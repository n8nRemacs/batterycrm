package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ux5 {
    public final tw0 a;
    public final jve b = kve.b(0, 0, 7);
    public final ContextScope c;

    public ux5(tw0 tw0Var, lzf lzfVar) {
        this.a = tw0Var;
        this.c = d7j.a(((q2b) lzfVar).c());
        tw0Var.d(this);
    }

    @vnf
    public final void onEvent(az5 az5Var) {
        if (uog.i.equals(az5Var.c)) {
            svi.e(this.c, null, null, new sx5(this, null), 3);
        }
    }

    @vnf
    public final void onEvent(gde gdeVar) {
        if ("file.local.max.size.reached".equals(gdeVar.b)) {
            svi.e(this.c, null, null, new tx5(this, null), 3);
        }
    }
}
