import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.omg.CORBA.OBJECT_NOT_EXIST;
import sun.awt.image.ImageWatched;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by andrew on 5/11/2014.
 */
public class EiffelToJSONVisitor extends EiffelBaseVisitor<LinkedHashMap<String, Object>> {
    public LinkedHashMap<String, Object> classDeclaration;
    @Override
    public LinkedHashMap<String, Object> visitClass_declaration(@NotNull EiffelParser.Class_declarationContext ctx) {
        LinkedHashMap<String, Object> classObject = new LinkedHashMap<String, Object>();
        classObject.put("type", "class");
        classObject.putAll(visit(ctx.class_header()));
        if (ctx.indexing() != null) {
            ArrayList<Object> indexList = new ArrayList<Object>();
            for (EiffelParser.Index_clauseContext ic : ctx.indexing().index_list().index_clause())
                indexList.add(visit(ic));
            classObject.put("index list", indexList);
        }
        if (ctx.inheritance() != null) {
            LinkedHashMap<String, Object> inheritance = visit(ctx.inheritance());
            if (inheritance != null)
                classObject.putAll(inheritance);
        }
        if (ctx.obsolete() != null) {
            classObject.put("obsolete message", ctx.obsolete().message().getText());
        }
        if (ctx.creators() != null) {
            classObject.putAll(visit(ctx.creators()));
        }
        if (ctx.features() != null) {
            LinkedHashMap<String, Object> features = visit(ctx.features());
            if (features != null)
                classObject.putAll(features);
        }
        if (ctx.formal_generics() != null) {
            LinkedHashMap<String, Object> formalGenerics = visit(ctx.formal_generics());
            classObject.putAll(formalGenerics);
        }

        if (ctx.invariant() != null) {
            classObject.putAll(visit(ctx.invariant()));
        }

        this.classDeclaration = classObject;
        return classObject;
    }
    @Override
    public LinkedHashMap<String, Object> visitIndex_clause (@NotNull EiffelParser.Index_clauseContext ctx) {
        LinkedHashMap<String, Object> indexClause = new LinkedHashMap<String, Object>();
        if (ctx.index() != null)
            indexClause.put("index identifier", ctx.index().IDENTIFIER().getText());
        ArrayList<Object> indexClauseList = new ArrayList<Object>();
        for (EiffelParser.Index_valueContext ic : ctx.index_terms().index_value())
            indexClauseList.add(ic.getText().replace("\"", ""));
        indexClause.put("index clause list", indexClauseList);
        return indexClause;
    }
    @Override
    public LinkedHashMap<String, Object> visitClass_header (@NotNull EiffelParser.Class_headerContext ctx) {
        LinkedHashMap<String, Object> classHeader = new LinkedHashMap<String, Object>();
        classHeader.put("name", ctx.class_name().getText());
        return classHeader;
    }
    @Override
    public LinkedHashMap<String, Object> visitFormal_generics (@NotNull EiffelParser.Formal_genericsContext ctx) {
        LinkedHashMap<String, Object> formalGenerics = new LinkedHashMap<String, Object>();
        JSONArray jsonObjectsFormalGenerics = new JSONArray();
        for (EiffelParser.Formal_genericContext fg : ctx.formal_generic_list().formal_generic()) {
            jsonObjectsFormalGenerics.add(visit(fg));
        }
        formalGenerics.put("formal generics", jsonObjectsFormalGenerics);
        return formalGenerics;
    }
    @Override
    public LinkedHashMap<String, Object> visitFormal_generic (@NotNull EiffelParser.Formal_genericContext ctx) {
        LinkedHashMap<String, Object> formalGeneric = new LinkedHashMap<String, Object>();
        formalGeneric.put("name", ctx.formal_generic_name().getText());
        if (ctx.constraint() != null) {
            formalGeneric.putAll(visit(ctx.constraint()));
        }
        return formalGeneric;
    }
    @Override
    public LinkedHashMap<String, Object> visitConstraint (@NotNull EiffelParser.ConstraintContext ctx) {
        LinkedHashMap<String, Object> constraint = new LinkedHashMap<String, Object>();
        constraint.put("type", "constraint");
        constraint.put("class type", ctx.class_type().class_name());
        return constraint;
    }
    @Override
    public LinkedHashMap<String, Object> visitInheritance (@NotNull EiffelParser.InheritanceContext ctx) {
        LinkedHashMap<String, Object> inheritance = new LinkedHashMap<String, Object>();
        EiffelParser.Parent_listContext parent_listContext = ctx.parent_list();
        JSONArray parents = new JSONArray();
        List<EiffelParser.ParentContext> parentContexts = parent_listContext.parent();
        for (EiffelParser.ParentContext p : parentContexts) {
            LinkedHashMap<String, Object> parent = new LinkedHashMap<String, Object>();
            parent.put("parent", p.class_type().class_name().getText());
            if (p.feature_adaptation() != null) {
                LinkedHashMap<String, Object> featureAdaptation = visit(p.feature_adaptation());
                parent.putAll(featureAdaptation);
            }
            parents.add(parent);
        }
        inheritance.put("inherits", parents);
        return inheritance;
    }
    @Override
    public LinkedHashMap<String, Object> visitFeature_adaptation (@NotNull EiffelParser.Feature_adaptationContext ctx) {
        LinkedHashMap<String, Object> featureAdaptation = new LinkedHashMap<String, Object>();
        if (ctx.rename() != null) {
            JSONArray jsonObjectsRenameList = new JSONArray();
            for (EiffelParser.Rename_pairContext rpc : ctx.rename().rename_list().rename_pair())
                jsonObjectsRenameList.add(visit(rpc));
            featureAdaptation.put("features renames list", jsonObjectsRenameList);
        }
        if (ctx.new_exports() != null) {
            JSONArray jsonObjectsNewExports = new JSONArray();
            for (EiffelParser.New_export_itemContext neic : ctx.new_exports().new_export_list().new_export_item()) {
                jsonObjectsNewExports.add(visit(neic));
            }
            featureAdaptation.put("new exports", jsonObjectsNewExports);
        }
        if (ctx.redefine() != null) {
            JSONArray jsonObjectsRedefine = new JSONArray();
            for (EiffelParser.Feature_nameContext fn : ctx.redefine().feature_list().feature_name())
                jsonObjectsRedefine.add(fn.getText());
            featureAdaptation.put("redefine list", jsonObjectsRedefine);
        }
        if (ctx.undefine() != null) {
            JSONArray jsonObjectsUndefine = new JSONArray();
            for (EiffelParser.Feature_nameContext fn : ctx.undefine().feature_list().feature_name())
                jsonObjectsUndefine.add(fn.getText());
            featureAdaptation.put("undefine list", jsonObjectsUndefine);
        }
        if (ctx.select() != null) {
            JSONArray jsonObjectsSelect = new JSONArray();
            for (EiffelParser.Feature_nameContext fn : ctx.select().feature_list().feature_name())
                jsonObjectsSelect.add(fn.getText());
            featureAdaptation.put("select list", jsonObjectsSelect);
        }
        return featureAdaptation;
    }
    @Override
    public LinkedHashMap<String, Object> visitNew_export_item (@NotNull EiffelParser.New_export_itemContext ctx) {
        LinkedHashMap<String, Object> newExportItem = new LinkedHashMap<String, Object>();
        newExportItem.put("type", "new export item");
        newExportItem.putAll(visit(ctx.clients()));
        newExportItem.putAll(visit(ctx.feature_set()));
        return newExportItem;
    }
    @Override
    public LinkedHashMap<String, Object> visitAll_features (@NotNull EiffelParser.All_featuresContext ctx) {
        LinkedHashMap<String, Object> featureSet = new LinkedHashMap<String, Object>();
        featureSet.put("type", "feature set");
        featureSet.put("features", "ALL");
        return featureSet;
    }
    @Override
    public LinkedHashMap<String, Object> visitSome_features (@NotNull EiffelParser.Some_featuresContext ctx) {
        LinkedHashMap<String, Object> featureSet = new LinkedHashMap<String, Object>();
        JSONArray features = new JSONArray();
        for (EiffelParser.Feature_nameContext fn : ctx.feature_list().feature_name())
            features.add(fn.getText());
        featureSet.put("type", "feature set");
        featureSet.put("feature set", features);
        return featureSet;
    }
    @Override
    public LinkedHashMap<String, Object> visitRename_pair (@NotNull EiffelParser.Rename_pairContext ctx) {
        LinkedHashMap<String, Object> renamePair = new LinkedHashMap<String, Object>();
        renamePair.put("type", "rename pair");
        renamePair.put("pre name", ctx.feature_name(0).getText());
        renamePair.put("as name", ctx.feature_name(1).getText());
        return renamePair;
    }
    @Override
    public LinkedHashMap<String, Object> visitFeatures (@NotNull EiffelParser.FeaturesContext ctx) {
        LinkedHashMap<String, Object> features = new LinkedHashMap<String, Object>();
        List<EiffelParser.Feature_clauseContext> featureClauses = ctx.feature_clause();
        JSONArray jsonObjectsFeatureClauses = new JSONArray();
        for (EiffelParser.Feature_clauseContext fc : featureClauses) {
            List<EiffelParser.Feature_declarationContext> featureDeclarationList = fc.feature_declaration_list().feature_declaration();
            JSONArray jsonObjectsFeatureDeclarations = new JSONArray();
            for (EiffelParser.Feature_declarationContext fd : featureDeclarationList) {
                jsonObjectsFeatureDeclarations.add(visit(fd));
            }
            LinkedHashMap<String, Object> featureClause = new LinkedHashMap<String, Object>();

            if (fc.clients() != null) {
                LinkedHashMap<String, Object> clients = visit(fc.clients());
                if (clients != null)
                    featureClause.putAll(clients);
            }
            featureClause.put("features_declarations", jsonObjectsFeatureDeclarations);
            jsonObjectsFeatureClauses.add(featureClause);
        }
        features.put("feature clauses", jsonObjectsFeatureClauses);
        return features;
    }
    @Override
    public LinkedHashMap<String, Object> visitCreators (@NotNull EiffelParser.CreatorsContext ctx) {
        LinkedHashMap<String, Object> creation = new LinkedHashMap<String, Object>();
        JSONArray jsonObjectsCreationClauses = new JSONArray();
        for (EiffelParser.Creation_clauseContext ccc : ctx.creation_clause()) {
            jsonObjectsCreationClauses.add(visit(ccc));
        }
        creation.put("creation clauses", jsonObjectsCreationClauses);
        return creation;
    }
    @Override
    public LinkedHashMap<String, Object> visitCreation_clause (@NotNull EiffelParser.Creation_clauseContext ctx) {
        LinkedHashMap<String, Object> creationClause = new LinkedHashMap<String, Object>();
        if (ctx.clients() != null) {
            creationClause.putAll(visit(ctx.clients()));
        }
        JSONArray jsonObjectsProcedures = new JSONArray();
        for (EiffelParser.Procedure_nameContext pnc : ctx.procedure_list().procedure_name())
            jsonObjectsProcedures.add(pnc.getText());
        creationClause.put("procedure list", jsonObjectsProcedures);
        return creationClause;
    }
    @Override
    public LinkedHashMap<String, Object> visitFeature_declaration (@NotNull EiffelParser.Feature_declarationContext ctx) {
        LinkedHashMap<String, Object> featureDeclaration = new LinkedHashMap<String, Object>();
        featureDeclaration.putAll(visit(ctx.new_feature_list()));
        featureDeclaration.putAll(visit(ctx.declaration_body()));
        return featureDeclaration;
    }
    @Override
    public LinkedHashMap<String, Object> visitClients (@NotNull EiffelParser.ClientsContext ctx) {
        LinkedHashMap<String, Object> clients = new LinkedHashMap<String, Object>();
        JSONArray classList = new JSONArray();
        for (EiffelParser.Class_nameContext cn : ctx.class_list().class_name())
            classList.add(cn.getText());
        clients.put("clients", classList);
        return clients;
    }
    @Override
    public LinkedHashMap<String, Object> visitNew_feature_list (@NotNull EiffelParser.New_feature_listContext ctx) {
        LinkedHashMap<String, Object> featureList = new LinkedHashMap<String, Object>();
        List<EiffelParser.New_featureContext> featuresNames = ctx.new_feature();
        if (featuresNames.size() == 1)
            featureList.put("name", featuresNames.get(0).feature_name().IDENTIFIER().getText());
        else {
            JSONArray jsonObjectsFeaturesNames = new JSONArray();
            for (EiffelParser.New_featureContext fn : featuresNames) {
                jsonObjectsFeaturesNames.add(fn.feature_name().IDENTIFIER().toString());
            }
            featureList.put("names", jsonObjectsFeaturesNames);
        }
        return featureList;
    }
    @Override
    public LinkedHashMap<String, Object> visitDeclaration_body (@NotNull EiffelParser.Declaration_bodyContext ctx) {
        LinkedHashMap<String, Object> declarationBody = new LinkedHashMap<String, Object>();
        if (ctx.formal_arguments() != null) {
            LinkedHashMap<String, Object> formalArguments = visit(ctx.formal_arguments().entity_declaration_list());
            if (formalArguments != null)
                declarationBody.put("formal arguments", formalArguments);
        }
        if (ctx.type_mark() != null) {
            LinkedHashMap<String, Object> type = visit(ctx.type_mark().type());
            if (type != null)
                declarationBody.putAll(type);
        }
        if (ctx.constant_or_routine() != null) {
            LinkedHashMap<String, Object> constantOrRoutine = visit(ctx.constant_or_routine());
            if (constantOrRoutine != null)
                declarationBody.putAll(constantOrRoutine);
        }

        return declarationBody;
    }
    @Override
    public LinkedHashMap<String, Object> visitEntity_declaration_list (@NotNull EiffelParser.Entity_declaration_listContext ctx) {
        LinkedHashMap<String, Object> formalArguments = new LinkedHashMap<String, Object>();
        JSONArray jsonObjectsFormalArguments = new JSONArray();
        List<EiffelParser.Entity_declaration_groupContext> formalArgumentsGroups = ctx.entity_declaration_group();
        for (EiffelParser.Entity_declaration_groupContext edc : formalArgumentsGroups) {
            LinkedHashMap<String, Object> type = visit(edc.type_mark().type());
            List<TerminalNode> identifiers = edc.identifier_list().IDENTIFIER();
            for (TerminalNode id : identifiers) {
                LinkedHashMap<String, Object> fa = new LinkedHashMap<String, Object>();
                fa.put(id.getText(), type);
                jsonObjectsFormalArguments.add(fa);
            }
        }
        formalArguments.put("declaration list", jsonObjectsFormalArguments);
        return formalArguments;
    }
    @Override
    public LinkedHashMap<String, Object> visitType_with_generics (@NotNull EiffelParser.Type_with_genericsContext ctx) {
        LinkedHashMap<String, Object> type = new LinkedHashMap<String, Object>();
        type.put("type name", ctx.class_type().getText());
        if (ctx.actual_generics() != null) {
            ArrayList<Object> generics = new ArrayList<Object>();

            for (EiffelParser.TypeContext tc : ctx.actual_generics().type_list().type())
                generics.add(visit(tc));
            type.put("actual generics list", generics);
        }
        return type;
    }

