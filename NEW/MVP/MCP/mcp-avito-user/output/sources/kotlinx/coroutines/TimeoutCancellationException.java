package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: Timeout.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/J;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TimeoutCancellationException extends CancellationException implements J<TimeoutCancellationException> {

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final transient N0 f410721b;

    public TimeoutCancellationException(@Y61.k String str, @Y61.l N0 n02) {
        super(str);
        this.f410721b = n02;
    }

    @Override // kotlinx.coroutines.J
    public final Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.f410721b);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
