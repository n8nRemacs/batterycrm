package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class r94 {
    public final jve a = kve.b(0, 0, 7);
    public final ContextScope b;

    public r94(tw0 tw0Var, lzf lzfVar) {
        this.b = d7j.a(((q2b) lzfVar).a());
        tw0Var.d(this);
    }

    @vnf
    public final void onEvent(p92 p92Var) {
        svi.e(this.b, null, null, new p94(this, p92Var, null), 3);
    }

    @vnf
    public final void onEvent(rj0 rj0Var) {
        svi.e(this.b, null, null, new q94(this, rj0Var, null), 3);
    }
}
