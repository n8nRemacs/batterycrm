package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p13 extends dtf implements sm6 {
    public final /* synthetic */ z13 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p13(z13 z13Var, Continuation continuation) {
        super(2, continuation);
        this.X = z13Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((p13) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new p13(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            this.X.s0.set(true);
            this.X.u0.clear();
            this.X.a.g.clear();
            z13 z13Var = this.X;
            z13Var.a.i = z13Var;
            z13 z13Var2 = this.X;
            this.o = 1;
            if (z13Var2.d(this) == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        this.X.t0.set(false);
        return qqg.a;
    }
}
