package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ba6 extends dtf implements sm6 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ ca6 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba6(Object obj, Continuation continuation, ca6 ca6Var) {
        super(2, continuation);
        this.X = obj;
        this.Y = ca6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ba6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ba6(this.X, continuation, this.Y);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        long jLongValue = ((Number) this.X).longValue();
        yy7[] yy7VarArr = ca6.H0;
        w63 w63Var = (w63) this.Y.v0.getValue();
        this.o = 1;
        Object objH = w63Var.h(jLongValue, this);
        g84 g84Var = g84.a;
        return objH == g84Var ? g84Var : objH;
    }
}