    @Override
    public LinkedHashMap<String, Object> visitType_anchored(@NotNull EiffelParser.Type_anchoredContext ctx) {
        LinkedHashMap<String, Object> type = new LinkedHashMap<String, Object>();
        type.put("anchored type name", ctx.anchored().anchor().getText());
        return type;
    }

    @Override
    public LinkedHashMap<String, Object> visitType_bit(@NotNull EiffelParser.Type_bitContext ctx) {
        LinkedHashMap<String, Object> type = new LinkedHashMap<String, Object>();
        type.put("bit type name/length", ctx.bit_type().bit_length().getText());
        return type;
    }

    @Override
    public LinkedHashMap<String, Object> visitType_expanded(@NotNull EiffelParser.Type_expandedContext ctx) {
        LinkedHashMap<String, Object> type = new LinkedHashMap<String, Object>();
        type.put("expanded type name", ctx.class_type_expanded().class_type().getText());
        return type;
    }

    @Override
    public LinkedHashMap<String, Object> visitType_separated(@NotNull EiffelParser.Type_separatedContext ctx) {
        LinkedHashMap<String, Object> type = new LinkedHashMap<String, Object>();
        type.put("separated type name", ctx.class_type_separate().class_type().getText());
        return type;
    }
    /*@Override
    public LinkedHashMap<String, Object> visitType_mark (@NotNull EiffelParser.Type_markContext ctx) {
        LinkedHashMap<String, Object> typeMark = new LinkedHashMap<String, Object>();
        typeMark.put("type", ctx.type().class_type().class_name().getText());
        return typeMark;
    }*/

