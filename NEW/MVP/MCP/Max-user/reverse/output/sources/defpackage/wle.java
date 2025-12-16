package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class wle {
    public final k18 a;
    public final jve b = kve.b(0, 0, 7);
    public final ContextScope c;

    public wle(k18 k18Var, lzf lzfVar) {
        this.a = k18Var;
        this.c = d7j.a(((q2b) lzfVar).a());
        ((tw0) k18Var.getValue()).d(this);
    }

    @vnf
    public final void onEvent(vr3 vr3Var) {
        throw null;
    }

    @vnf
    public final void onEvent(ake akeVar) {
        svi.e(this.c, null, null, new tle(this, akeVar, null), 3);
    }

    @vnf
    public final void onEvent(yje yjeVar) {
        svi.e(this.c, null, null, new ule(this, yjeVar, null), 3);
    }

    @vnf
    public final void onEvent(rj0 rj0Var) {
        svi.e(this.c, null, null, new vle(this, rj0Var, null), 3);
    }
}
