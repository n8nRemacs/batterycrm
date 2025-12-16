package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sh1 extends dtf implements sm6 {
    public final /* synthetic */ ci1 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh1(ci1 ci1Var, Continuation continuation) {
        super(2, continuation);
        this.X = ci1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        sh1 sh1Var = (sh1) l((cda) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        sh1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        sh1 sh1Var = new sh1(this.X, continuation);
        sh1Var.o = obj;
        return sh1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xfh.r(this.X.D0, (cda) this.o);
        return qqg.a;
    }
}
