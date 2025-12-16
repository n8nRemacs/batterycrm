package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class us9 extends dtf implements sm6 {
    public final /* synthetic */ dw9 X;
    public final /* synthetic */ vu9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us9(vu9 vu9Var, dw9 dw9Var, Continuation continuation) {
        super(2, continuation);
        this.o = vu9Var;
        this.X = dw9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        us9 us9Var = (us9) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        us9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new us9(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        long j = this.X.a;
        yy7[] yy7VarArr = vu9.U1;
        this.o.P(j, true, true, false);
        return qqg.a;
    }
}
