package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ui0 {
    public final jve a;
    public final gbd b;
    public final ContextScope c;

    public ui0(tw0 tw0Var, lzf lzfVar) {
        jve jveVarB = kve.b(0, 0, 7);
        this.a = jveVarB;
        this.b = new gbd(jveVarB);
        this.c = d7j.a(((q2b) lzfVar).c());
        tw0Var.d(this);
    }

    @vnf
    public final void onBaseError(rj0 rj0Var) {
        svi.e(this.c, null, null, new ti0(this, rj0Var, null), 3);
    }
}
