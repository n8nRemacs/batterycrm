package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vt6 extends dtf implements sm6 {
    public final /* synthetic */ Object X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt6(Object obj, Continuation continuation) {
        super(2, continuation);
        this.X = obj;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vt6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new vt6(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        try {
            if (i == 0) {
                g8j.b(obj);
                String str = (String) this.X;
                df7 df7VarE = zk6.e();
                nc0 nc0Var = hxa.a;
                rf7 rf7VarB = hxa.b(str, lxa.a);
                this.o = 1;
                obj = ebj.a(df7VarE, rf7VarB, 300L, null, true, (28 & 16) == 0, this);
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
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            obj = new ipd(th);
        }
        if (obj instanceof ipd) {
            return null;
        }
        return obj;
    }
}
