package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nu9 extends dtf implements sm6 {
    public final /* synthetic */ si9 X;
    public final /* synthetic */ vu9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu9(vu9 vu9Var, si9 si9Var, Continuation continuation) {
        super(2, continuation);
        this.o = vu9Var;
        this.X = si9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        nu9 nu9Var = (nu9) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nu9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nu9(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        long j = this.X.a;
        yy7[] yy7VarArr = vu9.U1;
        this.o.P(j, false, false, false);
        return qqg.a;
    }
}
