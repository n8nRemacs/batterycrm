package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zs9 extends dtf implements sm6 {
    public final /* synthetic */ y58 X;
    public final /* synthetic */ vu9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs9(vu9 vu9Var, y58 y58Var, Continuation continuation) {
        super(2, continuation);
        this.o = vu9Var;
        this.X = y58Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zs9 zs9Var = (zs9) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zs9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zs9(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        vu9 vu9Var = this.o;
        kj1 kj1Var = vu9Var.c;
        y58 y58Var = this.X;
        kj1Var.j(((w58) y58Var).a, true, false, false, new ys9(vu9Var, y58Var, 0));
        return qqg.a;
    }
}
