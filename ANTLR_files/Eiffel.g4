grammar Eiffel;

COMMENT:
        '--' (.)*? '\n' -> channel(HIDDEN);

/*long_string
    :   '\"' (.)* '%\n' ('%' (.)* '%\n')* '%' (.)* '\"';
    */

WS:
        [ \t\n\r]+ -> skip;
class_declaration:
        //indexing? class_header obsolete? inheritance? creators? features? invariant? END;
        indexing? class_header formal_generics? obsolete? inheritance? creators? features? invariant? END;
indexing:
        INDEXING index_list;
index_list:
        index_clause (index_clause)*;
index_clause:
        index? index_terms;
index:
        IDENTIFIER COLON;
index_terms:
        index_value (COMMA index_value)*;
index_value:
            IDENTIFIER
        |   manifest_constant;
class_header:
        header_mark? CLASS class_name;
header_mark:
            DEFERRED
        |   EXPANDED
        |   SEPARATE;
class_name:
        IDENTIFIER;
formal_generics:
        formal_generic_list;
formal_generic_list:
        formal_generic (COMMA formal_generic)*;
formal_generic:
        formal_generic_name constraint?;
formal_generic_name:
        IDENTIFIER;
constraint:
        CONSTR class_type;
obsolete:
        OBSOLETE message;
message:
        MANIFEST_STRING;
inheritance:
        INHERIT parent_list;
parent_list:
        parent (SEMI parent)* SEMI;
parent:
        class_type feature_adaptation?;
feature_adaptation:
        rename? new_exports? undefine? redefine? select? END;
rename:
        RENAME rename_list;
rename_list:
        rename_pair (COMMA rename_pair)*;
rename_pair:
        feature_name AS feature_name;
new_exports:
        EXPORT new_export_list;
new_export_list:
        new_export_item (SEMI new_export_item)* SEMI;
new_export_item:
        clients feature_set;
feature_set:
            feature_list    #some_features
        |   ALL             #all_features;
feature_list:
        feature_name (COMMA feature_name)*;
clients:
        LBRACE class_list RBRACE;
class_list:
        class_name (COMMA class_name)*;
redefine:
        REDEFINE feature_list;
undefine:
        UNDEFINE feature_list;
select:
        SELECT feature_list;
creators:
        (CREATION|CREATE) (creation_clause)+;
creation_clause:
        clients? COMMENT? procedure_list;
procedure_list:
        procedure_name (COMMA procedure_name)*;
procedure_name:
        IDENTIFIER;
features:
        FEATURE feature_clause (FEATURE feature_clause)*;
feature_clause:
        clients? COMMENT? feature_declaration_list?;
feature_declaration_list:
        feature_declaration ((SEMI |NEWLINE) feature_declaration)* (SEMI | NEWLINE);
feature_declaration:
        new_feature_list declaration_body;
declaration_body:
        formal_arguments? type_mark? constant_or_routine?;
constant_or_routine:
        IS feature_value;
feature_value:
            manifest_constant   #constant_feature_value
        |   UNIQUE              #unique_feature_value
        |   routine             #routine_feature_value;
/*unique:
        ;
        */
new_feature_list:
        new_feature (COMMA new_feature)*;
new_feature:
        FROZEN? feature_name;
feature_name:
            IDENTIFIER
        |   prefix
        |   infix;
prefix:
        PREFIX T__12 prefix_operator T__12;
infix:
        INFIX T__12 infix_operator T__12;
prefix_operator:
            unary;
//        |   free_operator;
infix_operator:
            binary;
//        |   free_operator;

unary:
            NOT
        |   ADD
        |   SUB;
binary:
            MUL
        |   DIV
        |   ADD
        |   SUB
        |   LT
        |   GT
        |   LE
        |   GE
        |   T__5
        |   T__6
        |   CARET
        |   AND
        |   OR
        |   XOR
        |   AND WS THEN
        |   OR WS ELSE
        |   IMPLIES;
formal_arguments:
        LPAREN entity_declaration_list? RPAREN;
entity_declaration_list:
        entity_declaration_group ((COMMA | SEMI) entity_declaration_group)*;
entity_declaration_group:
        identifier_list type_mark;