    /*@Override
    public LinkedHashMap<String, Object> visitConstant_or_routine (@NotNull EiffelParser.Constant_or_routineContext ctx) {
        LinkedHashMap<String, Object> constantOrRoutine = new LinkedHashMap<String, Object>();
        EiffelParser.Feature_valueContext fv = ctx.feature_value();
        //System.out.println("HERE WE GO: CONSTANT OR ROUTINE: AND CHILD COUNT IS " + fv.getChildCount());
        constantOrRoutine.put("feature_value", visit(fv.));
        return constantOrRoutine;
    }
    */
    @Override
    public LinkedHashMap<String, Object> visitConstant_feature_value (@NotNull EiffelParser.Constant_feature_valueContext ctx) {
        LinkedHashMap<String, Object> constant = new LinkedHashMap<String, Object>();
        constant.put("type", "constant");
        constant.put("value", ctx.getText());
        return constant;
    }
    @Override
    public LinkedHashMap<String, Object> visitUnique_feature_value (@NotNull EiffelParser.Unique_feature_valueContext ctx) {
        LinkedHashMap<String, Object> unique = new LinkedHashMap<String, Object>();
        unique.put("type", "UNIQUE");
        return unique;
    }
    @Override
    public LinkedHashMap<String, Object> visitRoutine_feature_value (@NotNull EiffelParser.Routine_feature_valueContext ctx) {
        LinkedHashMap<String, Object> routine = new LinkedHashMap<String, Object>();
        EiffelParser.RoutineContext rc = ctx.routine();
        routine.put("type", "routine");
        if (rc.obsolete() != null) {
            routine.put("obsolete", "true");
            routine.put("obsolete message", rc.obsolete().message().MANIFEST_STRING().getText());
        }
        if (rc.precondition() != null) {
            routine.put("precondition", visit(rc.precondition().assertion()));
        }
        if (rc.local_declarations() != null) {
            routine.put("local declarations", visit(rc.local_declarations().entity_declaration_list()));
        }
        routine.putAll(visit(rc.routine_body()));
        if (rc.postcondition() != null) {
            routine.put("postcondition", visit(rc.postcondition().assertion()));
        }
        if (rc.rescue() != null) {
            routine.put("rescue block", visit(rc.rescue().compound()));
        }
        return routine;
    }
    @Override
    public LinkedHashMap<String, Object> visitDeferred_routine_body (@NotNull EiffelParser.Deferred_routine_bodyContext ctx) {
        LinkedHashMap<String, Object> routineBody = new LinkedHashMap<String, Object>();
        routineBody.put("routine type", "deferred");
        return routineBody;
    }
    @Override
    public LinkedHashMap<String, Object> visitAssertion (@NotNull EiffelParser.AssertionContext ctx) {
        LinkedHashMap<String, Object> assertions = new LinkedHashMap<String, Object>();
        ArrayList<Object> assertionsList = new ArrayList<Object>();
        for (EiffelParser.Assertion_clauseContext ac : ctx.assertion_clause())
            assertionsList.add(visit(ac));
        assertions.put("assertions list", assertionsList);
        return assertions;
    }
    @Override
    public LinkedHashMap<String, Object> visitInternal_effective (@NotNull EiffelParser.Internal_effectiveContext ctx) {
        LinkedHashMap<String, Object> internal_routine = new LinkedHashMap<String, Object>();
        EiffelParser.InternalContext ic = ctx.internal();
        internal_routine.put("routine mark", ic.routine_mark().getText());
        internal_routine.put("routine body", visit(ic.compound()));
        return internal_routine;
    }
    @Override
    public LinkedHashMap<String, Object> visitCompound (@NotNull EiffelParser.CompoundContext ctx) {
        List<EiffelParser.InstructionContext> instructions = ctx.instruction();
        LinkedHashMap<String, Object> compoundsBlock = new LinkedHashMap<String, Object>();
        JSONArray jsonObjectsInstructions = new JSONArray();
        //compounds.put("num_of_instr", instructions.size());
        for (EiffelParser.InstructionContext ic : instructions) {
            jsonObjectsInstructions.add(visit(ic));
        }
        compoundsBlock.put("instruction set", jsonObjectsInstructions);
        return compoundsBlock;
    }
    @Override
    public LinkedHashMap<String, Object> visitAssignment (@NotNull EiffelParser.AssignmentContext ctx) {
        LinkedHashMap<String, Object> assignment = new LinkedHashMap<String, Object>();
        assignment.put("type", "assignment");
        assignment.put("left", ctx.writable().getText());
        assignment.put("right", visit(ctx.expression()));
        return assignment;
    }
    @Override
    public LinkedHashMap<String, Object> visitIdentifier_expr (@NotNull EiffelParser.Identifier_exprContext ctx) {
        LinkedHashMap<String, Object> expression = new LinkedHashMap<String, Object>();
        expression.put("type", "identifier");
        expression.put("name", ctx.getText());
        return expression;
    }
    @Override
    public LinkedHashMap<String, Object> visitResult_expr (@NotNull EiffelParser.Result_exprContext ctx) {
        LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();
        result.put("type", "Result expression");
        return result;
    }
    @Override
    public LinkedHashMap<String, Object> visitCurrent_expr (@NotNull EiffelParser.Current_exprContext ctx) {
        LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();
        result.put("type", "Current expression");
        return result;
    }
    @Override
    public LinkedHashMap<String, Object> visitParenthesized_expr (@NotNull EiffelParser.Parenthesized_exprContext ctx) {
        LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();
        result.put("type", "parenthesized expression");
        result.put("body", visit(ctx.expression()));
        return result;
    }
    @Override
    public LinkedHashMap<String, Object> visitMul_div_expr (@NotNull EiffelParser.Mul_div_exprContext ctx) {
        LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();
        if (ctx.op.getType() == EiffelParser.MUL) {
            result.put("type", "*");
        }
        else {
            result.put("type", "/");
        }
        result.put("left", visit(ctx.expression(0)));
        result.put("right", visit(ctx.expression(1)));
        return result;
    }
    @Override
    public LinkedHashMap<String, Object> visitDiv_expr (@NotNull EiffelParser.Div_exprContext ctx) {
        LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();
        if (ctx.op.getType() == EiffelParser.T__5)
            result.put("type", "remainder");
        else
            result.put("type", "integer division");
        result.put("left", visit(ctx.expression(0)));
        result.put("right", visit(ctx.expression(1)));
        return result;
    }
    @Override
    public LinkedHashMap<String, Object> visitAdd_sub_expr (@NotNull EiffelParser.Add_sub_exprContext ctx) {
        LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();
        result.put("type", ctx.op.getText());
        result.put("left", visit(ctx.expression(0)));
        result.put("right", visit(ctx.expression(1)));
        return result;
    }
    @Override
    public LinkedHashMap<String, Object> visitComp_expr (@NotNull EiffelParser.Comp_exprContext ctx) {
        LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();
        int op = ctx.op.getType();
        if (op == EiffelParser.LT)
            result.put("type", "less than");
        else if (op == EiffelParser.GT)
            result.put("type", "greater than");
        else if (op == EiffelParser.LE)
            result.put("type", "less or equal");
        else if (op == EiffelParser.GE)
            result.put("type", "greater or equal");
        else if (op == EiffelParser.EQUAL)
            result.put("type", "equal?");
        else if (op == EiffelParser.NOT_EQUAL)
            result.put("type", "not equal?");

        result.put("left", visit(ctx.expression(0)));
        result.put("right", visit(ctx.expression(1)));
        return result;
    }
    @Override
    public LinkedHashMap<String, Object> visitAnd_expr (@NotNull EiffelParser.And_exprContext ctx) {
        LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();
        if (ctx.op.getText().equals("and"))
            result.put("type", "and");
        else
            result.put("type", "and then");
        result.put("left", visit(ctx.expression(0)));
        result.put("right", visit(ctx.expression(1)));
        return result;
    }
    @Override
    public LinkedHashMap<String, Object> visitOr_expr (@NotNull EiffelParser.Or_exprContext ctx) {
        LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();
        result.put("type", ctx.op.getText());
        result.put("left", visit(ctx.expression(0)));
        result.put("right", visit(ctx.expression(1)));
        return result;
    }
    @Override
    public LinkedHashMap<String, Object> visitNot_expr (@NotNull EiffelParser.Not_exprContext ctx) {
        LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();
        result.put("type", "not");
        result.put("body", visit(ctx.expression()));
        return result;
    }
    @Override
    public LinkedHashMap<String, Object> visitImplies_expr (@NotNull EiffelParser.Implies_exprContext ctx) {
        LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();
        result.put("type", "implication");
        result.put("left", visit(ctx.expression(0)));
        result.put("right", visit(ctx.expression(1)));
        return result;
    }

