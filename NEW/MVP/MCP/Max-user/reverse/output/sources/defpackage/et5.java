package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class et5 extends dtf implements sm6 {
    public final /* synthetic */ it5 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et5(it5 it5Var, Continuation continuation) {
        super(2, continuation);
        this.X = it5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((et5) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new et5(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g84 g84Var = g84.a;
        int i = this.o;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
                return obj;
            }
            g8j.b(obj);
            hpa hpaVar = (hpa) this.X.X.getValue();
            this.o = 1;
            Object objB = hpaVar.b(this);
            return objB == g84Var ? g84Var : objB;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.Y;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, "it5", "failed to read fcm notifications", th);
                }
            }
            return hd5.a;
        }
    }
}