identifier_list:
        IDENTIFIER (COMMA IDENTIFIER)*;
type_mark:
        COLON type;
routine:
        obsolete? COMMENT? precondition? local_declarations? routine_body postcondition? rescue? END;
routine_body:
            effective   #effective_routine_body
        |   deferred    #deferred_routine_body;
effective:
            internal    #internal_effective
        |   external    #external_effective;
internal:
        routine_mark compound;
routine_mark:
            DO      #do
        |   ONCE    #once;
deferred:
        DEFERRED;
external:
        EXTERNAL language_name external_name?;
language_name:
        MANIFEST_STRING;
external_name:
        ALIAS MANIFEST_STRING;
local_declarations:
        LOCAL entity_declaration_list SEMI?;
precondition:
        REQUIRE ELSE? assertion;
postcondition:
        ENSURE THEN? assertion;
invariant:
        INVARIANT assertion;
assertion:
        (assertion_clause (SEMI | NEWLINE))+;
assertion_clause:
        tag_mark? unlabeled_assertion_clause;
unlabeled_assertion_clause:
            boolean_expression  #boolean_assertion_clause
        |   COMMENT             #comment_assertion_clause;
tag_mark:
        tag COLON;
tag:
        IDENTIFIER;
rescue:
        RESCUE compound;
type:
            class_type actual_generics? #type_with_generics
        |   class_type_expanded #type_expanded
        |   class_type_separate #type_separated
        |   anchored    #type_anchored
        |   bit_type    #type_bit;

class_type:
        class_name;
actual_generics:
        '[' type_list ']';
type_list:
        type (COMMA type)*;
class_type_expanded:
        EXPANDED class_type;
class_type_separate:
        SEPARATE class_type;
bit_type:
        BIT bit_length;
bit_length:
            integer_constant
        |   attribute;
anchored:
        LIKE anchor;
anchor:
            IDENTIFIER
        |   CURRENT;
compound:
        (instruction (SEMI|NEWLINE))*;

call_qualifier
	:	LPAREN expression RPAREN DOT #expression_qualifier
	|   RESULT DOT  #result_qualifier
	|   CURRENT DOT #current_qualifier
	;
usual_call
	:	IDENTIFIER (LPAREN params? RPAREN)?
	;
call_chain
	:	(DOT usual_call)+
	;
params
	:	(param (COMMA param)*)
	;
param
    :   expression #expr_param
    |   address #addr_param
    ;

call
    : call_qualifier? usual_call (call_chain)?;


instruction:
            creation    #creation_instruction
        //|   ((LPAREN expression RPAREN | RESULT | CURRENT) DOT)? (IDENTIFIER (LPAREN ((expression | address) (COMMA (expression | address))*)? RPAREN)? (DOT IDENTIFIER (LPAREN ((expression | address) (COMMA (expression | address))*)? RPAREN)?)*)   #call_instruction
        //|	((LPAREN expression RPAREN | RESULT | CURRENT | parent_qualification? PRECURSOR (LPAREN ((expression | address) (COMMA (expression | address))*)? RPAREN)?) DOT)? ((IDENTIFIER (LPAREN ((expression | address) (COMMA (expression | address))*)? RPAREN)?)) (DOT ((IDENTIFIER (LPAREN ((expression | address) (COMMA (expression | address))*)? RPAREN)?) DOT))*
        //|	parent_qualification? PRECURSOR (LPAREN ((expression | address) (COMMA (expression | address))*)? RPAREN)?
        //|   call_qualifier? usual_call call_chain?  #call_instruction
        |   call    #call_instruction
        |   assignment  #assignment_instruction
        |   assignment_attempt  #assignment_attempt_instruction
        |   conditional #conditional_instruction
        |   multi_branch    #multi_branch_instruction
        |   loop    #loop_instruction
        |   debug   #debug_instruction
        |   check   #check_instruction
        |   retry   #retry_instruction;
//        |   null_instruction;
creation:
        BANG type? BANG writable creation_call?;
creation_call:
        DOT procedure_name (LPAREN params? RPAREN)?;
assignment:
        writable ':=' expression;
assignment_attempt:
        writable T__8 expression;
conditional:
        IF then_part_list else_part? END;
