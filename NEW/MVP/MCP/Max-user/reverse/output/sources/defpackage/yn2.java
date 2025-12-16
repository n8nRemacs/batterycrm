package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yn2 extends dtf implements sm6 {
    public final /* synthetic */ jo2 X;
    public final /* synthetic */ w10 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn2(w10 w10Var, jo2 jo2Var, Continuation continuation) {
        super(2, continuation);
        this.o = w10Var;
        this.X = jo2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yn2 yn2Var = (yn2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        yn2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yn2(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        int i = this.o.e() ? x8b.S1 : x8b.T1;
        yy7[] yy7VarArr = jo2.W0;
        ccb ccbVarD = this.X.D();
        ccbVarD.g(new n5g(i));
        ccbVarD.e(new qcb(yud.o));
        ccbVarD.i();
        return qqg.a;
    }
}
