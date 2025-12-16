package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class kf5 {
    public final /* synthetic */ lf5 a;

    public kf5(lf5 lf5Var) {
        this.a = lf5Var;
    }

    public final void a(TextInputLayout textInputLayout) {
        lf5 lf5Var = this.a;
        jf5 jf5Var = lf5Var.I0;
        if (lf5Var.F0 == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = lf5Var.F0;
        if (editText != null) {
            editText.removeTextChangedListener(jf5Var);
            if (lf5Var.F0.getOnFocusChangeListener() == lf5Var.b().e()) {
                lf5Var.F0.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        lf5Var.F0 = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(jf5Var);
        }
        lf5Var.b().m(lf5Var.F0);
        lf5Var.j(lf5Var.b());
    }
}
