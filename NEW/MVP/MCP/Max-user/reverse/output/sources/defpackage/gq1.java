package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gq1 extends dtf implements sm6 {
    public final /* synthetic */ gk1 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq1(Continuation continuation, gk1 gk1Var) {
        super(2, continuation);
        this.X = gk1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gq1 gq1Var = (gq1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gq1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gq1 gq1Var = new gq1(continuation, this.X);
        gq1Var.o = obj;
        return gq1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        s5g s5gVar;
        g8j.b(obj);
        aq1 aq1Var = (aq1) this.o;
        int i = !(aq1Var.c instanceof wp1) ? 0 : 8;
        gk1 gk1Var = this.X;
        gk1Var.setVisibility(i);
        zp1 zp1Var = aq1Var.c;
        if (!fni.a(zp1Var, wp1.a)) {
            if (fni.a(zp1Var, yp1.a)) {
                vp1 vp1Var = aq1Var.b;
                gk1Var.setBody((vp1Var == null || (s5gVar = vp1Var.b) == null) ? null : s5gVar.b(gk1Var.getContext()));
                gk1Var.setLoading(false);
            } else {
                if (!fni.a(zp1Var, xp1.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                gk1Var.setLoading(true);
            }
        }
        return qqg.a;
    }
}
