package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gw1 extends dtf implements sm6 {
    public final /* synthetic */ hw1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw1(hw1 hw1Var, Continuation continuation) {
        super(2, continuation);
        this.o = hw1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gw1 gw1Var = (gw1) l((cnb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gw1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gw1(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        hw1 hw1Var = this.o;
        yx1 yx1VarP = hw1Var.p();
        String str = hw1Var.k().c;
        boolean z = hw1Var.k().i;
        yx1VarP.getClass();
        yx1.d(yx1VarP, "BAD_CONNECTION_ALERT", str, "BAD_NETWORK", null, null, null, z, 120);
        return qqg.a;
    }
}
