package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qu8 extends dtf implements sm6 {
    public final /* synthetic */ p12 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu8(Continuation continuation, p12 p12Var) {
        super(2, continuation);
        this.X = p12Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qu8 qu8Var = (qu8) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qu8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qu8 qu8Var = new qu8(continuation, this.X);
        qu8Var.o = obj;
        return qu8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.setVisibility(((Boolean) this.o).booleanValue() ? 0 : 8);
        return qqg.a;
    }
}
