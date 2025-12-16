package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class zh2 {
    public final jve a = kve.b(0, 0, 7);
    public final ContextScope b;

    public zh2(tw0 tw0Var, lzf lzfVar) {
        this.b = d7j.a(((q2b) lzfVar).c());
        tw0Var.d(this);
    }

    @vnf
    public final void onEvent(wh2 wh2Var) {
        svi.e(this.b, null, null, new xh2(this, wh2Var, null), 3);
    }

    @vnf
    public final void onEvent(ai2 ai2Var) {
        svi.e(this.b, null, null, new yh2(this, ai2Var, null), 3);
    }
}
