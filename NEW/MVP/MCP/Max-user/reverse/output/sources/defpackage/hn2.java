package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hn2 extends dtf implements sm6 {
    public final /* synthetic */ jo2 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn2(jo2 jo2Var, Continuation continuation) {
        super(2, continuation);
        this.X = jo2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        hn2 hn2Var = (hn2) l((q19) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hn2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hn2 hn2Var = new hn2(this.X, continuation);
        hn2Var.o = obj;
        return hn2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.F0.updateAndGet(new k11(5, (q19) this.o));
        return qqg.a;
    }
}
