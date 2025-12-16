package kotlinx.coroutines;

import kotlin.C42833p;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C43240j;

/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class P {
    @I0
    public static final void a(@Y61.k CoroutineContext coroutineContext, @Y61.k Throwable th2) {
        try {
            N n12 = (N) coroutineContext.get(N.f410714t2);
            if (n12 != null) {
                n12.handleException(coroutineContext, th2);
            } else {
                C43240j.a(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                C42833p.a(runtimeException, th2);
                th2 = runtimeException;
            }
            C43240j.a(coroutineContext, th2);
        }
    }
}
