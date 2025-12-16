package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class t72 extends whg {
    public boolean a = false;
    public final ViewGroup b;

    public t72(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.whg, defpackage.rhg
    public final void b() {
        hqi.m(this.b, false);
    }

    @Override // defpackage.whg, defpackage.rhg
    public final void c(shg shgVar) {
        if (!this.a) {
            hqi.m(this.b, false);
        }
        shgVar.D(this);
    }

    @Override // defpackage.whg, defpackage.rhg
    public final void f() {
        hqi.m(this.b, true);
    }

    @Override // defpackage.whg, defpackage.rhg
    public final void h(shg shgVar) {
        hqi.m(this.b, false);
        this.a = true;
    }
}
