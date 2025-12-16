package defpackage;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class jb5 extends ra5 {
    public final WeakReference a;
    public final WeakReference b;

    public jb5(TextView textView, kb5 kb5Var) {
        this.a = new WeakReference(textView);
        this.b = new WeakReference(kb5Var);
    }

    @Override // defpackage.ra5
    public final void i() {
        InputFilter[] filters;
        CharSequence text;
        CharSequence charSequenceG;
        TextView textView = (TextView) this.a.get();
        InputFilter inputFilter = (InputFilter) this.b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (!textView.isAttachedToWindow() || text == (charSequenceG = ta5.a().g((text = textView.getText())))) {
                    return;
                }
                int selectionStart = Selection.getSelectionStart(charSequenceG);
                int selectionEnd = Selection.getSelectionEnd(charSequenceG);
                textView.setText(charSequenceG);
                if (charSequenceG instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequenceG;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                        return;
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                        return;
                    } else {
                        if (selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionEnd);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }
}
