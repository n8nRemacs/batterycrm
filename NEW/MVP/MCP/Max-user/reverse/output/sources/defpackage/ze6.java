package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ze6 extends dtf implements sm6 {
    public final /* synthetic */ em6 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze6(Continuation continuation, em6 em6Var) {
        super(2, continuation);
        this.X = em6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ze6 ze6Var = (ze6) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ze6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ze6 ze6Var = new ze6(continuation, this.X);
        ze6Var.o = obj;
        return ze6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.invoke((cda) this.o);
        return qqg.a;
    }
}
