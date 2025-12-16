package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rvh extends dtf implements sm6 {
    public final /* synthetic */ uvh X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rvh(uvh uvhVar, Continuation continuation) {
        super(2, continuation);
        this.X = uvhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        rvh rvhVar = (rvh) l((pqh) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        rvhVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rvh rvhVar = new rvh(this.X, continuation);
        rvhVar.o = obj;
        return rvhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        g8j.b(obj);
        pqh pqhVar = (pqh) this.o;
        ConcurrentHashMap concurrentHashMap = this.X.j1;
        qv7 qv7Var = (qv7) concurrentHashMap.get(new Long(pqhVar.a()));
        qqg qqgVar = qqg.a;
        if (qv7Var == null) {
            return qqgVar;
        }
        if (pqhVar instanceof nqh) {
            qv7Var.a(nph.SUCCESS);
            concurrentHashMap.remove(new Long(((nqh) pqhVar).a));
            return qqgVar;
        }
        if (pqhVar instanceof mqh) {
            qv7Var.a(nph.CANCELLED);
            concurrentHashMap.remove(new Long(((mqh) pqhVar).a));
            return qqgVar;
        }
        if (!(pqhVar instanceof oqh)) {
            throw new NoWhenBranchMatchedException();
        }
        qv7Var.b(new rph());
        concurrentHashMap.remove(new Long(((oqh) pqhVar).a));
        return qqgVar;
    }
}
