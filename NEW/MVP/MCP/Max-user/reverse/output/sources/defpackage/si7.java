package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class si7 extends dtf implements sm6 {
    public final /* synthetic */ bj7 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si7(bj7 bj7Var, Continuation continuation) {
        super(2, continuation);
        this.X = bj7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((si7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new si7(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            bj7 bj7Var = this.X;
            bj7Var.u0.setValue(null);
            wqi.c(bj7.D0, "cancel prefetchJob", new Object[0]);
            x9f x9fVar = bj7Var.x0;
            if (x9fVar != null) {
                x9fVar.cancel((CancellationException) null);
            }
            bj7Var.x0 = null;
            bj7Var.e();
            x9f x9fVar2 = bj7Var.x0;
            if (x9fVar2 != null) {
                this.o = 1;
                Object objJoin = x9fVar2.join(this);
                g84 g84Var = g84.a;
                if (objJoin == g84Var) {
                    return g84Var;
                }
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
