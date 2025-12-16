package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rn2 extends dtf implements sm6 {
    public final /* synthetic */ y58 X;
    public final /* synthetic */ jo2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn2(jo2 jo2Var, y58 y58Var, Continuation continuation) {
        super(2, continuation);
        this.o = jo2Var;
        this.X = y58Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        rn2 rn2Var = (rn2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        rn2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rn2(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        jo2 jo2Var = this.o;
        kj1 kj1Var = jo2Var.d;
        y58 y58Var = this.X;
        kj1Var.j(((w58) y58Var).a, true, false, false, new qn2(jo2Var, 0, y58Var));
        return qqg.a;
    }
}
