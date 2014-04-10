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

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.util.text.StringUtil;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author Reedy
 */
public class MediaWikiSearchDocsAction extends AnAction {
    public void update(AnActionEvent event) {
        boolean enabled = getSelectedText(event) != null;
        event.getPresentation().setEnabled(enabled);
        event.getPresentation().setVisible(enabled);
    }

    @Nullable
    private static String getSelectedText(AnActionEvent e) {
        Editor editor = e.getData(CommonDataKeys.EDITOR);
        if (editor == null) {
            return null;
        }
        String selectedText = editor.getSelectionModel().getSelectedText();
        return StringUtil.nullize(selectedText, true);
    }

    public void actionPerformed(AnActionEvent event) {
        String selectedText = getSelectedText(event);
        if (selectedText == null) {
            return;
        }
        BrowserUtil.browse(getSearchUrl(selectedText));
    }

    @NonNls
    private static String getSearchUrl(@NotNull String textToSearch) {
        try {
            return "https://www.mediawiki.org/w/index.php?title=Special%3ASearch&profile=default&fulltext=Search&search=" + URLEncoder.encode(textToSearch, "UTF-8");
        } catch (UnsupportedEncodingException e) {
        }
        return "";
    }
}
