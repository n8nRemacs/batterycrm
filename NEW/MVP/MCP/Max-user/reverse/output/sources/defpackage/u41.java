package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class u41 extends dtf implements sm6 {
    public final /* synthetic */ c51 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41(c51 c51Var, Continuation continuation) {
        super(2, continuation);
        this.X = c51Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        u41 u41Var = (u41) l((pb2) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        u41Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        u41 u41Var = new u41(this.X, continuation);
        u41Var.o = obj;
        return u41Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        pb2 pb2Var = (pb2) this.o;
        if (pb2Var != null) {
            c51 c51Var = this.X;
            svi.e(c51Var.a, ((q2b) ((lzf) c51Var.e.getValue())).a(), null, new t41(c51Var, pb2Var, null), 2);
        }
        return qqg.a;
    }
}
