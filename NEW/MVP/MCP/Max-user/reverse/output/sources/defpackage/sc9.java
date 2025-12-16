package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class sc9 {
    public final long a;
    public final long b;
    public final tw0 c;
    public final jve d = kve.b(0, 0, 7);
    public final ContextScope e;

    public sc9(long j, long j2, tw0 tw0Var, lzf lzfVar) {
        this.a = j;
        this.b = j2;
        this.c = tw0Var;
        this.e = d7j.a(((q2b) lzfVar).a());
        tw0Var.d(this);
    }

    @vnf
    public final void onEvent(itg itgVar) {
        if (itgVar.b == this.b) {
            if (itgVar.c == this.a || itgVar.d) {
                svi.e(this.e, null, null, new rc9(this, null), 3);
            }
        }
    }

    @vnf
    public final void onEvent(n73 n73Var) {
        if (n73Var.b.contains(Long.valueOf(this.b))) {
            svi.e(this.e, null, null, new qc9(this, null), 3);
        }
    }
}
