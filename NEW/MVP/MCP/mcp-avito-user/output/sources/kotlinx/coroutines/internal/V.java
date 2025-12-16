package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* compiled from: ResizableAtomicArray.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/internal/V;", "T", "", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "array", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class V<T> {

    @Y61.k
    private volatile AtomicReferenceArray<T> array;

    public V(int i12) {
        this.array = new AtomicReferenceArray<>(i12);
    }

    public final int a() {
        return this.array.length();
    }

    @Y61.l
    public final T b(int i12) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i12 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i12);
        }
        return null;
    }

    public final void c(int i12, @Y61.l CoroutineScheduler.c cVar) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i12 < length) {
            atomicReferenceArray.set(i12, cVar);
            return;
        }
        int i13 = i12 + 1;
        int i14 = length * 2;
        if (i13 < i14) {
            i13 = i14;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(i13);
        for (int i15 = 0; i15 < length; i15++) {
            atomicReferenceArray2.set(i15, atomicReferenceArray.get(i15));
        }
        atomicReferenceArray2.set(i12, cVar);
        this.array = atomicReferenceArray2;
    }
}
