package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class sw1 {
    public final jve a = kve.b(0, 0, 7);
    public final ContextScope b;

    public sw1(k18 k18Var, k18 k18Var2) {
        this.b = d7j.a(((q2b) ((lzf) k18Var2.getValue())).c());
        ((tw0) k18Var.getValue()).d(this);
    }

    @vnf
    public final void onEvent(r51 r51Var) {
        svi.e(this.b, null, null, new qw1(this, r51Var, null), 3);
    }

    @vnf
    public final void onEvent(rj0 rj0Var) {
        svi.e(this.b, null, null, new rw1(this, rj0Var, null), 3);
    }
}
