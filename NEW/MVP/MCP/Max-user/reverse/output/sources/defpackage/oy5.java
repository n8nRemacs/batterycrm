package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oy5 extends dtf implements sm6 {
    public final /* synthetic */ ty5 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy5(ty5 ty5Var, Continuation continuation) {
        super(2, continuation);
        this.X = ty5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((oy5) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new oy5(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            cs3 cs3Var = (cs3) this.X.g.getValue();
            this.o = 1;
            Object objA = cs3Var.a(this);
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
        return qqg.a;
    }
}
