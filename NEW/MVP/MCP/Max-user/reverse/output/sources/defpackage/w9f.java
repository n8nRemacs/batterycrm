package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class w9f extends l7 implements tf9 {
    public WeakReference X;
    public boolean Y;
    public vf9 Z;
    public Context c;
    public ActionBarContextView d;
    public h79 o;

    @Override // defpackage.l7
    public final void a() {
        if (this.Y) {
            return;
        }
        this.Y = true;
        this.o.C(this);
    }

    @Override // defpackage.tf9
    public final boolean b(vf9 vf9Var, MenuItem menuItem) {
        return ((fa6) this.o.b).y(this, menuItem);
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
        return this.Z;
    }

    @Override // defpackage.l7
    public final MenuInflater e() {
        return new mrf(this.d.getContext());
    }

    @Override // defpackage.tf9
    public final void f(vf9 vf9Var) {
        i();
        h7 h7Var = this.d.d;
        if (h7Var != null) {
            h7Var.l();
        }
    }

    @Override // defpackage.l7
    public final CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override // defpackage.l7
    public final CharSequence h() {
        return this.d.getTitle();
    }

    @Override // defpackage.l7
    public final void i() {
        this.o.D(this, this.Z);
    }

    @Override // defpackage.l7
    public final boolean j() {
        return this.d.F0;
    }

    @Override // defpackage.l7
    public final void k(View view) {
        this.d.setCustomView(view);
        this.X = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.l7
    public final void l(int i) {
        m(this.c.getString(i));
    }

    @Override // defpackage.l7
    public final void m(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // defpackage.l7
    public final void n(int i) {
        o(this.c.getString(i));
    }

    @Override // defpackage.l7
    public final void o(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // defpackage.l7
    public final void p(boolean z) {
        this.b = z;
        this.d.setTitleOptional(z);
    }
}
