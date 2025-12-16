package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class qg1 extends dtf implements sm6 {
    public final /* synthetic */ tg1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg1(tg1 tg1Var, Continuation continuation) {
        super(2, continuation);
        this.o = tg1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qg1 qg1Var = (qg1) l((e2e) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qg1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qg1(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xfh.r(this.o.v0, jm1.D);
        return qqg.a;
    }
}
