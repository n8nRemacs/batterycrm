package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class g66 extends dtf implements sm6 {
    public final /* synthetic */ wta X;
    public final /* synthetic */ cb8 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g66(cb8 cb8Var, wta wtaVar, Continuation continuation) {
        super(2, continuation);
        this.o = cb8Var;
        this.X = wtaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        g66 g66Var = (g66) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        g66Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new g66(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.o.j(this.X);
        return qqg.a;
    }
}
