package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vd9 extends dtf implements sm6 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ ce9 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd9(Object obj, Continuation continuation, ce9 ce9Var) {
        super(2, continuation);
        this.X = obj;
        this.Y = ce9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vd9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new vd9(this.X, continuation, this.Y);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        ce9 ce9Var = this.Y;
        if (i == 0) {
            g8j.b(obj);
            long jLongValue = ((Number) this.X).longValue();
            l24 l24Var = (l24) ce9Var.s0.getValue();
            this.o = 1;
            obj = l24Var.b(jLongValue, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        ku3 ku3Var = (ku3) obj;
        if (ku3Var != null) {
            return ((io4) ce9Var.v0.getValue()).f(ku3Var);
        }
        return null;
    }
}
