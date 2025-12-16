package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w96 extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ ca6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w96(ca6 ca6Var, long j, Continuation continuation) {
        super(2, continuation);
        this.o = ca6Var;
        this.X = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        w96 w96Var = (w96) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        w96Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new w96(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = ca6.H0;
        this.o.v(this.X);
        return qqg.a;
    }
}
