package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nj2 extends dtf implements sm6 {
    public final /* synthetic */ pj2 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj2(pj2 pj2Var, Continuation continuation) {
        super(2, continuation);
        this.X = pj2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        nj2 nj2Var = (nj2) l((x40) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nj2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        nj2 nj2Var = new nj2(this.X, continuation);
        nj2Var.o = obj;
        return nj2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        pj2.v(this.X, (x40) this.o);
        return qqg.a;
    }
}
