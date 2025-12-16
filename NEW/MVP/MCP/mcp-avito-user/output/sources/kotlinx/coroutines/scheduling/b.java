package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC43313y0;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.M;
import kotlinx.coroutines.internal.d0;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/scheduling/b;", "Lkotlinx/coroutines/y0;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b extends AbstractC43313y0 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f412167c = new b();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final M f412168d;

    static {
        o oVar = o.f412186c;
        int iA2 = d0.a();
        if (64 >= iA2) {
            iA2 = 64;
        }
        f412168d = oVar.q(d0.d(iA2, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@Y61.k Runnable runnable) {
        h(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // kotlinx.coroutines.M
    public final void h(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        f412168d.h(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.M
    @I0
    public final void j(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        f412168d.j(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.M
    @B0
    @Y61.k
    public final M q(int i12) {
        return o.f412186c.q(1);
    }

    @Override // kotlinx.coroutines.M
    @Y61.k
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.AbstractC43313y0
    @Y61.k
    /* renamed from: y */
    public final Executor getF412305c() {
        return this;
    }
}
