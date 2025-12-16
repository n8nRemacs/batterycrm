package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class g21 extends dtf implements sm6 {
    public final /* synthetic */ h21 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g21(h21 h21Var, Continuation continuation) {
        super(2, continuation);
        this.X = h21Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        g21 g21Var = (g21) l((ca) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        g21Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        g21 g21Var = new g21(this.X, continuation);
        g21Var.o = obj;
        return g21Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.u((ca) this.o);
        return qqg.a;
    }
}
