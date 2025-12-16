package defpackage;

import androidx.work.CoroutineWorker;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class k84 extends dtf implements sm6 {
    public final /* synthetic */ CoroutineWorker X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k84(CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.X = coroutineWorker;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((k84) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new k84(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        CoroutineWorker coroutineWorker = this.X;
        ike ikeVar = coroutineWorker.b;
        int i = this.o;
        try {
            if (i == 0) {
                g8j.b(obj);
                this.o = 1;
                obj = coroutineWorker.doWork(this);
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
            ikeVar.i((la8) obj);
        } catch (Throwable th) {
            ikeVar.j(th);
        }
        return qqg.a;
    }
}
