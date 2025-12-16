package defpackage;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rr2 extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ vr2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr2(vr2 vr2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.o = vr2Var;
        this.X = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        rr2 rr2Var = (rr2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        rr2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rr2(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        String strE;
        g8j.b(obj);
        vr2 vr2Var = this.o;
        k18 k18Var = vr2Var.o;
        ci5 ci5Var = vr2Var.w0;
        l24 l24Var = (l24) k18Var.getValue();
        long j = this.X;
        ku3 ku3Var = (ku3) l24Var.c(j).a.getValue();
        qqg qqgVar = qqg.a;
        if (ku3Var != null && (strE = ku3Var.e()) != null) {
            int iV = az1.v(vr2Var.v0);
            if (iV != 0) {
                if (iV != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                xfh.r(ci5Var, k6j.c(Collections.singletonList(new Long(j)), new p5g(x8b.m2, ys.D(new Object[]{strE})), null));
                return qqgVar;
            }
            xfh.r(ci5Var, k6j.b(Collections.singletonList(new Long(j)), new p5g(x8b.l2, ys.D(new Object[]{strE})), null));
        }
        return qqgVar;
    }
}
