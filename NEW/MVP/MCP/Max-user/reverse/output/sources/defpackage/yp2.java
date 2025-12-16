package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yp2 extends dtf implements sm6 {
    public /* synthetic */ Object o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yp2 yp2Var = (yp2) l((af2) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        yp2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yp2 yp2Var = new yp2(2, continuation);
        yp2Var.o = obj;
        return yp2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        af2 af2Var = (af2) this.o;
        df2 df2Var = af2Var.q;
        if (df2Var == null) {
            df2Var = df2.g;
        }
        cf2 cf2VarA = df2Var.a();
        cf2VarA.c = 0L;
        af2Var.q = cf2VarA.a();
        return qqg.a;
    }
}
