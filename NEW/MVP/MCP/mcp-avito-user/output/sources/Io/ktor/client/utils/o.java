package io.ktor.client.utils;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExceptionUtilsJvm.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class o {
    @Y61.k
    public static final Throwable a(@Y61.k Throwable th2) {
        Throwable cause = th2;
        while (cause instanceof CancellationException) {
            CancellationException cancellationException = (CancellationException) cause;
            if (L.f(cause, cancellationException.getCause())) {
                return th2;
            }
            cause = cancellationException.getCause();
        }
        return cause == null ? th2 : cause;
    }
}