    @Override
    public LinkedHashMap<String, Object> visitConstant_expr (@NotNull EiffelParser.Constant_exprContext ctx) {
        LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();
        result.put("type", "constant expression");
        result.put("value", ctx.getText());
        return result;
    }
    @Override
    public LinkedHashMap<String, Object> visitChars_expr (@NotNull EiffelParser.Chars_exprContext ctx) {
        LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();
        result.put("type", "literal expression");
        //System.out.println("THIS!:\n" + ctx.getText());
        result.put("value", ctx.getText().replace("\"", "").replace("\'", "").replaceAll("%\\\\r\\\\n.*?%", ""));
        return result;
    }
    @Override
    public LinkedHashMap<String, Object> visitInvariant (@NotNull EiffelParser.InvariantContext ctx) {
        LinkedHashMap<String, Object> invariant = new LinkedHashMap<String, Object>();
        JSONArray jsonObjectsAssertions = new JSONArray();
        for (EiffelParser.Assertion_clauseContext acc : ctx.assertion().assertion_clause()) {
            jsonObjectsAssertions.add(visit(acc));
        }
        invariant.put("invariant assertions", jsonObjectsAssertions);
        return invariant;
    }
    @Override
    public LinkedHashMap<String, Object> visitVariant (@NotNull EiffelParser.VariantContext ctx) {
        LinkedHashMap<String, Object> variant = new LinkedHashMap<String, Object>();
        variant.put("variant tag", ctx.tag_mark().tag().getText());
        variant.put("variant expression", visit(ctx.expression()));
        return variant;
    }
    @Override
    public LinkedHashMap<String, Object> visitAssertion_clause (@NotNull EiffelParser.Assertion_clauseContext ctx) {
        LinkedHashMap<String, Object> assertionClause = new LinkedHashMap<String, Object>();
        if (ctx.tag_mark() != null)
            assertionClause.put("tag", ctx.tag_mark().tag().getText());
        assertionClause.put("expression", visit(ctx.unlabeled_assertion_clause()));
        return assertionClause;
    }
    @Override
    public LinkedHashMap<String, Object> visitConditional (@NotNull EiffelParser.ConditionalContext ctx) {
        LinkedHashMap<String, Object> conditional = new LinkedHashMap<String, Object>();
        conditional.put("type", "conditional");

        if (ctx.then_part_list().getChildCount() != 1) {
            ArrayList<Object> alternativesList = new ArrayList<Object>();
            for (EiffelParser.Then_partContext tpc : ctx.then_part_list().then_part()) {
                LinkedHashMap<String, Object> alternative = new LinkedHashMap<String, Object>();
                alternative.put("condition", visit(tpc.boolean_expression()));
                alternative.put("consequent", visit(tpc.compound()));
                alternativesList.add(alternative);
            }
            conditional.put("alternatives list", alternativesList);
        }
        else {
            conditional.put("condition", visit(ctx.then_part_list().then_part(0).boolean_expression()));
            conditional.put("consequent", visit(ctx.then_part_list().then_part(0).compound()));
        }
        if (ctx.else_part() != null) {
            conditional.put("else part", visit(ctx.else_part().compound()));
        }
        return conditional;
    }
    @Override
    public LinkedHashMap<String, Object> visitMulti_branch(@NotNull EiffelParser.Multi_branchContext ctx) {
        LinkedHashMap<String, Object> multiBranch = new LinkedHashMap<String, Object>();
        multiBranch.put("type", "multi-branch instruction");
        multiBranch.put("inspected expression", visit(ctx.expression()));
        if (ctx.when_part_list() != null) {
            ArrayList<Object> alternatives = new ArrayList<Object>();
            for (EiffelParser.When_partContext wpc : ctx.when_part_list().when_part()) {
                LinkedHashMap<String, Object> alternative = new LinkedHashMap<String, Object>();
                if (wpc.choices() != null)
                    alternative.putAll(visit(wpc.choices()));
                alternative.put("consequent", visit(wpc.compound()));
                alternatives.add(alternative);
            }
            multiBranch.put("alternatives", alternatives);
        }
        if (ctx.else_part() != null)
            multiBranch.put("else part", visit(ctx.else_part().compound()));
        return multiBranch;
    }
    @Override
    public LinkedHashMap<String, Object> visitChoices (@NotNull EiffelParser.ChoicesContext ctx) {
        LinkedHashMap<String, Object> choices = new LinkedHashMap<String, Object>();
        ArrayList<Object> jsonObjectsChoices = new ArrayList<Object>();
        for (EiffelParser.ChoiceContext cc : ctx.choice())
            jsonObjectsChoices.add(visit(cc));
        choices.put("choices list", jsonObjectsChoices);
        return choices;
    }
    @Override
    public LinkedHashMap<String, Object> visitChoice_constant_choice (@NotNull EiffelParser.Choice_constant_choiceContext ctx) {
        LinkedHashMap<String, Object> choice = new LinkedHashMap<String, Object>();
        choice.put("type", "constant");
        choice.put("value", ctx.getText());
        return choice;
    }
    @Override
    public LinkedHashMap<String, Object> visitInterval_choice (@NotNull EiffelParser.Interval_choiceContext ctx) {
        LinkedHashMap<String, Object> choice = new LinkedHashMap<String, Object>();
        choice.put("type", "interval");
        choice.put("begin", ctx.interval().choice_constant(0).getText());
        choice.put("end", ctx.interval().choice_constant(1).getText());
        return choice;
    }
    @Override
    public LinkedHashMap<String, Object> visitLoop (@NotNull EiffelParser.LoopContext ctx) {
        LinkedHashMap<String, Object> loopInstruction = new LinkedHashMap<String, Object>();
        loopInstruction.put("type", "loop");
        loopInstruction.put("initialization", visit(ctx.initialization().compound()));
        if (ctx.invariant() != null)
            loopInstruction.put("invariant", visit(ctx.invariant()));
        if (ctx.variant() != null)
            loopInstruction.put("variant", visit(ctx.variant()));
        loopInstruction.put("exit condition", visit(ctx.loop_body().exit().boolean_expression()));
        loopInstruction.put("loop body", ctx.loop_body().compound());
        return loopInstruction;
    }
    @Override
    public LinkedHashMap<String, Object> visitRetry_instruction (@NotNull EiffelParser.Retry_instructionContext ctx) {
        LinkedHashMap<String, Object> retry = new LinkedHashMap<String, Object>();
        retry.put("type", "retry instruction");
        return retry;
    }

