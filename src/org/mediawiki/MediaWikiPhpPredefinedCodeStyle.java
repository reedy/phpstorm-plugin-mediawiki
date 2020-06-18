package org.mediawiki;

import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.codeStyle.PredefinedCodeStyle;
import com.jetbrains.php.lang.PhpFileType;
import com.jetbrains.php.lang.PhpLanguage;
import com.jetbrains.php.lang.formatter.PhpCodeStyleSettings;
import com.jetbrains.php.refactoring.PhpNameStyle;

/**
 * @author Reedy
 */
public class MediaWikiPhpPredefinedCodeStyle extends PredefinedCodeStyle {
    public MediaWikiPhpPredefinedCodeStyle() {
        super("MediaWiki", PhpLanguage.INSTANCE);
    }

    @Override
    public void apply(CodeStyleSettings settings) {
        CommonCodeStyleSettings commonSettings = settings.getCommonSettings(getLanguage());
        commonSettings.KEEP_BLANK_LINES_IN_CODE = 1;
        commonSettings.KEEP_BLANK_LINES_BEFORE_RBRACE = 0;
        commonSettings.KEEP_LINE_BREAKS = false;
        commonSettings.KEEP_CONTROL_STATEMENT_IN_ONE_LINE = false;

        commonSettings.CLASS_BRACE_STYLE = 1;
        commonSettings.METHOD_BRACE_STYLE = 1;

        commonSettings.CATCH_ON_NEW_LINE = false;
        commonSettings.FINALLY_ON_NEW_LINE = false;

        commonSettings.ALIGN_MULTILINE_PARAMETERS = false;
        commonSettings.ALIGN_MULTILINE_FOR = false;

        commonSettings.SPACE_WITHIN_PARENTHESES = true;
        commonSettings.SPACE_WITHIN_METHOD_CALL_PARENTHESES = true;
        commonSettings.SPACE_WITHIN_METHOD_PARENTHESES = true;
        commonSettings.SPACE_WITHIN_IF_PARENTHESES = true;
        commonSettings.SPACE_WITHIN_WHILE_PARENTHESES = true;
        commonSettings.SPACE_WITHIN_FOR_PARENTHESES = true;
        commonSettings.SPACE_WITHIN_CATCH_PARENTHESES = true;
        commonSettings.SPACE_WITHIN_SWITCH_PARENTHESES = true;
        commonSettings.SPACE_WITHIN_ARRAY_INITIALIZER_BRACES = true;
        commonSettings.SPACE_AFTER_TYPE_CAST = true;

        commonSettings.IF_BRACE_FORCE = 3;
        commonSettings.FOR_BRACE_FORCE = 3;
        commonSettings.DOWHILE_BRACE_FORCE = 3;
        commonSettings.WHILE_BRACE_FORCE = 3;

        commonSettings.ARRAY_INITIALIZER_WRAP = 2;
        commonSettings.ARRAY_INITIALIZER_LBRACE_ON_NEXT_LINE = true;
        commonSettings.ARRAY_INITIALIZER_RBRACE_ON_NEXT_LINE = true;

        commonSettings.CALL_PARAMETERS_WRAP = 5;
        commonSettings.METHOD_PARAMETERS_WRAP = 5;

        commonSettings.EXTENDS_KEYWORD_WRAP = 1;
        commonSettings.EXTENDS_LIST_WRAP = 5;

        commonSettings.CALL_PARAMETERS_LPAREN_ON_NEXT_LINE = true;
        commonSettings.CALL_PARAMETERS_RPAREN_ON_NEXT_LINE = true;

        commonSettings.METHOD_PARAMETERS_LPAREN_ON_NEXT_LINE = true;
        commonSettings.METHOD_PARAMETERS_RPAREN_ON_NEXT_LINE = true;

        commonSettings.METHOD_CALL_CHAIN_WRAP = 5;
        commonSettings.BINARY_OPERATION_WRAP = 5;
        commonSettings.TERNARY_OPERATION_WRAP = 1;
        commonSettings.TERNARY_OPERATION_SIGNS_ON_NEXT_LINE = true;

        commonSettings.FOR_STATEMENT_WRAP = 1;
        commonSettings.FOR_STATEMENT_LPAREN_ON_NEXT_LINE = true;
        commonSettings.FOR_STATEMENT_RPAREN_ON_NEXT_LINE = true;
        
        // Hard wrap at 120 characters
        commonSettings.RIGHT_MARGIN = 120;

        // Doesn't seem to exist?
        // commonSettings.SOFT_MARGINS = 100;
        
        // Don't keep line breaks when reformatting
        commonSettings.KEEP_LINE_BREAKS = false;

        PhpCodeStyleSettings phpSettings = settings.getCustomSettings(PhpCodeStyleSettings.class);
        phpSettings.LOWER_CASE_BOOLEAN_CONST = true;
        phpSettings.LOWER_CASE_NULL_CONST = true;
        phpSettings.BLANK_LINES_BEFORE_RETURN_STATEMENT = 1;
        phpSettings.KEEP_RPAREN_AND_LBRACE_ON_ONE_LINE = true;
        phpSettings.SPACE_AFTER_COLON_IN_RETURN_TYPE = true;
        phpSettings.SPACE_BEFORE_COLON_IN_RETURN_TYPE = true;
        phpSettings.IF_LPAREN_ON_NEXT_LINE = true;
        phpSettings.IF_RPAREN_ON_NEXT_LINE = true;
        phpSettings.VARIABLE_NAMING_STYLE = PhpNameStyle.Style.CAMEL_CASE;
        
        phpSettings.PHPDOC_BLANK_LINE_BEFORE_TAGS = true;
        phpSettings.PHPDOC_KEEP_BLANK_LINES = true;
        phpSettings.PHPDOC_BLANK_LINES_AROUND_PARAMETERS = true;
        phpSettings.PHPDOC_WRAP_LONG_LINES = true;
        phpSettings.SORT_PHPDOC_ELEMENTS = false;

        CodeStyleSettings.IndentOptions indentOptions = settings.getIndentOptions(PhpFileType.INSTANCE);
        indentOptions.USE_TAB_CHARACTER = true;
        indentOptions.SMART_TABS = false;
        indentOptions.TAB_SIZE = 4;
        indentOptions.INDENT_SIZE = 4;
        indentOptions.CONTINUATION_INDENT_SIZE = 4;
        indentOptions.LABEL_INDENT_SIZE = 0;
        indentOptions.LABEL_INDENT_ABSOLUTE = false;
        indentOptions.USE_RELATIVE_INDENTS = false;
    }
}
