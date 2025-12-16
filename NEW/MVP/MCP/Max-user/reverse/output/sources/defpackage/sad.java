package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sad extends dtf implements sm6 {
    public final /* synthetic */ vad X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sad(vad vadVar, Continuation continuation) {
        super(2, continuation);
        this.X = vadVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((sad) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new sad(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
                return qqgVar;
            }
            g8j.b(obj);
            py2 py2Var = (py2) this.X.B0.getValue();
            this.o = 1;
            Object objI = svi.i(py2Var.l, new ny2(py2Var, null), this);
            g84 g84Var = g84.a;
            if (objI != g84Var) {
                objI = qqgVar;
            }
            return objI == g84Var ? g84Var : qqgVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            wqi.e("sdk:ReactionsViewModel", "runChatSubscribeNotifObserving: fail to run()", th);
            return qqgVar;
        }
    }
}
