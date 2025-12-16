package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tt2 extends dtf implements sm6 {
    public final /* synthetic */ pb2 X;
    public final /* synthetic */ bu2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt2(bu2 bu2Var, pb2 pb2Var, Continuation continuation) {
        super(2, continuation);
        this.o = bu2Var;
        this.X = pb2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tt2 tt2Var = (tt2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tt2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new tt2(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        bu2 bu2Var = this.o;
        bu2Var.getClass();
        pb2 pb2Var = this.X;
        boolean zM = pb2Var.M();
        rf2 rf2Var = pb2Var.b;
        if (zM && rf2Var.g()) {
            ((hwa) bu2Var.q.getValue()).f(rf2Var.a);
        }
        return qqg.a;
    }
}
