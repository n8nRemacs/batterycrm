package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class c49 extends dtf implements sm6 {
    public final /* synthetic */ h49 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c49(h49 h49Var, Continuation continuation) {
        super(2, continuation);
        this.X = h49Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        c49 c49Var = (c49) l((q19) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        c49Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        c49 c49Var = new c49(this.X, continuation);
        c49Var.o = obj;
        return c49Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.r.updateAndGet(new k11(5, (q19) this.o));
        return qqg.a;
    }
}
