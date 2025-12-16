package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ri7 extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ vo6 Z;
    public int o;
    public final /* synthetic */ int s0;
    public final /* synthetic */ bj7 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri7(vo6 vo6Var, int i, bj7 bj7Var, Continuation continuation) {
        super(2, continuation);
        this.Z = vo6Var;
        this.s0 = i;
        this.t0 = bj7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ri7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ri7 ri7Var = new ri7(this.Z, this.s0, this.t0, continuation);
        ri7Var.Y = obj;
        return ri7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri7.n(java.lang.Object):java.lang.Object");
    }
}
