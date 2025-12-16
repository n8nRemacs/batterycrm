package defpackage;

/* loaded from: classes.dex */
public final class nw1 {
    public final nxg a;
    public final jve b = kve.b(0, 0, 7);

    public nw1(k18 k18Var, k18 k18Var2, nxg nxgVar) {
        this.a = nxgVar;
        ((tw0) k18Var.getValue()).d(this);
        svi.e(nxgVar, null, null, new iw1(k18Var2, this, null), 3);
    }

    @vnf
    public final void onEvent(t24 t24Var) {
        svi.e(this.a, null, null, new jw1(this, t24Var, null), 3);
    }

    @vnf
    public final void onEvent(n73 n73Var) {
        svi.e(this.a, null, null, new kw1(this, n73Var, null), 3);
    }

    @vnf
    public final void onEvent(l58 l58Var) {
        svi.e(this.a, null, null, new lw1(this, l58Var, null), 3);
    }

    @vnf
    public final void onEvent(rj0 rj0Var) {
        svi.e(this.a, null, null, new mw1(this, rj0Var, null), 3);
    }
}
