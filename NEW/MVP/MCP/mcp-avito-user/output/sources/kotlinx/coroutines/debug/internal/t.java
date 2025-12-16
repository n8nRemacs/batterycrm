package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: ConcurrentWeakMap.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/debug/internal/t;", "T", "Ljava/lang/ref/WeakReference;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class t<T> extends WeakReference<T> {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    public final int f411076a;

    public t(T t12, @Y61.l ReferenceQueue<T> referenceQueue) {
        super(t12, referenceQueue);
        this.f411076a = t12 != null ? t12.hashCode() : 0;
    }
}
