package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jq6 extends dtf implements sm6 {
    public final /* synthetic */ tq6 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq6(tq6 tq6Var, Continuation continuation) {
        super(2, continuation);
        this.X = tq6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((jq6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new jq6(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        tq6 tq6Var = this.X;
        xfh.r(tq6Var.X.c, new gp6(pqi.b(tq6Var.E0)));
        this.o = 1;
        Object objI = svi.i(((q2b) tq6Var.v()).f(), new sq6(tq6Var, null), this);
        g84 g84Var = g84.a;
        if (objI != g84Var) {
            objI = qqgVar;
        }
        return objI == g84Var ? g84Var : qqgVar;
    }
}
