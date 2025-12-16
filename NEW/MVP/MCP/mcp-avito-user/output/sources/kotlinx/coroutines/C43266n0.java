package kotlinx.coroutines;

import java.util.concurrent.ScheduledFuture;
import kotlin.Metadata;

/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/n0;", "Lkotlinx/coroutines/o0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.n0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43266n0 implements InterfaceC43268o0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ScheduledFuture f411952b;

    public C43266n0(@Y61.k ScheduledFuture scheduledFuture) {
        this.f411952b = scheduledFuture;
    }

    @Override // kotlinx.coroutines.InterfaceC43268o0
    public final void dispose() {
        this.f411952b.cancel(false);
    }

    @Y61.k
    public final String toString() {
        return "DisposableFutureHandle[" + this.f411952b + ']';
    }
}
