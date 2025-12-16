package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class umc extends dtf implements sm6 {
    public final /* synthetic */ pnc X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public umc(pnc pncVar, Continuation continuation) {
        super(2, continuation);
        this.X = pncVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        umc umcVar = (umc) l((mhc) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        umcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        umc umcVar = new umc(this.X, continuation);
        umcVar.o = obj;
        return umcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        pnc pncVar = this.X;
        ci5 ci5Var = pncVar.E0;
        yac yacVar = pncVar.T0;
        g8j.b(obj);
        mhc mhcVar = (mhc) this.o;
        if (mhcVar instanceof jhc) {
            jhc jhcVar = (jhc) mhcVar;
            Long l = jhcVar.a;
            s5g s5gVar = jhcVar.b;
            if (l.longValue() == yacVar.g()) {
                svi.e(pncVar.a, ((q2b) pncVar.x()).b().plus(pncVar.w()), null, new cnc(pncVar, null), 2);
                xfh.r(ci5Var, new kmc(s5gVar, Integer.valueOf(yud.J)));
            }
        } else {
            if (!(mhcVar instanceof khc)) {
                throw new NoWhenBranchMatchedException();
            }
            Long l2 = ((khc) mhcVar).a;
            if (l2.longValue() == yacVar.g()) {
                xfh.r(ci5Var, new kmc(new n5g(x8b.c0), Integer.valueOf(y9b.m)));
            }
        }
        return qqg.a;
    }
}
