package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class z5e {
    public final jve a = kve.b(0, 0, 7);
    public final ContextScope b;

    public z5e(k18 k18Var, k18 k18Var2) {
        this.b = d7j.a(((q2b) ((lzf) k18Var2.getValue())).c());
        ((tw0) k18Var.getValue()).d(this);
    }

    @vnf
    public final void onEvent(ds2 ds2Var) {
        svi.e(this.b, null, null, new x5e(this, ds2Var, null), 3);
    }

    @vnf
    public final void onEvent(rj0 rj0Var) {
        svi.e(this.b, null, null, new y5e(this, rj0Var, null), 3);
    }
}
