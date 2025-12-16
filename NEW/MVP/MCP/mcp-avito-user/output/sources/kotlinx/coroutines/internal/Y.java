package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.internal.X;

/* compiled from: ConcurrentLinkedList.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003\u0088\u0001\u0004\u0092\u0001\u0004\u0018\u00010\u0003¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/internal/Y;", "Lkotlinx/coroutines/internal/X;", "S", "", "value", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Y<S extends X<S>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Object f411888a;

    @Y61.k
    public static final S a(Object obj) {
        if (obj != C43235e.f411894a) {
            return (S) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final boolean b(Object obj) {
        return obj == C43235e.f411894a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Y) {
            return kotlin.jvm.internal.L.f(this.f411888a, ((Y) obj).f411888a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f411888a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "SegmentOrClosed(value=" + this.f411888a + ')';
    }
}
