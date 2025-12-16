package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/k0;", "Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class ExecutorC43260k0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final M f411943b;

    public ExecutorC43260k0(@Y61.k M m12) {
        this.f411943b = m12;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@Y61.k Runnable runnable) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        M m12 = this.f411943b;
        if (m12.p(emptyCoroutineContext)) {
            m12.h(emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    @Y61.k
    public final String toString() {
        return this.f411943b.toString();
    }
}
