package Ba1;

import android.os.Looper;
import java.lang.Thread;

/* renamed from: Ba1.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13125c implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f1498a;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        if (Looper.getMainLooper().isCurrentThread()) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f1498a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th2);
                return;
            }
            return;
        }
        z91.s sVar = z91.e.f443908b;
        if (sVar != null) {
            sVar.b().c(new W91.e(y.b(null), "ERROR_SCREEN"));
        }
    }
}
