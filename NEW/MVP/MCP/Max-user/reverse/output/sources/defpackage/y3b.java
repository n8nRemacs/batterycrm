package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class y3b implements yi5 {
    public final void a(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        wqi.e("OneMeExceptionHandler", "Handle exception in " + Thread.currentThread(), th);
    }
}
