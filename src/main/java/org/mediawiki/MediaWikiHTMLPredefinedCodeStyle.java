/*
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package org.mediawiki;

import com.intellij.ide.highlighter.HtmlFileType;
import com.intellij.lang.html.HTMLLanguage;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.PredefinedCodeStyle;

/**
 * @author Reedy
 */
public class MediaWikiHTMLPredefinedCodeStyle extends PredefinedCodeStyle {
    public MediaWikiHTMLPredefinedCodeStyle() {
        super("MediaWiki", HTMLLanguage.INSTANCE);
    }

    @Override
    public void apply(CodeStyleSettings settings) {
        CodeStyleSettings.IndentOptions indentOptions = settings.getIndentOptions(HtmlFileType.INSTANCE);
        indentOptions.USE_TAB_CHARACTER = true;
        indentOptions.SMART_TABS = true;
        indentOptions.TAB_SIZE = 4;
        indentOptions.INDENT_SIZE = 4;
        indentOptions.CONTINUATION_INDENT_SIZE = 8;
        indentOptions.LABEL_INDENT_SIZE = 0;
        indentOptions.LABEL_INDENT_ABSOLUTE = false;
        indentOptions.USE_RELATIVE_INDENTS = false;
    }
}
