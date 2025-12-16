package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class e66 extends dtf implements sm6 {
    public final /* synthetic */ fz1 X;
    public final /* synthetic */ cb8 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e66(cb8 cb8Var, fz1 fz1Var, Continuation continuation) {
        super(2, continuation);
        this.o = cb8Var;
        this.X = fz1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        e66 e66Var = (e66) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        e66Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new e66(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.o.f(this.X);
        return qqg.a;
    }
}
