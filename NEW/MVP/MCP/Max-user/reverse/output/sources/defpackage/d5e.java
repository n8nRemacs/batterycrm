package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* loaded from: classes2.dex */
public final class d5e extends dtf implements sm6 {
    public final /* synthetic */ SdkCoroutineWorker X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5e(SdkCoroutineWorker sdkCoroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.X = sdkCoroutineWorker;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((d5e) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new d5e(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        SdkCoroutineWorker sdkCoroutineWorker = this.X;
        try {
            if (i == 0) {
                g8j.b(obj);
                this.o = 1;
                obj = sdkCoroutineWorker.doWork(this);
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
            sdkCoroutineWorker.future.i((la8) obj);
        } catch (Throwable th) {
            sdkCoroutineWorker.future.j(th);
        }
        return qqg.a;
    }
}
