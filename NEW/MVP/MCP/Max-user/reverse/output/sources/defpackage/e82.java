package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e82 extends dtf implements sm6 {
    public final /* synthetic */ em6 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e82(Continuation continuation, em6 em6Var) {
        super(2, continuation);
        this.X = em6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        e82 e82Var = (e82) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        e82Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        e82 e82Var = new e82(continuation, this.X);
        e82Var.o = obj;
        return e82Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.invoke((cda) this.o);
        return qqg.a;
    }
}
