package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.X;

/* compiled from: Semaphore.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/sync/q;", "Lkotlinx/coroutines/internal/X;", "Lkotlinx/atomicfu/AtomicArray;", "", "acquirers", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class q extends X<q> {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f412287f;

    public q(long j12, @Y61.l q qVar, int i12) {
        super(j12, qVar, i12);
        this.f412287f = new AtomicReferenceArray(p.f412286f);
    }

    @Override // kotlinx.coroutines.internal.X
    public final int g() {
        return p.f412286f;
    }

    @Override // kotlinx.coroutines.internal.X
    public final void h(int i12, @Y61.k CoroutineContext coroutineContext) {
        this.f412287f.set(i12, p.f412285e);
        i();
    }

    @Y61.k
    public final String toString() {
        return "SemaphoreSegment[id=" + this.f411887d + ", hashCode=" + hashCode() + ']';
    }
}
