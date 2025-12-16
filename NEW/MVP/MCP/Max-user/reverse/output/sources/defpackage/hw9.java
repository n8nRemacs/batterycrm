package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class hw9 {
    public final jve a = kve.b(0, 0, 7);
    public final ContextScope b;

    public hw9(tw0 tw0Var, lzf lzfVar) {
        this.b = d7j.a(((q2b) lzfVar).c());
        tw0Var.d(this);
    }

    @vnf
    public final void onEvent(p05 p05Var) {
        svi.e(this.b, null, null, new gw9(this, new dw9(p05Var.o, p05Var.d), null), 3);
    }

    @vnf
    public final void onEvent(r05 r05Var) {
        svi.e(this.b, null, null, new gw9(this, new ew9(r05Var.d, r05Var.c), null), 3);
    }
}
