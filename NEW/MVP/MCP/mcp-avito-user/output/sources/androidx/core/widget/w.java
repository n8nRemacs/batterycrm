package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.core.view.C22814d;
import androidx.core.view.N;
import j.P;
import java.util.Objects;

/* compiled from: TextViewOnReceiveContentListener.java */
@RestrictTo
/* loaded from: classes.dex */
public final class w implements N {
    @Override // androidx.core.view.N
    @P
    public final C22814d a(@j.N View view, @j.N C22814d c22814d) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(c22814d);
        }
        if (c22814d.c() == 2) {
            return c22814d;
        }
        ClipData clipDataA = c22814d.a();
        int iB2 = c22814d.b();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z12 = false;
        for (int i12 = 0; i12 < clipDataA.getItemCount(); i12++) {
            ClipData.Item itemAt = clipDataA.getItemAt(i12);
            if ((iB2 & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z12) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z12 = true;
                }
            }
        }
        return null;
    }
}
