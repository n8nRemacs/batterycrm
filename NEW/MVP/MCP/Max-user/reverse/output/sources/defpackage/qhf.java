package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qhf extends dtf implements sm6 {
    public final /* synthetic */ whf X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhf(whf whfVar, Continuation continuation) {
        super(2, continuation);
        this.X = whfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qhf qhfVar = (qhf) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qhfVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qhf qhfVar = new qhf(this.X, continuation);
        qhfVar.o = obj;
        return qhfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        whf whfVar = this.X;
        List list2 = (List) whfVar.t0.updateAndGet(new j11(list, 4, whfVar));
        String str = ((rhf) whfVar.u0.get()).a;
        if (str == null || str.length() == 0) {
            whfVar.X.m(null, new f7e(2, list2));
        }
        return qqg.a;
    }
}
