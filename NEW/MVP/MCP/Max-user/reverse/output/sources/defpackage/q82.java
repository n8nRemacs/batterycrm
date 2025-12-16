package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q82 extends dtf implements sm6 {
    public final /* synthetic */ u82 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q82(u82 u82Var, Continuation continuation) {
        super(2, continuation);
        this.X = u82Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        q82 q82Var = (q82) l((cda) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        q82Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        q82 q82Var = new q82(this.X, continuation);
        q82Var.o = obj;
        return q82Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xfh.r(this.X.Y, (cda) this.o);
        return qqg.a;
    }
}
