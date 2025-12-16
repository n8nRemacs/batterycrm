package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p82 extends dtf implements sm6 {
    public final /* synthetic */ u82 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p82(u82 u82Var, Continuation continuation) {
        super(2, continuation);
        this.X = u82Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        p82 p82Var = (p82) l((h82) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        p82Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        p82 p82Var = new p82(this.X, continuation);
        p82Var.o = obj;
        return p82Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        h82 h82Var = (h82) this.o;
        u82 u82Var = this.X;
        u82Var.o.setValue(h82Var.a);
        u82Var.c.setValue(h82Var.b);
        return qqg.a;
    }
}
