package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class twb {
    public final jve a = kve.b(0, 0, 7);
    public final ContextScope b;

    public twb(tw0 tw0Var, lzf lzfVar) {
        this.b = d7j.a(((q2b) lzfVar).a());
        tw0Var.d(this);
    }

    @vnf
    public final void onEvent(or2 or2Var) {
        svi.e(this.b, null, null, new rwb(this, or2Var, null), 3);
    }

    @vnf
    public final void onEvent(rj0 rj0Var) {
        svi.e(this.b, null, null, new swb(this, rj0Var, null), 3);
    }
}
