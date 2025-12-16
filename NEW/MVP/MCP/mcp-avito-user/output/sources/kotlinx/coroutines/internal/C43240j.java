package kotlinx.coroutines.internal;

import java.util.Iterator;
import kotlin.C42833p;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: CoroutineExceptionHandlerImpl.common.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.internal.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43240j {
    public static final void a(@Y61.k CoroutineContext coroutineContext, @Y61.k Throwable th2) {
        Throwable runtimeException;
        Iterator<kotlinx.coroutines.N> it = C43239i.f411909a.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th2);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    C42833p.a(runtimeException, th2);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            C42833p.a(th2, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }
}
