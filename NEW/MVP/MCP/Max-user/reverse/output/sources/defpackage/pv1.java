package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pv1 extends dtf implements sm6 {
    public final /* synthetic */ qv1 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv1(qv1 qv1Var, Continuation continuation) {
        super(2, continuation);
        this.X = qv1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        pv1 pv1Var = (pv1) l((dxg) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        pv1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pv1 pv1Var = new pv1(this.X, continuation);
        pv1Var.o = obj;
        return pv1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        dxg dxgVar = (dxg) this.o;
        dxg dxgVar2 = dxg.a;
        qv1 qv1Var = this.X;
        if (dxgVar == dxgVar2) {
            mb4 mb4Var = (mb4) ((tcf) qv1Var.b()).getValue();
            yx1 yx1Var = (yx1) qv1Var.n.getValue();
            String str = mb4Var.c;
            boolean z = mb4Var.i;
            yx1Var.getClass();
            yx1.d(yx1Var, "BAD_CONNECTION_ALERT", str, "VPN", null, null, null, z, 120);
        }
        qv1Var.o(dxgVar);
        return qqg.a;
    }
}
