package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class mq0 {
    public final k18 a;
    public final jve b = kve.b(0, 0, 7);
    public final ContextScope c;

    public mq0(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.c = d7j.a(((q2b) ((lzf) k18Var2.getValue())).a());
        ((tw0) k18Var.getValue()).d(this);
    }

    @vnf
    public final void onEvent(t24 t24Var) {
        svi.e(this.c, null, null, new jq0(this, t24Var, null), 3);
    }

    @vnf
    public final void onEvent(ux3 ux3Var) {
        svi.e(this.c, null, null, new kq0(this, ux3Var, null), 3);
    }

    @vnf
    public final void onEvent(rj0 rj0Var) {
        svi.e(this.c, null, null, new lq0(this, rj0Var, null), 3);
    }
}
