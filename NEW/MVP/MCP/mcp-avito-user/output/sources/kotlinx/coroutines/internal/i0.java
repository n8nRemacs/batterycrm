package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: ThreadContext.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/internal/i0;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/internal/h0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final /* data */ class i0 implements CoroutineContext.Key<h0<?>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ThreadLocal<?> f411910b;

    public i0(@Y61.k ThreadLocal<?> threadLocal) {
        this.f411910b = threadLocal;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && kotlin.jvm.internal.L.f(this.f411910b, ((i0) obj).f411910b);
    }

    public final int hashCode() {
        return this.f411910b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f411910b + ')';
    }
}
