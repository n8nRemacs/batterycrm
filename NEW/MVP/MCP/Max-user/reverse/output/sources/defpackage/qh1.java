package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class qh1 extends dtf implements sm6 {
    public final /* synthetic */ ci1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh1(ci1 ci1Var, Continuation continuation) {
        super(2, continuation);
        this.o = ci1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qh1 qh1Var = (qh1) l((onb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qh1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qh1(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ci1 ci1Var = this.o;
        svi.e(ci1Var.a, ((q2b) ci1Var.o).f(), null, new xh1(ci1Var, ci1Var.x0, null), 2);
        return qqg.a;
    }
}