then_part_list:
        then_part (ELSEIF then_part)*;
then_part:
        boolean_expression THEN compound;
else_part:
        ELSE compound;
multi_branch:
        INSPECT expression when_part_list? else_part? END;
when_part_list:
        WHEN when_part (WHEN when_part)*;
when_part:
        choices? THEN compound;
choices:
        choice (COMMA choice)*;
choice:
            choice_constant #choice_constant_choice
        |   interval    #interval_choice;
interval:
        choice_constant T__9 choice_constant;
choice_constant:
            integer_constant    #integer_choice_constant
        |   CHARACTER_CONSTANT  #character_choice_constant
        |   attribute   #attribute_choice_constant;
loop:
        initialization invariant? variant? loop_body END;
initialization:
        FROM compound;
variant:
        VARIANT tag_mark? expression;
loop_body:
        exit LOOP compound;
exit:
        UNTIL boolean_expression;
debug:
        DEBUG debug_keys? compound END;
debug_keys:
        LPAREN debug_key_list RPAREN;
debug_key_list:
        debug_key (COMMA debug_key)*;
debug_key:
        MANIFEST_STRING;
check:
        CHECK assertion END;
retry:
        RETRY;

parent_qualification:
        LBRACE class_name RBRACE;
attribute:
        IDENTIFIER;
writable:
            IDENTIFIER  #identifier_writable
        |   RESULT  #result_writable;

address:
        T__14 address_mark;
address_mark:
            feature_name    #feature_name_address_mark
        |   CURRENT         #current_address_mark
        |   RESULT          #result_address_mark;
expression:
            LPAREN expression RPAREN    #parenthesized_expr
        |   IDENTIFIER                  #identifier_expr

        |   ADD expression              #add_expr
        |   SUB expression              #sub_expr
        |   expression op=(MUL | DIV) expression   #mul_div_expr
        |   expression op=(T__5 | T__6) expression #div_expr
        |   expression op=(ADD | SUB) expression   #add_sub_expr
        |   expression op=(LT | GT | LE | GE | EQUAL | NOT_EQUAL) expression   #comp_expr
        |   NOT expression              #not_expr
        |   expression op=(AND | AND_THEN) expression                   #and_expr
        |   expression op=(OR | XOR | OR_ELSE) expression                    #or_expr
        |   expression IMPLIES expression               #implies_expr
        //|   ((LPAREN expression RPAREN | RESULT | CURRENT) DOT)? (IDENTIFIER (LPAREN ((expression | address) (COMMA (expression | address))*)? RPAREN)? (DOT IDENTIFIER (LPAREN ((expression | address) (COMMA (expression | address))*)? RPAREN)?)*)   #call_expr
        |   call  #call_expr
        |   OLD expression  #old_expr
        |   strip   #strip_expr
        |   (boolean_constant |   BIT_CONSTANT |   INTEGER |   REAL |  HEXADECIMAL_CONSTANT)   #constant_expr
        //|   long_string #long_str_expr
        |   (MANIFEST_STRING |   CHARACTER_CONSTANT |   wide_character_constant |   wide_manifest_string)   #chars_expr

        |   manifest_array  #manifest_array_expr
        |   CURRENT #current_expr
        |   RESULT  #result_expr;
boolean_expression:
        expression;

manifest_constant:
            boolean_constant    #bool_man
        |   CHARACTER_CONSTANT  #char_man
        |   integer_constant    #int_man
        |   real_constant   #real_man
        |   MANIFEST_STRING #man_str_man
        |   BIT_CONSTANT    #bit_man
        |   wide_character_constant #wide_char_man
        |   wide_manifest_string    #wide_man_man
        |   HEXADECIMAL_CONSTANT    #hexad_man;
boolean_constant:
            TRUE
        |   FALSE;
integer_constant:
        sign? INTEGER;
real_constant:
        sign? REAL;
sign:
            ADD
        |   SUB;
wide_character_constant:
        T__14 CHARACTER_CONSTANT;
wide_manifest_string:
        T__14 MANIFEST_STRING;
manifest_array:
        T__15 expression_list? T__16;
expression_list:
        expression (COMMA expression)*;
old:
        OLD expression;

strip:
        STRIP LPAREN attribute_list? RPAREN;
