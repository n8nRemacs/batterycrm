package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class f43 extends dtf implements sm6 {
    public final /* synthetic */ y58 X;
    public final /* synthetic */ k53 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f43(k53 k53Var, y58 y58Var, Continuation continuation) {
        super(2, continuation);
        this.o = k53Var;
        this.X = y58Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        f43 f43Var = (f43) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        f43Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new f43(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        k53 k53Var = this.o;
        kj1 kj1Var = k53Var.d;
        y58 y58Var = this.X;
        kj1Var.j(((w58) y58Var).a, true, false, false, new qn2(k53Var, 3, y58Var));
        return qqg.a;
    }
}
