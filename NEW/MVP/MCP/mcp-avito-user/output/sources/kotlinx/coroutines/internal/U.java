package kotlinx.coroutines.internal;

import kotlin.Metadata;

/* compiled from: LockFreeLinkedList.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/internal/U;", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class U {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final E f411884a;

    public U(@Y61.k E e12) {
        this.f411884a = e12;
    }

    @Y61.k
    public final String toString() {
        return "Removed[" + this.f411884a + ']';
    }
}
