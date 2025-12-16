package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class f66 extends dtf implements sm6 {
    public final /* synthetic */ wta X;
    public final /* synthetic */ cb8 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f66(cb8 cb8Var, wta wtaVar, Continuation continuation) {
        super(2, continuation);
        this.o = cb8Var;
        this.X = wtaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        f66 f66Var = (f66) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        f66Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new f66(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.o.f(this.X);
        return qqg.a;
    }
}
