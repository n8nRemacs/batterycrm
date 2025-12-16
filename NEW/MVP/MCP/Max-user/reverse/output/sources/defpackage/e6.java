package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e6 extends dtf implements sm6 {
    public final /* synthetic */ d6 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(d6 d6Var, Continuation continuation) {
        super(2, continuation);
        this.X = d6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((e6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new e6(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        d6 d6Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            qi8 qi8Var = (qi8) ((t1b) ((qm3) d6Var.J0.b)).getAccessor().c(384);
            this.o = 1;
            Object objA = qi8Var.a(this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        d6Var.I();
        return qqg.a;
    }
}
