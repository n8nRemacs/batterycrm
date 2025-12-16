package okio;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import shark.AndroidResourceIdNames;

/* compiled from: SegmentPool.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokio/a0;", "", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a0 f420058a = new a0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f420059b = AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Z f420060c = new Z(new byte[0], 0, 0, false, false);

    /* renamed from: d, reason: collision with root package name */
    public static final int f420061d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final AtomicReference<Z>[] f420062e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f420061d = iHighestOneBit;
        AtomicReference<Z>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i12 = 0; i12 < iHighestOneBit; i12++) {
            atomicReferenceArr[i12] = new AtomicReference<>();
        }
        f420062e = atomicReferenceArr;
    }

    @X41.n
    public static final void a(@Y61.k Z z12) {
        if (z12.f420055f != null || z12.f420056g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (z12.f420053d) {
            return;
        }
        f420058a.getClass();
        AtomicReference<Z> atomicReference = f420062e[(int) (Thread.currentThread().getId() & (f420061d - 1))];
        Z z13 = f420060c;
        Z andSet = atomicReference.getAndSet(z13);
        if (andSet == z13) {
            return;
        }
        int i12 = andSet != null ? andSet.f420052c : 0;
        if (i12 >= f420059b) {
            atomicReference.set(andSet);
            return;
        }
        z12.f420055f = andSet;
        z12.f420051b = 0;
        z12.f420052c = i12 + 8192;
        atomicReference.set(z12);
    }

    @X41.n
    @Y61.k
    public static final Z b() {
        f420058a.getClass();
        AtomicReference<Z> atomicReference = f420062e[(int) (Thread.currentThread().getId() & (f420061d - 1))];
        Z z12 = f420060c;
        Z andSet = atomicReference.getAndSet(z12);
        if (andSet == z12) {
            return new Z();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new Z();
        }
        atomicReference.set(andSet.f420055f);
        andSet.f420055f = null;
        andSet.f420052c = 0;
        return andSet;
    }
}
