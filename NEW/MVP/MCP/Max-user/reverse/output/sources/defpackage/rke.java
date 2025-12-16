package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rke extends dtf implements sm6 {
    public final /* synthetic */ ele X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rke(ele eleVar, Continuation continuation) {
        super(2, continuation);
        this.X = eleVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        rke rkeVar = (rke) l((ihc) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        rkeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rke rkeVar = new rke(this.X, continuation);
        rkeVar.o = obj;
        return rkeVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ihc ihcVar = (ihc) this.o;
        if (ihcVar != null) {
            Long l = ihcVar.a;
            s5g s5gVar = ihcVar.b;
            ele eleVar = this.X;
            ci5 ci5Var = eleVar.B0;
            long j = eleVar.I0.get();
            if (l != null && l.longValue() == j) {
                svi.e(eleVar.a, ((q2b) eleVar.v()).a().plus(eleVar.u()), null, new wke(eleVar, null), 2);
                xfh.r(ci5Var, new ype(s5gVar, Integer.valueOf(yud.J)));
            } else if (l == null) {
                xfh.r(ci5Var, new ype(s5gVar, Integer.valueOf(yud.J)));
            }
        }
        return qqg.a;
    }
}
