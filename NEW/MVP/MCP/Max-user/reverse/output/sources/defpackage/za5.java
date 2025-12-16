package defpackage;

import android.R;
import android.text.TextWatcher;

/* loaded from: classes2.dex */
public abstract class za5 extends ri {
    public xc5 v0;

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        return i == 16908322 ? super.onTextContextMenuItem(R.id.pasteAsPlainText) : super.onTextContextMenuItem(i);
    }

    public void setReplaceTextSmiles(boolean z) {
        if (z) {
            if (this.v0 == null) {
                xc5 xc5Var = new xc5();
                this.v0 = xc5Var;
                addTextChangedListener(xc5Var);
                return;
            }
            return;
        }
        TextWatcher textWatcher = this.v0;
        if (textWatcher != null) {
            removeTextChangedListener(textWatcher);
            this.v0 = null;
        }
    }
}