    @Override
    public LinkedHashMap<String, Object> visitDebug_instruction(@NotNull EiffelParser.Debug_instructionContext ctx) {
        LinkedHashMap<String, Object> debug = new LinkedHashMap<String, Object>();
        debug.put("type", "debug instruction");
        if (ctx.debug().debug_keys() != null) {
            ArrayList<Object> debugKeys = new ArrayList<Object>();
            for (EiffelParser.Debug_keyContext dk : ctx.debug().debug_keys().debug_key_list().debug_key())
                debugKeys.add(dk.getText());
            debug.put("debug keys", debugKeys);
        }
        debug.put("debug instructions block", ctx.debug().compound());
        return debug;
    }

    @Override
    public LinkedHashMap<String, Object> visitCall(@NotNull EiffelParser.CallContext ctx) {
        LinkedHashMap<String, Object> callExpression = new LinkedHashMap<String, Object>();
        if (ctx.call_qualifier() != null)
            callExpression.put("call qualifier", visit(ctx.call_qualifier()));
        ArrayList<EiffelParser.Usual_callContext> callChain = new ArrayList<EiffelParser.Usual_callContext>();
        callChain.add(ctx.usual_call());
        if (ctx.call_chain() != null)
            for (EiffelParser.Usual_callContext uc : ctx.call_chain().usual_call())
                callChain.add(uc);
        callExpression.putAll(processCallStatement(callChain, callChain.size() - 1));
        return callExpression;
    }

