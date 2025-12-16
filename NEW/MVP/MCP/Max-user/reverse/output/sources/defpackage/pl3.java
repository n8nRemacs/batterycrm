package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public class pl3 extends Dialog implements j48, kyd {
    public l48 a;
    public final vd b;
    public final jva c;

    public pl3(Context context, int i) {
        super(context, i);
        this.b = new vd(this);
        this.c = new jva(new vy1(21, this));
    }

    public static void a(pl3 pl3Var) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        pai.d(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(y0d.view_tree_on_back_pressed_dispatcher_owner, this);
        wqi.l(getWindow().getDecorView(), this);
    }

    @Override // defpackage.kyd
    public final pn l() {
        return (pn) this.b.d;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.c.d();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            jva jvaVar = this.c;
            jvaVar.e = onBackInvokedDispatcher;
            jvaVar.e(jvaVar.g);
        }
        this.b.r(bundle);
        l48 l48Var = this.a;
        if (l48Var == null) {
            l48Var = new l48(this);
            this.a = l48Var;
        }
        l48Var.d(k38.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        this.b.s(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        l48 l48Var = this.a;
        if (l48Var == null) {
            l48Var = new l48(this);
            this.a = l48Var;
        }
        l48Var.d(k38.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        l48 l48Var = this.a;
        if (l48Var == null) {
            l48Var = new l48(this);
            this.a = l48Var;
        }
        l48Var.d(k38.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // defpackage.j48
    public final l48 p() {
        l48 l48Var = this.a;
        if (l48Var != null) {
            return l48Var;
        }
        l48 l48Var2 = new l48(this);
        this.a = l48Var2;
        return l48Var2;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.setContentView(view, layoutParams);
    }
}
