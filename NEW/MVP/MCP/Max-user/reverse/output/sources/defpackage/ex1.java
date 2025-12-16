package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ex1 extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex1(String str, Continuation continuation) {
        super(2, continuation);
        this.X = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ex1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ex1(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
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
            wqi.c("CallsNotification", "handle loading notification image", new Object[0]);
            String str = this.X;
            if (str != null && !vmf.F(str)) {
                wqi.c("CallsNotification", "start loading call push avatar", new Object[0]);
                dx1 dx1Var = new dx1(str, null);
                this.o = 1;
                Object objG = yei.g(500L, dx1Var, this);
                g84 g84Var = g84.a;
                return objG == g84Var ? g84Var : objG;
            }
            wqi.c("CallsNotification", "avatar for call push is empty", new Object[0]);
            return null;
        } catch (InterruptedException e) {
            wqi.e("CallsNotification", "Failed to load call notification avatar due to InterruptedException: " + e.getMessage(), e);
            throw e;
        } catch (CancellationException e2) {
            wqi.e("CallsNotification", "Failed to load call notification avatar due to CancellationException: " + e2.getMessage(), e2);
            throw e2;
        } catch (Exception e3) {
            wqi.e("CallsNotification", "Failed to load call notification avatar due to: " + e3.getMessage(), e3);
            return null;
        }
    }
}
