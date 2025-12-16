package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class uhg implements rhg {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ thg b;
    public final /* synthetic */ vhg c;

    public uhg(vhg vhgVar, ViewGroup viewGroup, thg thgVar) {
        this.c = vhgVar;
        this.a = viewGroup;
        this.b = thgVar;
    }

    @Override // defpackage.rhg
    public final void a(shg shgVar) {
        this.a.removeCallbacks(this.b);
    }

    @Override // defpackage.rhg
    public final void b() {
    }

    @Override // defpackage.rhg
    public final void c(shg shgVar) {
        vhg vhgVar = this.c;
        vhgVar.X.d();
        vhgVar.X = null;
    }

    @Override // defpackage.rhg
    public final void f() {
    }

    @Override // defpackage.rhg
    public final void h(shg shgVar) {
        vhg vhgVar = this.c;
        vhgVar.X.d();
        vhgVar.X = null;
    }
}
