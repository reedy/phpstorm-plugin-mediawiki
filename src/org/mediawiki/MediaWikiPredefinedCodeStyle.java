package org.mediawiki;

import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.PredefinedCodeStyle;
import com.jetbrains.php.lang.PhpFileType;
import com.jetbrains.php.lang.PhpLanguage;

/**
 * @author Reedy
 */
public class MediaWikiPredefinedCodeStyle extends PredefinedCodeStyle {
    public MediaWikiPredefinedCodeStyle() {
        super("MediaWiki", PhpLanguage.INSTANCE);
    }

    @Override
    public void apply(CodeStyleSettings settings) {
        CodeStyleSettings.IndentOptions indentOptions = settings.getIndentOptions(PhpFileType.INSTANCE);
        indentOptions.USE_TAB_CHARACTER = true;
        indentOptions.SMART_TABS = true;
    }
}
