package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gg2 extends dtf implements sm6 {
    public final /* synthetic */ qg2 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg2(qg2 qg2Var, Continuation continuation) {
        super(2, continuation);
        this.X = qg2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gg2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gg2(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = qg2.F;
            qg2 qg2Var = this.X;
            w63 w63Var = (w63) qg2Var.r.getValue();
            w63Var.i().Z(qg2Var.n);
            jve jveVar = qg2Var.d;
            yfc yfcVar = yfc.b;
            this.o = 1;
            Object objA = jveVar.a(yfcVar, this);
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
