package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wj2 extends dtf implements sm6 {
    public final /* synthetic */ yj2 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj2(yj2 yj2Var, Continuation continuation) {
        super(2, continuation);
        this.X = yj2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wj2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new wj2(this.X, continuation);
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
        yj2 yj2Var = this.X;
        w63 w63Var = (w63) yj2Var.g.getValue();
        long j = yj2Var.b;
        this.o = 1;
        Object objR = w63Var.r(j, this);
        g84 g84Var = g84.a;
        return objR == g84Var ? g84Var : objR;
    }
}
