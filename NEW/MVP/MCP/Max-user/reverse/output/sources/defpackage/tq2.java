package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tq2 extends dtf implements sm6 {
    public final /* synthetic */ yq2 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq2(yq2 yq2Var, Continuation continuation) {
        super(2, continuation);
        this.X = yq2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tq2 tq2Var = (tq2) l((q19) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tq2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tq2 tq2Var = new tq2(this.X, continuation);
        tq2Var.o = obj;
        return tq2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.P0.updateAndGet(new k11(5, (q19) this.o));
        return qqg.a;
    }
}
