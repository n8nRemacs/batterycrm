package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yp3 extends dtf implements sm6 {
    public /* synthetic */ Object o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yp3 yp3Var = (yp3) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        yp3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yp3 yp3Var = new yp3(2, continuation);
        yp3Var.o = obj;
        return yp3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        gqe.c.p0().b(":settings/privacy", null);
        return qqg.a;
    }
}
