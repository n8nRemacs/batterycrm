package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class hob extends mf5 {
    public final int e;
    public EditText f;
    public final ye6 g;

    public hob(lf5 lf5Var, int i) {
        super(lf5Var);
        this.e = lxc.design_password_eye;
        this.g = new ye6(27, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.mf5
    public final void b() {
        q();
    }

    @Override // defpackage.mf5
    public final int c() {
        return s2d.password_toggle_content_description;
    }

    @Override // defpackage.mf5
    public final int d() {
        return this.e;
    }

    @Override // defpackage.mf5
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.mf5
    public final boolean k() {
        return true;
    }

    @Override // defpackage.mf5
    public final boolean l() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.mf5
    public final void m(EditText editText) {
        this.f = editText;
        q();
    }

    @Override // defpackage.mf5
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.mf5
    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
