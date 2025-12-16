package defpackage;

import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.CompletionHandler;

/* loaded from: classes2.dex */
public final class fv implements CompletionHandler {
    public static final fv b = new fv(0);
    public static final fv c = new fv(1);
    public final /* synthetic */ int a;

    public /* synthetic */ fv(int i) {
        this.a = i;
    }

    @Override // java.nio.channels.CompletionHandler
    public final void completed(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((k42) obj2).resumeWith(obj);
                break;
            default:
                ((k42) obj2).resumeWith(qqg.a);
                break;
        }
    }

    @Override // java.nio.channels.CompletionHandler
    public final void failed(Throwable th, Object obj) {
        switch (this.a) {
            case 0:
                k42 k42Var = (k42) obj;
                if (!(th instanceof AsynchronousCloseException) || !k42Var.isCancelled()) {
                    k42Var.resumeWith(new ipd(th));
                    break;
                }
                break;
            default:
                k42 k42Var2 = (k42) obj;
                if (!(th instanceof AsynchronousCloseException) || !k42Var2.isCancelled()) {
                    k42Var2.resumeWith(new ipd(th));
                    break;
                }
                break;
        }
    }
}
