package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ba2 extends aa2 {
    public ba2(int i, int i2, int i3, x74 x74Var, x26 x26Var) {
        super((i3 & 4) != 0 ? -3 : i, (i3 & 8) != 0 ? 1 : i2, (i3 & 2) != 0 ? bd5.a : x74Var, x26Var);
    }

    @Override // defpackage.t92
    public final t92 k(x74 x74Var, int i, int i2) {
        return new ba2(i, i2, x74Var, this.d);
    }

    @Override // defpackage.t92
    public final x26 l() {
        return this.d;
    }

    @Override // defpackage.aa2
    public final Object n(z26 z26Var, Continuation continuation) {
        Object objD = this.d.d(z26Var, continuation);
        return objD == g84.a ? objD : qqg.a;
    }
}