    public LinkedHashMap<String, Object> processCallStatement(ArrayList<EiffelParser.Usual_callContext> callChain, int rightMostCall) {
        LinkedHashMap<String, Object> callStatement = new LinkedHashMap<String, Object>();
        if (rightMostCall != 0) {
            callStatement.put("type", "call");
            callStatement.put("call entity", processCallStatement(callChain, rightMostCall - 1));
            callStatement.put("feature to call", callChain.get(rightMostCall).IDENTIFIER().getText());
            if (callChain.get(rightMostCall).params() != null) {
                ArrayList<Object> params = new ArrayList<Object>();
                for (EiffelParser.ParamContext pc : callChain.get(rightMostCall).params().param())
                    params.add(visit(pc));
                callStatement.put("parameters list", params);
            }
        }
        else {
            callStatement.put("type", "call");
            callStatement.put("feature", callChain.get(0).IDENTIFIER().getText());
            if (callChain.get(0).params() != null) {
                ArrayList<Object> params = new ArrayList<Object>();
                for (EiffelParser.ParamContext pc : callChain.get(rightMostCall).params().param())
                    params.add(visit(pc));
                callStatement.put("parameters list", params);
            }
        }
        return callStatement;
    }
    @Override
    public LinkedHashMap<String, Object> visitOld_expr (@NotNull EiffelParser.Old_exprContext ctx) {
        LinkedHashMap<String, Object> oldExpr = new LinkedHashMap<String, Object>();
        oldExpr.put("type", "old expression");
        oldExpr.put("value", visit(ctx.expression()));
        return oldExpr;
    }
    @Override
    public LinkedHashMap<String, Object> visitStrip_expr (@NotNull EiffelParser.Strip_exprContext ctx) {
        LinkedHashMap<String, Object> stripExpr = new LinkedHashMap<String, Object>();
        stripExpr.put("type", "strip expression");
        ArrayList<Object> attributes = new ArrayList<Object>();
        for (EiffelParser.AttributeContext ac : ctx.strip().attribute_list().attribute())
            attributes.add(ac.getText());
        stripExpr.put("attributes list", attributes);
        return stripExpr;
    }

