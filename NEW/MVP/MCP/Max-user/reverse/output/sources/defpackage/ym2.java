package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ym2 extends dtf implements sm6 {
    public final /* synthetic */ an2 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym2(an2 an2Var, Continuation continuation) {
        super(2, continuation);
        this.X = an2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ym2 ym2Var = (ym2) l((pb2) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ym2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ym2 ym2Var = new ym2(this.X, continuation);
        ym2Var.o = obj;
        return ym2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        pb2 pb2Var = (pb2) this.o;
        tcf tcfVar = this.X.b;
        String strI = pb2Var.i(il0.c, hl0.a);
        pb2Var.q0();
        tcfVar.m(null, new zm2(new pfb(strI, pb2Var.w0, pb2Var.h(), null, 24), pb2Var.s()));
        return qqg.a;
    }
}
