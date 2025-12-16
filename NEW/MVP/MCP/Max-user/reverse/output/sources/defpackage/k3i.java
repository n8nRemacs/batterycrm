package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class k3i extends l7 implements tf9 {
    public WeakReference X;
    public final /* synthetic */ l3i Y;
    public final Context c;
    public final vf9 d;
    public h79 o;

    public k3i(l3i l3iVar, Context context, h79 h79Var) {
        this.Y = l3iVar;
        this.c = context;
        this.o = h79Var;
        vf9 vf9Var = new vf9(context);
        vf9Var.v0 = 1;
        this.d = vf9Var;
        vf9Var.o = this;
    }

    @Override // defpackage.l7
    public final void a() {
        l3i l3iVar = this.Y;
        if (l3iVar.i != this) {
            return;
        }
        if (l3iVar.p) {
            l3iVar.j = this;
            l3iVar.k = this.o;
        } else {
            this.o.C(this);
        }
        this.o = null;
        l3iVar.s(false);
        ActionBarContextView actionBarContextView = l3iVar.f;
        if (actionBarContextView.x0 == null) {
            actionBarContextView.e();
        }
        l3iVar.c.setHideOnContentScrollEnabled(l3iVar.u);
        l3iVar.i = null;
    }

    @Override // defpackage.tf9
    public final boolean b(vf9 vf9Var, MenuItem menuItem) {
        h79 h79Var = this.o;
        if (h79Var != null) {
            return ((fa6) h79Var.b).y(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.l7
    public final View c() {
        WeakReference weakReference = this.X;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.l7
    public final vf9 d() {
        return this.d;
    }

    @Override // defpackage.l7
    public final MenuInflater e() {
        return new mrf(this.c);
    }

    @Override // defpackage.tf9
    public final void f(vf9 vf9Var) {
        if (this.o == null) {
            return;
        }
        i();
        h7 h7Var = this.Y.f.d;
        if (h7Var != null) {
            h7Var.l();
        }
    }

    @Override // defpackage.l7
    public final CharSequence g() {
        return this.Y.f.getSubtitle();
    }

    @Override // defpackage.l7
    public final CharSequence h() {
        return this.Y.f.getTitle();
    }

    @Override // defpackage.l7
    public final void i() {
        if (this.Y.i != this) {
            return;
        }
        vf9 vf9Var = this.d;
        vf9Var.w();
        try {
            this.o.D(this, vf9Var);
        } finally {
            vf9Var.v();
        }
    }

    @Override // defpackage.l7
    public final boolean j() {
        return this.Y.f.F0;
    }

    @Override // defpackage.l7
    public final void k(View view) {
        this.Y.f.setCustomView(view);
        this.X = new WeakReference(view);
    }

    @Override // defpackage.l7
    public final void l(int i) {
        m(this.Y.a.getResources().getString(i));
    }

    @Override // defpackage.l7
    public final void m(CharSequence charSequence) {
        this.Y.f.setSubtitle(charSequence);
    }

    @Override // defpackage.l7
    public final void n(int i) {
        o(this.Y.a.getResources().getString(i));
    }

    @Override // defpackage.l7
    public final void o(CharSequence charSequence) {
        this.Y.f.setTitle(charSequence);
    }

    @Override // defpackage.l7
    public final void p(boolean z) {
        this.b = z;
        this.Y.f.setTitleOptional(z);
    }
}