    @Override
    public LinkedHashMap<String, Object> visitAddress(@NotNull EiffelParser.AddressContext ctx) {
        LinkedHashMap<String, Object> address = new LinkedHashMap<String, Object>();
        address.put("type", "address");
        address.put("address value", ctx.getText());
        return address;
    }
    @Override
    public LinkedHashMap<String, Object> visitCheck(@NotNull EiffelParser.CheckContext ctx) {
        LinkedHashMap<String, Object> checkInstruction = new LinkedHashMap<String, Object>();
        checkInstruction.put("type", "check instruction");
        ArrayList<Object> assertions = new ArrayList<Object>();
        for (EiffelParser.Assertion_clauseContext acc : ctx.assertion().assertion_clause()) {
            assertions.add(visit(acc));
        }
        checkInstruction.put("assertions", assertions);
        return checkInstruction;
    }

    @Override
    public LinkedHashMap<String, Object> visitCreation_instruction (@NotNull EiffelParser.Creation_instructionContext ctx) {
        LinkedHashMap<String, Object> creationInstruction = new LinkedHashMap<String, Object>();
        creationInstruction.put("type", "creation instruction");
        if (ctx.creation().type() != null)
            creationInstruction.put("creation type", ctx.creation().type().getText());
        creationInstruction.put("target", ctx.creation().writable().getText());
        if (ctx.creation().creation_call() != null) {
            creationInstruction.put("creation procedure", ctx.creation().creation_call().procedure_name().getText());

            ArrayList<Object> params = new ArrayList<Object>();
            for (EiffelParser.ParamContext pc : ctx.creation().creation_call().params().param())
                params.add(visit(pc));

            creationInstruction.put("parameters", params);
        }
        return creationInstruction;

    }
    @Override
    public LinkedHashMap<String, Object> visitManifest_array_expr (@NotNull EiffelParser.Manifest_array_exprContext ctx) {
        LinkedHashMap<String, Object> manifestArray = new LinkedHashMap<String, Object>();
        manifestArray.put("type", "manifest array");
        ArrayList<Object> values = new ArrayList<Object>();
        for (EiffelParser.ExpressionContext ec : ctx.manifest_array().expression_list().expression())
            values.add(visit(ec));
        manifestArray.put("values", values);
        return manifestArray;
    }
    /*@Override
    public LinkedHashMap<String, Object> visitLong_str_expr (@NotNull EiffelParser.Long_str_exprContext ctx) {
        LinkedHashMap<String, Object> longStr = new LinkedHashMap<String, Object>();
        longStr.put("type", "literal expression");
        longStr.put("value", join(ctx.long_string().getText().split("%(\\\\r)?\\\\n[^%]*%")));
        //longStr.put("value", ctx.long_string().getText().replaceAll("%\\\\r\\\\n.*%", ""));
        return longStr;
    }*/
    public String join(String[] array) {
        int k = array.length;
        StringBuilder sb = new StringBuilder();
        sb.append(array[0]);
        for (int i = 1; i < k; i++) {
            sb.append(array[i]);
            System.err.println(array[i]);
        }
        return sb.toString();
    }
}
