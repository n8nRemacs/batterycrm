package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC43313y0;

/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u000b\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/scheduling/f;", "Lkotlinx/coroutines/y0;", "Lkotlinx/coroutines/scheduling/k;", "Ljava/util/concurrent/Executor;", "Lkotlinx/atomicfu/AtomicInt;", "inFlightTasks", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class f extends AbstractC43313y0 implements k, Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f412171c = AtomicIntegerFieldUpdater.newUpdater(f.class, "inFlightTasks$volatile");
    private volatile /* synthetic */ int inFlightTasks$volatile;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@Y61.k Runnable runnable) {
        if (f412171c.incrementAndGet(this) > 0) {
            throw null;
        }
        throw null;
    }

    @Override // kotlinx.coroutines.M
    public final void h(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        if (f412171c.incrementAndGet(this) > 0) {
            throw null;
        }
        throw null;
    }

    @Override // kotlinx.coroutines.M
    public final void j(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        if (f412171c.incrementAndGet(this) > 0) {
            throw null;
        }
        throw null;
    }

    @Override // kotlinx.coroutines.M
    @Y61.k
    public final String toString() {
        return AK.c.s(new StringBuilder(), super.toString(), "[dispatcher = null]");
    }

    @Override // kotlinx.coroutines.AbstractC43313y0
    @Y61.k
    /* renamed from: y */
    public final Executor getF412305c() {
        return this;
    }
}
