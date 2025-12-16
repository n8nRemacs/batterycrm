package q41;

import io.reactivex.rxjava3.internal.util.n;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscArrayQueue.java */
/* loaded from: classes8.dex */
public final class h<E> extends AtomicReferenceArray<E> implements f<E> {

    /* renamed from: g, reason: collision with root package name */
    public static final Integer f429016g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;

    /* renamed from: b, reason: collision with root package name */
    public final int f429017b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f429018c;

    /* renamed from: d, reason: collision with root package name */
    public long f429019d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f429020e;

    /* renamed from: f, reason: collision with root package name */
    public final int f429021f;

    public h(int i12) {
        super(n.a(i12));
        this.f429017b = length() - 1;
        this.f429018c = new AtomicLong();
        this.f429020e = new AtomicLong();
        this.f429021f = Math.min(i12 / 4, f429016g.intValue());
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
        return this.f429018c.get() == this.f429020e.get();
    }

    @Override // q41.g
    public final boolean offer(E e12) {
        if (e12 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f429018c;
        long j12 = atomicLong.get();
        int i12 = this.f429017b;
        int i13 = ((int) j12) & i12;
        if (j12 >= this.f429019d) {
            long j13 = this.f429021f + j12;
            if (get(i12 & ((int) j13)) == null) {
                this.f429019d = j13;
            } else if (get(i13) != null) {
                return false;
            }
        }
        lazySet(i13, e12);
        atomicLong.lazySet(j12 + 1);
        return true;
    }

    @Override // q41.g
    @j41.f
    public final E poll() {
        AtomicLong atomicLong = this.f429020e;
        long j12 = atomicLong.get();
        int i12 = ((int) j12) & this.f429017b;
        E e12 = get(i12);
        if (e12 == null) {
            return null;
        }
        atomicLong.lazySet(j12 + 1);
        lazySet(i12, null);
        return e12;
    }
}
