package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fa2 extends aa2 {
    public final dtf o;

    /* JADX WARN: Multi-variable type inference failed */
    public fa2(um6 um6Var, x26 x26Var, x74 x74Var, int i, int i2) {
        super(i, i2, x74Var, x26Var);
        this.o = (dtf) um6Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dtf, um6] */
    @Override // defpackage.t92
    public final t92 k(x74 x74Var, int i, int i2) {
        return new fa2(this.o, this.d, x74Var, i, i2);
    }

    @Override // defpackage.aa2
    public final Object n(z26 z26Var, Continuation continuation) {
        Object objD = d7j.d(new ea2(this, z26Var, null), continuation);
        return objD == g84.a ? objD : qqg.a;
    }
}
