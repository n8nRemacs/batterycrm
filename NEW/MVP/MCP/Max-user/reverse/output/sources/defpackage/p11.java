package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class p11 extends dtf implements sm6 {
    public final /* synthetic */ v11 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p11(v11 v11Var, Continuation continuation) {
        super(2, continuation);
        this.o = v11Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        p11 p11Var = (p11) l((ww3) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        p11Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new p11(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = v11.G0;
        this.o.m();
        return qqg.a;
    }
}
