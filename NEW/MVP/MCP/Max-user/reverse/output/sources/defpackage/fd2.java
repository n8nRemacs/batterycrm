package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fd2 extends dtf implements sm6 {
    public final /* synthetic */ sd2 X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd2(int i, sd2 sd2Var, Continuation continuation) {
        super(2, continuation);
        this.o = i;
        this.X = sd2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        fd2 fd2Var = (fd2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fd2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fd2(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (this.o == r8b.D0) {
            yy7[] yy7VarArr = sd2.B;
            this.X.o(false);
        }
        return qqg.a;
    }
}
