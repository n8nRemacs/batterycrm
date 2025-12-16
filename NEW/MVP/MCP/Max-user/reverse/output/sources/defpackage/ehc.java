package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ehc extends dtf implements sm6 {
    public final /* synthetic */ fhc X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehc(fhc fhcVar, Continuation continuation) {
        super(2, continuation);
        this.X = fhcVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ehc ehcVar = (ehc) l((jfc) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ehcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ehc ehcVar = new ehc(this.X, continuation);
        ehcVar.o = obj;
        return ehcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        fhc fhcVar = this.X;
        b95 b95Var = fhcVar.b;
        ci5 ci5Var = fhcVar.v0;
        g8j.b(obj);
        jfc jfcVar = (jfc) this.o;
        if (jfcVar instanceof ifc) {
            ifc ifcVar = (ifc) jfcVar;
            Long l = ifcVar.a;
            s5g s5gVar = ifcVar.b;
            long j = b95Var.m.get();
            if (l != null && l.longValue() == j) {
                svi.e(fhcVar.a, ((q2b) fhcVar.t()).b(), null, new zgc(fhcVar, null), 2);
                xfh.r(ci5Var, new dgc(s5gVar, Integer.valueOf(yud.J)));
            } else {
                long j2 = b95Var.l.get();
                if ((l != null && l.longValue() == j2) || l == null) {
                    xfh.r(ci5Var, new dgc(s5gVar, Integer.valueOf(yud.J)));
                }
            }
        } else if (jfcVar instanceof ffc) {
            Long l2 = new Long(((ffc) jfcVar).a);
            if (l2.longValue() == b95Var.m.get()) {
                xfh.r(ci5Var, new dgc(new n5g(u8b.q), Integer.valueOf(yud.n)));
            }
        } else if (jfcVar instanceof hfc) {
            xfh.r(ci5Var, new dgc(new n5g(u8b.q), new Integer(yud.n)));
        }
        return qqg.a;
    }
}
