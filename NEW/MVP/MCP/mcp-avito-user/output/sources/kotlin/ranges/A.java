package kotlin.ranges;

import kotlin.InterfaceC42733c0;
import kotlin.K0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.w0;

/* compiled from: ULongRange.kt */
@K0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\tB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/ranges/A;", "Lkotlin/ranges/y;", "Lkotlin/ranges/g;", "Lkotlin/w0;", "Lkotlin/ranges/r;", "start", "endInclusive", "<init>", "(JJLkotlin/jvm/internal/w;)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public final class A extends y implements g<w0>, r<w0> {

    /* compiled from: ULongRange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/A$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        new A(-1L, 0L, null);
    }

    public A(long j12, long j13, C42822w c42822w) {
        super(j12, j13, 1L, null);
    }

    @Override // kotlin.ranges.g
    public final Comparable d() {
        return w0.a(this.f406931b);
    }

    @Override // kotlin.ranges.g
    public final boolean e(Comparable comparable) {
        long j12 = this.f406931b;
        long j13 = ((w0) comparable).f410663b;
        return Long.compareUnsigned(j12, j13) <= 0 && Long.compareUnsigned(j13, this.f406932c) <= 0;
    }

    @Override // kotlin.ranges.y
    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof A) {
            if (!isEmpty() || !((A) obj).isEmpty()) {
                A a12 = (A) obj;
                if (this.f406931b == a12.f406931b) {
                    if (this.f406932c == a12.f406932c) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.g
    public final Comparable g() {
        return w0.a(this.f406932c);
    }

    @Override // kotlin.ranges.y
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j12 = this.f406931b;
        int i12 = w0.f410662c;
        int i13 = ((int) (j12 ^ (j12 >>> 32))) * 31;
        long j13 = this.f406932c;
        return i13 + ((int) ((j13 >>> 32) ^ j13));
    }

    @Override // kotlin.ranges.y, kotlin.ranges.g
    public final boolean isEmpty() {
        return Long.compareUnsigned(this.f406931b, this.f406932c) > 0;
    }

    @Override // kotlin.ranges.y
    @Y61.k
    public final String toString() {
        return ((Object) w0.b(this.f406931b)) + ".." + ((Object) w0.b(this.f406932c));
    }
}
