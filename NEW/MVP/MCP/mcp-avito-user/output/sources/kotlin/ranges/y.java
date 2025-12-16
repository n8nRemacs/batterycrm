package kotlin.ranges;

import java.util.Iterator;
import kotlin.InterfaceC42733c0;
import kotlin.K0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.w0;

/* compiled from: ULongRange.kt */
@K0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/ranges/y;", "", "Lkotlin/w0;", "start", "endInclusive", "", "step", "<init>", "(JJJLkotlin/jvm/internal/w;)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public class y implements Iterable<w0>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f406931b;

    /* renamed from: c, reason: collision with root package name */
    public final long f406932c;

    /* renamed from: d, reason: collision with root package name */
    public final long f406933d;

    /* compiled from: ULongRange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/y$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public y(long j12, long j13, long j14, C42822w c42822w) {
        if (j14 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j14 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f406931b = j12;
        if (j14 > 0) {
            if (Long.compareUnsigned(j12, j13) < 0) {
                int i12 = w0.f410662c;
                long jRemainderUnsigned = Long.remainderUnsigned(j13, j14);
                long jRemainderUnsigned2 = Long.remainderUnsigned(j12, j14);
                int iCompareUnsigned = Long.compareUnsigned(jRemainderUnsigned, jRemainderUnsigned2);
                long j15 = jRemainderUnsigned - jRemainderUnsigned2;
                j13 -= iCompareUnsigned < 0 ? j15 + j14 : j15;
            }
        } else {
            if (j14 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (Long.compareUnsigned(j12, j13) > 0) {
                long j16 = -j14;
                int i13 = w0.f410662c;
                long jRemainderUnsigned3 = Long.remainderUnsigned(j12, j16);
                long jRemainderUnsigned4 = Long.remainderUnsigned(j13, j16);
                int iCompareUnsigned2 = Long.compareUnsigned(jRemainderUnsigned3, jRemainderUnsigned4);
                long j17 = jRemainderUnsigned3 - jRemainderUnsigned4;
                j13 += iCompareUnsigned2 < 0 ? j17 + j16 : j17;
            }
        }
        this.f406932c = j13;
        this.f406933d = j14;
    }

    public boolean equals(@Y61.l Object obj) {
        if (obj instanceof y) {
            if (!isEmpty() || !((y) obj).isEmpty()) {
                y yVar = (y) obj;
                if (this.f406931b != yVar.f406931b || this.f406932c != yVar.f406932c || this.f406933d != yVar.f406933d) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j12 = this.f406931b;
        int i12 = w0.f410662c;
        long j13 = this.f406932c;
        int i13 = ((((int) (j12 ^ (j12 >>> 32))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f406933d;
        return i13 + ((int) ((j14 >>> 32) ^ j14));
    }

    public boolean isEmpty() {
        long j12 = this.f406933d;
        long j13 = this.f406932c;
        long j14 = this.f406931b;
        if (j12 > 0) {
            if (Long.compareUnsigned(j14, j13) <= 0) {
                return false;
            }
        } else if (Long.compareUnsigned(j14, j13) >= 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<w0> iterator() {
        return new z(this.f406931b, this.f406932c, this.f406933d, null);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2;
        long j12 = this.f406933d;
        long j13 = this.f406932c;
        long j14 = this.f406931b;
        if (j12 > 0) {
            sb2 = new StringBuilder();
            sb2.append((Object) w0.b(j14));
            sb2.append("..");
            sb2.append((Object) w0.b(j13));
            sb2.append(" step ");
            sb2.append(j12);
        } else {
            sb2 = new StringBuilder();
            sb2.append((Object) w0.b(j14));
            sb2.append(" downTo ");
            sb2.append((Object) w0.b(j13));
            sb2.append(" step ");
            sb2.append(-j12);
        }
        return sb2.toString();
    }
}
