package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u96 extends dtf implements sm6 {
    public final /* synthetic */ ca6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u96(ca6 ca6Var, Continuation continuation) {
        super(2, continuation);
        this.o = ca6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        u96 u96Var = (u96) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        u96Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new u96(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ccb ccbVar = (ccb) this.o.t0.getValue();
        ccbVar.g(new n5g(mvd.Y1));
        ccbVar.a(new n5g(mvd.X1));
        ccbVar.i();
        return qqg.a;
    }
}
