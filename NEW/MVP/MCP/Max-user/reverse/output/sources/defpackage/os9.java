package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class os9 extends dtf implements sm6 {
    public final /* synthetic */ vu9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os9(vu9 vu9Var, Continuation continuation) {
        super(2, continuation);
        this.o = vu9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        os9 os9Var = (os9) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        os9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new os9(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = vu9.U1;
        vu9 vu9Var = this.o;
        ccb ccbVar = (ccb) vu9Var.K0.getValue();
        ccbVar.e(new qcb(yud.O1));
        ccbVar.g(new n5g(l7b.y0));
        vu9Var.R(ccbVar);
        ccbVar.i();
        return qqg.a;
    }
}
