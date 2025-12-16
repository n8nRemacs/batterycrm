package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q77 extends dtf implements sm6 {
    public final /* synthetic */ r77 X;
    public final /* synthetic */ String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q77(String str, r77 r77Var, Continuation continuation) {
        super(2, continuation);
        this.o = str;
        this.X = r77Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        q77 q77Var = (q77) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        q77Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new q77(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        r77 r77Var = this.X;
        k18 k18Var = r77Var.d;
        ci5 ci5Var = r77Var.Z;
        g8j.b(obj);
        String str = this.o;
        boolean zR = dnf.r(str, "Custom", false);
        qqg qqgVar = qqg.a;
        if (zR) {
            xfh.r(ci5Var, new n77(r77Var.o.getString("Custom", "")));
            return qqgVar;
        }
        boolean zB = ((fxa) k18Var.getValue()).b();
        r77Var.t().a();
        pe8 pe8Var = r77Var.t().a;
        pe8Var.q0.O(pe8Var, pe8.U0[3], str);
        r77Var.t().a.R("443");
        r77Var.Y.setValue(r77Var.u());
        if (zB) {
            xfh.r(ci5Var, o77.a);
            ((fxa) k18Var.getValue()).d(true);
        }
        xfh.r(ci5Var, m77.a);
        return qqgVar;
    }
}
