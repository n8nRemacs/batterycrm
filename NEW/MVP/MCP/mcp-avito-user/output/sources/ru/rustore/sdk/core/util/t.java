package ru.rustore.sdk.core.util;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: WithTimeoutOrThrow.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/TimeoutCancellationException;", "T", "it", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
final class t extends N implements Y41.l<TimeoutCancellationException, TimeoutCancellationException> {
    static {
        new t();
    }

    public t() {
        super(1);
    }

    @Override // Y41.l
    public final TimeoutCancellationException invoke(TimeoutCancellationException timeoutCancellationException) {
        return timeoutCancellationException;
    }
}
