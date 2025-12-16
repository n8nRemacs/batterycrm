package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bq1 extends dtf implements sm6 {
    public final /* synthetic */ dq1 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq1(dq1 dq1Var, Continuation continuation) {
        super(2, continuation);
        this.X = dq1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bq1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new bq1(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        dq1 dq1Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            fde fdeVar = dq1Var.b;
            this.o = 1;
            obj = fdeVar.u(this);
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
        ((mue) dq1Var.e.getValue()).b(((aq1) dq1Var.g.a.getValue()).a, ue3.d0((Set) obj), null, null);
        return qqg.a;
    }
}
