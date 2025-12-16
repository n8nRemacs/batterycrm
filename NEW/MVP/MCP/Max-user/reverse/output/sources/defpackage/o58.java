package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class o58 {
    public final jve a = kve.b(0, 0, 7);
    public final ContextScope b;

    public o58(tw0 tw0Var, lzf lzfVar) {
        this.b = d7j.a(((q2b) lzfVar).c());
        tw0Var.d(this);
    }

    @vnf
    public final void onEvent(l58 l58Var) {
        svi.e(this.b, null, null, new m58(this, l58Var, null), 3);
    }

    @vnf
    public final void onEvent(rj0 rj0Var) {
        svi.e(this.b, null, null, new n58(this, rj0Var, null), 3);
    }
}
