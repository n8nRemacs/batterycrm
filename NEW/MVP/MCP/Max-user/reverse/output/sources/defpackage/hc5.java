package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class hc5 extends haj {
    public final gc5 a;

    public hc5(TextView textView) {
        this.a = new gc5(textView);
    }

    @Override // defpackage.haj
    public final InputFilter[] b(InputFilter[] inputFilterArr) {
        return !(ta5.m != null) ? inputFilterArr : this.a.b(inputFilterArr);
    }

    @Override // defpackage.haj
    public final boolean f() {
        return this.a.c;
    }

    @Override // defpackage.haj
    public final void g(boolean z) {
        if (ta5.m != null) {
            this.a.g(z);
        }
    }

    @Override // defpackage.haj
    public final void h(boolean z) {
        gc5 gc5Var = this.a;
        if (ta5.m != null) {
            gc5Var.h(z);
        } else {
            gc5Var.c = z;
        }
    }

    @Override // defpackage.haj
    public final TransformationMethod i(TransformationMethod transformationMethod) {
        return !(ta5.m != null) ? transformationMethod : this.a.i(transformationMethod);
    }
}
