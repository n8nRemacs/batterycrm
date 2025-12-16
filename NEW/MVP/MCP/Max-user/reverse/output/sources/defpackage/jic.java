package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jic extends dtf implements sm6 {
    public final /* synthetic */ qic X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jic(qic qicVar, Continuation continuation) {
        super(2, continuation);
        this.X = qicVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jic jicVar = (jic) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jicVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jic jicVar = new jic(this.X, continuation);
        jicVar.o = obj;
        return jicVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        yy7[] yy7VarArr = qic.H0;
        qic qicVar = this.X;
        pb2 pb2VarU = qicVar.u();
        qqg qqgVar = qqg.a;
        if (pb2VarU != null) {
            rf2 rf2Var = pb2VarU.b;
            if (pb2VarU.e0()) {
                if (rf2Var.a == 0) {
                    wqi.q(f84Var.getClass().getName(), "Try update revokePrivateLink with charServerId == 0", new Object[0]);
                    ((j94) qicVar.v0.getValue()).a("ONEME-18920", new IllegalArgumentException("Try update revokePrivateLink with charServerId == 0. ProfileInvite"));
                    return qqgVar;
                }
                qicVar.z0.set(((hwa) qicVar.X.getValue()).g(pb2VarU.a, rf2Var.a, 0, null, true, null));
                return qqgVar;
            }
        }
        return qqgVar;
    }
}
