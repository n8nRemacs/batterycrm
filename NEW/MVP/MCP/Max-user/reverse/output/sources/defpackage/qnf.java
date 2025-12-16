package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class qnf extends vf9 implements SubMenu {
    public final vf9 J0;
    public final zf9 K0;

    public qnf(Context context, vf9 vf9Var, zf9 zf9Var) {
        super(context);
        this.J0 = vf9Var;
        this.K0 = zf9Var;
    }

    @Override // defpackage.vf9
    public final boolean d(zf9 zf9Var) {
        return this.J0.d(zf9Var);
    }

    @Override // defpackage.vf9
    public final boolean e(vf9 vf9Var, MenuItem menuItem) {
        return super.e(vf9Var, menuItem) || this.J0.e(vf9Var, menuItem);
    }

    @Override // defpackage.vf9
    public final boolean f(zf9 zf9Var) {
        return this.J0.f(zf9Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.K0;
    }

    @Override // defpackage.vf9
    public final String j() {
        zf9 zf9Var = this.K0;
        int i = zf9Var != null ? zf9Var.a : 0;
        if (i == 0) {
            return null;
        }
        return ho7.f(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.vf9
    public final vf9 k() {
        return this.J0.k();
    }

    @Override // defpackage.vf9
    public final boolean m() {
        return this.J0.m();
    }

    @Override // defpackage.vf9
    public final boolean n() {
        return this.J0.n();
    }

    @Override // defpackage.vf9
    public final boolean o() {
        return this.J0.o();
    }

    @Override // defpackage.vf9, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.J0.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.K0.setIcon(drawable);
        return this;
    }

    @Override // defpackage.vf9, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.J0.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.K0.setIcon(i);
        return this;
    }
}