attribute_list:
        attribute (COMMA attribute)*;
NEWLINE : '\n';
CONSTR  :   '->';
T__23 : ':=' ;
END : 'end' ;
INDEXING : 'indexing' ;
SEMI : ';' ;
COLON : ':' ;
COMMA : ',' ;
CLASS : 'class' ;
DEFERRED : 'deferred' ;
EXPANDED : 'expanded';
SEPARATE : 'separate' ;
SUB : '-' ;
GT : '>' ;
OBSOLETE : 'obsolete' ;
INHERIT : 'inherit' ;
RENAME : 'rename' ;
AS : 'as' ;
EXPORT : 'export' ;
ALL : 'all' ;
LBRACE : '{' ;
RBRACE : '}' ;
REDEFINE : 'redefine' ;
UNDEFINE : 'undefine' ;
SELECT : 'select' ;
CREATE : 'create' ;
FEATURE : 'feature' ;
IS : 'is' ;
UNIQUE : 'unique' ;
FROZEN : 'frozen' ;
PREFIX : 'prefix' ;
T__12 : '"' ;
INFIX : 'infix' ;
NOT : 'not' ;
ADD : '+' ;
MUL : '*' ;
DIV : '/' ;
LT : '<' ;
LE : '<=' ;
GE : '>=' ;
T__5 : '//' ;
T__6 : '\\\\' ;
CARET : '^' ;
AND_THEN : 'and then';
AND : 'and' ;

OR : 'or' ;
XOR : 'xor' ;
THEN : 'then' ;
ELSE : 'else';
OR_ELSE : 'or else';
IMPLIES : 'implies' ;
LPAREN : '(' ;
RPAREN : ')' ;
DO : 'do' ;
ONCE : 'once' ;
EXTERNAL : 'external' ;
ALIAS : 'alias' ;
LOCAL : 'local' ;
REQUIRE : 'require' ;
ENSURE : 'ensure' ;
INVARIANT : 'invariant' ;
RESCUE : 'rescue' ;
BIT : 'bit' ;
LIKE : 'like' ;
CURRENT : 'Current' ;
RESULT : 'Result' ;
CREATION : 'creation';
PRECURSOR : 'Precursor' ;
DOT : '.';
BANG : '!' ;
T__8 : '?=' ;
IF : 'if' ;
ELSEIF : 'elseif' ;
INSPECT : 'inspect' ;
WHEN : 'when' ;
T__9 : '..' ;
FROM : 'from' ;
VARIANT : 'variant' ;
LOOP : 'loop' ;
UNTIL : 'until' ;
DEBUG : 'debug' ;
CHECK : 'check' ;
RETRY : 'retry' ;
T__14 : '$' ;
OLD : 'old' ;
EQUAL : '=' ;
NOT_EQUAL : '/=' ;
TRUE : 'true' ;
FALSE : 'false' ;
T__15 : '<<' ;
T__16 : '>>' ;
STRIP : 'strip' ;

INTEGER:
            [0-9]+
        |   [0-9] ([0-9] [0-9]?)? ('_' [0-9] [0-9] [0-9])+;
MANIFEST_STRING:
        //T__12 (.)*? ('%' WS '%' (.)*?)* T__12;
        T__12 (.)*? T__12;
        //'\"' (.)* ('%\n' ('%' (.)* '%\n')* '%' (.)*)? '\"';
CHARACTER_CONSTANT:
        '\'' CHARACTER '\'';
BIT_CONSTANT:
        ('0' | '1')+ ('b' | 'b');
REAL:
            [0-9]+ DOT (('e' | 'e') (ADD | SUB) [0-9]+)?
        |   DOT [0-9]+ (('e' | 'e') (ADD | SUB) [0-9]+)?
        |   [0-9]+ DOT [0-9]+ (('e' | 'e') (ADD | SUB) [0-9]+)?;
IDENTIFIER:
        [a-zA-Z] [a-zA-Z0-9_]*;
CHARACTER:
        (.);
DECIMAL_DIGIT:
        [0-9];
LETTER:
        [a-zA-Z];
HEXADECIMAL_CONSTANT:
        [0-9] ([0-9] | [a-fA-F])* ('x' | 'x');