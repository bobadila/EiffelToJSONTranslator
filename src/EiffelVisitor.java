// Generated from D:/IdeaProjects/EiffelToJSONTranslator/ANTLR_files\Eiffel.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EiffelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EiffelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EiffelParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(@NotNull EiffelParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound(@NotNull EiffelParser.CompoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#external}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal(@NotNull EiffelParser.ExternalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#debug_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug_key(@NotNull EiffelParser.Debug_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#wide_character_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWide_character_constant(@NotNull EiffelParser.Wide_character_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#call_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_expr(@NotNull EiffelParser.Call_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#then_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen_part(@NotNull EiffelParser.Then_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#entity_declaration_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_declaration_group(@NotNull EiffelParser.Entity_declaration_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#features}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatures(@NotNull EiffelParser.FeaturesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#language_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage_name(@NotNull EiffelParser.Language_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_part(@NotNull EiffelParser.Else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#class_type_expanded}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type_expanded(@NotNull EiffelParser.Class_type_expandedContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#expr_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_param(@NotNull EiffelParser.Expr_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(@NotNull EiffelParser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#once}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnce(@NotNull EiffelParser.OnceContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#new_exports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_exports(@NotNull EiffelParser.New_exportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#procedure_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_list(@NotNull EiffelParser.Procedure_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#identifier_writable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_writable(@NotNull EiffelParser.Identifier_writableContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#bit_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_type(@NotNull EiffelParser.Bit_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#parent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(@NotNull EiffelParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(@NotNull EiffelParser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#actual_generics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_generics(@NotNull EiffelParser.Actual_genericsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(@NotNull EiffelParser.InitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix(@NotNull EiffelParser.PrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#character_choice_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_choice_constant(@NotNull EiffelParser.Character_choice_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#formal_generics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_generics(@NotNull EiffelParser.Formal_genericsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#choice_constant_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice_constant_choice(@NotNull EiffelParser.Choice_constant_choiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#constant_or_routine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_or_routine(@NotNull EiffelParser.Constant_or_routineContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#formal_generic_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_generic_name(@NotNull EiffelParser.Formal_generic_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#header_mark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader_mark(@NotNull EiffelParser.Header_markContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#current_address_mark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_address_mark(@NotNull EiffelParser.Current_address_markContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#feature_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_list(@NotNull EiffelParser.Feature_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#deferred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferred(@NotNull EiffelParser.DeferredContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug(@NotNull EiffelParser.DebugContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#all_features}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_features(@NotNull EiffelParser.All_featuresContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(@NotNull EiffelParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo(@NotNull EiffelParser.DoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#addr_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddr_param(@NotNull EiffelParser.Addr_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#deferred_routine_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferred_routine_body(@NotNull EiffelParser.Deferred_routine_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#type_separated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_separated(@NotNull EiffelParser.Type_separatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#rename_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename_pair(@NotNull EiffelParser.Rename_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#multi_branch_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_branch_instruction(@NotNull EiffelParser.Multi_branch_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#choices}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoices(@NotNull EiffelParser.ChoicesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#assignment_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_instruction(@NotNull EiffelParser.Assignment_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#bit_length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_length(@NotNull EiffelParser.Bit_lengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#sub_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_expr(@NotNull EiffelParser.Sub_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#implies_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplies_expr(@NotNull EiffelParser.Implies_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull EiffelParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#type_mark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_mark(@NotNull EiffelParser.Type_markContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#assignment_attempt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_attempt(@NotNull EiffelParser.Assignment_attemptContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#interval_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_choice(@NotNull EiffelParser.Interval_choiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#infix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_operator(@NotNull EiffelParser.Infix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#feature_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_name(@NotNull EiffelParser.Feature_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#routine_feature_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_feature_value(@NotNull EiffelParser.Routine_feature_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#index_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_list(@NotNull EiffelParser.Index_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#type_anchored}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_anchored(@NotNull EiffelParser.Type_anchoredContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#unique_feature_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnique_feature_value(@NotNull EiffelParser.Unique_feature_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_part(@NotNull EiffelParser.When_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#postcondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostcondition(@NotNull EiffelParser.PostconditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(@NotNull EiffelParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#feature_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_clause(@NotNull EiffelParser.Feature_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#hexad_man}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexad_man(@NotNull EiffelParser.Hexad_manContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#some_features}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSome_features(@NotNull EiffelParser.Some_featuresContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#new_export_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_export_list(@NotNull EiffelParser.New_export_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#assertion_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion_clause(@NotNull EiffelParser.Assertion_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(@NotNull EiffelParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#effective_routine_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffective_routine_body(@NotNull EiffelParser.Effective_routine_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(@NotNull EiffelParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#creation_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreation_clause(@NotNull EiffelParser.Creation_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(@NotNull EiffelParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#tag_mark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_mark(@NotNull EiffelParser.Tag_markContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#constant_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expr(@NotNull EiffelParser.Constant_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#class_type_separate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type_separate(@NotNull EiffelParser.Class_type_separateContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#new_feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_feature(@NotNull EiffelParser.New_featureContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#feature_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_declaration_list(@NotNull EiffelParser.Feature_declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#or_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expr(@NotNull EiffelParser.Or_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#div_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv_expr(@NotNull EiffelParser.Div_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#new_export_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_export_item(@NotNull EiffelParser.New_export_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#identifier_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_expr(@NotNull EiffelParser.Identifier_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#routine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine(@NotNull EiffelParser.RoutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#strip_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrip_expr(@NotNull EiffelParser.Strip_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#class_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_header(@NotNull EiffelParser.Class_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#real_man}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_man(@NotNull EiffelParser.Real_manContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#char_man}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_man(@NotNull EiffelParser.Char_manContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#manifest_array_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManifest_array_expr(@NotNull EiffelParser.Manifest_array_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#type_with_generics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_with_generics(@NotNull EiffelParser.Type_with_genericsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#type_expanded}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_expanded(@NotNull EiffelParser.Type_expandedContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#loop_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_instruction(@NotNull EiffelParser.Loop_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#feature_name_address_mark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_name_address_mark(@NotNull EiffelParser.Feature_name_address_markContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#obsolete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObsolete(@NotNull EiffelParser.ObsoleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#wide_manifest_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWide_manifest_string(@NotNull EiffelParser.Wide_manifest_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#assertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion(@NotNull EiffelParser.AssertionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expression(@NotNull EiffelParser.Boolean_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#constant_feature_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_feature_value(@NotNull EiffelParser.Constant_feature_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(@NotNull EiffelParser.MessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#external_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_name(@NotNull EiffelParser.External_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#new_feature_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_feature_list(@NotNull EiffelParser.New_feature_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#when_part_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_part_list(@NotNull EiffelParser.When_part_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#creation_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreation_call(@NotNull EiffelParser.Creation_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#class_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type(@NotNull EiffelParser.Class_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#usual_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsual_call(@NotNull EiffelParser.Usual_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#mul_div_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_div_expr(@NotNull EiffelParser.Mul_div_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(@NotNull EiffelParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#formal_generic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_generic(@NotNull EiffelParser.Formal_genericContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#indexing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexing(@NotNull EiffelParser.IndexingContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#rescue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRescue(@NotNull EiffelParser.RescueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#conditional_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_instruction(@NotNull EiffelParser.Conditional_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#result_writable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_writable(@NotNull EiffelParser.Result_writableContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix(@NotNull EiffelParser.InfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#invariant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvariant(@NotNull EiffelParser.InvariantContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#debug_key_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug_key_list(@NotNull EiffelParser.Debug_key_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#expression_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_qualifier(@NotNull EiffelParser.Expression_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#comment_assertion_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_assertion_clause(@NotNull EiffelParser.Comment_assertion_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#real_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_constant(@NotNull EiffelParser.Real_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#result_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_qualifier(@NotNull EiffelParser.Result_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#current_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_expr(@NotNull EiffelParser.Current_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#not_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_expr(@NotNull EiffelParser.Not_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#parent_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent_list(@NotNull EiffelParser.Parent_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#exit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit(@NotNull EiffelParser.ExitContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#creators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreators(@NotNull EiffelParser.CreatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#anchored}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnchored(@NotNull EiffelParser.AnchoredContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_clause(@NotNull EiffelParser.Index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#manifest_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManifest_array(@NotNull EiffelParser.Manifest_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_list(@NotNull EiffelParser.Type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#current_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_qualifier(@NotNull EiffelParser.Current_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#creation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreation(@NotNull EiffelParser.CreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(@NotNull EiffelParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(@NotNull EiffelParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#index_terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_terms(@NotNull EiffelParser.Index_termsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#call_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_instruction(@NotNull EiffelParser.Call_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#chars_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChars_expr(@NotNull EiffelParser.Chars_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(@NotNull EiffelParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#add_sub_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_sub_expr(@NotNull EiffelParser.Add_sub_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#feature_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_declaration(@NotNull EiffelParser.Feature_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(@NotNull EiffelParser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#variant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant(@NotNull EiffelParser.VariantContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#int_man}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_man(@NotNull EiffelParser.Int_manContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#debug_keys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug_keys(@NotNull EiffelParser.Debug_keysContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#internal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternal(@NotNull EiffelParser.InternalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#old_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_expr(@NotNull EiffelParser.Old_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#debug_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug_instruction(@NotNull EiffelParser.Debug_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#feature_adaptation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_adaptation(@NotNull EiffelParser.Feature_adaptationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#boolean_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_constant(@NotNull EiffelParser.Boolean_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#call_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_chain(@NotNull EiffelParser.Call_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#bit_man}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_man(@NotNull EiffelParser.Bit_manContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#parent_qualification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent_qualification(@NotNull EiffelParser.Parent_qualificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#attribute_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_list(@NotNull EiffelParser.Attribute_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#retry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetry(@NotNull EiffelParser.RetryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#old}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld(@NotNull EiffelParser.OldContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#assignment_attempt_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_attempt_instruction(@NotNull EiffelParser.Assignment_attempt_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#integer_choice_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_choice_constant(@NotNull EiffelParser.Integer_choice_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#rename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename(@NotNull EiffelParser.RenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#multi_branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_branch(@NotNull EiffelParser.Multi_branchContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#declaration_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_body(@NotNull EiffelParser.Declaration_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#anchor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnchor(@NotNull EiffelParser.AnchorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#loop_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_body(@NotNull EiffelParser.Loop_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#add_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expr(@NotNull EiffelParser.Add_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#comp_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_expr(@NotNull EiffelParser.Comp_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#internal_effective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternal_effective(@NotNull EiffelParser.Internal_effectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#attribute_choice_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_choice_constant(@NotNull EiffelParser.Attribute_choice_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#then_part_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen_part_list(@NotNull EiffelParser.Then_part_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#result_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_expr(@NotNull EiffelParser.Result_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#strip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrip(@NotNull EiffelParser.StripContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#retry_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetry_instruction(@NotNull EiffelParser.Retry_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#man_str_man}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMan_str_man(@NotNull EiffelParser.Man_str_manContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#parenthesized_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized_expr(@NotNull EiffelParser.Parenthesized_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#precondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecondition(@NotNull EiffelParser.PreconditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#undefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndefine(@NotNull EiffelParser.UndefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#procedure_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_name(@NotNull EiffelParser.Procedure_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#local_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_declarations(@NotNull EiffelParser.Local_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(@NotNull EiffelParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#bool_man}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_man(@NotNull EiffelParser.Bool_manContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#rename_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename_list(@NotNull EiffelParser.Rename_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(@NotNull EiffelParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(@NotNull EiffelParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#wide_char_man}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWide_char_man(@NotNull EiffelParser.Wide_char_manContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_operator(@NotNull EiffelParser.Prefix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(@NotNull EiffelParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#check_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck_instruction(@NotNull EiffelParser.Check_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#wide_man_man}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWide_man_man(@NotNull EiffelParser.Wide_man_manContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#external_effective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_effective(@NotNull EiffelParser.External_effectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#type_bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_bit(@NotNull EiffelParser.Type_bitContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#entity_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_declaration_list(@NotNull EiffelParser.Entity_declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#redefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedefine(@NotNull EiffelParser.RedefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck(@NotNull EiffelParser.CheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#formal_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_arguments(@NotNull EiffelParser.Formal_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#index_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_value(@NotNull EiffelParser.Index_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull EiffelParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#inheritance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritance(@NotNull EiffelParser.InheritanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#class_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_list(@NotNull EiffelParser.Class_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#boolean_assertion_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_assertion_clause(@NotNull EiffelParser.Boolean_assertion_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress(@NotNull EiffelParser.AddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#integer_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_constant(@NotNull EiffelParser.Integer_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#formal_generic_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_generic_list(@NotNull EiffelParser.Formal_generic_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#creation_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreation_instruction(@NotNull EiffelParser.Creation_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#result_address_mark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_address_mark(@NotNull EiffelParser.Result_address_markContext ctx);
	/**
	 * Visit a parse tree produced by {@link EiffelParser#clients}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClients(@NotNull EiffelParser.ClientsContext ctx);
}