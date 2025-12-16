package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class mf5 {
    public final TextInputLayout a;
    public final lf5 b;
    public final Context c;
    public final CheckableImageButton d;

    public mf5(lf5 lf5Var) {
        this.a = lf5Var.a;
        this.b = lf5Var;
        this.c = lf5Var.getContext();
        this.d = lf5Var.t0;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public wo4 h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof d65;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(m5 m5Var) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z) {
    }

    public final void q() {
        this.b.f(false);
    }

    public void r() {
    }

    public void s() {
    }
}
