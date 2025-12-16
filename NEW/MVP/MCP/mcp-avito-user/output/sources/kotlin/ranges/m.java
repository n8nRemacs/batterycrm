package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Progressions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/m;", "", "", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class m implements Iterable<Long>, Z41.a {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f406914e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final long f406915b;

    /* renamed from: c, reason: collision with root package name */
    public final long f406916c;

    /* renamed from: d, reason: collision with root package name */
    public final long f406917d;

    /* compiled from: Progressions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/m$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public m(long j12, long j13, long j14) {
        if (j14 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j14 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f406915b = j12;
        this.f406916c = kotlin.internal.n.b(j12, j13, j14);
        this.f406917d = j14;
    }

    public boolean equals(@Y61.l Object obj) {
        if (obj instanceof m) {
            if (!isEmpty() || !((m) obj).isEmpty()) {
                m mVar = (m) obj;
                if (this.f406915b != mVar.f406915b || this.f406916c != mVar.f406916c || this.f406917d != mVar.f406917d) {
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
        long j12 = 31;
        long j13 = this.f406915b;
        long j14 = this.f406916c;
        long j15 = (((j13 ^ (j13 >>> 32)) * j12) + (j14 ^ (j14 >>> 32))) * j12;
        long j16 = this.f406917d;
        return (int) (j15 + (j16 ^ (j16 >>> 32)));
    }

    public boolean isEmpty() {
        long j12 = this.f406917d;
        long j13 = this.f406916c;
        long j14 = this.f406915b;
        if (j12 > 0) {
            if (j14 <= j13) {
                return false;
            }
        } else if (j14 >= j13) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new n(this.f406915b, this.f406916c, this.f406917d);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2;
        long j12 = this.f406917d;
        long j13 = this.f406916c;
        long j14 = this.f406915b;
        if (j12 > 0) {
            sb2 = new StringBuilder();
            sb2.append(j14);
            sb2.append("..");
            sb2.append(j13);
            sb2.append(" step ");
            sb2.append(j12);
        } else {
            sb2 = new StringBuilder();
            sb2.append(j14);
            sb2.append(" downTo ");
            sb2.append(j13);
            sb2.append(" step ");
            sb2.append(-j12);
        }
        return sb2.toString();
    }
}
