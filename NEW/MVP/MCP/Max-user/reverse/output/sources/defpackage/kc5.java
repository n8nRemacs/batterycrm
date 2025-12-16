package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class kc5 implements TextWatcher {
    public final EditText a;
    public final boolean b;
    public ic5 c;
    public int d = Integer.MAX_VALUE;
    public int o = 0;
    public boolean X = true;

    public kc5(EditText editText, boolean z) {
        this.a = editText;
        this.b = z;
    }

    public static void a(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            ta5.a().g(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.a;
        if (editText.isInEditMode() || !this.X) {
            return;
        }
        if ((this.b || ta5.m != null) && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iB = ta5.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    ta5.a().f(i, i + i3, (Spannable) charSequence, this.d, this.o);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            ta5 ta5VarA = ta5.a();
            if (this.c == null) {
                this.c = new ic5(editText);
            }
            ta5VarA.h(this.c);
        }
    }
}
