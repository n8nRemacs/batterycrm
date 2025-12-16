package q41;

import io.reactivex.rxjava3.internal.util.n;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscLinkedArrayQueue.java */
/* loaded from: classes8.dex */
public final class i<T> implements f<T> {

    /* renamed from: j, reason: collision with root package name */
    public static final int f429022j = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f429023k = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f429024b;

    /* renamed from: c, reason: collision with root package name */
    public final int f429025c;

    /* renamed from: d, reason: collision with root package name */
    public long f429026d;

    /* renamed from: e, reason: collision with root package name */
    public final int f429027e;

    /* renamed from: f, reason: collision with root package name */
    public AtomicReferenceArray<Object> f429028f;

    /* renamed from: g, reason: collision with root package name */
    public final int f429029g;

    /* renamed from: h, reason: collision with root package name */
    public AtomicReferenceArray<Object> f429030h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f429031i;

    public i(int i12) {
        AtomicLong atomicLong = new AtomicLong();
        this.f429024b = atomicLong;
        this.f429031i = new AtomicLong();
        int iA2 = n.a(Math.max(8, i12));
        int i13 = iA2 - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iA2 + 1);
        this.f429028f = atomicReferenceArray;
        this.f429027e = i13;
        this.f429025c = Math.min(iA2 / 4, f429022j);
        this.f429030h = atomicReferenceArray;
        this.f429029g = i13;
        this.f429026d = iA2 - 2;
        atomicLong.lazySet(0L);
    }

    public final void a(Serializable serializable, Object obj) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f429028f;
        AtomicLong atomicLong = this.f429024b;
        long j12 = atomicLong.get();
        long j13 = 2 + j12;
        int i12 = this.f429027e;
        if (atomicReferenceArray.get(((int) j13) & i12) == null) {
            int i13 = ((int) j12) & i12;
            atomicReferenceArray.lazySet(i13 + 1, obj);
            atomicReferenceArray.lazySet(i13, serializable);
            atomicLong.lazySet(j13);
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f429028f = atomicReferenceArray2;
        int i14 = ((int) j12) & i12;
        atomicReferenceArray2.lazySet(i14 + 1, obj);
        atomicReferenceArray2.lazySet(i14, serializable);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i14, f429023k);
        atomicLong.lazySet(j13);
    }

    @j41.f
    public final T b() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f429030h;
        int i12 = (int) this.f429031i.get();
        int i13 = this.f429029g;
        int i14 = i12 & i13;
        T t12 = (T) atomicReferenceArray.get(i14);
        if (t12 != f429023k) {
            return t12;
        }
        int i15 = i13 + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i15);
        atomicReferenceArray.lazySet(i15, null);
        this.f429030h = atomicReferenceArray2;
        return (T) atomicReferenceArray2.get(i14);
    }

    @Override // q41.g
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // q41.g
    public final boolean isEmpty() {
        return this.f429024b.get() == this.f429031i.get();
    }

    @Override // q41.g
    public final boolean offer(T t12) {
        if (t12 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f429028f;
        AtomicLong atomicLong = this.f429024b;
        long j12 = atomicLong.get();
        int i12 = this.f429027e;
        int i13 = ((int) j12) & i12;
        if (j12 < this.f429026d) {
            atomicReferenceArray.lazySet(i13, t12);
            atomicLong.lazySet(j12 + 1);
            return true;
        }
        long j13 = this.f429025c + j12;
        if (atomicReferenceArray.get(((int) j13) & i12) == null) {
            this.f429026d = j13 - 1;
            atomicReferenceArray.lazySet(i13, t12);
            atomicLong.lazySet(j12 + 1);
            return true;
        }
        long j14 = j12 + 1;
        if (atomicReferenceArray.get(((int) j14) & i12) == null) {
            atomicReferenceArray.lazySet(i13, t12);
            atomicLong.lazySet(j14);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f429028f = atomicReferenceArray2;
        this.f429026d = (j12 + i12) - 1;
        atomicReferenceArray2.lazySet(i13, t12);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i13, f429023k);
        atomicLong.lazySet(j14);
        return true;
    }

    @Override // q41.g
    @j41.f
    public final T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f429030h;
        AtomicLong atomicLong = this.f429031i;
        long j12 = atomicLong.get();
        int i12 = this.f429029g;
        int i13 = ((int) j12) & i12;
        T t12 = (T) atomicReferenceArray.get(i13);
        boolean z12 = t12 == f429023k;
        if (t12 != null && !z12) {
            atomicReferenceArray.lazySet(i13, null);
            atomicLong.lazySet(j12 + 1);
            return t12;
        }
        if (!z12) {
            return null;
        }
        int i14 = i12 + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i14);
        atomicReferenceArray.lazySet(i14, null);
        this.f429030h = atomicReferenceArray2;
        T t13 = (T) atomicReferenceArray2.get(i13);
        if (t13 != null) {
            atomicReferenceArray2.lazySet(i13, null);
            atomicLong.lazySet(j12 + 1);
        }
        return t13;
    }
}
