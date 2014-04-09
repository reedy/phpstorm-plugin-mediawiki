package org.mediawiki;

import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.codeStyle.PredefinedCodeStyle;
import com.jetbrains.php.lang.PhpFileType;
import com.jetbrains.php.lang.PhpLanguage;
import com.jetbrains.php.lang.formatter.PhpCodeStyleSettings;

/**
 * @author Reedy
 */
public class MediaWikiPredefinedCodeStyle extends PredefinedCodeStyle {
    public MediaWikiPredefinedCodeStyle() {
        super("MediaWiki", PhpLanguage.INSTANCE);
    }

    @Override
    public void apply(CodeStyleSettings settings) {
        CommonCodeStyleSettings commonSettings = settings.getCommonSettings(getLanguage());
        commonSettings.KEEP_BLANK_LINES_IN_CODE = 1;
        commonSettings.KEEP_BLANK_LINES_BEFORE_RBRACE = 0;
        commonSettings.CLASS_BRACE_STYLE = 1;
        commonSettings.METHOD_BRACE_STYLE = 1;
        commonSettings.ALIGN_MULTILINE_PARAMETERS = false;
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

        PhpCodeStyleSettings phpSettings = settings.getCustomSettings(PhpCodeStyleSettings.class);
        phpSettings.LOWER_CASE_BOOLEAN_CONST = true;
        phpSettings.LOWER_CASE_NULL_CONST = true;
        phpSettings.BLANK_LINE_BEFORE_RETURN_STATEMENT = true;
        phpSettings.KEEP_RPAREN_AND_LBRACE_ON_ONE_LINE = true;

        CodeStyleSettings.IndentOptions indentOptions = settings.getIndentOptions(PhpFileType.INSTANCE);
        indentOptions.USE_TAB_CHARACTER = true;
        indentOptions.SMART_TABS = true;
        indentOptions.TAB_SIZE = 4;
        indentOptions.INDENT_SIZE = 4;
        indentOptions.CONTINUATION_INDENT_SIZE = 4;
    }
}
