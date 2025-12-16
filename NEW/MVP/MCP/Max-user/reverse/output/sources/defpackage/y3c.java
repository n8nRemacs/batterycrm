package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class y3c extends dtf implements sm6 {
    public final /* synthetic */ qs3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3c(qs3 qs3Var, Continuation continuation) {
        super(2, continuation);
        this.o = qs3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        y3c y3cVar = (y3c) l((z26) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        y3cVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new y3c(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        f50 f50Var = (f50) this.o.b;
        ((b8a) f50Var.c).b(f50Var.u0);
        f84 f84Var = f50Var.d;
        eoi.e(f84Var.getCoroutineContext()).invokeOnCompletion(new k(11, f50Var));
        svi.e(f84Var, ((q2b) f50Var.a).a(), null, new d50(f50Var, null), 2);
        return qqg.a;
    }
}
