package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class na3 extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ oa3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na3(oa3 oa3Var, long j, Continuation continuation) {
        super(2, continuation);
        this.o = oa3Var;
        this.X = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        na3 na3Var = (na3) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        na3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new na3(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        oa3 oa3Var = this.o;
        k18 k18Var = oa3Var.c;
        String str = oa3Var.a;
        long j = this.X;
        wy1.q(j, "cancelAllRunningDraftTasks for chat ", str);
        try {
            List<r2g> listI = ((a3g) k18Var.getValue()).i(oa3.d);
            wqi.c(str, "cancelAllRunningDraftTasks: all tasks count = " + listI.size(), new Object[0]);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (r2g r2gVar : listI) {
                tsb tsbVar = r2gVar.f;
                if (tsbVar instanceof x25) {
                    if (((x25) tsbVar).d == j) {
                        linkedHashSet.add(new Long(r2gVar.a));
                    }
                } else if ((tsbVar instanceof b35) && ((b35) tsbVar).d == j) {
                    linkedHashSet.add(new Long(r2gVar.a));
                }
            }
            ((a3g) k18Var.getValue()).e(linkedHashSet);
            wqi.c(str, "cancelAllRunningDraftTasks: removed tasks count = " + linkedHashSet.size(), new Object[0]);
        } catch (Throwable th) {
            wqi.e(str, "cancelAllRunningDraftTasks: error!", th);
        }
        return qqg.a;
    }
}
