// Generated from D:/IdeaProjects/EiffelToJSONTranslator/ANTLR_files\Eiffel.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EiffelParser}.
 */
public interface EiffelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EiffelParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(@NotNull EiffelParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(@NotNull EiffelParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#compound}.
	 * @param ctx the parse tree
	 */
	void enterCompound(@NotNull EiffelParser.CompoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#compound}.
	 * @param ctx the parse tree
	 */
	void exitCompound(@NotNull EiffelParser.CompoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#external}.
	 * @param ctx the parse tree
	 */
	void enterExternal(@NotNull EiffelParser.ExternalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#external}.
	 * @param ctx the parse tree
	 */
	void exitExternal(@NotNull EiffelParser.ExternalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(@NotNull EiffelParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(@NotNull EiffelParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#indexing}.
	 * @param ctx the parse tree
	 */
	void enterIndexing(@NotNull EiffelParser.IndexingContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#indexing}.
	 * @param ctx the parse tree
	 */
	void exitIndexing(@NotNull EiffelParser.IndexingContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#formal_generic}.
	 * @param ctx the parse tree
	 */
	void enterFormal_generic(@NotNull EiffelParser.Formal_genericContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#formal_generic}.
	 * @param ctx the parse tree
	 */
	void exitFormal_generic(@NotNull EiffelParser.Formal_genericContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#rescue}.
	 * @param ctx the parse tree
	 */
	void enterRescue(@NotNull EiffelParser.RescueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#rescue}.
	 * @param ctx the parse tree
	 */
	void exitRescue(@NotNull EiffelParser.RescueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#wide_character_constant}.
	 * @param ctx the parse tree
	 */
	void enterWide_character_constant(@NotNull EiffelParser.Wide_character_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#wide_character_constant}.
	 * @param ctx the parse tree
	 */
	void exitWide_character_constant(@NotNull EiffelParser.Wide_character_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#debug_key}.
	 * @param ctx the parse tree
	 */
	void enterDebug_key(@NotNull EiffelParser.Debug_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#debug_key}.
	 * @param ctx the parse tree
	 */
	void exitDebug_key(@NotNull EiffelParser.Debug_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterInfix(@NotNull EiffelParser.InfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitInfix(@NotNull EiffelParser.InfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#invariant}.
	 * @param ctx the parse tree
	 */
	void enterInvariant(@NotNull EiffelParser.InvariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#invariant}.
	 * @param ctx the parse tree
	 */
	void exitInvariant(@NotNull EiffelParser.InvariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#then_part}.
	 * @param ctx the parse tree
	 */
	void enterThen_part(@NotNull EiffelParser.Then_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#then_part}.
	 * @param ctx the parse tree
	 */
	void exitThen_part(@NotNull EiffelParser.Then_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#debug_key_list}.
	 * @param ctx the parse tree
	 */
	void enterDebug_key_list(@NotNull EiffelParser.Debug_key_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#debug_key_list}.
	 * @param ctx the parse tree
	 */
	void exitDebug_key_list(@NotNull EiffelParser.Debug_key_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#features}.
	 * @param ctx the parse tree
	 */
	void enterFeatures(@NotNull EiffelParser.FeaturesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#features}.
	 * @param ctx the parse tree
	 */
	void exitFeatures(@NotNull EiffelParser.FeaturesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#entity_declaration_group}.
	 * @param ctx the parse tree
	 */
	void enterEntity_declaration_group(@NotNull EiffelParser.Entity_declaration_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#entity_declaration_group}.
	 * @param ctx the parse tree
	 */
	void exitEntity_declaration_group(@NotNull EiffelParser.Entity_declaration_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(@NotNull EiffelParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(@NotNull EiffelParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#language_name}.
	 * @param ctx the parse tree
	 */
	void enterLanguage_name(@NotNull EiffelParser.Language_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#language_name}.
	 * @param ctx the parse tree
	 */
	void exitLanguage_name(@NotNull EiffelParser.Language_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#real_constant}.
	 * @param ctx the parse tree
	 */
	void enterReal_constant(@NotNull EiffelParser.Real_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#real_constant}.
	 * @param ctx the parse tree
	 */
	void exitReal_constant(@NotNull EiffelParser.Real_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#class_type_expanded}.
	 * @param ctx the parse tree
	 */
	void enterClass_type_expanded(@NotNull EiffelParser.Class_type_expandedContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#class_type_expanded}.
	 * @param ctx the parse tree
	 */
	void exitClass_type_expanded(@NotNull EiffelParser.Class_type_expandedContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(@NotNull EiffelParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(@NotNull EiffelParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#procedure_list}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_list(@NotNull EiffelParser.Procedure_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#procedure_list}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_list(@NotNull EiffelParser.Procedure_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#new_exports}.
	 * @param ctx the parse tree
	 */
	void enterNew_exports(@NotNull EiffelParser.New_exportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#new_exports}.
	 * @param ctx the parse tree
	 */
	void exitNew_exports(@NotNull EiffelParser.New_exportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#bit_type}.
	 * @param ctx the parse tree
	 */
	void enterBit_type(@NotNull EiffelParser.Bit_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#bit_type}.
	 * @param ctx the parse tree
	 */
	void exitBit_type(@NotNull EiffelParser.Bit_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#parent}.
	 * @param ctx the parse tree
	 */
	void enterParent(@NotNull EiffelParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#parent}.
	 * @param ctx the parse tree
	 */
	void exitParent(@NotNull EiffelParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#parent_list}.
	 * @param ctx the parse tree
	 */
	void enterParent_list(@NotNull EiffelParser.Parent_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#parent_list}.
	 * @param ctx the parse tree
	 */
	void exitParent_list(@NotNull EiffelParser.Parent_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(@NotNull EiffelParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(@NotNull EiffelParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#unlabeled_assertion_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnlabeled_assertion_clause(@NotNull EiffelParser.Unlabeled_assertion_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#unlabeled_assertion_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnlabeled_assertion_clause(@NotNull EiffelParser.Unlabeled_assertion_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#exit}.
	 * @param ctx the parse tree
	 */
	void enterExit(@NotNull EiffelParser.ExitContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#exit}.
	 * @param ctx the parse tree
	 */
	void exitExit(@NotNull EiffelParser.ExitContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#actual_generics}.
	 * @param ctx the parse tree
	 */
	void enterActual_generics(@NotNull EiffelParser.Actual_genericsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#actual_generics}.
	 * @param ctx the parse tree
	 */
	void exitActual_generics(@NotNull EiffelParser.Actual_genericsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(@NotNull EiffelParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(@NotNull EiffelParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#creators}.
	 * @param ctx the parse tree
	 */
	void enterCreators(@NotNull EiffelParser.CreatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#creators}.
	 * @param ctx the parse tree
	 */
	void exitCreators(@NotNull EiffelParser.CreatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#choice_constant}.
	 * @param ctx the parse tree
	 */
	void enterChoice_constant(@NotNull EiffelParser.Choice_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#choice_constant}.
	 * @param ctx the parse tree
	 */
	void exitChoice_constant(@NotNull EiffelParser.Choice_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#anchored}.
	 * @param ctx the parse tree
	 */
	void enterAnchored(@NotNull EiffelParser.AnchoredContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#anchored}.
	 * @param ctx the parse tree
	 */
	void exitAnchored(@NotNull EiffelParser.AnchoredContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(@NotNull EiffelParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(@NotNull EiffelParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#formal_generics}.
	 * @param ctx the parse tree
	 */
	void enterFormal_generics(@NotNull EiffelParser.Formal_genericsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#formal_generics}.
	 * @param ctx the parse tree
	 */
	void exitFormal_generics(@NotNull EiffelParser.Formal_genericsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#index_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_clause(@NotNull EiffelParser.Index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#index_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_clause(@NotNull EiffelParser.Index_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#manifest_array}.
	 * @param ctx the parse tree
	 */
	void enterManifest_array(@NotNull EiffelParser.Manifest_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#manifest_array}.
	 * @param ctx the parse tree
	 */
	void exitManifest_array(@NotNull EiffelParser.Manifest_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#type_list}.
	 * @param ctx the parse tree
	 */
	void enterType_list(@NotNull EiffelParser.Type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#type_list}.
	 * @param ctx the parse tree
	 */
	void exitType_list(@NotNull EiffelParser.Type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#constant_or_routine}.
	 * @param ctx the parse tree
	 */
	void enterConstant_or_routine(@NotNull EiffelParser.Constant_or_routineContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#constant_or_routine}.
	 * @param ctx the parse tree
	 */
	void exitConstant_or_routine(@NotNull EiffelParser.Constant_or_routineContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#creation}.
	 * @param ctx the parse tree
	 */
	void enterCreation(@NotNull EiffelParser.CreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#creation}.
	 * @param ctx the parse tree
	 */
	void exitCreation(@NotNull EiffelParser.CreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(@NotNull EiffelParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(@NotNull EiffelParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#formal_generic_name}.
	 * @param ctx the parse tree
	 */
	void enterFormal_generic_name(@NotNull EiffelParser.Formal_generic_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#formal_generic_name}.
	 * @param ctx the parse tree
	 */
	void exitFormal_generic_name(@NotNull EiffelParser.Formal_generic_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(@NotNull EiffelParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(@NotNull EiffelParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#header_mark}.
	 * @param ctx the parse tree
	 */
	void enterHeader_mark(@NotNull EiffelParser.Header_markContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#header_mark}.
	 * @param ctx the parse tree
	 */
	void exitHeader_mark(@NotNull EiffelParser.Header_markContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#choice}.
	 * @param ctx the parse tree
	 */
	void enterChoice(@NotNull EiffelParser.ChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#choice}.
	 * @param ctx the parse tree
	 */
	void exitChoice(@NotNull EiffelParser.ChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#index_terms}.
	 * @param ctx the parse tree
	 */
	void enterIndex_terms(@NotNull EiffelParser.Index_termsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#index_terms}.
	 * @param ctx the parse tree
	 */
	void exitIndex_terms(@NotNull EiffelParser.Index_termsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#feature_list}.
	 * @param ctx the parse tree
	 */
	void enterFeature_list(@NotNull EiffelParser.Feature_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#feature_list}.
	 * @param ctx the parse tree
	 */
	void exitFeature_list(@NotNull EiffelParser.Feature_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(@NotNull EiffelParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(@NotNull EiffelParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(@NotNull EiffelParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(@NotNull EiffelParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#feature_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFeature_declaration(@NotNull EiffelParser.Feature_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#feature_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFeature_declaration(@NotNull EiffelParser.Feature_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#deferred}.
	 * @param ctx the parse tree
	 */
	void enterDeferred(@NotNull EiffelParser.DeferredContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#deferred}.
	 * @param ctx the parse tree
	 */
	void exitDeferred(@NotNull EiffelParser.DeferredContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(@NotNull EiffelParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(@NotNull EiffelParser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#variant}.
	 * @param ctx the parse tree
	 */
	void enterVariant(@NotNull EiffelParser.VariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#variant}.
	 * @param ctx the parse tree
	 */
	void exitVariant(@NotNull EiffelParser.VariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#effective}.
	 * @param ctx the parse tree
	 */
	void enterEffective(@NotNull EiffelParser.EffectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#effective}.
	 * @param ctx the parse tree
	 */
	void exitEffective(@NotNull EiffelParser.EffectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull EiffelParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull EiffelParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#debug_keys}.
	 * @param ctx the parse tree
	 */
	void enterDebug_keys(@NotNull EiffelParser.Debug_keysContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#debug_keys}.
	 * @param ctx the parse tree
	 */
	void exitDebug_keys(@NotNull EiffelParser.Debug_keysContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#internal}.
	 * @param ctx the parse tree
	 */
	void enterInternal(@NotNull EiffelParser.InternalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#internal}.
	 * @param ctx the parse tree
	 */
	void exitInternal(@NotNull EiffelParser.InternalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#feature_adaptation}.
	 * @param ctx the parse tree
	 */
	void enterFeature_adaptation(@NotNull EiffelParser.Feature_adaptationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#feature_adaptation}.
	 * @param ctx the parse tree
	 */
	void exitFeature_adaptation(@NotNull EiffelParser.Feature_adaptationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#rename_pair}.
	 * @param ctx the parse tree
	 */
	void enterRename_pair(@NotNull EiffelParser.Rename_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#rename_pair}.
	 * @param ctx the parse tree
	 */
	void exitRename_pair(@NotNull EiffelParser.Rename_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#choices}.
	 * @param ctx the parse tree
	 */
	void enterChoices(@NotNull EiffelParser.ChoicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#choices}.
	 * @param ctx the parse tree
	 */
	void exitChoices(@NotNull EiffelParser.ChoicesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#bit_length}.
	 * @param ctx the parse tree
	 */
	void enterBit_length(@NotNull EiffelParser.Bit_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#bit_length}.
	 * @param ctx the parse tree
	 */
	void exitBit_length(@NotNull EiffelParser.Bit_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#address_mark}.
	 * @param ctx the parse tree
	 */
	void enterAddress_mark(@NotNull EiffelParser.Address_markContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#address_mark}.
	 * @param ctx the parse tree
	 */
	void exitAddress_mark(@NotNull EiffelParser.Address_markContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#boolean_constant}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_constant(@NotNull EiffelParser.Boolean_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#boolean_constant}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_constant(@NotNull EiffelParser.Boolean_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull EiffelParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull EiffelParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#parent_qualification}.
	 * @param ctx the parse tree
	 */
	void enterParent_qualification(@NotNull EiffelParser.Parent_qualificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#parent_qualification}.
	 * @param ctx the parse tree
	 */
	void exitParent_qualification(@NotNull EiffelParser.Parent_qualificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#type_mark}.
	 * @param ctx the parse tree
	 */
	void enterType_mark(@NotNull EiffelParser.Type_markContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#type_mark}.
	 * @param ctx the parse tree
	 */
	void exitType_mark(@NotNull EiffelParser.Type_markContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#assignment_attempt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_attempt(@NotNull EiffelParser.Assignment_attemptContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#assignment_attempt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_attempt(@NotNull EiffelParser.Assignment_attemptContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(@NotNull EiffelParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(@NotNull EiffelParser.Attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#manifest_constant}.
	 * @param ctx the parse tree
	 */
	void enterManifest_constant(@NotNull EiffelParser.Manifest_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#manifest_constant}.
	 * @param ctx the parse tree
	 */
	void exitManifest_constant(@NotNull EiffelParser.Manifest_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#retry}.
	 * @param ctx the parse tree
	 */
	void enterRetry(@NotNull EiffelParser.RetryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#retry}.
	 * @param ctx the parse tree
	 */
	void exitRetry(@NotNull EiffelParser.RetryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#infix_operator}.
	 * @param ctx the parse tree
	 */
	void enterInfix_operator(@NotNull EiffelParser.Infix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#infix_operator}.
	 * @param ctx the parse tree
	 */
	void exitInfix_operator(@NotNull EiffelParser.Infix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull EiffelParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull EiffelParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#old}.
	 * @param ctx the parse tree
	 */
	void enterOld(@NotNull EiffelParser.OldContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#old}.
	 * @param ctx the parse tree
	 */
	void exitOld(@NotNull EiffelParser.OldContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#feature_name}.
	 * @param ctx the parse tree
	 */
	void enterFeature_name(@NotNull EiffelParser.Feature_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#feature_name}.
	 * @param ctx the parse tree
	 */
	void exitFeature_name(@NotNull EiffelParser.Feature_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#writable}.
	 * @param ctx the parse tree
	 */
	void enterWritable(@NotNull EiffelParser.WritableContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#writable}.
	 * @param ctx the parse tree
	 */
	void exitWritable(@NotNull EiffelParser.WritableContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#rename}.
	 * @param ctx the parse tree
	 */
	void enterRename(@NotNull EiffelParser.RenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#rename}.
	 * @param ctx the parse tree
	 */
	void exitRename(@NotNull EiffelParser.RenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#index_list}.
	 * @param ctx the parse tree
	 */
	void enterIndex_list(@NotNull EiffelParser.Index_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#index_list}.
	 * @param ctx the parse tree
	 */
	void exitIndex_list(@NotNull EiffelParser.Index_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#multi_branch}.
	 * @param ctx the parse tree
	 */
	void enterMulti_branch(@NotNull EiffelParser.Multi_branchContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#multi_branch}.
	 * @param ctx the parse tree
	 */
	void exitMulti_branch(@NotNull EiffelParser.Multi_branchContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull EiffelParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull EiffelParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#declaration_body}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_body(@NotNull EiffelParser.Declaration_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#declaration_body}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_body(@NotNull EiffelParser.Declaration_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void enterLoop_body(@NotNull EiffelParser.Loop_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void exitLoop_body(@NotNull EiffelParser.Loop_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#when_part}.
	 * @param ctx the parse tree
	 */
	void enterWhen_part(@NotNull EiffelParser.When_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#when_part}.
	 * @param ctx the parse tree
	 */
	void exitWhen_part(@NotNull EiffelParser.When_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#anchor}.
	 * @param ctx the parse tree
	 */
	void enterAnchor(@NotNull EiffelParser.AnchorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#anchor}.
	 * @param ctx the parse tree
	 */
	void exitAnchor(@NotNull EiffelParser.AnchorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#feature_clause}.
	 * @param ctx the parse tree
	 */
	void enterFeature_clause(@NotNull EiffelParser.Feature_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#feature_clause}.
	 * @param ctx the parse tree
	 */
	void exitFeature_clause(@NotNull EiffelParser.Feature_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull EiffelParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull EiffelParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#postcondition}.
	 * @param ctx the parse tree
	 */
	void enterPostcondition(@NotNull EiffelParser.PostconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#postcondition}.
	 * @param ctx the parse tree
	 */
	void exitPostcondition(@NotNull EiffelParser.PostconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#new_export_list}.
	 * @param ctx the parse tree
	 */
	void enterNew_export_list(@NotNull EiffelParser.New_export_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#new_export_list}.
	 * @param ctx the parse tree
	 */
	void exitNew_export_list(@NotNull EiffelParser.New_export_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(@NotNull EiffelParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(@NotNull EiffelParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#routine_body}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_body(@NotNull EiffelParser.Routine_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#routine_body}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_body(@NotNull EiffelParser.Routine_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#assertion_clause}.
	 * @param ctx the parse tree
	 */
	void enterAssertion_clause(@NotNull EiffelParser.Assertion_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#assertion_clause}.
	 * @param ctx the parse tree
	 */
	void exitAssertion_clause(@NotNull EiffelParser.Assertion_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#then_part_list}.
	 * @param ctx the parse tree
	 */
	void enterThen_part_list(@NotNull EiffelParser.Then_part_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#then_part_list}.
	 * @param ctx the parse tree
	 */
	void exitThen_part_list(@NotNull EiffelParser.Then_part_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(@NotNull EiffelParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(@NotNull EiffelParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#creation_clause}.
	 * @param ctx the parse tree
	 */
	void enterCreation_clause(@NotNull EiffelParser.Creation_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#creation_clause}.
	 * @param ctx the parse tree
	 */
	void exitCreation_clause(@NotNull EiffelParser.Creation_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#strip}.
	 * @param ctx the parse tree
	 */
	void enterStrip(@NotNull EiffelParser.StripContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#strip}.
	 * @param ctx the parse tree
	 */
	void exitStrip(@NotNull EiffelParser.StripContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(@NotNull EiffelParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(@NotNull EiffelParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#precondition}.
	 * @param ctx the parse tree
	 */
	void enterPrecondition(@NotNull EiffelParser.PreconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#precondition}.
	 * @param ctx the parse tree
	 */
	void exitPrecondition(@NotNull EiffelParser.PreconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#undefine}.
	 * @param ctx the parse tree
	 */
	void enterUndefine(@NotNull EiffelParser.UndefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#undefine}.
	 * @param ctx the parse tree
	 */
	void exitUndefine(@NotNull EiffelParser.UndefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_name(@NotNull EiffelParser.Procedure_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_name(@NotNull EiffelParser.Procedure_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#routine_mark}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_mark(@NotNull EiffelParser.Routine_markContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#routine_mark}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_mark(@NotNull EiffelParser.Routine_markContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declarations(@NotNull EiffelParser.Local_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declarations(@NotNull EiffelParser.Local_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#tag_mark}.
	 * @param ctx the parse tree
	 */
	void enterTag_mark(@NotNull EiffelParser.Tag_markContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#tag_mark}.
	 * @param ctx the parse tree
	 */
	void exitTag_mark(@NotNull EiffelParser.Tag_markContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(@NotNull EiffelParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(@NotNull EiffelParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#class_type_separate}.
	 * @param ctx the parse tree
	 */
	void enterClass_type_separate(@NotNull EiffelParser.Class_type_separateContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#class_type_separate}.
	 * @param ctx the parse tree
	 */
	void exitClass_type_separate(@NotNull EiffelParser.Class_type_separateContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#new_feature}.
	 * @param ctx the parse tree
	 */
	void enterNew_feature(@NotNull EiffelParser.New_featureContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#new_feature}.
	 * @param ctx the parse tree
	 */
	void exitNew_feature(@NotNull EiffelParser.New_featureContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#feature_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterFeature_declaration_list(@NotNull EiffelParser.Feature_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#feature_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitFeature_declaration_list(@NotNull EiffelParser.Feature_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#rename_list}.
	 * @param ctx the parse tree
	 */
	void enterRename_list(@NotNull EiffelParser.Rename_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#rename_list}.
	 * @param ctx the parse tree
	 */
	void exitRename_list(@NotNull EiffelParser.Rename_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_operator(@NotNull EiffelParser.Prefix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_operator(@NotNull EiffelParser.Prefix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#new_export_item}.
	 * @param ctx the parse tree
	 */
	void enterNew_export_item(@NotNull EiffelParser.New_export_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#new_export_item}.
	 * @param ctx the parse tree
	 */
	void exitNew_export_item(@NotNull EiffelParser.New_export_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull EiffelParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull EiffelParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#feature_set}.
	 * @param ctx the parse tree
	 */
	void enterFeature_set(@NotNull EiffelParser.Feature_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#feature_set}.
	 * @param ctx the parse tree
	 */
	void exitFeature_set(@NotNull EiffelParser.Feature_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#routine}.
	 * @param ctx the parse tree
	 */
	void enterRoutine(@NotNull EiffelParser.RoutineContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#routine}.
	 * @param ctx the parse tree
	 */
	void exitRoutine(@NotNull EiffelParser.RoutineContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#class_header}.
	 * @param ctx the parse tree
	 */
	void enterClass_header(@NotNull EiffelParser.Class_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#class_header}.
	 * @param ctx the parse tree
	 */
	void exitClass_header(@NotNull EiffelParser.Class_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#feature_value}.
	 * @param ctx the parse tree
	 */
	void enterFeature_value(@NotNull EiffelParser.Feature_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#feature_value}.
	 * @param ctx the parse tree
	 */
	void exitFeature_value(@NotNull EiffelParser.Feature_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(@NotNull EiffelParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(@NotNull EiffelParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#redefine}.
	 * @param ctx the parse tree
	 */
	void enterRedefine(@NotNull EiffelParser.RedefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#redefine}.
	 * @param ctx the parse tree
	 */
	void exitRedefine(@NotNull EiffelParser.RedefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#entity_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterEntity_declaration_list(@NotNull EiffelParser.Entity_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#entity_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitEntity_declaration_list(@NotNull EiffelParser.Entity_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#check}.
	 * @param ctx the parse tree
	 */
	void enterCheck(@NotNull EiffelParser.CheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#check}.
	 * @param ctx the parse tree
	 */
	void exitCheck(@NotNull EiffelParser.CheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#wide_manifest_string}.
	 * @param ctx the parse tree
	 */
	void enterWide_manifest_string(@NotNull EiffelParser.Wide_manifest_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#wide_manifest_string}.
	 * @param ctx the parse tree
	 */
	void exitWide_manifest_string(@NotNull EiffelParser.Wide_manifest_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#obsolete}.
	 * @param ctx the parse tree
	 */
	void enterObsolete(@NotNull EiffelParser.ObsoleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#obsolete}.
	 * @param ctx the parse tree
	 */
	void exitObsolete(@NotNull EiffelParser.ObsoleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#formal_arguments}.
	 * @param ctx the parse tree
	 */
	void enterFormal_arguments(@NotNull EiffelParser.Formal_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#formal_arguments}.
	 * @param ctx the parse tree
	 */
	void exitFormal_arguments(@NotNull EiffelParser.Formal_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#index_value}.
	 * @param ctx the parse tree
	 */
	void enterIndex_value(@NotNull EiffelParser.Index_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#index_value}.
	 * @param ctx the parse tree
	 */
	void exitIndex_value(@NotNull EiffelParser.Index_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(@NotNull EiffelParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(@NotNull EiffelParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(@NotNull EiffelParser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(@NotNull EiffelParser.AssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void enterInheritance(@NotNull EiffelParser.InheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void exitInheritance(@NotNull EiffelParser.InheritanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#class_list}.
	 * @param ctx the parse tree
	 */
	void enterClass_list(@NotNull EiffelParser.Class_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#class_list}.
	 * @param ctx the parse tree
	 */
	void exitClass_list(@NotNull EiffelParser.Class_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(@NotNull EiffelParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(@NotNull EiffelParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#integer_constant}.
	 * @param ctx the parse tree
	 */
	void enterInteger_constant(@NotNull EiffelParser.Integer_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#integer_constant}.
	 * @param ctx the parse tree
	 */
	void exitInteger_constant(@NotNull EiffelParser.Integer_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(@NotNull EiffelParser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(@NotNull EiffelParser.AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#new_feature_list}.
	 * @param ctx the parse tree
	 */
	void enterNew_feature_list(@NotNull EiffelParser.New_feature_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#new_feature_list}.
	 * @param ctx the parse tree
	 */
	void exitNew_feature_list(@NotNull EiffelParser.New_feature_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#external_name}.
	 * @param ctx the parse tree
	 */
	void enterExternal_name(@NotNull EiffelParser.External_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#external_name}.
	 * @param ctx the parse tree
	 */
	void exitExternal_name(@NotNull EiffelParser.External_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#when_part_list}.
	 * @param ctx the parse tree
	 */
	void enterWhen_part_list(@NotNull EiffelParser.When_part_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#when_part_list}.
	 * @param ctx the parse tree
	 */
	void exitWhen_part_list(@NotNull EiffelParser.When_part_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#formal_generic_list}.
	 * @param ctx the parse tree
	 */
	void enterFormal_generic_list(@NotNull EiffelParser.Formal_generic_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#formal_generic_list}.
	 * @param ctx the parse tree
	 */
	void exitFormal_generic_list(@NotNull EiffelParser.Formal_generic_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#creation_call}.
	 * @param ctx the parse tree
	 */
	void enterCreation_call(@NotNull EiffelParser.Creation_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#creation_call}.
	 * @param ctx the parse tree
	 */
	void exitCreation_call(@NotNull EiffelParser.Creation_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(@NotNull EiffelParser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(@NotNull EiffelParser.Class_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EiffelParser#clients}.
	 * @param ctx the parse tree
	 */
	void enterClients(@NotNull EiffelParser.ClientsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EiffelParser#clients}.
	 * @param ctx the parse tree
	 */
	void exitClients(@NotNull EiffelParser.ClientsContext ctx);
}