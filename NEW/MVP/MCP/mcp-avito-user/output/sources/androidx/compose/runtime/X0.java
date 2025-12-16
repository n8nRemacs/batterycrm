package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: MonotonicFrameClock.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X0 {
    @Y61.k
    public static final V0 a(@Y61.k CoroutineContext coroutineContext) {
        V0 v02 = (V0) coroutineContext.get(V0.f38155w1);
        if (v02 != null) {
            return v02;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }
}
