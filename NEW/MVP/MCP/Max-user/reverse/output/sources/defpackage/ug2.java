package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ug2 {
    public final tw0 a;
    public final long b;
    public final jve c;
    public final ContextScope d;
    public final gbd e;

    public ug2(long j, tw0 tw0Var, lzf lzfVar) {
        this.a = tw0Var;
        this.b = j;
        jve jveVarB = kve.b(0, 0, 7);
        this.c = jveVarB;
        this.d = d7j.a(((q2b) lzfVar).a());
        this.e = new gbd(jveVarB);
        tw0Var.d(this);
    }

    @vnf
    public final void onEvent(cpd cpdVar) {
        if (this.b != cpdVar.c) {
            return;
        }
        svi.e(this.d, null, null, new tg2(this, null), 3);
    }
}
