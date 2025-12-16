package kotlinx.coroutines;

import java.util.concurrent.ScheduledFuture;
import kotlin.Metadata;

/* compiled from: Future.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/n;", "Lkotlinx/coroutines/p;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43265n implements InterfaceC43269p {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ScheduledFuture f411951b;

    public C43265n(@Y61.k ScheduledFuture scheduledFuture) {
        this.f411951b = scheduledFuture;
    }

    @Override // kotlinx.coroutines.InterfaceC43269p
    public final void a(@Y61.l Throwable th2) {
        if (th2 != null) {
            this.f411951b.cancel(false);
        }
    }

    @Y61.k
    public final String toString() {
        return "CancelFutureOnCancel[" + this.f411951b + ']';
    }
}
