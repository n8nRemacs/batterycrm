package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gic extends dtf implements sm6 {
    public final /* synthetic */ qic X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gic(qic qicVar, Continuation continuation) {
        super(2, continuation);
        this.X = qicVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gic gicVar = (gic) l((pb2) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gicVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gic gicVar = new gic(this.X, continuation);
        gicVar.o = obj;
        return gicVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        pb2 pb2Var = (pb2) this.o;
        if (!pb2Var.v() && !pb2Var.C()) {
            xfh.r(this.X.E0, jc3.b);
        }
        return qqg.a;
    }
}
