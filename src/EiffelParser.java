// Generated from D:/IdeaProjects/EiffelToJSONTranslator/ANTLR_files\Eiffel.g4 by ANTLR 4.x
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EiffelParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, COMMENT=3, WS=4, NEWLINE=5, CONSTR=6, T__23=7, END=8, 
		INDEXING=9, SEMI=10, COLON=11, COMMA=12, CLASS=13, DEFERRED=14, EXPANDED=15, 
		SEPARATE=16, SUB=17, GT=18, OBSOLETE=19, INHERIT=20, RENAME=21, AS=22, 
		EXPORT=23, ALL=24, LBRACE=25, RBRACE=26, REDEFINE=27, UNDEFINE=28, SELECT=29, 
		CREATE=30, FEATURE=31, IS=32, UNIQUE=33, FROZEN=34, PREFIX=35, T__12=36, 
		INFIX=37, NOT=38, ADD=39, MUL=40, DIV=41, LT=42, LE=43, GE=44, T__5=45, 
		T__6=46, CARET=47, AND_THEN=48, AND=49, OR=50, XOR=51, THEN=52, ELSE=53, 
		OR_ELSE=54, IMPLIES=55, LPAREN=56, RPAREN=57, DO=58, ONCE=59, EXTERNAL=60, 
		ALIAS=61, LOCAL=62, REQUIRE=63, ENSURE=64, INVARIANT=65, RESCUE=66, BIT=67, 
		LIKE=68, CURRENT=69, RESULT=70, CREATION=71, PRECURSOR=72, DOT=73, BANG=74, 
		T__8=75, IF=76, ELSEIF=77, INSPECT=78, WHEN=79, T__9=80, FROM=81, VARIANT=82, 
		LOOP=83, UNTIL=84, DEBUG=85, CHECK=86, RETRY=87, T__14=88, OLD=89, EQUAL=90, 
		NOT_EQUAL=91, TRUE=92, FALSE=93, T__15=94, T__16=95, STRIP=96, INTEGER=97, 
		MANIFEST_STRING=98, CHARACTER_CONSTANT=99, BIT_CONSTANT=100, REAL=101, 
		IDENTIFIER=102, CHARACTER=103, DECIMAL_DIGIT=104, LETTER=105, HEXADECIMAL_CONSTANT=106;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'['", "COMMENT", "WS", "'\n'", "'->'", "':='", "'end'", 
		"'indexing'", "';'", "':'", "','", "'class'", "'deferred'", "'expanded'", 
		"'separate'", "'-'", "'>'", "'obsolete'", "'inherit'", "'rename'", "'as'", 
		"'export'", "'all'", "'{'", "'}'", "'redefine'", "'undefine'", "'select'", 
		"'create'", "'feature'", "'is'", "'unique'", "'frozen'", "'prefix'", "'\"'", 
		"'infix'", "'not'", "'+'", "'*'", "'/'", "'<'", "'<='", "'>='", "'//'", 
		"'\\\\'", "'^'", "'and then'", "'and'", "'or'", "'xor'", "'then'", "'else'", 
		"'or else'", "'implies'", "'('", "')'", "'do'", "'once'", "'external'", 
		"'alias'", "'local'", "'require'", "'ensure'", "'invariant'", "'rescue'", 
		"'bit'", "'like'", "'Current'", "'Result'", "'creation'", "'Precursor'", 
		"'.'", "'!'", "'?='", "'if'", "'elseif'", "'inspect'", "'when'", "'..'", 
		"'from'", "'variant'", "'loop'", "'until'", "'debug'", "'check'", "'retry'", 
		"'$'", "'old'", "'='", "'/='", "'true'", "'false'", "'<<'", "'>>'", "'strip'", 
		"INTEGER", "MANIFEST_STRING", "CHARACTER_CONSTANT", "BIT_CONSTANT", "REAL", 
		"IDENTIFIER", "CHARACTER", "DECIMAL_DIGIT", "LETTER", "HEXADECIMAL_CONSTANT"
	};
	public static final int
		RULE_class_declaration = 0, RULE_indexing = 1, RULE_index_list = 2, RULE_index_clause = 3, 
		RULE_index = 4, RULE_index_terms = 5, RULE_index_value = 6, RULE_class_header = 7, 
		RULE_header_mark = 8, RULE_class_name = 9, RULE_formal_generics = 10, 
		RULE_formal_generic_list = 11, RULE_formal_generic = 12, RULE_formal_generic_name = 13, 
		RULE_constraint = 14, RULE_obsolete = 15, RULE_message = 16, RULE_inheritance = 17, 
		RULE_parent_list = 18, RULE_parent = 19, RULE_feature_adaptation = 20, 
		RULE_rename = 21, RULE_rename_list = 22, RULE_rename_pair = 23, RULE_new_exports = 24, 
		RULE_new_export_list = 25, RULE_new_export_item = 26, RULE_feature_set = 27, 
		RULE_feature_list = 28, RULE_clients = 29, RULE_class_list = 30, RULE_redefine = 31, 
		RULE_undefine = 32, RULE_select = 33, RULE_creators = 34, RULE_creation_clause = 35, 
		RULE_procedure_list = 36, RULE_procedure_name = 37, RULE_features = 38, 
		RULE_feature_clause = 39, RULE_feature_declaration_list = 40, RULE_feature_declaration = 41, 
		RULE_declaration_body = 42, RULE_constant_or_routine = 43, RULE_feature_value = 44, 
		RULE_new_feature_list = 45, RULE_new_feature = 46, RULE_feature_name = 47, 
		RULE_prefix = 48, RULE_infix = 49, RULE_prefix_operator = 50, RULE_infix_operator = 51, 
		RULE_unary = 52, RULE_binary = 53, RULE_formal_arguments = 54, RULE_entity_declaration_list = 55, 
		RULE_entity_declaration_group = 56, RULE_identifier_list = 57, RULE_type_mark = 58, 
		RULE_routine = 59, RULE_routine_body = 60, RULE_effective = 61, RULE_internal = 62, 
		RULE_routine_mark = 63, RULE_deferred = 64, RULE_external = 65, RULE_language_name = 66, 
		RULE_external_name = 67, RULE_local_declarations = 68, RULE_precondition = 69, 
		RULE_postcondition = 70, RULE_invariant = 71, RULE_assertion = 72, RULE_assertion_clause = 73, 
		RULE_unlabeled_assertion_clause = 74, RULE_tag_mark = 75, RULE_tag = 76, 
		RULE_rescue = 77, RULE_type = 78, RULE_class_type = 79, RULE_actual_generics = 80, 
		RULE_type_list = 81, RULE_class_type_expanded = 82, RULE_class_type_separate = 83, 
		RULE_bit_type = 84, RULE_bit_length = 85, RULE_anchored = 86, RULE_anchor = 87, 
		RULE_compound = 88, RULE_call_qualifier = 89, RULE_usual_call = 90, RULE_call_chain = 91, 
		RULE_params = 92, RULE_param = 93, RULE_call = 94, RULE_instruction = 95, 
		RULE_creation = 96, RULE_creation_call = 97, RULE_assignment = 98, RULE_assignment_attempt = 99, 
		RULE_conditional = 100, RULE_then_part_list = 101, RULE_then_part = 102, 
		RULE_else_part = 103, RULE_multi_branch = 104, RULE_when_part_list = 105, 
		RULE_when_part = 106, RULE_choices = 107, RULE_choice = 108, RULE_interval = 109, 
		RULE_choice_constant = 110, RULE_loop = 111, RULE_initialization = 112, 
		RULE_variant = 113, RULE_loop_body = 114, RULE_exit = 115, RULE_debug = 116, 
		RULE_debug_keys = 117, RULE_debug_key_list = 118, RULE_debug_key = 119, 
		RULE_check = 120, RULE_retry = 121, RULE_parent_qualification = 122, RULE_attribute = 123, 
		RULE_writable = 124, RULE_address = 125, RULE_address_mark = 126, RULE_expression = 127, 
		RULE_boolean_expression = 128, RULE_manifest_constant = 129, RULE_boolean_constant = 130, 
		RULE_integer_constant = 131, RULE_real_constant = 132, RULE_sign = 133, 
		RULE_wide_character_constant = 134, RULE_wide_manifest_string = 135, RULE_manifest_array = 136, 
		RULE_expression_list = 137, RULE_old = 138, RULE_strip = 139, RULE_attribute_list = 140;
	public static final String[] ruleNames = {
		"class_declaration", "indexing", "index_list", "index_clause", "index", 
		"index_terms", "index_value", "class_header", "header_mark", "class_name", 
		"formal_generics", "formal_generic_list", "formal_generic", "formal_generic_name", 
		"constraint", "obsolete", "message", "inheritance", "parent_list", "parent", 
		"feature_adaptation", "rename", "rename_list", "rename_pair", "new_exports", 
		"new_export_list", "new_export_item", "feature_set", "feature_list", "clients", 
		"class_list", "redefine", "undefine", "select", "creators", "creation_clause", 
		"procedure_list", "procedure_name", "features", "feature_clause", "feature_declaration_list", 
		"feature_declaration", "declaration_body", "constant_or_routine", "feature_value", 
		"new_feature_list", "new_feature", "feature_name", "prefix", "infix", 
		"prefix_operator", "infix_operator", "unary", "binary", "formal_arguments", 
		"entity_declaration_list", "entity_declaration_group", "identifier_list", 
		"type_mark", "routine", "routine_body", "effective", "internal", "routine_mark", 
		"deferred", "external", "language_name", "external_name", "local_declarations", 
		"precondition", "postcondition", "invariant", "assertion", "assertion_clause", 
		"unlabeled_assertion_clause", "tag_mark", "tag", "rescue", "type", "class_type", 
		"actual_generics", "type_list", "class_type_expanded", "class_type_separate", 
		"bit_type", "bit_length", "anchored", "anchor", "compound", "call_qualifier", 
		"usual_call", "call_chain", "params", "param", "call", "instruction", 
		"creation", "creation_call", "assignment", "assignment_attempt", "conditional", 
		"then_part_list", "then_part", "else_part", "multi_branch", "when_part_list", 
		"when_part", "choices", "choice", "interval", "choice_constant", "loop", 
		"initialization", "variant", "loop_body", "exit", "debug", "debug_keys", 
		"debug_key_list", "debug_key", "check", "retry", "parent_qualification", 
		"attribute", "writable", "address", "address_mark", "expression", "boolean_expression", 
		"manifest_constant", "boolean_constant", "integer_constant", "real_constant", 
		"sign", "wide_character_constant", "wide_manifest_string", "manifest_array", 
		"expression_list", "old", "strip", "attribute_list"
	};

	@Override
	public String getGrammarFileName() { return "Eiffel.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EiffelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Class_declarationContext extends ParserRuleContext {
		public InvariantContext invariant() {
			return getRuleContext(InvariantContext.class,0);
		}
		public FeaturesContext features() {
			return getRuleContext(FeaturesContext.class,0);
		}
		public CreatorsContext creators() {
			return getRuleContext(CreatorsContext.class,0);
		}
		public Formal_genericsContext formal_generics() {
			return getRuleContext(Formal_genericsContext.class,0);
		}
		public ObsoleteContext obsolete() {
			return getRuleContext(ObsoleteContext.class,0);
		}
		public IndexingContext indexing() {
			return getRuleContext(IndexingContext.class,0);
		}
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public TerminalNode END() { return getToken(EiffelParser.END, 0); }
		public Class_headerContext class_header() {
			return getRuleContext(Class_headerContext.class,0);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if (_la==INDEXING) {
				{
				setState(282); indexing();
				}
			}

			setState(285); class_header();
			setState(287);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(286); formal_generics();
				}
			}

			setState(290);
			_la = _input.LA(1);
			if (_la==OBSOLETE) {
				{
				setState(289); obsolete();
				}
			}

			setState(293);
			_la = _input.LA(1);
			if (_la==INHERIT) {
				{
				setState(292); inheritance();
				}
			}

			setState(296);
			_la = _input.LA(1);
			if (_la==CREATE || _la==CREATION) {
				{
				setState(295); creators();
				}
			}

			setState(299);
			_la = _input.LA(1);
			if (_la==FEATURE) {
				{
				setState(298); features();
				}
			}

			setState(302);
			_la = _input.LA(1);
			if (_la==INVARIANT) {
				{
				setState(301); invariant();
				}
			}

			setState(304); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexingContext extends ParserRuleContext {
		public Index_listContext index_list() {
			return getRuleContext(Index_listContext.class,0);
		}
		public TerminalNode INDEXING() { return getToken(EiffelParser.INDEXING, 0); }
		public IndexingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexing; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitIndexing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexingContext indexing() throws RecognitionException {
		IndexingContext _localctx = new IndexingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_indexing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); match(INDEXING);
			setState(307); index_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_listContext extends ParserRuleContext {
		public Index_clauseContext index_clause(int i) {
			return getRuleContext(Index_clauseContext.class,i);
		}
		public List<Index_clauseContext> index_clause() {
			return getRuleContexts(Index_clauseContext.class);
		}
		public Index_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitIndex_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_listContext index_list() throws RecognitionException {
		Index_listContext _localctx = new Index_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_index_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); index_clause();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB || _la==ADD || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (T__14 - 88)) | (1L << (TRUE - 88)) | (1L << (FALSE - 88)) | (1L << (INTEGER - 88)) | (1L << (MANIFEST_STRING - 88)) | (1L << (CHARACTER_CONSTANT - 88)) | (1L << (BIT_CONSTANT - 88)) | (1L << (REAL - 88)) | (1L << (IDENTIFIER - 88)) | (1L << (HEXADECIMAL_CONSTANT - 88)))) != 0)) {
				{
				{
				setState(310); index_clause();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_clauseContext extends ParserRuleContext {
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public Index_termsContext index_terms() {
			return getRuleContext(Index_termsContext.class,0);
		}
		public Index_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitIndex_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_clauseContext index_clause() throws RecognitionException {
		Index_clauseContext _localctx = new Index_clauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_index_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(316); index();
				}
				break;
			}
			setState(319); index_terms();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EiffelParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(EiffelParser.COLON, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); match(IDENTIFIER);
			setState(322); match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_termsContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(EiffelParser.COMMA); }
		public Index_valueContext index_value(int i) {
			return getRuleContext(Index_valueContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(EiffelParser.COMMA, i);
		}
		public List<Index_valueContext> index_value() {
			return getRuleContexts(Index_valueContext.class);
		}
		public Index_termsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_terms; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitIndex_terms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_termsContext index_terms() throws RecognitionException {
		Index_termsContext _localctx = new Index_termsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_index_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); index_value();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(325); match(COMMA);
				setState(326); index_value();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_valueContext extends ParserRuleContext {
		public Manifest_constantContext manifest_constant() {
			return getRuleContext(Manifest_constantContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(EiffelParser.IDENTIFIER, 0); }
		public Index_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitIndex_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_valueContext index_value() throws RecognitionException {
		Index_valueContext _localctx = new Index_valueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_index_value);
		try {
			setState(334);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(332); match(IDENTIFIER);
				}
				break;
			case SUB:
			case ADD:
			case T__14:
			case TRUE:
			case FALSE:
			case INTEGER:
			case MANIFEST_STRING:
			case CHARACTER_CONSTANT:
			case BIT_CONSTANT:
			case REAL:
			case HEXADECIMAL_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(333); manifest_constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_headerContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Header_markContext header_mark() {
			return getRuleContext(Header_markContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(EiffelParser.CLASS, 0); }
		public Class_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitClass_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_headerContext class_header() throws RecognitionException {
		Class_headerContext _localctx = new Class_headerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_class_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFERRED) | (1L << EXPANDED) | (1L << SEPARATE))) != 0)) {
				{
				setState(336); header_mark();
				}
			}

			setState(339); match(CLASS);
			setState(340); class_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Header_markContext extends ParserRuleContext {
		public TerminalNode EXPANDED() { return getToken(EiffelParser.EXPANDED, 0); }
		public TerminalNode DEFERRED() { return getToken(EiffelParser.DEFERRED, 0); }
		public TerminalNode SEPARATE() { return getToken(EiffelParser.SEPARATE, 0); }
		public Header_markContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_mark; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitHeader_mark(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Header_markContext header_mark() throws RecognitionException {
		Header_markContext _localctx = new Header_markContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_header_mark);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFERRED) | (1L << EXPANDED) | (1L << SEPARATE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EiffelParser.IDENTIFIER, 0); }
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_genericsContext extends ParserRuleContext {
		public Formal_generic_listContext formal_generic_list() {
			return getRuleContext(Formal_generic_listContext.class,0);
		}
		public Formal_genericsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_generics; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitFormal_generics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_genericsContext formal_generics() throws RecognitionException {
		Formal_genericsContext _localctx = new Formal_genericsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formal_generics);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); formal_generic_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_generic_listContext extends ParserRuleContext {
		public List<Formal_genericContext> formal_generic() {
			return getRuleContexts(Formal_genericContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(EiffelParser.COMMA); }
		public Formal_genericContext formal_generic(int i) {
			return getRuleContext(Formal_genericContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(EiffelParser.COMMA, i);
		}
		public Formal_generic_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_generic_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitFormal_generic_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_generic_listContext formal_generic_list() throws RecognitionException {
		Formal_generic_listContext _localctx = new Formal_generic_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formal_generic_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348); formal_generic();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(349); match(COMMA);
				setState(350); formal_generic();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_genericContext extends ParserRuleContext {
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public Formal_generic_nameContext formal_generic_name() {
			return getRuleContext(Formal_generic_nameContext.class,0);
		}
		public Formal_genericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_generic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitFormal_generic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_genericContext formal_generic() throws RecognitionException {
		Formal_genericContext _localctx = new Formal_genericContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_formal_generic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356); formal_generic_name();
			setState(358);
			_la = _input.LA(1);
			if (_la==CONSTR) {
				{
				setState(357); constraint();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_generic_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EiffelParser.IDENTIFIER, 0); }
		public Formal_generic_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_generic_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitFormal_generic_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_generic_nameContext formal_generic_name() throws RecognitionException {
		Formal_generic_nameContext _localctx = new Formal_generic_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_formal_generic_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public TerminalNode CONSTR() { return getToken(EiffelParser.CONSTR, 0); }
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362); match(CONSTR);
			setState(363); class_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObsoleteContext extends ParserRuleContext {
		public TerminalNode OBSOLETE() { return getToken(EiffelParser.OBSOLETE, 0); }
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public ObsoleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obsolete; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitObsolete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObsoleteContext obsolete() throws RecognitionException {
		ObsoleteContext _localctx = new ObsoleteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_obsolete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); match(OBSOLETE);
			setState(366); message();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageContext extends ParserRuleContext {
		public TerminalNode MANIFEST_STRING() { return getToken(EiffelParser.MANIFEST_STRING, 0); }
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); match(MANIFEST_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceContext extends ParserRuleContext {
		public Parent_listContext parent_list() {
			return getRuleContext(Parent_listContext.class,0);
		}
		public TerminalNode INHERIT() { return getToken(EiffelParser.INHERIT, 0); }
		public InheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritance; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitInheritance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritanceContext inheritance() throws RecognitionException {
		InheritanceContext _localctx = new InheritanceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inheritance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); match(INHERIT);
			setState(371); parent_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parent_listContext extends ParserRuleContext {
		public ParentContext parent(int i) {
			return getRuleContext(ParentContext.class,i);
		}
		public List<ParentContext> parent() {
			return getRuleContexts(ParentContext.class);
		}
		public List<TerminalNode> SEMI() { return getTokens(EiffelParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(EiffelParser.SEMI, i);
		}
		public Parent_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitParent_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parent_listContext parent_list() throws RecognitionException {
		Parent_listContext _localctx = new Parent_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parent_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373); parent();
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(374); match(SEMI);
					setState(375); parent();
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(381); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParentContext extends ParserRuleContext {
		public Feature_adaptationContext feature_adaptation() {
			return getRuleContext(Feature_adaptationContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public ParentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitParent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentContext parent() throws RecognitionException {
		ParentContext _localctx = new ParentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383); class_type();
			setState(385);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << END) | (1L << RENAME) | (1L << EXPORT) | (1L << REDEFINE) | (1L << UNDEFINE) | (1L << SELECT))) != 0)) {
				{
				setState(384); feature_adaptation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Feature_adaptationContext extends ParserRuleContext {
		public RenameContext rename() {
			return getRuleContext(RenameContext.class,0);
		}
		public RedefineContext redefine() {
			return getRuleContext(RedefineContext.class,0);
		}
		public New_exportsContext new_exports() {
			return getRuleContext(New_exportsContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public UndefineContext undefine() {
			return getRuleContext(UndefineContext.class,0);
		}
		public TerminalNode END() { return getToken(EiffelParser.END, 0); }
		public Feature_adaptationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_adaptation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitFeature_adaptation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_adaptationContext feature_adaptation() throws RecognitionException {
		Feature_adaptationContext _localctx = new Feature_adaptationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_feature_adaptation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if (_la==RENAME) {
				{
				setState(387); rename();
				}
			}

			setState(391);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(390); new_exports();
				}
			}

			setState(394);
			_la = _input.LA(1);
			if (_la==UNDEFINE) {
				{
				setState(393); undefine();
				}
			}

			setState(397);
			_la = _input.LA(1);
			if (_la==REDEFINE) {
				{
				setState(396); redefine();
				}
			}

			setState(400);
			_la = _input.LA(1);
			if (_la==SELECT) {
				{
				setState(399); select();
				}
			}

			setState(402); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(EiffelParser.RENAME, 0); }
		public Rename_listContext rename_list() {
			return getRuleContext(Rename_listContext.class,0);
		}
		public RenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitRename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameContext rename() throws RecognitionException {
		RenameContext _localctx = new RenameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404); match(RENAME);
			setState(405); rename_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rename_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(EiffelParser.COMMA); }
		public Rename_pairContext rename_pair(int i) {
			return getRuleContext(Rename_pairContext.class,i);
		}
		public List<Rename_pairContext> rename_pair() {
			return getRuleContexts(Rename_pairContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(EiffelParser.COMMA, i);
		}
		public Rename_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitRename_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rename_listContext rename_list() throws RecognitionException {
		Rename_listContext _localctx = new Rename_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_rename_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407); rename_pair();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(408); match(COMMA);
				setState(409); rename_pair();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rename_pairContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(EiffelParser.AS, 0); }
		public List<Feature_nameContext> feature_name() {
			return getRuleContexts(Feature_nameContext.class);
		}
		public Feature_nameContext feature_name(int i) {
			return getRuleContext(Feature_nameContext.class,i);
		}
		public Rename_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_pair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitRename_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rename_pairContext rename_pair() throws RecognitionException {
		Rename_pairContext _localctx = new Rename_pairContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rename_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415); feature_name();
			setState(416); match(AS);
			setState(417); feature_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_exportsContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(EiffelParser.EXPORT, 0); }
		public New_export_listContext new_export_list() {
			return getRuleContext(New_export_listContext.class,0);
		}
		public New_exportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_exports; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitNew_exports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_exportsContext new_exports() throws RecognitionException {
		New_exportsContext _localctx = new New_exportsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_new_exports);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); match(EXPORT);
			setState(420); new_export_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_export_listContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(EiffelParser.SEMI); }
		public List<New_export_itemContext> new_export_item() {
			return getRuleContexts(New_export_itemContext.class);
		}
		public TerminalNode SEMI(int i) {
			return getToken(EiffelParser.SEMI, i);
		}
		public New_export_itemContext new_export_item(int i) {
			return getRuleContext(New_export_itemContext.class,i);
		}
		public New_export_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_export_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitNew_export_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_export_listContext new_export_list() throws RecognitionException {
		New_export_listContext _localctx = new New_export_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_new_export_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(422); new_export_item();
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(423); match(SEMI);
					setState(424); new_export_item();
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(430); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_export_itemContext extends ParserRuleContext {
		public Feature_setContext feature_set() {
			return getRuleContext(Feature_setContext.class,0);
		}
		public ClientsContext clients() {
			return getRuleContext(ClientsContext.class,0);
		}
		public New_export_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_export_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitNew_export_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_export_itemContext new_export_item() throws RecognitionException {
		New_export_itemContext _localctx = new New_export_itemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_new_export_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432); clients();
			setState(433); feature_set();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Feature_setContext extends ParserRuleContext {
		public Feature_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_set; }
	 
		public Feature_setContext() { }
		public void copyFrom(Feature_setContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class All_featuresContext extends Feature_setContext {
		public TerminalNode ALL() { return getToken(EiffelParser.ALL, 0); }
		public All_featuresContext(Feature_setContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitAll_features(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Some_featuresContext extends Feature_setContext {
		public Feature_listContext feature_list() {
			return getRuleContext(Feature_listContext.class,0);
		}
		public Some_featuresContext(Feature_setContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitSome_features(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_setContext feature_set() throws RecognitionException {
		Feature_setContext _localctx = new Feature_setContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_feature_set);
		try {
			setState(437);
			switch (_input.LA(1)) {
			case PREFIX:
			case INFIX:
			case IDENTIFIER:
				_localctx = new Some_featuresContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(435); feature_list();
				}
				break;
			case ALL:
				_localctx = new All_featuresContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(436); match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Feature_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(EiffelParser.COMMA); }
		public List<Feature_nameContext> feature_name() {
			return getRuleContexts(Feature_nameContext.class);
		}
		public Feature_nameContext feature_name(int i) {
			return getRuleContext(Feature_nameContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(EiffelParser.COMMA, i);
		}
		public Feature_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitFeature_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_listContext feature_list() throws RecognitionException {
		Feature_listContext _localctx = new Feature_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_feature_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439); feature_name();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(440); match(COMMA);
				setState(441); feature_name();
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClientsContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(EiffelParser.LBRACE, 0); }
		public Class_listContext class_list() {
			return getRuleContext(Class_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(EiffelParser.RBRACE, 0); }
		public ClientsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clients; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitClients(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClientsContext clients() throws RecognitionException {
		ClientsContext _localctx = new ClientsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_clients);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447); match(LBRACE);
			setState(448); class_list();
			setState(449); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_listContext extends ParserRuleContext {
		public Class_nameContext class_name(int i) {
			return getRuleContext(Class_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EiffelParser.COMMA); }
		public List<Class_nameContext> class_name() {
			return getRuleContexts(Class_nameContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(EiffelParser.COMMA, i);
		}
		public Class_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitClass_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_listContext class_list() throws RecognitionException {
		Class_listContext _localctx = new Class_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_class_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451); class_name();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(452); match(COMMA);
				setState(453); class_name();
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RedefineContext extends ParserRuleContext {
		public Feature_listContext feature_list() {
			return getRuleContext(Feature_listContext.class,0);
		}
		public TerminalNode REDEFINE() { return getToken(EiffelParser.REDEFINE, 0); }
		public RedefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redefine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitRedefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RedefineContext redefine() throws RecognitionException {
		RedefineContext _localctx = new RedefineContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_redefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); match(REDEFINE);
			setState(460); feature_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UndefineContext extends ParserRuleContext {
		public Feature_listContext feature_list() {
			return getRuleContext(Feature_listContext.class,0);
		}
		public TerminalNode UNDEFINE() { return getToken(EiffelParser.UNDEFINE, 0); }
		public UndefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undefine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitUndefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UndefineContext undefine() throws RecognitionException {
		UndefineContext _localctx = new UndefineContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_undefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462); match(UNDEFINE);
			setState(463); feature_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public Feature_listContext feature_list() {
			return getRuleContext(Feature_listContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(EiffelParser.SELECT, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); match(SELECT);
			setState(466); feature_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorsContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(EiffelParser.CREATE, 0); }
		public List<Creation_clauseContext> creation_clause() {
			return getRuleContexts(Creation_clauseContext.class);
		}
		public TerminalNode CREATION() { return getToken(EiffelParser.CREATION, 0); }
		public Creation_clauseContext creation_clause(int i) {
			return getRuleContext(Creation_clauseContext.class,i);
		}
		public CreatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creators; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitCreators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorsContext creators() throws RecognitionException {
		CreatorsContext _localctx = new CreatorsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_creators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_la = _input.LA(1);
			if ( !(_la==CREATE || _la==CREATION) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(470); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(469); creation_clause();
				}
				}
				setState(472); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMENT || _la==LBRACE || _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_clauseContext extends ParserRuleContext {
		public ClientsContext clients() {
			return getRuleContext(ClientsContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(EiffelParser.COMMENT, 0); }
		public Procedure_listContext procedure_list() {
			return getRuleContext(Procedure_listContext.class,0);
		}
		public Creation_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitCreation_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Creation_clauseContext creation_clause() throws RecognitionException {
		Creation_clauseContext _localctx = new Creation_clauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_creation_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(474); clients();
				}
			}

			setState(478);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(477); match(COMMENT);
				}
			}

			setState(480); procedure_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_listContext extends ParserRuleContext {
		public Procedure_nameContext procedure_name(int i) {
			return getRuleContext(Procedure_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EiffelParser.COMMA); }
		public List<Procedure_nameContext> procedure_name() {
			return getRuleContexts(Procedure_nameContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(EiffelParser.COMMA, i);
		}
		public Procedure_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitProcedure_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_listContext procedure_list() throws RecognitionException {
		Procedure_listContext _localctx = new Procedure_listContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_procedure_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482); procedure_name();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(483); match(COMMA);
				setState(484); procedure_name();
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EiffelParser.IDENTIFIER, 0); }
		public Procedure_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitProcedure_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_nameContext procedure_name() throws RecognitionException {
		Procedure_nameContext _localctx = new Procedure_nameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_procedure_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeaturesContext extends ParserRuleContext {
		public Feature_clauseContext feature_clause(int i) {
			return getRuleContext(Feature_clauseContext.class,i);
		}
		public List<TerminalNode> FEATURE() { return getTokens(EiffelParser.FEATURE); }
		public List<Feature_clauseContext> feature_clause() {
			return getRuleContexts(Feature_clauseContext.class);
		}
		public TerminalNode FEATURE(int i) {
			return getToken(EiffelParser.FEATURE, i);
		}
		public FeaturesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_features; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitFeatures(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeaturesContext features() throws RecognitionException {
		FeaturesContext _localctx = new FeaturesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_features);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492); match(FEATURE);
			setState(493); feature_clause();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FEATURE) {
				{
				{
				setState(494); match(FEATURE);
				setState(495); feature_clause();
				}
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Feature_clauseContext extends ParserRuleContext {
		public Feature_declaration_listContext feature_declaration_list() {
			return getRuleContext(Feature_declaration_listContext.class,0);
		}
		public ClientsContext clients() {
			return getRuleContext(ClientsContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(EiffelParser.COMMENT, 0); }
		public Feature_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitFeature_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_clauseContext feature_clause() throws RecognitionException {
		Feature_clauseContext _localctx = new Feature_clauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_feature_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(501); clients();
				}
			}

			setState(505);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(504); match(COMMENT);
				}
			}

			setState(508);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FROZEN) | (1L << PREFIX) | (1L << INFIX))) != 0) || _la==IDENTIFIER) {
				{
				setState(507); feature_declaration_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Feature_declaration_listContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(EiffelParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(EiffelParser.NEWLINE, i);
		}
		public List<Feature_declarationContext> feature_declaration() {
			return getRuleContexts(Feature_declarationContext.class);
		}
		public Feature_declarationContext feature_declaration(int i) {
			return getRuleContext(Feature_declarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(EiffelParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(EiffelParser.SEMI, i);
		}
		public Feature_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_declaration_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitFeature_declaration_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_declaration_listContext feature_declaration_list() throws RecognitionException {
		Feature_declaration_listContext _localctx = new Feature_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_feature_declaration_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(510); feature_declaration();
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(511);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==SEMI) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(512); feature_declaration();
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(518);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==SEMI) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Feature_declarationContext extends ParserRuleContext {
		public New_feature_listContext new_feature_list() {
			return getRuleContext(New_feature_listContext.class,0);
		}
		public Declaration_bodyContext declaration_body() {
			return getRuleContext(Declaration_bodyContext.class,0);
		}
		public Feature_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitFeature_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_declarationContext feature_declaration() throws RecognitionException {
		Feature_declarationContext _localctx = new Feature_declarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_feature_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520); new_feature_list();
			setState(521); declaration_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_bodyContext extends ParserRuleContext {
		public Formal_argumentsContext formal_arguments() {
			return getRuleContext(Formal_argumentsContext.class,0);
		}
		public Constant_or_routineContext constant_or_routine() {
			return getRuleContext(Constant_or_routineContext.class,0);
		}
		public Type_markContext type_mark() {
			return getRuleContext(Type_markContext.class,0);
		}
		public Declaration_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitDeclaration_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_bodyContext declaration_body() throws RecognitionException {
		Declaration_bodyContext _localctx = new Declaration_bodyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_declaration_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(523); formal_arguments();
				}
			}

			setState(527);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(526); type_mark();
				}
			}

			setState(530);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(529); constant_or_routine();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_or_routineContext extends ParserRuleContext {
		public Feature_valueContext feature_value() {
			return getRuleContext(Feature_valueContext.class,0);
		}
		public TerminalNode IS() { return getToken(EiffelParser.IS, 0); }
		public Constant_or_routineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_or_routine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitConstant_or_routine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_or_routineContext constant_or_routine() throws RecognitionException {
		Constant_or_routineContext _localctx = new Constant_or_routineContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constant_or_routine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532); match(IS);
			setState(533); feature_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Feature_valueContext extends ParserRuleContext {
		public Feature_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_value; }
	 
		public Feature_valueContext() { }
		public void copyFrom(Feature_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Routine_feature_valueContext extends Feature_valueContext {
		public RoutineContext routine() {
			return getRuleContext(RoutineContext.class,0);
		}
		public Routine_feature_valueContext(Feature_valueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitRoutine_feature_value(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Constant_feature_valueContext extends Feature_valueContext {
		public Manifest_constantContext manifest_constant() {
			return getRuleContext(Manifest_constantContext.class,0);
		}
		public Constant_feature_valueContext(Feature_valueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitConstant_feature_value(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unique_feature_valueContext extends Feature_valueContext {
		public TerminalNode UNIQUE() { return getToken(EiffelParser.UNIQUE, 0); }
		public Unique_feature_valueContext(Feature_valueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitUnique_feature_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_valueContext feature_value() throws RecognitionException {
		Feature_valueContext _localctx = new Feature_valueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_feature_value);
		try {
			setState(538);
			switch (_input.LA(1)) {
			case SUB:
			case ADD:
			case T__14:
			case TRUE:
			case FALSE:
			case INTEGER:
			case MANIFEST_STRING:
			case CHARACTER_CONSTANT:
			case BIT_CONSTANT:
			case REAL:
			case HEXADECIMAL_CONSTANT:
				_localctx = new Constant_feature_valueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(535); manifest_constant();
				}
				break;
			case UNIQUE:
				_localctx = new Unique_feature_valueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(536); match(UNIQUE);
				}
				break;
			case COMMENT:
			case DEFERRED:
			case OBSOLETE:
			case DO:
			case ONCE:
			case EXTERNAL:
			case LOCAL:
			case REQUIRE:
				_localctx = new Routine_feature_valueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(537); routine();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_feature_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(EiffelParser.COMMA); }
		public New_featureContext new_feature(int i) {
			return getRuleContext(New_featureContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(EiffelParser.COMMA, i);
		}
		public List<New_featureContext> new_feature() {
			return getRuleContexts(New_featureContext.class);
		}
		public New_feature_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_feature_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitNew_feature_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_feature_listContext new_feature_list() throws RecognitionException {
		New_feature_listContext _localctx = new New_feature_listContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_new_feature_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540); new_feature();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(541); match(COMMA);
				setState(542); new_feature();
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_featureContext extends ParserRuleContext {
		public Feature_nameContext feature_name() {
			return getRuleContext(Feature_nameContext.class,0);
		}
		public TerminalNode FROZEN() { return getToken(EiffelParser.FROZEN, 0); }
		public New_featureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_feature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitNew_feature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_featureContext new_feature() throws RecognitionException {
		New_featureContext _localctx = new New_featureContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_new_feature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_la = _input.LA(1);
			if (_la==FROZEN) {
				{
				setState(548); match(FROZEN);
				}
			}

			setState(551); feature_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Feature_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EiffelParser.IDENTIFIER, 0); }
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public Feature_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitFeature_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_nameContext feature_name() throws RecognitionException {
		Feature_nameContext _localctx = new Feature_nameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_feature_name);
		try {
			setState(556);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(553); match(IDENTIFIER);
				}
				break;
			case PREFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(554); prefix();
				}
				break;
			case INFIX:
				enterOuterAlt(_localctx, 3);
				{
				setState(555); infix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixContext extends ParserRuleContext {
		public TerminalNode PREFIX() { return getToken(EiffelParser.PREFIX, 0); }
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public TerminalNode T__12(int i) {
			return getToken(EiffelParser.T__12, i);
		}
		public List<TerminalNode> T__12() { return getTokens(EiffelParser.T__12); }
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558); match(PREFIX);
			setState(559); match(T__12);
			setState(560); prefix_operator();
			setState(561); match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixContext extends ParserRuleContext {
		public TerminalNode INFIX() { return getToken(EiffelParser.INFIX, 0); }
		public Infix_operatorContext infix_operator() {
			return getRuleContext(Infix_operatorContext.class,0);
		}
		public TerminalNode T__12(int i) {
			return getToken(EiffelParser.T__12, i);
		}
		public List<TerminalNode> T__12() { return getTokens(EiffelParser.T__12); }
		public InfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitInfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixContext infix() throws RecognitionException {
		InfixContext _localctx = new InfixContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_infix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563); match(INFIX);
			setState(564); match(T__12);
			setState(565); infix_operator();
			setState(566); match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_operatorContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public Prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitPrefix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_operatorContext prefix_operator() throws RecognitionException {
		Prefix_operatorContext _localctx = new Prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568); unary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Infix_operatorContext extends ParserRuleContext {
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public Infix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitInfix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infix_operatorContext infix_operator() throws RecognitionException {
		Infix_operatorContext _localctx = new Infix_operatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_infix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570); binary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(EiffelParser.NOT, 0); }
		public TerminalNode SUB() { return getToken(EiffelParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(EiffelParser.ADD, 0); }
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NOT) | (1L << ADD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(EiffelParser.THEN, 0); }
		public TerminalNode T__6() { return getToken(EiffelParser.T__6, 0); }
		public TerminalNode MUL() { return getToken(EiffelParser.MUL, 0); }
		public TerminalNode WS() { return getToken(EiffelParser.WS, 0); }
		public TerminalNode XOR() { return getToken(EiffelParser.XOR, 0); }
		public TerminalNode AND() { return getToken(EiffelParser.AND, 0); }
		public TerminalNode OR() { return getToken(EiffelParser.OR, 0); }
		public TerminalNode LE() { return getToken(EiffelParser.LE, 0); }
		public TerminalNode ADD() { return getToken(EiffelParser.ADD, 0); }
		public TerminalNode GE() { return getToken(EiffelParser.GE, 0); }
		public TerminalNode DIV() { return getToken(EiffelParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(EiffelParser.ELSE, 0); }
		public TerminalNode LT() { return getToken(EiffelParser.LT, 0); }
		public TerminalNode T__5() { return getToken(EiffelParser.T__5, 0); }
		public TerminalNode CARET() { return getToken(EiffelParser.CARET, 0); }
		public TerminalNode GT() { return getToken(EiffelParser.GT, 0); }
		public TerminalNode IMPLIES() { return getToken(EiffelParser.IMPLIES, 0); }
		public TerminalNode SUB() { return getToken(EiffelParser.SUB, 0); }
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_binary);
		try {
			setState(595);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574); match(MUL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575); match(DIV);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(576); match(ADD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(577); match(SUB);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(578); match(LT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(579); match(GT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(580); match(LE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(581); match(GE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(582); match(T__5);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(583); match(T__6);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(584); match(CARET);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(585); match(AND);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(586); match(OR);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(587); match(XOR);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(588); match(AND);
				setState(589); match(WS);
				setState(590); match(THEN);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(591); match(OR);
				setState(592); match(WS);
				setState(593); match(ELSE);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(594); match(IMPLIES);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_argumentsContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(EiffelParser.RPAREN, 0); }
		public Entity_declaration_listContext entity_declaration_list() {
			return getRuleContext(Entity_declaration_listContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(EiffelParser.LPAREN, 0); }
		public Formal_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitFormal_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_argumentsContext formal_arguments() throws RecognitionException {
		Formal_argumentsContext _localctx = new Formal_argumentsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_formal_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597); match(LPAREN);
			setState(599);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(598); entity_declaration_list();
				}
			}

			setState(601); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_declaration_listContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(EiffelParser.SEMI); }
		public List<TerminalNode> COMMA() { return getTokens(EiffelParser.COMMA); }
		public TerminalNode SEMI(int i) {
			return getToken(EiffelParser.SEMI, i);
		}
		public List<Entity_declaration_groupContext> entity_declaration_group() {
			return getRuleContexts(Entity_declaration_groupContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(EiffelParser.COMMA, i);
		}
		public Entity_declaration_groupContext entity_declaration_group(int i) {
			return getRuleContext(Entity_declaration_groupContext.class,i);
		}
		public Entity_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_declaration_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitEntity_declaration_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_declaration_listContext entity_declaration_list() throws RecognitionException {
		Entity_declaration_listContext _localctx = new Entity_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_entity_declaration_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(603); entity_declaration_group();
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(604);
					_la = _input.LA(1);
					if ( !(_la==SEMI || _la==COMMA) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(605); entity_declaration_group();
					}
					} 
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_declaration_groupContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Type_markContext type_mark() {
			return getRuleContext(Type_markContext.class,0);
		}
		public Entity_declaration_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_declaration_group; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitEntity_declaration_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_declaration_groupContext entity_declaration_group() throws RecognitionException {
		Entity_declaration_groupContext _localctx = new Entity_declaration_groupContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_entity_declaration_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611); identifier_list();
			setState(612); type_mark();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EiffelParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EiffelParser.IDENTIFIER); }
		public List<TerminalNode> COMMA() { return getTokens(EiffelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EiffelParser.COMMA, i);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitIdentifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614); match(IDENTIFIER);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(615); match(COMMA);
				setState(616); match(IDENTIFIER);
				}
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_markContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(EiffelParser.COLON, 0); }
		public Type_markContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_mark; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitType_mark(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_markContext type_mark() throws RecognitionException {
		Type_markContext _localctx = new Type_markContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_type_mark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622); match(COLON);
			setState(623); type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoutineContext extends ParserRuleContext {
		public PostconditionContext postcondition() {
			return getRuleContext(PostconditionContext.class,0);
		}
		public ObsoleteContext obsolete() {
			return getRuleContext(ObsoleteContext.class,0);
		}
		public Routine_bodyContext routine_body() {
			return getRuleContext(Routine_bodyContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(EiffelParser.COMMENT, 0); }
		public PreconditionContext precondition() {
			return getRuleContext(PreconditionContext.class,0);
		}
		public RescueContext rescue() {
			return getRuleContext(RescueContext.class,0);
		}
		public Local_declarationsContext local_declarations() {
			return getRuleContext(Local_declarationsContext.class,0);
		}
		public TerminalNode END() { return getToken(EiffelParser.END, 0); }
		public RoutineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitRoutine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineContext routine() throws RecognitionException {
		RoutineContext _localctx = new RoutineContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_routine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_la = _input.LA(1);
			if (_la==OBSOLETE) {
				{
				setState(625); obsolete();
				}
			}

			setState(629);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(628); match(COMMENT);
				}
			}

			setState(632);
			_la = _input.LA(1);
			if (_la==REQUIRE) {
				{
				setState(631); precondition();
				}
			}

			setState(635);
			_la = _input.LA(1);
			if (_la==LOCAL) {
				{
				setState(634); local_declarations();
				}
			}

			setState(637); routine_body();
			setState(639);
			_la = _input.LA(1);
			if (_la==ENSURE) {
				{
				setState(638); postcondition();
				}
			}

			setState(642);
			_la = _input.LA(1);
			if (_la==RESCUE) {
				{
				setState(641); rescue();
				}
			}

			setState(644); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Routine_bodyContext extends ParserRuleContext {
		public Routine_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routine_body; }
	 
		public Routine_bodyContext() { }
		public void copyFrom(Routine_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Effective_routine_bodyContext extends Routine_bodyContext {
		public EffectiveContext effective() {
			return getRuleContext(EffectiveContext.class,0);
		}
		public Effective_routine_bodyContext(Routine_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitEffective_routine_body(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Deferred_routine_bodyContext extends Routine_bodyContext {
		public DeferredContext deferred() {
			return getRuleContext(DeferredContext.class,0);
		}
		public Deferred_routine_bodyContext(Routine_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitDeferred_routine_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Routine_bodyContext routine_body() throws RecognitionException {
		Routine_bodyContext _localctx = new Routine_bodyContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_routine_body);
		try {
			setState(648);
			switch (_input.LA(1)) {
			case DO:
			case ONCE:
			case EXTERNAL:
				_localctx = new Effective_routine_bodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(646); effective();
				}
				break;
			case DEFERRED:
				_localctx = new Deferred_routine_bodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(647); deferred();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EffectiveContext extends ParserRuleContext {
		public EffectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effective; }
	 
		public EffectiveContext() { }
		public void copyFrom(EffectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class External_effectiveContext extends EffectiveContext {
		public ExternalContext external() {
			return getRuleContext(ExternalContext.class,0);
		}
		public External_effectiveContext(EffectiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitExternal_effective(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Internal_effectiveContext extends EffectiveContext {
		public InternalContext internal() {
			return getRuleContext(InternalContext.class,0);
		}
		public Internal_effectiveContext(EffectiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitInternal_effective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectiveContext effective() throws RecognitionException {
		EffectiveContext _localctx = new EffectiveContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_effective);
		try {
			setState(652);
			switch (_input.LA(1)) {
			case DO:
			case ONCE:
				_localctx = new Internal_effectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(650); internal();
				}
				break;
			case EXTERNAL:
				_localctx = new External_effectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(651); external();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InternalContext extends ParserRuleContext {
		public Routine_markContext routine_mark() {
			return getRuleContext(Routine_markContext.class,0);
		}
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public InternalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_internal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitInternal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InternalContext internal() throws RecognitionException {
		InternalContext _localctx = new InternalContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_internal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654); routine_mark();
			setState(655); compound();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Routine_markContext extends ParserRuleContext {
		public Routine_markContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routine_mark; }
	 
		public Routine_markContext() { }
		public void copyFrom(Routine_markContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OnceContext extends Routine_markContext {
		public TerminalNode ONCE() { return getToken(EiffelParser.ONCE, 0); }
		public OnceContext(Routine_markContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitOnce(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoContext extends Routine_markContext {
		public TerminalNode DO() { return getToken(EiffelParser.DO, 0); }
		public DoContext(Routine_markContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitDo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Routine_markContext routine_mark() throws RecognitionException {
		Routine_markContext _localctx = new Routine_markContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_routine_mark);
		try {
			setState(659);
			switch (_input.LA(1)) {
			case DO:
				_localctx = new DoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(657); match(DO);
				}
				break;
			case ONCE:
				_localctx = new OnceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(658); match(ONCE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeferredContext extends ParserRuleContext {
		public TerminalNode DEFERRED() { return getToken(EiffelParser.DEFERRED, 0); }
		public DeferredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deferred; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitDeferred(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeferredContext deferred() throws RecognitionException {
		DeferredContext _localctx = new DeferredContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_deferred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661); match(DEFERRED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalContext extends ParserRuleContext {
		public Language_nameContext language_name() {
			return getRuleContext(Language_nameContext.class,0);
		}
		public External_nameContext external_name() {
			return getRuleContext(External_nameContext.class,0);
		}
		public TerminalNode EXTERNAL() { return getToken(EiffelParser.EXTERNAL, 0); }
		public ExternalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitExternal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalContext external() throws RecognitionException {
		ExternalContext _localctx = new ExternalContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_external);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663); match(EXTERNAL);
			setState(664); language_name();
			setState(666);
			_la = _input.LA(1);
			if (_la==ALIAS) {
				{
				setState(665); external_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Language_nameContext extends ParserRuleContext {
		public TerminalNode MANIFEST_STRING() { return getToken(EiffelParser.MANIFEST_STRING, 0); }
		public Language_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitLanguage_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Language_nameContext language_name() throws RecognitionException {
		Language_nameContext _localctx = new Language_nameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_language_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668); match(MANIFEST_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class External_nameContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(EiffelParser.ALIAS, 0); }
		public TerminalNode MANIFEST_STRING() { return getToken(EiffelParser.MANIFEST_STRING, 0); }
		public External_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitExternal_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final External_nameContext external_name() throws RecognitionException {
		External_nameContext _localctx = new External_nameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_external_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670); match(ALIAS);
			setState(671); match(MANIFEST_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_declarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(EiffelParser.SEMI, 0); }
		public Entity_declaration_listContext entity_declaration_list() {
			return getRuleContext(Entity_declaration_listContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(EiffelParser.LOCAL, 0); }
		public Local_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_declarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitLocal_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_declarationsContext local_declarations() throws RecognitionException {
		Local_declarationsContext _localctx = new Local_declarationsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_local_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673); match(LOCAL);
			setState(674); entity_declaration_list();
			setState(676);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(675); match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreconditionContext extends ParserRuleContext {
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(EiffelParser.ELSE, 0); }
		public TerminalNode REQUIRE() { return getToken(EiffelParser.REQUIRE, 0); }
		public PreconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitPrecondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreconditionContext precondition() throws RecognitionException {
		PreconditionContext _localctx = new PreconditionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_precondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678); match(REQUIRE);
			setState(680);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(679); match(ELSE);
				}
			}

			setState(682); assertion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostconditionContext extends ParserRuleContext {
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(EiffelParser.THEN, 0); }
		public TerminalNode ENSURE() { return getToken(EiffelParser.ENSURE, 0); }
		public PostconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postcondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitPostcondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostconditionContext postcondition() throws RecognitionException {
		PostconditionContext _localctx = new PostconditionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_postcondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684); match(ENSURE);
			setState(686);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(685); match(THEN);
				}
			}

			setState(688); assertion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvariantContext extends ParserRuleContext {
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public TerminalNode INVARIANT() { return getToken(EiffelParser.INVARIANT, 0); }
		public InvariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitInvariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvariantContext invariant() throws RecognitionException {
		InvariantContext _localctx = new InvariantContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_invariant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690); match(INVARIANT);
			setState(691); assertion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(EiffelParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(EiffelParser.NEWLINE, i);
		}
		public List<Assertion_clauseContext> assertion_clause() {
			return getRuleContexts(Assertion_clauseContext.class);
		}
		public Assertion_clauseContext assertion_clause(int i) {
			return getRuleContext(Assertion_clauseContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(EiffelParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(EiffelParser.SEMI, i);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitAssertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_assertion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(693); assertion_clause();
				setState(694);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==SEMI) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(698); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SUB) | (1L << NOT) | (1L << ADD) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CURRENT - 69)) | (1L << (RESULT - 69)) | (1L << (T__14 - 69)) | (1L << (OLD - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (T__15 - 69)) | (1L << (STRIP - 69)) | (1L << (INTEGER - 69)) | (1L << (MANIFEST_STRING - 69)) | (1L << (CHARACTER_CONSTANT - 69)) | (1L << (BIT_CONSTANT - 69)) | (1L << (REAL - 69)) | (1L << (IDENTIFIER - 69)) | (1L << (HEXADECIMAL_CONSTANT - 69)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assertion_clauseContext extends ParserRuleContext {
		public Tag_markContext tag_mark() {
			return getRuleContext(Tag_markContext.class,0);
		}
		public Unlabeled_assertion_clauseContext unlabeled_assertion_clause() {
			return getRuleContext(Unlabeled_assertion_clauseContext.class,0);
		}
		public Assertion_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitAssertion_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assertion_clauseContext assertion_clause() throws RecognitionException {
		Assertion_clauseContext _localctx = new Assertion_clauseContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_assertion_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(700); tag_mark();
				}
				break;
			}
			setState(703); unlabeled_assertion_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unlabeled_assertion_clauseContext extends ParserRuleContext {
		public Unlabeled_assertion_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlabeled_assertion_clause; }
	 
		public Unlabeled_assertion_clauseContext() { }
		public void copyFrom(Unlabeled_assertion_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Boolean_assertion_clauseContext extends Unlabeled_assertion_clauseContext {
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Boolean_assertion_clauseContext(Unlabeled_assertion_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitBoolean_assertion_clause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Comment_assertion_clauseContext extends Unlabeled_assertion_clauseContext {
		public TerminalNode COMMENT() { return getToken(EiffelParser.COMMENT, 0); }
		public Comment_assertion_clauseContext(Unlabeled_assertion_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitComment_assertion_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unlabeled_assertion_clauseContext unlabeled_assertion_clause() throws RecognitionException {
		Unlabeled_assertion_clauseContext _localctx = new Unlabeled_assertion_clauseContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_unlabeled_assertion_clause);
		try {
			setState(707);
			switch (_input.LA(1)) {
			case SUB:
			case NOT:
			case ADD:
			case LPAREN:
			case CURRENT:
			case RESULT:
			case T__14:
			case OLD:
			case TRUE:
			case FALSE:
			case T__15:
			case STRIP:
			case INTEGER:
			case MANIFEST_STRING:
			case CHARACTER_CONSTANT:
			case BIT_CONSTANT:
			case REAL:
			case IDENTIFIER:
			case HEXADECIMAL_CONSTANT:
				_localctx = new Boolean_assertion_clauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(705); boolean_expression();
				}
				break;
			case COMMENT:
				_localctx = new Comment_assertion_clauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(706); match(COMMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tag_markContext extends ParserRuleContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TerminalNode COLON() { return getToken(EiffelParser.COLON, 0); }
		public Tag_markContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_mark; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitTag_mark(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_markContext tag_mark() throws RecognitionException {
		Tag_markContext _localctx = new Tag_markContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_tag_mark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709); tag();
			setState(710); match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EiffelParser.IDENTIFIER, 0); }
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RescueContext extends ParserRuleContext {
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public TerminalNode RESCUE() { return getToken(EiffelParser.RESCUE, 0); }
		public RescueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rescue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitRescue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RescueContext rescue() throws RecognitionException {
		RescueContext _localctx = new RescueContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_rescue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714); match(RESCUE);
			setState(715); compound();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Type_separatedContext extends TypeContext {
		public Class_type_separateContext class_type_separate() {
			return getRuleContext(Class_type_separateContext.class,0);
		}
		public Type_separatedContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitType_separated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_bitContext extends TypeContext {
		public Bit_typeContext bit_type() {
			return getRuleContext(Bit_typeContext.class,0);
		}
		public Type_bitContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitType_bit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_anchoredContext extends TypeContext {
		public AnchoredContext anchored() {
			return getRuleContext(AnchoredContext.class,0);
		}
		public Type_anchoredContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitType_anchored(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_expandedContext extends TypeContext {
		public Class_type_expandedContext class_type_expanded() {
			return getRuleContext(Class_type_expandedContext.class,0);
		}
		public Type_expandedContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitType_expanded(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_with_genericsContext extends TypeContext {
		public Actual_genericsContext actual_generics() {
			return getRuleContext(Actual_genericsContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public Type_with_genericsContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitType_with_generics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_type);
		int _la;
		try {
			setState(725);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new Type_with_genericsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(717); class_type();
				setState(719);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(718); actual_generics();
					}
				}

				}
				break;
			case EXPANDED:
				_localctx = new Type_expandedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(721); class_type_expanded();
				}
				break;
			case SEPARATE:
				_localctx = new Type_separatedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(722); class_type_separate();
				}
				break;
			case LIKE:
				_localctx = new Type_anchoredContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(723); anchored();
				}
				break;
			case BIT:
				_localctx = new Type_bitContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(724); bit_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_typeContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Class_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitClass_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_typeContext class_type() throws RecognitionException {
		Class_typeContext _localctx = new Class_typeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_class_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727); class_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_genericsContext extends ParserRuleContext {
		public Type_listContext type_list() {
			return getRuleContext(Type_listContext.class,0);
		}
		public Actual_genericsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_generics; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitActual_generics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_genericsContext actual_generics() throws RecognitionException {
		Actual_genericsContext _localctx = new Actual_genericsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_actual_generics);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729); match(T__0);
			setState(730); type_list();
			setState(731); match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_listContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(EiffelParser.COMMA); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(EiffelParser.COMMA, i);
		}
		public Type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitType_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_listContext type_list() throws RecognitionException {
		Type_listContext _localctx = new Type_listContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733); type();
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(734); match(COMMA);
				setState(735); type();
				}
				}
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_type_expandedContext extends ParserRuleContext {
		public TerminalNode EXPANDED() { return getToken(EiffelParser.EXPANDED, 0); }
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public Class_type_expandedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_type_expanded; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitClass_type_expanded(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_type_expandedContext class_type_expanded() throws RecognitionException {
		Class_type_expandedContext _localctx = new Class_type_expandedContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_class_type_expanded);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741); match(EXPANDED);
			setState(742); class_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_type_separateContext extends ParserRuleContext {
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode SEPARATE() { return getToken(EiffelParser.SEPARATE, 0); }
		public Class_type_separateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_type_separate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitClass_type_separate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_type_separateContext class_type_separate() throws RecognitionException {
		Class_type_separateContext _localctx = new Class_type_separateContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_class_type_separate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744); match(SEPARATE);
			setState(745); class_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_typeContext extends ParserRuleContext {
		public TerminalNode BIT() { return getToken(EiffelParser.BIT, 0); }
		public Bit_lengthContext bit_length() {
			return getRuleContext(Bit_lengthContext.class,0);
		}
		public Bit_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitBit_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_typeContext bit_type() throws RecognitionException {
		Bit_typeContext _localctx = new Bit_typeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_bit_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747); match(BIT);
			setState(748); bit_length();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_lengthContext extends ParserRuleContext {
		public Integer_constantContext integer_constant() {
			return getRuleContext(Integer_constantContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public Bit_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_length; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitBit_length(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_lengthContext bit_length() throws RecognitionException {
		Bit_lengthContext _localctx = new Bit_lengthContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_bit_length);
		try {
			setState(752);
			switch (_input.LA(1)) {
			case SUB:
			case ADD:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(750); integer_constant();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(751); attribute();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnchoredContext extends ParserRuleContext {
		public AnchorContext anchor() {
			return getRuleContext(AnchorContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(EiffelParser.LIKE, 0); }
		public AnchoredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anchored; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitAnchored(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnchoredContext anchored() throws RecognitionException {
		AnchoredContext _localctx = new AnchoredContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_anchored);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754); match(LIKE);
			setState(755); anchor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnchorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EiffelParser.IDENTIFIER, 0); }
		public TerminalNode CURRENT() { return getToken(EiffelParser.CURRENT, 0); }
		public AnchorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anchor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitAnchor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnchorContext anchor() throws RecognitionException {
		AnchorContext _localctx = new AnchorContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_anchor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			_la = _input.LA(1);
			if ( !(_la==CURRENT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(EiffelParser.NEWLINE); }
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(EiffelParser.NEWLINE, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(EiffelParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(EiffelParser.SEMI, i);
		}
		public CompoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitCompound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundContext compound() throws RecognitionException {
		CompoundContext _localctx = new CompoundContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_compound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (LPAREN - 56)) | (1L << (CURRENT - 56)) | (1L << (RESULT - 56)) | (1L << (BANG - 56)) | (1L << (IF - 56)) | (1L << (INSPECT - 56)) | (1L << (FROM - 56)) | (1L << (DEBUG - 56)) | (1L << (CHECK - 56)) | (1L << (RETRY - 56)) | (1L << (IDENTIFIER - 56)))) != 0)) {
				{
				{
				setState(759); instruction();
				setState(760);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==SEMI) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_qualifierContext extends ParserRuleContext {
		public Call_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_qualifier; }
	 
		public Call_qualifierContext() { }
		public void copyFrom(Call_qualifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expression_qualifierContext extends Call_qualifierContext {
		public TerminalNode DOT() { return getToken(EiffelParser.DOT, 0); }
		public TerminalNode RPAREN() { return getToken(EiffelParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(EiffelParser.LPAREN, 0); }
		public Expression_qualifierContext(Call_qualifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitExpression_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Current_qualifierContext extends Call_qualifierContext {
		public TerminalNode DOT() { return getToken(EiffelParser.DOT, 0); }
		public TerminalNode CURRENT() { return getToken(EiffelParser.CURRENT, 0); }
		public Current_qualifierContext(Call_qualifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitCurrent_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Result_qualifierContext extends Call_qualifierContext {
		public TerminalNode DOT() { return getToken(EiffelParser.DOT, 0); }
		public TerminalNode RESULT() { return getToken(EiffelParser.RESULT, 0); }
		public Result_qualifierContext(Call_qualifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitResult_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_qualifierContext call_qualifier() throws RecognitionException {
		Call_qualifierContext _localctx = new Call_qualifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_call_qualifier);
		try {
			setState(776);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new Expression_qualifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(767); match(LPAREN);
				setState(768); expression(0);
				setState(769); match(RPAREN);
				setState(770); match(DOT);
				}
				break;
			case RESULT:
				_localctx = new Result_qualifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(772); match(RESULT);
				setState(773); match(DOT);
				}
				break;
			case CURRENT:
				_localctx = new Current_qualifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(774); match(CURRENT);
				setState(775); match(DOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Usual_callContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(EiffelParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(EiffelParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(EiffelParser.LPAREN, 0); }
		public Usual_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usual_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitUsual_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Usual_callContext usual_call() throws RecognitionException {
		Usual_callContext _localctx = new Usual_callContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_usual_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778); match(IDENTIFIER);
			setState(784);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(779); match(LPAREN);
				setState(781);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NOT) | (1L << ADD) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CURRENT - 69)) | (1L << (RESULT - 69)) | (1L << (T__14 - 69)) | (1L << (OLD - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (T__15 - 69)) | (1L << (STRIP - 69)) | (1L << (INTEGER - 69)) | (1L << (MANIFEST_STRING - 69)) | (1L << (CHARACTER_CONSTANT - 69)) | (1L << (BIT_CONSTANT - 69)) | (1L << (REAL - 69)) | (1L << (IDENTIFIER - 69)) | (1L << (HEXADECIMAL_CONSTANT - 69)))) != 0)) {
					{
					setState(780); params();
					}
				}

				setState(783); match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_chainContext extends ParserRuleContext {
		public Usual_callContext usual_call(int i) {
			return getRuleContext(Usual_callContext.class,i);
		}
		public List<Usual_callContext> usual_call() {
			return getRuleContexts(Usual_callContext.class);
		}
		public List<TerminalNode> DOT() { return getTokens(EiffelParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(EiffelParser.DOT, i);
		}
		public Call_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_chain; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitCall_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_chainContext call_chain() throws RecognitionException {
		Call_chainContext _localctx = new Call_chainContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_call_chain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(788); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(786); match(DOT);
					setState(787); usual_call();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(790); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(EiffelParser.COMMA); }
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(EiffelParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(792); param();
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(793); match(COMMA);
				setState(794); param();
				}
				}
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	 
		public ParamContext() { }
		public void copyFrom(ParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr_paramContext extends ParamContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expr_paramContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitExpr_param(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Addr_paramContext extends ParamContext {
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public Addr_paramContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitAddr_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_param);
		try {
			setState(802);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				_localctx = new Expr_paramContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(800); expression(0);
				}
				break;
			case 2:
				_localctx = new Addr_paramContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(801); address();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public Usual_callContext usual_call() {
			return getRuleContext(Usual_callContext.class,0);
		}
		public Call_chainContext call_chain() {
			return getRuleContext(Call_chainContext.class,0);
		}
		public Call_qualifierContext call_qualifier() {
			return getRuleContext(Call_qualifierContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (LPAREN - 56)) | (1L << (CURRENT - 56)) | (1L << (RESULT - 56)))) != 0)) {
				{
				setState(804); call_qualifier();
				}
			}

			setState(807); usual_call();
			setState(809);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(808); call_chain();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Loop_instructionContext extends InstructionContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public Loop_instructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitLoop_instruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assignment_attempt_instructionContext extends InstructionContext {
		public Assignment_attemptContext assignment_attempt() {
			return getRuleContext(Assignment_attemptContext.class,0);
		}
		public Assignment_attempt_instructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitAssignment_attempt_instruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Debug_instructionContext extends InstructionContext {
		public DebugContext debug() {
			return getRuleContext(DebugContext.class,0);
		}
		public Debug_instructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitDebug_instruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Multi_branch_instructionContext extends InstructionContext {
		public Multi_branchContext multi_branch() {
			return getRuleContext(Multi_branchContext.class,0);
		}
		public Multi_branch_instructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitMulti_branch_instruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Call_instructionContext extends InstructionContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Call_instructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitCall_instruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assignment_instructionContext extends InstructionContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Assignment_instructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitAssignment_instruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Creation_instructionContext extends InstructionContext {
		public CreationContext creation() {
			return getRuleContext(CreationContext.class,0);
		}
		public Creation_instructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitCreation_instruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Check_instructionContext extends InstructionContext {
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public Check_instructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitCheck_instruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Conditional_instructionContext extends InstructionContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Conditional_instructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitConditional_instruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Retry_instructionContext extends InstructionContext {
		public RetryContext retry() {
			return getRuleContext(RetryContext.class,0);
		}
		public Retry_instructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitRetry_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_instruction);
		try {
			setState(821);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				_localctx = new Creation_instructionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(811); creation();
				}
				break;
			case 2:
				_localctx = new Call_instructionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(812); call();
				}
				break;
			case 3:
				_localctx = new Assignment_instructionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(813); assignment();
				}
				break;
			case 4:
				_localctx = new Assignment_attempt_instructionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(814); assignment_attempt();
				}
				break;
			case 5:
				_localctx = new Conditional_instructionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(815); conditional();
				}
				break;
			case 6:
				_localctx = new Multi_branch_instructionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(816); multi_branch();
				}
				break;
			case 7:
				_localctx = new Loop_instructionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(817); loop();
				}
				break;
			case 8:
				_localctx = new Debug_instructionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(818); debug();
				}
				break;
			case 9:
				_localctx = new Check_instructionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(819); check();
				}
				break;
			case 10:
				_localctx = new Retry_instructionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(820); retry();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreationContext extends ParserRuleContext {
		public WritableContext writable() {
			return getRuleContext(WritableContext.class,0);
		}
		public List<TerminalNode> BANG() { return getTokens(EiffelParser.BANG); }
		public Creation_callContext creation_call() {
			return getRuleContext(Creation_callContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode BANG(int i) {
			return getToken(EiffelParser.BANG, i);
		}
		public CreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreationContext creation() throws RecognitionException {
		CreationContext _localctx = new CreationContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_creation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823); match(BANG);
			setState(825);
			_la = _input.LA(1);
			if (_la==EXPANDED || _la==SEPARATE || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (BIT - 67)) | (1L << (LIKE - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				setState(824); type();
				}
			}

			setState(827); match(BANG);
			setState(828); writable();
			setState(830);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(829); creation_call();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_callContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(EiffelParser.DOT, 0); }
		public Procedure_nameContext procedure_name() {
			return getRuleContext(Procedure_nameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EiffelParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(EiffelParser.LPAREN, 0); }
		public Creation_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitCreation_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Creation_callContext creation_call() throws RecognitionException {
		Creation_callContext _localctx = new Creation_callContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_creation_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832); match(DOT);
			setState(833); procedure_name();
			setState(839);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(834); match(LPAREN);
				setState(836);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NOT) | (1L << ADD) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CURRENT - 69)) | (1L << (RESULT - 69)) | (1L << (T__14 - 69)) | (1L << (OLD - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (T__15 - 69)) | (1L << (STRIP - 69)) | (1L << (INTEGER - 69)) | (1L << (MANIFEST_STRING - 69)) | (1L << (CHARACTER_CONSTANT - 69)) | (1L << (BIT_CONSTANT - 69)) | (1L << (REAL - 69)) | (1L << (IDENTIFIER - 69)) | (1L << (HEXADECIMAL_CONSTANT - 69)))) != 0)) {
					{
					setState(835); params();
					}
				}

				setState(838); match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public WritableContext writable() {
			return getRuleContext(WritableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841); writable();
			setState(842); match(T__23);
			setState(843); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_attemptContext extends ParserRuleContext {
		public WritableContext writable() {
			return getRuleContext(WritableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode T__8() { return getToken(EiffelParser.T__8, 0); }
		public Assignment_attemptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_attempt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitAssignment_attempt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_attemptContext assignment_attempt() throws RecognitionException {
		Assignment_attemptContext _localctx = new Assignment_attemptContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_assignment_attempt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845); writable();
			setState(846); match(T__8);
			setState(847); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EiffelParser.IF, 0); }
		public Then_part_listContext then_part_list() {
			return getRuleContext(Then_part_listContext.class,0);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public TerminalNode END() { return getToken(EiffelParser.END, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849); match(IF);
			setState(850); then_part_list();
			setState(852);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(851); else_part();
				}
			}

			setState(854); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Then_part_listContext extends ParserRuleContext {
		public List<TerminalNode> ELSEIF() { return getTokens(EiffelParser.ELSEIF); }
		public Then_partContext then_part(int i) {
			return getRuleContext(Then_partContext.class,i);
		}
		public List<Then_partContext> then_part() {
			return getRuleContexts(Then_partContext.class);
		}
		public TerminalNode ELSEIF(int i) {
			return getToken(EiffelParser.ELSEIF, i);
		}
		public Then_part_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then_part_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitThen_part_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Then_part_listContext then_part_list() throws RecognitionException {
		Then_part_listContext _localctx = new Then_part_listContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_then_part_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856); then_part();
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(857); match(ELSEIF);
				setState(858); then_part();
				}
				}
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Then_partContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(EiffelParser.THEN, 0); }
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Then_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then_part; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitThen_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Then_partContext then_part() throws RecognitionException {
		Then_partContext _localctx = new Then_partContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_then_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864); boolean_expression();
			setState(865); match(THEN);
			setState(866); compound();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_partContext extends ParserRuleContext {
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(EiffelParser.ELSE, 0); }
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitElse_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_else_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868); match(ELSE);
			setState(869); compound();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multi_branchContext extends ParserRuleContext {
		public TerminalNode INSPECT() { return getToken(EiffelParser.INSPECT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public When_part_listContext when_part_list() {
			return getRuleContext(When_part_listContext.class,0);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public TerminalNode END() { return getToken(EiffelParser.END, 0); }
		public Multi_branchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_branch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitMulti_branch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_branchContext multi_branch() throws RecognitionException {
		Multi_branchContext _localctx = new Multi_branchContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_multi_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871); match(INSPECT);
			setState(872); expression(0);
			setState(874);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(873); when_part_list();
				}
			}

			setState(877);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(876); else_part();
				}
			}

			setState(879); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class When_part_listContext extends ParserRuleContext {
		public TerminalNode WHEN(int i) {
			return getToken(EiffelParser.WHEN, i);
		}
		public List<When_partContext> when_part() {
			return getRuleContexts(When_partContext.class);
		}
		public When_partContext when_part(int i) {
			return getRuleContext(When_partContext.class,i);
		}
		public List<TerminalNode> WHEN() { return getTokens(EiffelParser.WHEN); }
		public When_part_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_part_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitWhen_part_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final When_part_listContext when_part_list() throws RecognitionException {
		When_part_listContext _localctx = new When_part_listContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_when_part_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881); match(WHEN);
			setState(882); when_part();
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(883); match(WHEN);
				setState(884); when_part();
				}
				}
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class When_partContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(EiffelParser.THEN, 0); }
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public ChoicesContext choices() {
			return getRuleContext(ChoicesContext.class,0);
		}
		public When_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_part; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitWhen_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final When_partContext when_part() throws RecognitionException {
		When_partContext _localctx = new When_partContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_when_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			_la = _input.LA(1);
			if (_la==SUB || _la==ADD || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (INTEGER - 97)) | (1L << (CHARACTER_CONSTANT - 97)) | (1L << (IDENTIFIER - 97)))) != 0)) {
				{
				setState(890); choices();
				}
			}

			setState(893); match(THEN);
			setState(894); compound();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChoicesContext extends ParserRuleContext {
		public ChoiceContext choice(int i) {
			return getRuleContext(ChoiceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EiffelParser.COMMA); }
		public List<ChoiceContext> choice() {
			return getRuleContexts(ChoiceContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(EiffelParser.COMMA, i);
		}
		public ChoicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choices; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitChoices(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoicesContext choices() throws RecognitionException {
		ChoicesContext _localctx = new ChoicesContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_choices);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896); choice();
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(897); match(COMMA);
				setState(898); choice();
				}
				}
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChoiceContext extends ParserRuleContext {
		public ChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice; }
	 
		public ChoiceContext() { }
		public void copyFrom(ChoiceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Interval_choiceContext extends ChoiceContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public Interval_choiceContext(ChoiceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitInterval_choice(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Choice_constant_choiceContext extends ChoiceContext {
		public Choice_constantContext choice_constant() {
			return getRuleContext(Choice_constantContext.class,0);
		}
		public Choice_constant_choiceContext(ChoiceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitChoice_constant_choice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_choice);
		try {
			setState(906);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				_localctx = new Choice_constant_choiceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(904); choice_constant();
				}
				break;
			case 2:
				_localctx = new Interval_choiceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(905); interval();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public List<Choice_constantContext> choice_constant() {
			return getRuleContexts(Choice_constantContext.class);
		}
		public TerminalNode T__9() { return getToken(EiffelParser.T__9, 0); }
		public Choice_constantContext choice_constant(int i) {
			return getRuleContext(Choice_constantContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908); choice_constant();
			setState(909); match(T__9);
			setState(910); choice_constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Choice_constantContext extends ParserRuleContext {
		public Choice_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice_constant; }
	 
		public Choice_constantContext() { }
		public void copyFrom(Choice_constantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Attribute_choice_constantContext extends Choice_constantContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public Attribute_choice_constantContext(Choice_constantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitAttribute_choice_constant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Integer_choice_constantContext extends Choice_constantContext {
		public Integer_constantContext integer_constant() {
			return getRuleContext(Integer_constantContext.class,0);
		}
		public Integer_choice_constantContext(Choice_constantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitInteger_choice_constant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Character_choice_constantContext extends Choice_constantContext {
		public TerminalNode CHARACTER_CONSTANT() { return getToken(EiffelParser.CHARACTER_CONSTANT, 0); }
		public Character_choice_constantContext(Choice_constantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitCharacter_choice_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Choice_constantContext choice_constant() throws RecognitionException {
		Choice_constantContext _localctx = new Choice_constantContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_choice_constant);
		try {
			setState(915);
			switch (_input.LA(1)) {
			case SUB:
			case ADD:
			case INTEGER:
				_localctx = new Integer_choice_constantContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(912); integer_constant();
				}
				break;
			case CHARACTER_CONSTANT:
				_localctx = new Character_choice_constantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(913); match(CHARACTER_CONSTANT);
				}
				break;
			case IDENTIFIER:
				_localctx = new Attribute_choice_constantContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(914); attribute();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public VariantContext variant() {
			return getRuleContext(VariantContext.class,0);
		}
		public InvariantContext invariant() {
			return getRuleContext(InvariantContext.class,0);
		}
		public Loop_bodyContext loop_body() {
			return getRuleContext(Loop_bodyContext.class,0);
		}
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public TerminalNode END() { return getToken(EiffelParser.END, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917); initialization();
			setState(919);
			_la = _input.LA(1);
			if (_la==INVARIANT) {
				{
				setState(918); invariant();
				}
			}

			setState(922);
			_la = _input.LA(1);
			if (_la==VARIANT) {
				{
				setState(921); variant();
				}
			}

			setState(924); loop_body();
			setState(925); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializationContext extends ParserRuleContext {
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public TerminalNode FROM() { return getToken(EiffelParser.FROM, 0); }
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927); match(FROM);
			setState(928); compound();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariantContext extends ParserRuleContext {
		public Tag_markContext tag_mark() {
			return getRuleContext(Tag_markContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VARIANT() { return getToken(EiffelParser.VARIANT, 0); }
		public VariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitVariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariantContext variant() throws RecognitionException {
		VariantContext _localctx = new VariantContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_variant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930); match(VARIANT);
			setState(932);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(931); tag_mark();
				}
				break;
			}
			setState(934); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_bodyContext extends ParserRuleContext {
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(EiffelParser.LOOP, 0); }
		public ExitContext exit() {
			return getRuleContext(ExitContext.class,0);
		}
		public Loop_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitLoop_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_bodyContext loop_body() throws RecognitionException {
		Loop_bodyContext _localctx = new Loop_bodyContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_loop_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936); exit();
			setState(937); match(LOOP);
			setState(938); compound();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitContext extends ParserRuleContext {
		public TerminalNode UNTIL() { return getToken(EiffelParser.UNTIL, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public ExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitExit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitContext exit() throws RecognitionException {
		ExitContext _localctx = new ExitContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940); match(UNTIL);
			setState(941); boolean_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DebugContext extends ParserRuleContext {
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public TerminalNode DEBUG() { return getToken(EiffelParser.DEBUG, 0); }
		public Debug_keysContext debug_keys() {
			return getRuleContext(Debug_keysContext.class,0);
		}
		public TerminalNode END() { return getToken(EiffelParser.END, 0); }
		public DebugContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitDebug(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebugContext debug() throws RecognitionException {
		DebugContext _localctx = new DebugContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_debug);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943); match(DEBUG);
			setState(945);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(944); debug_keys();
				}
				break;
			}
			setState(947); compound();
			setState(948); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Debug_keysContext extends ParserRuleContext {
		public Debug_key_listContext debug_key_list() {
			return getRuleContext(Debug_key_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EiffelParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(EiffelParser.LPAREN, 0); }
		public Debug_keysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug_keys; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitDebug_keys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Debug_keysContext debug_keys() throws RecognitionException {
		Debug_keysContext _localctx = new Debug_keysContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_debug_keys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950); match(LPAREN);
			setState(951); debug_key_list();
			setState(952); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Debug_key_listContext extends ParserRuleContext {
		public Debug_keyContext debug_key(int i) {
			return getRuleContext(Debug_keyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EiffelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EiffelParser.COMMA, i);
		}
		public List<Debug_keyContext> debug_key() {
			return getRuleContexts(Debug_keyContext.class);
		}
		public Debug_key_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug_key_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitDebug_key_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Debug_key_listContext debug_key_list() throws RecognitionException {
		Debug_key_listContext _localctx = new Debug_key_listContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_debug_key_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954); debug_key();
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(955); match(COMMA);
				setState(956); debug_key();
				}
				}
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Debug_keyContext extends ParserRuleContext {
		public TerminalNode MANIFEST_STRING() { return getToken(EiffelParser.MANIFEST_STRING, 0); }
		public Debug_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug_key; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitDebug_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Debug_keyContext debug_key() throws RecognitionException {
		Debug_keyContext _localctx = new Debug_keyContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_debug_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962); match(MANIFEST_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckContext extends ParserRuleContext {
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(EiffelParser.CHECK, 0); }
		public TerminalNode END() { return getToken(EiffelParser.END, 0); }
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964); match(CHECK);
			setState(965); assertion();
			setState(966); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetryContext extends ParserRuleContext {
		public TerminalNode RETRY() { return getToken(EiffelParser.RETRY, 0); }
		public RetryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retry; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitRetry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetryContext retry() throws RecognitionException {
		RetryContext _localctx = new RetryContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_retry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968); match(RETRY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parent_qualificationContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(EiffelParser.LBRACE, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(EiffelParser.RBRACE, 0); }
		public Parent_qualificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent_qualification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitParent_qualification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parent_qualificationContext parent_qualification() throws RecognitionException {
		Parent_qualificationContext _localctx = new Parent_qualificationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_parent_qualification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970); match(LBRACE);
			setState(971); class_name();
			setState(972); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EiffelParser.IDENTIFIER, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WritableContext extends ParserRuleContext {
		public WritableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writable; }
	 
		public WritableContext() { }
		public void copyFrom(WritableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Result_writableContext extends WritableContext {
		public TerminalNode RESULT() { return getToken(EiffelParser.RESULT, 0); }
		public Result_writableContext(WritableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitResult_writable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Identifier_writableContext extends WritableContext {
		public TerminalNode IDENTIFIER() { return getToken(EiffelParser.IDENTIFIER, 0); }
		public Identifier_writableContext(WritableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitIdentifier_writable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WritableContext writable() throws RecognitionException {
		WritableContext _localctx = new WritableContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_writable);
		try {
			setState(978);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new Identifier_writableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(976); match(IDENTIFIER);
				}
				break;
			case RESULT:
				_localctx = new Result_writableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(977); match(RESULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddressContext extends ParserRuleContext {
		public Address_markContext address_mark() {
			return getRuleContext(Address_markContext.class,0);
		}
		public TerminalNode T__14() { return getToken(EiffelParser.T__14, 0); }
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980); match(T__14);
			setState(981); address_mark();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Address_markContext extends ParserRuleContext {
		public Address_markContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address_mark; }
	 
		public Address_markContext() { }
		public void copyFrom(Address_markContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Feature_name_address_markContext extends Address_markContext {
		public Feature_nameContext feature_name() {
			return getRuleContext(Feature_nameContext.class,0);
		}
		public Feature_name_address_markContext(Address_markContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitFeature_name_address_mark(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Current_address_markContext extends Address_markContext {
		public TerminalNode CURRENT() { return getToken(EiffelParser.CURRENT, 0); }
		public Current_address_markContext(Address_markContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitCurrent_address_mark(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Result_address_markContext extends Address_markContext {
		public TerminalNode RESULT() { return getToken(EiffelParser.RESULT, 0); }
		public Result_address_markContext(Address_markContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitResult_address_mark(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Address_markContext address_mark() throws RecognitionException {
		Address_markContext _localctx = new Address_markContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_address_mark);
		try {
			setState(986);
			switch (_input.LA(1)) {
			case PREFIX:
			case INFIX:
			case IDENTIFIER:
				_localctx = new Feature_name_address_markContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(983); feature_name();
				}
				break;
			case CURRENT:
				_localctx = new Current_address_markContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(984); match(CURRENT);
				}
				break;
			case RESULT:
				_localctx = new Result_address_markContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(985); match(RESULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Old_exprContext extends ExpressionContext {
		public TerminalNode OLD() { return getToken(EiffelParser.OLD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Old_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitOld_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class And_exprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(EiffelParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode AND_THEN() { return getToken(EiffelParser.AND_THEN, 0); }
		public And_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitAnd_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Or_exprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode XOR() { return getToken(EiffelParser.XOR, 0); }
		public TerminalNode OR() { return getToken(EiffelParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode OR_ELSE() { return getToken(EiffelParser.OR_ELSE, 0); }
		public Or_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitOr_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Result_exprContext extends ExpressionContext {
		public TerminalNode RESULT() { return getToken(EiffelParser.RESULT, 0); }
		public Result_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitResult_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Div_exprContext extends ExpressionContext {
		public Token op;
		public TerminalNode T__6() { return getToken(EiffelParser.T__6, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode T__5() { return getToken(EiffelParser.T__5, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Div_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitDiv_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Mul_div_exprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(EiffelParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(EiffelParser.DIV, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Mul_div_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitMul_div_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Current_exprContext extends ExpressionContext {
		public TerminalNode CURRENT() { return getToken(EiffelParser.CURRENT, 0); }
		public Current_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitCurrent_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Not_exprContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(EiffelParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Not_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitNot_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Identifier_exprContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(EiffelParser.IDENTIFIER, 0); }
		public Identifier_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitIdentifier_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Chars_exprContext extends ExpressionContext {
		public Wide_manifest_stringContext wide_manifest_string() {
			return getRuleContext(Wide_manifest_stringContext.class,0);
		}
		public Wide_character_constantContext wide_character_constant() {
			return getRuleContext(Wide_character_constantContext.class,0);
		}
		public TerminalNode CHARACTER_CONSTANT() { return getToken(EiffelParser.CHARACTER_CONSTANT, 0); }
		public TerminalNode MANIFEST_STRING() { return getToken(EiffelParser.MANIFEST_STRING, 0); }
		public Chars_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitChars_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Add_sub_exprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SUB() { return getToken(EiffelParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(EiffelParser.ADD, 0); }
		public Add_sub_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitAdd_sub_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Strip_exprContext extends ExpressionContext {
		public StripContext strip() {
			return getRuleContext(StripContext.class,0);
		}
		public Strip_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitStrip_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Sub_exprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(EiffelParser.SUB, 0); }
		public Sub_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitSub_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Parenthesized_exprContext extends ExpressionContext {
		public TerminalNode RPAREN() { return getToken(EiffelParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(EiffelParser.LPAREN, 0); }
		public Parenthesized_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitParenthesized_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Add_exprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(EiffelParser.ADD, 0); }
		public Add_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitAdd_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Implies_exprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IMPLIES() { return getToken(EiffelParser.IMPLIES, 0); }
		public Implies_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitImplies_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Call_exprContext extends ExpressionContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Call_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitCall_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Comp_exprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(EiffelParser.LT, 0); }
		public TerminalNode LE() { return getToken(EiffelParser.LE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode EQUAL() { return getToken(EiffelParser.EQUAL, 0); }
		public TerminalNode GT() { return getToken(EiffelParser.GT, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(EiffelParser.NOT_EQUAL, 0); }
		public TerminalNode GE() { return getToken(EiffelParser.GE, 0); }
		public Comp_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitComp_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Constant_exprContext extends ExpressionContext {
		public TerminalNode REAL() { return getToken(EiffelParser.REAL, 0); }
		public TerminalNode BIT_CONSTANT() { return getToken(EiffelParser.BIT_CONSTANT, 0); }
		public Boolean_constantContext boolean_constant() {
			return getRuleContext(Boolean_constantContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(EiffelParser.INTEGER, 0); }
		public TerminalNode HEXADECIMAL_CONSTANT() { return getToken(EiffelParser.HEXADECIMAL_CONSTANT, 0); }
		public Constant_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitConstant_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Manifest_array_exprContext extends ExpressionContext {
		public Manifest_arrayContext manifest_array() {
			return getRuleContext(Manifest_arrayContext.class,0);
		}
		public Manifest_array_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitManifest_array_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 254;
		enterRecursionRule(_localctx, 254, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				_localctx = new Add_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(989); match(ADD);
				setState(990); expression(18);
				}
				break;
			case 2:
				{
				_localctx = new Sub_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(991); match(SUB);
				setState(992); expression(17);
				}
				break;
			case 3:
				{
				_localctx = new Not_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(993); match(NOT);
				setState(994); expression(12);
				}
				break;
			case 4:
				{
				_localctx = new Old_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(995); match(OLD);
				setState(996); expression(7);
				}
				break;
			case 5:
				{
				_localctx = new Parenthesized_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(997); match(LPAREN);
				setState(998); expression(0);
				setState(999); match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new Identifier_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1001); match(IDENTIFIER);
				}
				break;
			case 7:
				{
				_localctx = new Call_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1002); call();
				}
				break;
			case 8:
				{
				_localctx = new Strip_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1003); strip();
				}
				break;
			case 9:
				{
				_localctx = new Constant_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1009);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
					{
					setState(1004); boolean_constant();
					}
					break;
				case BIT_CONSTANT:
					{
					setState(1005); match(BIT_CONSTANT);
					}
					break;
				case INTEGER:
					{
					setState(1006); match(INTEGER);
					}
					break;
				case REAL:
					{
					setState(1007); match(REAL);
					}
					break;
				case HEXADECIMAL_CONSTANT:
					{
					setState(1008); match(HEXADECIMAL_CONSTANT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				{
				_localctx = new Chars_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1015);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(1011); match(MANIFEST_STRING);
					}
					break;
				case 2:
					{
					setState(1012); match(CHARACTER_CONSTANT);
					}
					break;
				case 3:
					{
					setState(1013); wide_character_constant();
					}
					break;
				case 4:
					{
					setState(1014); wide_manifest_string();
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new Manifest_array_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1017); manifest_array();
				}
				break;
			case 12:
				{
				_localctx = new Current_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1018); match(CURRENT);
				}
				break;
			case 13:
				{
				_localctx = new Result_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1019); match(RESULT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1045);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1043);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						_localctx = new Mul_div_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1022);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1023);
						((Mul_div_exprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((Mul_div_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1024); expression(17);
						}
						break;
					case 2:
						{
						_localctx = new Div_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1025);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1026);
						((Div_exprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
							((Div_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1027); expression(16);
						}
						break;
					case 3:
						{
						_localctx = new Add_sub_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1028);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1029);
						((Add_sub_exprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUB || _la==ADD) ) {
							((Add_sub_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1030); expression(15);
						}
						break;
					case 4:
						{
						_localctx = new Comp_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1031);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1032);
						((Comp_exprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0) || _la==EQUAL || _la==NOT_EQUAL) ) {
							((Comp_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1033); expression(14);
						}
						break;
					case 5:
						{
						_localctx = new And_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1034);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1035);
						((And_exprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND_THEN || _la==AND) ) {
							((And_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1036); expression(12);
						}
						break;
					case 6:
						{
						_localctx = new Or_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1037);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1038);
						((Or_exprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << XOR) | (1L << OR_ELSE))) != 0)) ) {
							((Or_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1039); expression(11);
						}
						break;
					case 7:
						{
						_localctx = new Implies_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1040);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1041); match(IMPLIES);
						setState(1042); expression(10);
						}
						break;
					}
					} 
				}
				setState(1047);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Boolean_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitBoolean_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_boolean_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Manifest_constantContext extends ParserRuleContext {
		public Manifest_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manifest_constant; }
	 
		public Manifest_constantContext() { }
		public void copyFrom(Manifest_constantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Wide_char_manContext extends Manifest_constantContext {
		public Wide_character_constantContext wide_character_constant() {
			return getRuleContext(Wide_character_constantContext.class,0);
		}
		public Wide_char_manContext(Manifest_constantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitWide_char_man(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bit_manContext extends Manifest_constantContext {
		public TerminalNode BIT_CONSTANT() { return getToken(EiffelParser.BIT_CONSTANT, 0); }
		public Bit_manContext(Manifest_constantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitBit_man(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Real_manContext extends Manifest_constantContext {
		public Real_constantContext real_constant() {
			return getRuleContext(Real_constantContext.class,0);
		}
		public Real_manContext(Manifest_constantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitReal_man(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int_manContext extends Manifest_constantContext {
		public Integer_constantContext integer_constant() {
			return getRuleContext(Integer_constantContext.class,0);
		}
		public Int_manContext(Manifest_constantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitInt_man(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Hexad_manContext extends Manifest_constantContext {
		public TerminalNode HEXADECIMAL_CONSTANT() { return getToken(EiffelParser.HEXADECIMAL_CONSTANT, 0); }
		public Hexad_manContext(Manifest_constantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitHexad_man(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Wide_man_manContext extends Manifest_constantContext {
		public Wide_manifest_stringContext wide_manifest_string() {
			return getRuleContext(Wide_manifest_stringContext.class,0);
		}
		public Wide_man_manContext(Manifest_constantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitWide_man_man(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Char_manContext extends Manifest_constantContext {
		public TerminalNode CHARACTER_CONSTANT() { return getToken(EiffelParser.CHARACTER_CONSTANT, 0); }
		public Char_manContext(Manifest_constantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitChar_man(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Man_str_manContext extends Manifest_constantContext {
		public TerminalNode MANIFEST_STRING() { return getToken(EiffelParser.MANIFEST_STRING, 0); }
		public Man_str_manContext(Manifest_constantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitMan_str_man(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bool_manContext extends Manifest_constantContext {
		public Boolean_constantContext boolean_constant() {
			return getRuleContext(Boolean_constantContext.class,0);
		}
		public Bool_manContext(Manifest_constantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitBool_man(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Manifest_constantContext manifest_constant() throws RecognitionException {
		Manifest_constantContext _localctx = new Manifest_constantContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_manifest_constant);
		try {
			setState(1059);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				_localctx = new Bool_manContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1050); boolean_constant();
				}
				break;
			case 2:
				_localctx = new Char_manContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1051); match(CHARACTER_CONSTANT);
				}
				break;
			case 3:
				_localctx = new Int_manContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1052); integer_constant();
				}
				break;
			case 4:
				_localctx = new Real_manContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1053); real_constant();
				}
				break;
			case 5:
				_localctx = new Man_str_manContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1054); match(MANIFEST_STRING);
				}
				break;
			case 6:
				_localctx = new Bit_manContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1055); match(BIT_CONSTANT);
				}
				break;
			case 7:
				_localctx = new Wide_char_manContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1056); wide_character_constant();
				}
				break;
			case 8:
				_localctx = new Wide_man_manContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1057); wide_manifest_string();
				}
				break;
			case 9:
				_localctx = new Hexad_manContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1058); match(HEXADECIMAL_CONSTANT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_constantContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(EiffelParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(EiffelParser.FALSE, 0); }
		public Boolean_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitBoolean_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_constantContext boolean_constant() throws RecognitionException {
		Boolean_constantContext _localctx = new Boolean_constantContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_boolean_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_constantContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(EiffelParser.INTEGER, 0); }
		public Integer_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitInteger_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_constantContext integer_constant() throws RecognitionException {
		Integer_constantContext _localctx = new Integer_constantContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_integer_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			_la = _input.LA(1);
			if (_la==SUB || _la==ADD) {
				{
				setState(1063); sign();
				}
			}

			setState(1066); match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Real_constantContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode REAL() { return getToken(EiffelParser.REAL, 0); }
		public Real_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitReal_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_constantContext real_constant() throws RecognitionException {
		Real_constantContext _localctx = new Real_constantContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_real_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			_la = _input.LA(1);
			if (_la==SUB || _la==ADD) {
				{
				setState(1068); sign();
				}
			}

			setState(1071); match(REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(EiffelParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(EiffelParser.ADD, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			_la = _input.LA(1);
			if ( !(_la==SUB || _la==ADD) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wide_character_constantContext extends ParserRuleContext {
		public TerminalNode CHARACTER_CONSTANT() { return getToken(EiffelParser.CHARACTER_CONSTANT, 0); }
		public TerminalNode T__14() { return getToken(EiffelParser.T__14, 0); }
		public Wide_character_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wide_character_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitWide_character_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wide_character_constantContext wide_character_constant() throws RecognitionException {
		Wide_character_constantContext _localctx = new Wide_character_constantContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_wide_character_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075); match(T__14);
			setState(1076); match(CHARACTER_CONSTANT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wide_manifest_stringContext extends ParserRuleContext {
		public TerminalNode T__14() { return getToken(EiffelParser.T__14, 0); }
		public TerminalNode MANIFEST_STRING() { return getToken(EiffelParser.MANIFEST_STRING, 0); }
		public Wide_manifest_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wide_manifest_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitWide_manifest_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wide_manifest_stringContext wide_manifest_string() throws RecognitionException {
		Wide_manifest_stringContext _localctx = new Wide_manifest_stringContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_wide_manifest_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078); match(T__14);
			setState(1079); match(MANIFEST_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Manifest_arrayContext extends ParserRuleContext {
		public TerminalNode T__16() { return getToken(EiffelParser.T__16, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode T__15() { return getToken(EiffelParser.T__15, 0); }
		public Manifest_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manifest_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitManifest_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Manifest_arrayContext manifest_array() throws RecognitionException {
		Manifest_arrayContext _localctx = new Manifest_arrayContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_manifest_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081); match(T__15);
			setState(1083);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NOT) | (1L << ADD) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CURRENT - 69)) | (1L << (RESULT - 69)) | (1L << (T__14 - 69)) | (1L << (OLD - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (T__15 - 69)) | (1L << (STRIP - 69)) | (1L << (INTEGER - 69)) | (1L << (MANIFEST_STRING - 69)) | (1L << (CHARACTER_CONSTANT - 69)) | (1L << (BIT_CONSTANT - 69)) | (1L << (REAL - 69)) | (1L << (IDENTIFIER - 69)) | (1L << (HEXADECIMAL_CONSTANT - 69)))) != 0)) {
				{
				setState(1082); expression_list();
				}
			}

			setState(1085); match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EiffelParser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(EiffelParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087); expression(0);
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1088); match(COMMA);
				setState(1089); expression(0);
				}
				}
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OldContext extends ParserRuleContext {
		public TerminalNode OLD() { return getToken(EiffelParser.OLD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_old; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitOld(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OldContext old() throws RecognitionException {
		OldContext _localctx = new OldContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_old);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095); match(OLD);
			setState(1096); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StripContext extends ParserRuleContext {
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EiffelParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(EiffelParser.LPAREN, 0); }
		public TerminalNode STRIP() { return getToken(EiffelParser.STRIP, 0); }
		public StripContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strip; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitStrip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StripContext strip() throws RecognitionException {
		StripContext _localctx = new StripContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_strip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098); match(STRIP);
			setState(1099); match(LPAREN);
			setState(1101);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1100); attribute_list();
				}
			}

			setState(1103); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_listContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(EiffelParser.COMMA); }
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(EiffelParser.COMMA, i);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EiffelVisitor ) return ((EiffelVisitor<? extends T>)visitor).visitAttribute_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_attribute_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105); attribute();
			setState(1110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1106); match(COMMA);
				setState(1107); attribute();
				}
				}
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 127: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 16);
		case 1: return precpred(_ctx, 15);
		case 2: return precpred(_ctx, 14);
		case 3: return precpred(_ctx, 13);
		case 4: return precpred(_ctx, 11);
		case 5: return precpred(_ctx, 10);
		case 6: return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3l\u045c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\3\2\5\2\u011e\n\2\3\2\3\2\5\2\u0122\n\2\3\2\5\2\u0125\n\2\3\2"+
		"\5\2\u0128\n\2\3\2\5\2\u012b\n\2\3\2\5\2\u012e\n\2\3\2\5\2\u0131\n\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4\u013a\n\4\f\4\16\4\u013d\13\4\3\5\5\5\u0140"+
		"\n\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u014a\n\7\f\7\16\7\u014d\13\7"+
		"\3\b\3\b\5\b\u0151\n\b\3\t\5\t\u0154\n\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\7\r\u0162\n\r\f\r\16\r\u0165\13\r\3\16\3\16\5\16"+
		"\u0169\n\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\7\24\u017b\n\24\f\24\16\24\u017e\13\24\3\24\3\24"+
		"\3\25\3\25\5\25\u0184\n\25\3\26\5\26\u0187\n\26\3\26\5\26\u018a\n\26\3"+
		"\26\5\26\u018d\n\26\3\26\5\26\u0190\n\26\3\26\5\26\u0193\n\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u019d\n\30\f\30\16\30\u01a0\13\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u01ac\n\33\f\33"+
		"\16\33\u01af\13\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\5\35\u01b8\n\35"+
		"\3\36\3\36\3\36\7\36\u01bd\n\36\f\36\16\36\u01c0\13\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \7 \u01c9\n \f \16 \u01cc\13 \3!\3!\3!\3\"\3\"\3\"\3#\3"+
		"#\3#\3$\3$\6$\u01d9\n$\r$\16$\u01da\3%\5%\u01de\n%\3%\5%\u01e1\n%\3%\3"+
		"%\3&\3&\3&\7&\u01e8\n&\f&\16&\u01eb\13&\3\'\3\'\3(\3(\3(\3(\7(\u01f3\n"+
		"(\f(\16(\u01f6\13(\3)\5)\u01f9\n)\3)\5)\u01fc\n)\3)\5)\u01ff\n)\3*\3*"+
		"\3*\7*\u0204\n*\f*\16*\u0207\13*\3*\3*\3+\3+\3+\3,\5,\u020f\n,\3,\5,\u0212"+
		"\n,\3,\5,\u0215\n,\3-\3-\3-\3.\3.\3.\5.\u021d\n.\3/\3/\3/\7/\u0222\n/"+
		"\f/\16/\u0225\13/\3\60\5\60\u0228\n\60\3\60\3\60\3\61\3\61\3\61\5\61\u022f"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0256\n\67\38"+
		"\38\58\u025a\n8\38\38\39\39\39\79\u0261\n9\f9\169\u0264\139\3:\3:\3:\3"+
		";\3;\3;\7;\u026c\n;\f;\16;\u026f\13;\3<\3<\3<\3=\5=\u0275\n=\3=\5=\u0278"+
		"\n=\3=\5=\u027b\n=\3=\5=\u027e\n=\3=\3=\5=\u0282\n=\3=\5=\u0285\n=\3="+
		"\3=\3>\3>\5>\u028b\n>\3?\3?\5?\u028f\n?\3@\3@\3@\3A\3A\5A\u0296\nA\3B"+
		"\3B\3C\3C\3C\5C\u029d\nC\3D\3D\3E\3E\3E\3F\3F\3F\5F\u02a7\nF\3G\3G\5G"+
		"\u02ab\nG\3G\3G\3H\3H\5H\u02b1\nH\3H\3H\3I\3I\3I\3J\3J\3J\6J\u02bb\nJ"+
		"\rJ\16J\u02bc\3K\5K\u02c0\nK\3K\3K\3L\3L\5L\u02c6\nL\3M\3M\3M\3N\3N\3"+
		"O\3O\3O\3P\3P\5P\u02d2\nP\3P\3P\3P\3P\5P\u02d8\nP\3Q\3Q\3R\3R\3R\3R\3"+
		"S\3S\3S\7S\u02e3\nS\fS\16S\u02e6\13S\3T\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W"+
		"\5W\u02f3\nW\3X\3X\3X\3Y\3Y\3Z\3Z\3Z\7Z\u02fd\nZ\fZ\16Z\u0300\13Z\3[\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\5[\u030b\n[\3\\\3\\\3\\\5\\\u0310\n\\\3\\\5\\\u0313"+
		"\n\\\3]\3]\6]\u0317\n]\r]\16]\u0318\3^\3^\3^\7^\u031e\n^\f^\16^\u0321"+
		"\13^\3_\3_\5_\u0325\n_\3`\5`\u0328\n`\3`\3`\5`\u032c\n`\3a\3a\3a\3a\3"+
		"a\3a\3a\3a\3a\3a\5a\u0338\na\3b\3b\5b\u033c\nb\3b\3b\3b\5b\u0341\nb\3"+
		"c\3c\3c\3c\5c\u0347\nc\3c\5c\u034a\nc\3d\3d\3d\3d\3e\3e\3e\3e\3f\3f\3"+
		"f\5f\u0357\nf\3f\3f\3g\3g\3g\7g\u035e\ng\fg\16g\u0361\13g\3h\3h\3h\3h"+
		"\3i\3i\3i\3j\3j\3j\5j\u036d\nj\3j\5j\u0370\nj\3j\3j\3k\3k\3k\3k\7k\u0378"+
		"\nk\fk\16k\u037b\13k\3l\5l\u037e\nl\3l\3l\3l\3m\3m\3m\7m\u0386\nm\fm\16"+
		"m\u0389\13m\3n\3n\5n\u038d\nn\3o\3o\3o\3o\3p\3p\3p\5p\u0396\np\3q\3q\5"+
		"q\u039a\nq\3q\5q\u039d\nq\3q\3q\3q\3r\3r\3r\3s\3s\5s\u03a7\ns\3s\3s\3"+
		"t\3t\3t\3t\3u\3u\3u\3v\3v\5v\u03b4\nv\3v\3v\3v\3w\3w\3w\3w\3x\3x\3x\7"+
		"x\u03c0\nx\fx\16x\u03c3\13x\3y\3y\3z\3z\3z\3z\3{\3{\3|\3|\3|\3|\3}\3}"+
		"\3~\3~\5~\u03d5\n~\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\5\u0080\u03dd"+
		"\n\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u03f4\n\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\5\u0081\u03fa\n\u0081\3\u0081\3\u0081\3\u0081\5\u0081"+
		"\u03ff\n\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u0416\n\u0081\f\u0081"+
		"\16\u0081\u0419\13\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0426\n\u0083\3\u0084"+
		"\3\u0084\3\u0085\5\u0085\u042b\n\u0085\3\u0085\3\u0085\3\u0086\5\u0086"+
		"\u0430\n\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\5\u008a\u043e\n\u008a\3\u008a"+
		"\3\u008a\3\u008b\3\u008b\3\u008b\7\u008b\u0445\n\u008b\f\u008b\16\u008b"+
		"\u0448\13\u008b\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\5\u008d"+
		"\u0450\n\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\7\u008e\u0457\n"+
		"\u008e\f\u008e\16\u008e\u045a\13\u008e\3\u008e\2\3\u0100\u008f\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\2\17\3\2\20\22"+
		"\4\2  II\4\2\7\7\f\f\4\2\23\23()\4\2\f\f\16\16\4\2GGhh\3\2*+\3\2/\60\4"+
		"\2\23\23))\5\2\24\24,.\\]\3\2\62\63\4\2\64\6588\3\2^_\u0475\2\u011d\3"+
		"\2\2\2\4\u0134\3\2\2\2\6\u0137\3\2\2\2\b\u013f\3\2\2\2\n\u0143\3\2\2\2"+
		"\f\u0146\3\2\2\2\16\u0150\3\2\2\2\20\u0153\3\2\2\2\22\u0158\3\2\2\2\24"+
		"\u015a\3\2\2\2\26\u015c\3\2\2\2\30\u015e\3\2\2\2\32\u0166\3\2\2\2\34\u016a"+
		"\3\2\2\2\36\u016c\3\2\2\2 \u016f\3\2\2\2\"\u0172\3\2\2\2$\u0174\3\2\2"+
		"\2&\u0177\3\2\2\2(\u0181\3\2\2\2*\u0186\3\2\2\2,\u0196\3\2\2\2.\u0199"+
		"\3\2\2\2\60\u01a1\3\2\2\2\62\u01a5\3\2\2\2\64\u01a8\3\2\2\2\66\u01b2\3"+
		"\2\2\28\u01b7\3\2\2\2:\u01b9\3\2\2\2<\u01c1\3\2\2\2>\u01c5\3\2\2\2@\u01cd"+
		"\3\2\2\2B\u01d0\3\2\2\2D\u01d3\3\2\2\2F\u01d6\3\2\2\2H\u01dd\3\2\2\2J"+
		"\u01e4\3\2\2\2L\u01ec\3\2\2\2N\u01ee\3\2\2\2P\u01f8\3\2\2\2R\u0200\3\2"+
		"\2\2T\u020a\3\2\2\2V\u020e\3\2\2\2X\u0216\3\2\2\2Z\u021c\3\2\2\2\\\u021e"+
		"\3\2\2\2^\u0227\3\2\2\2`\u022e\3\2\2\2b\u0230\3\2\2\2d\u0235\3\2\2\2f"+
		"\u023a\3\2\2\2h\u023c\3\2\2\2j\u023e\3\2\2\2l\u0255\3\2\2\2n\u0257\3\2"+
		"\2\2p\u025d\3\2\2\2r\u0265\3\2\2\2t\u0268\3\2\2\2v\u0270\3\2\2\2x\u0274"+
		"\3\2\2\2z\u028a\3\2\2\2|\u028e\3\2\2\2~\u0290\3\2\2\2\u0080\u0295\3\2"+
		"\2\2\u0082\u0297\3\2\2\2\u0084\u0299\3\2\2\2\u0086\u029e\3\2\2\2\u0088"+
		"\u02a0\3\2\2\2\u008a\u02a3\3\2\2\2\u008c\u02a8\3\2\2\2\u008e\u02ae\3\2"+
		"\2\2\u0090\u02b4\3\2\2\2\u0092\u02ba\3\2\2\2\u0094\u02bf\3\2\2\2\u0096"+
		"\u02c5\3\2\2\2\u0098\u02c7\3\2\2\2\u009a\u02ca\3\2\2\2\u009c\u02cc\3\2"+
		"\2\2\u009e\u02d7\3\2\2\2\u00a0\u02d9\3\2\2\2\u00a2\u02db\3\2\2\2\u00a4"+
		"\u02df\3\2\2\2\u00a6\u02e7\3\2\2\2\u00a8\u02ea\3\2\2\2\u00aa\u02ed\3\2"+
		"\2\2\u00ac\u02f2\3\2\2\2\u00ae\u02f4\3\2\2\2\u00b0\u02f7\3\2\2\2\u00b2"+
		"\u02fe\3\2\2\2\u00b4\u030a\3\2\2\2\u00b6\u030c\3\2\2\2\u00b8\u0316\3\2"+
		"\2\2\u00ba\u031a\3\2\2\2\u00bc\u0324\3\2\2\2\u00be\u0327\3\2\2\2\u00c0"+
		"\u0337\3\2\2\2\u00c2\u0339\3\2\2\2\u00c4\u0342\3\2\2\2\u00c6\u034b\3\2"+
		"\2\2\u00c8\u034f\3\2\2\2\u00ca\u0353\3\2\2\2\u00cc\u035a\3\2\2\2\u00ce"+
		"\u0362\3\2\2\2\u00d0\u0366\3\2\2\2\u00d2\u0369\3\2\2\2\u00d4\u0373\3\2"+
		"\2\2\u00d6\u037d\3\2\2\2\u00d8\u0382\3\2\2\2\u00da\u038c\3\2\2\2\u00dc"+
		"\u038e\3\2\2\2\u00de\u0395\3\2\2\2\u00e0\u0397\3\2\2\2\u00e2\u03a1\3\2"+
		"\2\2\u00e4\u03a4\3\2\2\2\u00e6\u03aa\3\2\2\2\u00e8\u03ae\3\2\2\2\u00ea"+
		"\u03b1\3\2\2\2\u00ec\u03b8\3\2\2\2\u00ee\u03bc\3\2\2\2\u00f0\u03c4\3\2"+
		"\2\2\u00f2\u03c6\3\2\2\2\u00f4\u03ca\3\2\2\2\u00f6\u03cc\3\2\2\2\u00f8"+
		"\u03d0\3\2\2\2\u00fa\u03d4\3\2\2\2\u00fc\u03d6\3\2\2\2\u00fe\u03dc\3\2"+
		"\2\2\u0100\u03fe\3\2\2\2\u0102\u041a\3\2\2\2\u0104\u0425\3\2\2\2\u0106"+
		"\u0427\3\2\2\2\u0108\u042a\3\2\2\2\u010a\u042f\3\2\2\2\u010c\u0433\3\2"+
		"\2\2\u010e\u0435\3\2\2\2\u0110\u0438\3\2\2\2\u0112\u043b\3\2\2\2\u0114"+
		"\u0441\3\2\2\2\u0116\u0449\3\2\2\2\u0118\u044c\3\2\2\2\u011a\u0453\3\2"+
		"\2\2\u011c\u011e\5\4\3\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0121\5\20\t\2\u0120\u0122\5\26\f\2\u0121\u0120\3"+
		"\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0125\5 \21\2\u0124"+
		"\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0128\5$"+
		"\23\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129"+
		"\u012b\5F$\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2"+
		"\2\u012c\u012e\5N(\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130"+
		"\3\2\2\2\u012f\u0131\5\u0090I\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2"+
		"\2\u0131\u0132\3\2\2\2\u0132\u0133\7\n\2\2\u0133\3\3\2\2\2\u0134\u0135"+
		"\7\13\2\2\u0135\u0136\5\6\4\2\u0136\5\3\2\2\2\u0137\u013b\5\b\5\2\u0138"+
		"\u013a\5\b\5\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\7\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0140"+
		"\5\n\6\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0142\5\f\7\2\u0142\t\3\2\2\2\u0143\u0144\7h\2\2\u0144\u0145\7\r\2\2"+
		"\u0145\13\3\2\2\2\u0146\u014b\5\16\b\2\u0147\u0148\7\16\2\2\u0148\u014a"+
		"\5\16\b\2\u0149\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2"+
		"\u014b\u014c\3\2\2\2\u014c\r\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0151\7"+
		"h\2\2\u014f\u0151\5\u0104\u0083\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2"+
		"\2\2\u0151\17\3\2\2\2\u0152\u0154\5\22\n\2\u0153\u0152\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7\17\2\2\u0156\u0157\5\24\13"+
		"\2\u0157\21\3\2\2\2\u0158\u0159\t\2\2\2\u0159\23\3\2\2\2\u015a\u015b\7"+
		"h\2\2\u015b\25\3\2\2\2\u015c\u015d\5\30\r\2\u015d\27\3\2\2\2\u015e\u0163"+
		"\5\32\16\2\u015f\u0160\7\16\2\2\u0160\u0162\5\32\16\2\u0161\u015f\3\2"+
		"\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\31\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0168\5\34\17\2\u0167\u0169\5\36"+
		"\20\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\33\3\2\2\2\u016a\u016b"+
		"\7h\2\2\u016b\35\3\2\2\2\u016c\u016d\7\b\2\2\u016d\u016e\5\u00a0Q\2\u016e"+
		"\37\3\2\2\2\u016f\u0170\7\25\2\2\u0170\u0171\5\"\22\2\u0171!\3\2\2\2\u0172"+
		"\u0173\7d\2\2\u0173#\3\2\2\2\u0174\u0175\7\26\2\2\u0175\u0176\5&\24\2"+
		"\u0176%\3\2\2\2\u0177\u017c\5(\25\2\u0178\u0179\7\f\2\2\u0179\u017b\5"+
		"(\25\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7\f"+
		"\2\2\u0180\'\3\2\2\2\u0181\u0183\5\u00a0Q\2\u0182\u0184\5*\26\2\u0183"+
		"\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184)\3\2\2\2\u0185\u0187\5,\27\2"+
		"\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u018a"+
		"\5\62\32\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2"+
		"\u018b\u018d\5B\"\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f"+
		"\3\2\2\2\u018e\u0190\5@!\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0192\3\2\2\2\u0191\u0193\5D#\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2"+
		"\2\u0193\u0194\3\2\2\2\u0194\u0195\7\n\2\2\u0195+\3\2\2\2\u0196\u0197"+
		"\7\27\2\2\u0197\u0198\5.\30\2\u0198-\3\2\2\2\u0199\u019e\5\60\31\2\u019a"+
		"\u019b\7\16\2\2\u019b\u019d\5\60\31\2\u019c\u019a\3\2\2\2\u019d\u01a0"+
		"\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f/\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u01a2\5`\61\2\u01a2\u01a3\7\30\2\2\u01a3\u01a4\5"+
		"`\61\2\u01a4\61\3\2\2\2\u01a5\u01a6\7\31\2\2\u01a6\u01a7\5\64\33\2\u01a7"+
		"\63\3\2\2\2\u01a8\u01ad\5\66\34\2\u01a9\u01aa\7\f\2\2\u01aa\u01ac\5\66"+
		"\34\2\u01ab\u01a9\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\7\f"+
		"\2\2\u01b1\65\3\2\2\2\u01b2\u01b3\5<\37\2\u01b3\u01b4\58\35\2\u01b4\67"+
		"\3\2\2\2\u01b5\u01b8\5:\36\2\u01b6\u01b8\7\32\2\2\u01b7\u01b5\3\2\2\2"+
		"\u01b7\u01b6\3\2\2\2\u01b89\3\2\2\2\u01b9\u01be\5`\61\2\u01ba\u01bb\7"+
		"\16\2\2\u01bb\u01bd\5`\61\2\u01bc\u01ba\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf;\3\2\2\2\u01c0\u01be\3\2\2\2"+
		"\u01c1\u01c2\7\33\2\2\u01c2\u01c3\5> \2\u01c3\u01c4\7\34\2\2\u01c4=\3"+
		"\2\2\2\u01c5\u01ca\5\24\13\2\u01c6\u01c7\7\16\2\2\u01c7\u01c9\5\24\13"+
		"\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb?\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01ce\7\35\2\2\u01ce"+
		"\u01cf\5:\36\2\u01cfA\3\2\2\2\u01d0\u01d1\7\36\2\2\u01d1\u01d2\5:\36\2"+
		"\u01d2C\3\2\2\2\u01d3\u01d4\7\37\2\2\u01d4\u01d5\5:\36\2\u01d5E\3\2\2"+
		"\2\u01d6\u01d8\t\3\2\2\u01d7\u01d9\5H%\2\u01d8\u01d7\3\2\2\2\u01d9\u01da"+
		"\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01dbG\3\2\2\2\u01dc"+
		"\u01de\5<\37\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2"+
		"\2\2\u01df\u01e1\7\5\2\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01e3\5J&\2\u01e3I\3\2\2\2\u01e4\u01e9\5L\'\2\u01e5"+
		"\u01e6\7\16\2\2\u01e6\u01e8\5L\'\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb\3\2"+
		"\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01eaK\3\2\2\2\u01eb\u01e9"+
		"\3\2\2\2\u01ec\u01ed\7h\2\2\u01edM\3\2\2\2\u01ee\u01ef\7!\2\2\u01ef\u01f4"+
		"\5P)\2\u01f0\u01f1\7!\2\2\u01f1\u01f3\5P)\2\u01f2\u01f0\3\2\2\2\u01f3"+
		"\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5O\3\2\2\2"+
		"\u01f6\u01f4\3\2\2\2\u01f7\u01f9\5<\37\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9"+
		"\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01fc\7\5\2\2\u01fb\u01fa\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ff\5R*\2\u01fe\u01fd\3\2\2"+
		"\2\u01fe\u01ff\3\2\2\2\u01ffQ\3\2\2\2\u0200\u0205\5T+\2\u0201\u0202\t"+
		"\4\2\2\u0202\u0204\5T+\2\u0203\u0201\3\2\2\2\u0204\u0207\3\2\2\2\u0205"+
		"\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u0205\3\2"+
		"\2\2\u0208\u0209\t\4\2\2\u0209S\3\2\2\2\u020a\u020b\5\\/\2\u020b\u020c"+
		"\5V,\2\u020cU\3\2\2\2\u020d\u020f\5n8\2\u020e\u020d\3\2\2\2\u020e\u020f"+
		"\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u0212\5v<\2\u0211\u0210\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0215\5X-\2\u0214\u0213\3\2\2"+
		"\2\u0214\u0215\3\2\2\2\u0215W\3\2\2\2\u0216\u0217\7\"\2\2\u0217\u0218"+
		"\5Z.\2\u0218Y\3\2\2\2\u0219\u021d\5\u0104\u0083\2\u021a\u021d\7#\2\2\u021b"+
		"\u021d\5x=\2\u021c\u0219\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2"+
		"\2\u021d[\3\2\2\2\u021e\u0223\5^\60\2\u021f\u0220\7\16\2\2\u0220\u0222"+
		"\5^\60\2\u0221\u021f\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224]\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0228\7$\2\2\u0227"+
		"\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\5`"+
		"\61\2\u022a_\3\2\2\2\u022b\u022f\7h\2\2\u022c\u022f\5b\62\2\u022d\u022f"+
		"\5d\63\2\u022e\u022b\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022d\3\2\2\2\u022f"+
		"a\3\2\2\2\u0230\u0231\7%\2\2\u0231\u0232\7&\2\2\u0232\u0233\5f\64\2\u0233"+
		"\u0234\7&\2\2\u0234c\3\2\2\2\u0235\u0236\7\'\2\2\u0236\u0237\7&\2\2\u0237"+
		"\u0238\5h\65\2\u0238\u0239\7&\2\2\u0239e\3\2\2\2\u023a\u023b\5j\66\2\u023b"+
		"g\3\2\2\2\u023c\u023d\5l\67\2\u023di\3\2\2\2\u023e\u023f\t\5\2\2\u023f"+
		"k\3\2\2\2\u0240\u0256\7*\2\2\u0241\u0256\7+\2\2\u0242\u0256\7)\2\2\u0243"+
		"\u0256\7\23\2\2\u0244\u0256\7,\2\2\u0245\u0256\7\24\2\2\u0246\u0256\7"+
		"-\2\2\u0247\u0256\7.\2\2\u0248\u0256\7/\2\2\u0249\u0256\7\60\2\2\u024a"+
		"\u0256\7\61\2\2\u024b\u0256\7\63\2\2\u024c\u0256\7\64\2\2\u024d\u0256"+
		"\7\65\2\2\u024e\u024f\7\63\2\2\u024f\u0250\7\6\2\2\u0250\u0256\7\66\2"+
		"\2\u0251\u0252\7\64\2\2\u0252\u0253\7\6\2\2\u0253\u0256\7\67\2\2\u0254"+
		"\u0256\79\2\2\u0255\u0240\3\2\2\2\u0255\u0241\3\2\2\2\u0255\u0242\3\2"+
		"\2\2\u0255\u0243\3\2\2\2\u0255\u0244\3\2\2\2\u0255\u0245\3\2\2\2\u0255"+
		"\u0246\3\2\2\2\u0255\u0247\3\2\2\2\u0255\u0248\3\2\2\2\u0255\u0249\3\2"+
		"\2\2\u0255\u024a\3\2\2\2\u0255\u024b\3\2\2\2\u0255\u024c\3\2\2\2\u0255"+
		"\u024d\3\2\2\2\u0255\u024e\3\2\2\2\u0255\u0251\3\2\2\2\u0255\u0254\3\2"+
		"\2\2\u0256m\3\2\2\2\u0257\u0259\7:\2\2\u0258\u025a\5p9\2\u0259\u0258\3"+
		"\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\7;\2\2\u025c"+
		"o\3\2\2\2\u025d\u0262\5r:\2\u025e\u025f\t\6\2\2\u025f\u0261\5r:\2\u0260"+
		"\u025e\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2"+
		"\2\2\u0263q\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0266\5t;\2\u0266\u0267"+
		"\5v<\2\u0267s\3\2\2\2\u0268\u026d\7h\2\2\u0269\u026a\7\16\2\2\u026a\u026c"+
		"\7h\2\2\u026b\u0269\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026eu\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0271\7\r\2\2"+
		"\u0271\u0272\5\u009eP\2\u0272w\3\2\2\2\u0273\u0275\5 \21\2\u0274\u0273"+
		"\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\3\2\2\2\u0276\u0278\7\5\2\2\u0277"+
		"\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u027b\5\u008c"+
		"G\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2\2\2\u027c"+
		"\u027e\5\u008aF\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f"+
		"\3\2\2\2\u027f\u0281\5z>\2\u0280\u0282\5\u008eH\2\u0281\u0280\3\2\2\2"+
		"\u0281\u0282\3\2\2\2\u0282\u0284\3\2\2\2\u0283\u0285\5\u009cO\2\u0284"+
		"\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\7\n"+
		"\2\2\u0287y\3\2\2\2\u0288\u028b\5|?\2\u0289\u028b\5\u0082B\2\u028a\u0288"+
		"\3\2\2\2\u028a\u0289\3\2\2\2\u028b{\3\2\2\2\u028c\u028f\5~@\2\u028d\u028f"+
		"\5\u0084C\2\u028e\u028c\3\2\2\2\u028e\u028d\3\2\2\2\u028f}\3\2\2\2\u0290"+
		"\u0291\5\u0080A\2\u0291\u0292\5\u00b2Z\2\u0292\177\3\2\2\2\u0293\u0296"+
		"\7<\2\2\u0294\u0296\7=\2\2\u0295\u0293\3\2\2\2\u0295\u0294\3\2\2\2\u0296"+
		"\u0081\3\2\2\2\u0297\u0298\7\20\2\2\u0298\u0083\3\2\2\2\u0299\u029a\7"+
		">\2\2\u029a\u029c\5\u0086D\2\u029b\u029d\5\u0088E\2\u029c\u029b\3\2\2"+
		"\2\u029c\u029d\3\2\2\2\u029d\u0085\3\2\2\2\u029e\u029f\7d\2\2\u029f\u0087"+
		"\3\2\2\2\u02a0\u02a1\7?\2\2\u02a1\u02a2\7d\2\2\u02a2\u0089\3\2\2\2\u02a3"+
		"\u02a4\7@\2\2\u02a4\u02a6\5p9\2\u02a5\u02a7\7\f\2\2\u02a6\u02a5\3\2\2"+
		"\2\u02a6\u02a7\3\2\2\2\u02a7\u008b\3\2\2\2\u02a8\u02aa\7A\2\2\u02a9\u02ab"+
		"\7\67\2\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2"+
		"\u02ac\u02ad\5\u0092J\2\u02ad\u008d\3\2\2\2\u02ae\u02b0\7B\2\2\u02af\u02b1"+
		"\7\66\2\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2"+
		"\u02b2\u02b3\5\u0092J\2\u02b3\u008f\3\2\2\2\u02b4\u02b5\7C\2\2\u02b5\u02b6"+
		"\5\u0092J\2\u02b6\u0091\3\2\2\2\u02b7\u02b8\5\u0094K\2\u02b8\u02b9\t\4"+
		"\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b7\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc"+
		"\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u0093\3\2\2\2\u02be\u02c0\5\u0098"+
		"M\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u02c2\5\u0096L\2\u02c2\u0095\3\2\2\2\u02c3\u02c6\5\u0102\u0082\2\u02c4"+
		"\u02c6\7\5\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c4\3\2\2\2\u02c6\u0097\3\2"+
		"\2\2\u02c7\u02c8\5\u009aN\2\u02c8\u02c9\7\r\2\2\u02c9\u0099\3\2\2\2\u02ca"+
		"\u02cb\7h\2\2\u02cb\u009b\3\2\2\2\u02cc\u02cd\7D\2\2\u02cd\u02ce\5\u00b2"+
		"Z\2\u02ce\u009d\3\2\2\2\u02cf\u02d1\5\u00a0Q\2\u02d0\u02d2\5\u00a2R\2"+
		"\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d8\3\2\2\2\u02d3\u02d8"+
		"\5\u00a6T\2\u02d4\u02d8\5\u00a8U\2\u02d5\u02d8\5\u00aeX\2\u02d6\u02d8"+
		"\5\u00aaV\2\u02d7\u02cf\3\2\2\2\u02d7\u02d3\3\2\2\2\u02d7\u02d4\3\2\2"+
		"\2\u02d7\u02d5\3\2\2\2\u02d7\u02d6\3\2\2\2\u02d8\u009f\3\2\2\2\u02d9\u02da"+
		"\5\24\13\2\u02da\u00a1\3\2\2\2\u02db\u02dc\7\4\2\2\u02dc\u02dd\5\u00a4"+
		"S\2\u02dd\u02de\7\3\2\2\u02de\u00a3\3\2\2\2\u02df\u02e4\5\u009eP\2\u02e0"+
		"\u02e1\7\16\2\2\u02e1\u02e3\5\u009eP\2\u02e2\u02e0\3\2\2\2\u02e3\u02e6"+
		"\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u00a5\3\2\2\2\u02e6"+
		"\u02e4\3\2\2\2\u02e7\u02e8\7\21\2\2\u02e8\u02e9\5\u00a0Q\2\u02e9\u00a7"+
		"\3\2\2\2\u02ea\u02eb\7\22\2\2\u02eb\u02ec\5\u00a0Q\2\u02ec\u00a9\3\2\2"+
		"\2\u02ed\u02ee\7E\2\2\u02ee\u02ef\5\u00acW\2\u02ef\u00ab\3\2\2\2\u02f0"+
		"\u02f3\5\u0108\u0085\2\u02f1\u02f3\5\u00f8}\2\u02f2\u02f0\3\2\2\2\u02f2"+
		"\u02f1\3\2\2\2\u02f3\u00ad\3\2\2\2\u02f4\u02f5\7F\2\2\u02f5\u02f6\5\u00b0"+
		"Y\2\u02f6\u00af\3\2\2\2\u02f7\u02f8\t\7\2\2\u02f8\u00b1\3\2\2\2\u02f9"+
		"\u02fa\5\u00c0a\2\u02fa\u02fb\t\4\2\2\u02fb\u02fd\3\2\2\2\u02fc\u02f9"+
		"\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff"+
		"\u00b3\3\2\2\2\u0300\u02fe\3\2\2\2\u0301\u0302\7:\2\2\u0302\u0303\5\u0100"+
		"\u0081\2\u0303\u0304\7;\2\2\u0304\u0305\7K\2\2\u0305\u030b\3\2\2\2\u0306"+
		"\u0307\7H\2\2\u0307\u030b\7K\2\2\u0308\u0309\7G\2\2\u0309\u030b\7K\2\2"+
		"\u030a\u0301\3\2\2\2\u030a\u0306\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u00b5"+
		"\3\2\2\2\u030c\u0312\7h\2\2\u030d\u030f\7:\2\2\u030e\u0310\5\u00ba^\2"+
		"\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0313"+
		"\7;\2\2\u0312\u030d\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u00b7\3\2\2\2\u0314"+
		"\u0315\7K\2\2\u0315\u0317\5\u00b6\\\2\u0316\u0314\3\2\2\2\u0317\u0318"+
		"\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u00b9\3\2\2\2\u031a"+
		"\u031f\5\u00bc_\2\u031b\u031c\7\16\2\2\u031c\u031e\5\u00bc_\2\u031d\u031b"+
		"\3\2\2\2\u031e\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320"+
		"\u00bb\3\2\2\2\u0321\u031f\3\2\2\2\u0322\u0325\5\u0100\u0081\2\u0323\u0325"+
		"\5\u00fc\177\2\u0324\u0322\3\2\2\2\u0324\u0323\3\2\2\2\u0325\u00bd\3\2"+
		"\2\2\u0326\u0328\5\u00b4[\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328"+
		"\u0329\3\2\2\2\u0329\u032b\5\u00b6\\\2\u032a\u032c\5\u00b8]\2\u032b\u032a"+
		"\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u00bf\3\2\2\2\u032d\u0338\5\u00c2b"+
		"\2\u032e\u0338\5\u00be`\2\u032f\u0338\5\u00c6d\2\u0330\u0338\5\u00c8e"+
		"\2\u0331\u0338\5\u00caf\2\u0332\u0338\5\u00d2j\2\u0333\u0338\5\u00e0q"+
		"\2\u0334\u0338\5\u00eav\2\u0335\u0338\5\u00f2z\2\u0336\u0338\5\u00f4{"+
		"\2\u0337\u032d\3\2\2\2\u0337\u032e\3\2\2\2\u0337\u032f\3\2\2\2\u0337\u0330"+
		"\3\2\2\2\u0337\u0331\3\2\2\2\u0337\u0332\3\2\2\2\u0337\u0333\3\2\2\2\u0337"+
		"\u0334\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0336\3\2\2\2\u0338\u00c1\3\2"+
		"\2\2\u0339\u033b\7L\2\2\u033a\u033c\5\u009eP\2\u033b\u033a\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\7L\2\2\u033e\u0340\5\u00fa"+
		"~\2\u033f\u0341\5\u00c4c\2\u0340\u033f\3\2\2\2\u0340\u0341\3\2\2\2\u0341"+
		"\u00c3\3\2\2\2\u0342\u0343\7K\2\2\u0343\u0349\5L\'\2\u0344\u0346\7:\2"+
		"\2\u0345\u0347\5\u00ba^\2\u0346\u0345\3\2\2\2\u0346\u0347\3\2\2\2\u0347"+
		"\u0348\3\2\2\2\u0348\u034a\7;\2\2\u0349\u0344\3\2\2\2\u0349\u034a\3\2"+
		"\2\2\u034a\u00c5\3\2\2\2\u034b\u034c\5\u00fa~\2\u034c\u034d\7\t\2\2\u034d"+
		"\u034e\5\u0100\u0081\2\u034e\u00c7\3\2\2\2\u034f\u0350\5\u00fa~\2\u0350"+
		"\u0351\7M\2\2\u0351\u0352\5\u0100\u0081\2\u0352\u00c9\3\2\2\2\u0353\u0354"+
		"\7N\2\2\u0354\u0356\5\u00ccg\2\u0355\u0357\5\u00d0i\2\u0356\u0355\3\2"+
		"\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\7\n\2\2\u0359"+
		"\u00cb\3\2\2\2\u035a\u035f\5\u00ceh\2\u035b\u035c\7O\2\2\u035c\u035e\5"+
		"\u00ceh\2\u035d\u035b\3\2\2\2\u035e\u0361\3\2\2\2\u035f\u035d\3\2\2\2"+
		"\u035f\u0360\3\2\2\2\u0360\u00cd\3\2\2\2\u0361\u035f\3\2\2\2\u0362\u0363"+
		"\5\u0102\u0082\2\u0363\u0364\7\66\2\2\u0364\u0365\5\u00b2Z\2\u0365\u00cf"+
		"\3\2\2\2\u0366\u0367\7\67\2\2\u0367\u0368\5\u00b2Z\2\u0368\u00d1\3\2\2"+
		"\2\u0369\u036a\7P\2\2\u036a\u036c\5\u0100\u0081\2\u036b\u036d\5\u00d4"+
		"k\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036f\3\2\2\2\u036e"+
		"\u0370\5\u00d0i\2\u036f\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0371"+
		"\3\2\2\2\u0371\u0372\7\n\2\2\u0372\u00d3\3\2\2\2\u0373\u0374\7Q\2\2\u0374"+
		"\u0379\5\u00d6l\2\u0375\u0376\7Q\2\2\u0376\u0378\5\u00d6l\2\u0377\u0375"+
		"\3\2\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a"+
		"\u00d5\3\2\2\2\u037b\u0379\3\2\2\2\u037c\u037e\5\u00d8m\2\u037d\u037c"+
		"\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\7\66\2\2"+
		"\u0380\u0381\5\u00b2Z\2\u0381\u00d7\3\2\2\2\u0382\u0387\5\u00dan\2\u0383"+
		"\u0384\7\16\2\2\u0384\u0386\5\u00dan\2\u0385\u0383\3\2\2\2\u0386\u0389"+
		"\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u00d9\3\2\2\2\u0389"+
		"\u0387\3\2\2\2\u038a\u038d\5\u00dep\2\u038b\u038d\5\u00dco\2\u038c\u038a"+
		"\3\2\2\2\u038c\u038b\3\2\2\2\u038d\u00db\3\2\2\2\u038e\u038f\5\u00dep"+
		"\2\u038f\u0390\7R\2\2\u0390\u0391\5\u00dep\2\u0391\u00dd\3\2\2\2\u0392"+
		"\u0396\5\u0108\u0085\2\u0393\u0396\7e\2\2\u0394\u0396\5\u00f8}\2\u0395"+
		"\u0392\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0394\3\2\2\2\u0396\u00df\3\2"+
		"\2\2\u0397\u0399\5\u00e2r\2\u0398\u039a\5\u0090I\2\u0399\u0398\3\2\2\2"+
		"\u0399\u039a\3\2\2\2\u039a\u039c\3\2\2\2\u039b\u039d\5\u00e4s\2\u039c"+
		"\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039f\5\u00e6"+
		"t\2\u039f\u03a0\7\n\2\2\u03a0\u00e1\3\2\2\2\u03a1\u03a2\7S\2\2\u03a2\u03a3"+
		"\5\u00b2Z\2\u03a3\u00e3\3\2\2\2\u03a4\u03a6\7T\2\2\u03a5\u03a7\5\u0098"+
		"M\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8"+
		"\u03a9\5\u0100\u0081\2\u03a9\u00e5\3\2\2\2\u03aa\u03ab\5\u00e8u\2\u03ab"+
		"\u03ac\7U\2\2\u03ac\u03ad\5\u00b2Z\2\u03ad\u00e7\3\2\2\2\u03ae\u03af\7"+
		"V\2\2\u03af\u03b0\5\u0102\u0082\2\u03b0\u00e9\3\2\2\2\u03b1\u03b3\7W\2"+
		"\2\u03b2\u03b4\5\u00ecw\2\u03b3\u03b2\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4"+
		"\u03b5\3\2\2\2\u03b5\u03b6\5\u00b2Z\2\u03b6\u03b7\7\n\2\2\u03b7\u00eb"+
		"\3\2\2\2\u03b8\u03b9\7:\2\2\u03b9\u03ba\5\u00eex\2\u03ba\u03bb\7;\2\2"+
		"\u03bb\u00ed\3\2\2\2\u03bc\u03c1\5\u00f0y\2\u03bd\u03be\7\16\2\2\u03be"+
		"\u03c0\5\u00f0y\2\u03bf\u03bd\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1\u03bf"+
		"\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u00ef\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c4"+
		"\u03c5\7d\2\2\u03c5\u00f1\3\2\2\2\u03c6\u03c7\7X\2\2\u03c7\u03c8\5\u0092"+
		"J\2\u03c8\u03c9\7\n\2\2\u03c9\u00f3\3\2\2\2\u03ca\u03cb\7Y\2\2\u03cb\u00f5"+
		"\3\2\2\2\u03cc\u03cd\7\33\2\2\u03cd\u03ce\5\24\13\2\u03ce\u03cf\7\34\2"+
		"\2\u03cf\u00f7\3\2\2\2\u03d0\u03d1\7h\2\2\u03d1\u00f9\3\2\2\2\u03d2\u03d5"+
		"\7h\2\2\u03d3\u03d5\7H\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d3\3\2\2\2\u03d5"+
		"\u00fb\3\2\2\2\u03d6\u03d7\7Z\2\2\u03d7\u03d8\5\u00fe\u0080\2\u03d8\u00fd"+
		"\3\2\2\2\u03d9\u03dd\5`\61\2\u03da\u03dd\7G\2\2\u03db\u03dd\7H\2\2\u03dc"+
		"\u03d9\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc\u03db\3\2\2\2\u03dd\u00ff\3\2"+
		"\2\2\u03de\u03df\b\u0081\1\2\u03df\u03e0\7)\2\2\u03e0\u03ff\5\u0100\u0081"+
		"\24\u03e1\u03e2\7\23\2\2\u03e2\u03ff\5\u0100\u0081\23\u03e3\u03e4\7(\2"+
		"\2\u03e4\u03ff\5\u0100\u0081\16\u03e5\u03e6\7[\2\2\u03e6\u03ff\5\u0100"+
		"\u0081\t\u03e7\u03e8\7:\2\2\u03e8\u03e9\5\u0100\u0081\2\u03e9\u03ea\7"+
		";\2\2\u03ea\u03ff\3\2\2\2\u03eb\u03ff\7h\2\2\u03ec\u03ff\5\u00be`\2\u03ed"+
		"\u03ff\5\u0118\u008d\2\u03ee\u03f4\5\u0106\u0084\2\u03ef\u03f4\7f\2\2"+
		"\u03f0\u03f4\7c\2\2\u03f1\u03f4\7g\2\2\u03f2\u03f4\7l\2\2\u03f3\u03ee"+
		"\3\2\2\2\u03f3\u03ef\3\2\2\2\u03f3\u03f0\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3"+
		"\u03f2\3\2\2\2\u03f4\u03ff\3\2\2\2\u03f5\u03fa\7d\2\2\u03f6\u03fa\7e\2"+
		"\2\u03f7\u03fa\5\u010e\u0088\2\u03f8\u03fa\5\u0110\u0089\2\u03f9\u03f5"+
		"\3\2\2\2\u03f9\u03f6\3\2\2\2\u03f9\u03f7\3\2\2\2\u03f9\u03f8\3\2\2\2\u03fa"+
		"\u03ff\3\2\2\2\u03fb\u03ff\5\u0112\u008a\2\u03fc\u03ff\7G\2\2\u03fd\u03ff"+
		"\7H\2\2\u03fe\u03de\3\2\2\2\u03fe\u03e1\3\2\2\2\u03fe\u03e3\3\2\2\2\u03fe"+
		"\u03e5\3\2\2\2\u03fe\u03e7\3\2\2\2\u03fe\u03eb\3\2\2\2\u03fe\u03ec\3\2"+
		"\2\2\u03fe\u03ed\3\2\2\2\u03fe\u03f3\3\2\2\2\u03fe\u03f9\3\2\2\2\u03fe"+
		"\u03fb\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03fd\3\2\2\2\u03ff\u0417\3\2"+
		"\2\2\u0400\u0401\f\22\2\2\u0401\u0402\t\b\2\2\u0402\u0416\5\u0100\u0081"+
		"\23\u0403\u0404\f\21\2\2\u0404\u0405\t\t\2\2\u0405\u0416\5\u0100\u0081"+
		"\22\u0406\u0407\f\20\2\2\u0407\u0408\t\n\2\2\u0408\u0416\5\u0100\u0081"+
		"\21\u0409\u040a\f\17\2\2\u040a\u040b\t\13\2\2\u040b\u0416\5\u0100\u0081"+
		"\20\u040c\u040d\f\r\2\2\u040d\u040e\t\f\2\2\u040e\u0416\5\u0100\u0081"+
		"\16\u040f\u0410\f\f\2\2\u0410\u0411\t\r\2\2\u0411\u0416\5\u0100\u0081"+
		"\r\u0412\u0413\f\13\2\2\u0413\u0414\79\2\2\u0414\u0416\5\u0100\u0081\f"+
		"\u0415\u0400\3\2\2\2\u0415\u0403\3\2\2\2\u0415\u0406\3\2\2\2\u0415\u0409"+
		"\3\2\2\2\u0415\u040c\3\2\2\2\u0415\u040f\3\2\2\2\u0415\u0412\3\2\2\2\u0416"+
		"\u0419\3\2\2\2\u0417\u0415\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0101\3\2"+
		"\2\2\u0419\u0417\3\2\2\2\u041a\u041b\5\u0100\u0081\2\u041b\u0103\3\2\2"+
		"\2\u041c\u0426\5\u0106\u0084\2\u041d\u0426\7e\2\2\u041e\u0426\5\u0108"+
		"\u0085\2\u041f\u0426\5\u010a\u0086\2\u0420\u0426\7d\2\2\u0421\u0426\7"+
		"f\2\2\u0422\u0426\5\u010e\u0088\2\u0423\u0426\5\u0110\u0089\2\u0424\u0426"+
		"\7l\2\2\u0425\u041c\3\2\2\2\u0425\u041d\3\2\2\2\u0425\u041e\3\2\2\2\u0425"+
		"\u041f\3\2\2\2\u0425\u0420\3\2\2\2\u0425\u0421\3\2\2\2\u0425\u0422\3\2"+
		"\2\2\u0425\u0423\3\2\2\2\u0425\u0424\3\2\2\2\u0426\u0105\3\2\2\2\u0427"+
		"\u0428\t\16\2\2\u0428\u0107\3\2\2\2\u0429\u042b\5\u010c\u0087\2\u042a"+
		"\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d\7c"+
		"\2\2\u042d\u0109\3\2\2\2\u042e\u0430\5\u010c\u0087\2\u042f\u042e\3\2\2"+
		"\2\u042f\u0430\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0432\7g\2\2\u0432\u010b"+
		"\3\2\2\2\u0433\u0434\t\n\2\2\u0434\u010d\3\2\2\2\u0435\u0436\7Z\2\2\u0436"+
		"\u0437\7e\2\2\u0437\u010f\3\2\2\2\u0438\u0439\7Z\2\2\u0439\u043a\7d\2"+
		"\2\u043a\u0111\3\2\2\2\u043b\u043d\7`\2\2\u043c\u043e\5\u0114\u008b\2"+
		"\u043d\u043c\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440"+
		"\7a\2\2\u0440\u0113\3\2\2\2\u0441\u0446\5\u0100\u0081\2\u0442\u0443\7"+
		"\16\2\2\u0443\u0445\5\u0100\u0081\2\u0444\u0442\3\2\2\2\u0445\u0448\3"+
		"\2\2\2\u0446\u0444\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0115\3\2\2\2\u0448"+
		"\u0446\3\2\2\2\u0449\u044a\7[\2\2\u044a\u044b\5\u0100\u0081\2\u044b\u0117"+
		"\3\2\2\2\u044c\u044d\7b\2\2\u044d\u044f\7:\2\2\u044e\u0450\5\u011a\u008e"+
		"\2\u044f\u044e\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0452"+
		"\7;\2\2\u0452\u0119\3\2\2\2\u0453\u0458\5\u00f8}\2\u0454\u0455\7\16\2"+
		"\2\u0455\u0457\5\u00f8}\2\u0456\u0454\3\2\2\2\u0457\u045a\3\2\2\2\u0458"+
		"\u0456\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u011b\3\2\2\2\u045a\u0458\3\2"+
		"\2\2n\u011d\u0121\u0124\u0127\u012a\u012d\u0130\u013b\u013f\u014b\u0150"+
		"\u0153\u0163\u0168\u017c\u0183\u0186\u0189\u018c\u018f\u0192\u019e\u01ad"+
		"\u01b7\u01be\u01ca\u01da\u01dd\u01e0\u01e9\u01f4\u01f8\u01fb\u01fe\u0205"+
		"\u020e\u0211\u0214\u021c\u0223\u0227\u022e\u0255\u0259\u0262\u026d\u0274"+
		"\u0277\u027a\u027d\u0281\u0284\u028a\u028e\u0295\u029c\u02a6\u02aa\u02b0"+
		"\u02bc\u02bf\u02c5\u02d1\u02d7\u02e4\u02f2\u02fe\u030a\u030f\u0312\u0318"+
		"\u031f\u0324\u0327\u032b\u0337\u033b\u0340\u0346\u0349\u0356\u035f\u036c"+
		"\u036f\u0379\u037d\u0387\u038c\u0395\u0399\u039c\u03a6\u03b3\u03c1\u03d4"+
		"\u03dc\u03f3\u03f9\u03fe\u0415\u0417\u0425\u042a\u042f\u043d\u0446\u044f"+
		"\u0458";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}