package io.ktor.utils.io.pool;

import Y61.k;
import Y61.l;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.s0;

/* compiled from: DefaultPool.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0007R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lio/ktor/utils/io/pool/d;", "", "T", "Lio/ktor/utils/io/pool/h;", "", "top", "J", "b", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class d<T> implements h<T> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final AtomicLongFieldUpdater<d<?>> f401246f;

    /* renamed from: b, reason: collision with root package name */
    public final int f401247b;

    /* renamed from: c, reason: collision with root package name */
    public final int f401248c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AtomicReferenceArray<T> f401249d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final int[] f401250e;
    private volatile long top;

    /* compiled from: DefaultPool.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/utils/io/pool/d$b;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;", "Lio/ktor/utils/io/pool/d;", "Top", "Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        f401246f = AtomicLongFieldUpdater.newUpdater(d.class, new Y() { // from class: io.ktor.utils.io.pool.d.a
            @Override // kotlin.jvm.internal.Y, kotlin.reflect.l
            public final void e(@l Object obj, @l Object obj2) {
                ((d) obj).top = ((Number) obj2).longValue();
            }

            @Override // kotlin.jvm.internal.Y, kotlin.reflect.p
            @l
            public final Object get(@l Object obj) {
                return Long.valueOf(((d) obj).top);
            }
        }.getName());
    }

    public d(int i12) {
        if (i12 <= 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "capacity should be positive but it is ").toString());
        }
        if (i12 > 536870911) {
            throw new IllegalArgumentException(AK.c.g(i12, "capacity should be less or equal to 536870911 but it is ").toString());
        }
        int iHighestOneBit = Integer.highestOneBit((i12 * 4) - 1) * 2;
        this.f401247b = iHighestOneBit;
        this.f401248c = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        int i13 = iHighestOneBit + 1;
        this.f401249d = new AtomicReferenceArray<>(i13);
        this.f401250e = new int[i13];
    }

    @Override // io.ktor.utils.io.pool.h
    public final void G4(@k T t12) {
        long j12;
        long j13;
        i(t12);
        int iIdentityHashCode = ((System.identityHashCode(t12) * (-1640531527)) >>> this.f401248c) + 1;
        for (int i12 = 0; i12 < 8; i12++) {
            AtomicReferenceArray<T> atomicReferenceArray = this.f401249d;
            while (!atomicReferenceArray.compareAndSet(iIdentityHashCode, null, t12)) {
                if (atomicReferenceArray.get(iIdentityHashCode) != null) {
                    iIdentityHashCode--;
                    if (iIdentityHashCode == 0) {
                        iIdentityHashCode = this.f401247b;
                    }
                }
            }
            if (iIdentityHashCode <= 0) {
                throw new IllegalArgumentException("index should be positive");
            }
            do {
                j12 = this.top;
                j13 = ((((j12 >> 32) & 4294967295L) + 1) << 32) | iIdentityHashCode;
                this.f401250e[iIdentityHashCode] = (int) (4294967295L & j12);
            } while (!f401246f.compareAndSet(this, j12, j13));
            return;
        }
        f(t12);
    }

    @Override // io.ktor.utils.io.pool.h
    @k
    public final T S2() {
        T tH2 = h();
        return tH2 != null ? c(tH2) : g();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d();
    }

    public final void d() {
        while (true) {
            T tH2 = h();
            if (tH2 == null) {
                return;
            } else {
                f(tH2);
            }
        }
    }

    @k
    public abstract T g();

    public final T h() {
        int i12;
        while (true) {
            long j12 = this.top;
            i12 = 0;
            if (j12 == 0) {
                break;
            }
            long j13 = ((j12 >> 32) & 4294967295L) + 1;
            int i13 = (int) (4294967295L & j12);
            if (i13 == 0) {
                break;
            }
            if (f401246f.compareAndSet(this, j12, (j13 << 32) | this.f401250e[i13])) {
                i12 = i13;
                break;
            }
        }
        if (i12 == 0) {
            return null;
        }
        return this.f401249d.getAndSet(i12, null);
    }

    @k
    public T c(@k T t12) {
        return t12;
    }

    public void f(@k T t12) {
    }

    public void i(@k T t12) {
    }
}
