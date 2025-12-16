package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.w0;

/* compiled from: ULongRange.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/ranges/z;", "", "Lkotlin/w0;", "first", "last", "", "step", "<init>", "(JJJLkotlin/jvm/internal/w;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
final class z implements Iterator<w0>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f406934b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f406935c;

    /* renamed from: d, reason: collision with root package name */
    public final long f406936d;

    /* renamed from: e, reason: collision with root package name */
    public long f406937e;

    public z(long j12, long j13, long j14, C42822w c42822w) {
        this.f406934b = j13;
        boolean z12 = false;
        if (j14 <= 0 ? Long.compareUnsigned(j12, j13) >= 0 : Long.compareUnsigned(j12, j13) <= 0) {
            z12 = true;
        }
        this.f406935c = z12;
        int i12 = w0.f410662c;
        this.f406936d = j14;
        this.f406937e = z12 ? j12 : j13;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f406935c;
    }

    @Override // java.util.Iterator
    public final w0 next() {
        long j12 = this.f406937e;
        if (j12 != this.f406934b) {
            long j13 = this.f406936d + j12;
            int i12 = w0.f410662c;
            this.f406937e = j13;
        } else {
            if (!this.f406935c) {
                throw new NoSuchElementException();
            }
            this.f406935c = false;
        }
        return w0.a(j12);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
