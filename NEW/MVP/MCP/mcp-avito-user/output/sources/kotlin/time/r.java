package kotlin.time;

import kotlin.InterfaceC42733c0;
import kotlin.K0;
import kotlin.Metadata;
import kotlin.time.d;

/* compiled from: TimeSource.kt */
@K0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/time/r;", "", "a", "b", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public interface r {

    /* compiled from: TimeSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/time/r$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: TimeSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/time/r$b;", "Lkotlin/time/r$c;", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f410658a = new b();

        /* compiled from: TimeSource.kt */
        @K0
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/time/r$b$a;", "Lkotlin/time/d;", "reading", "", "Lkotlin/time/ValueTimeMarkReading;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @InterfaceC42733c0
        @X41.g
        public static final class a implements d {

            /* renamed from: b, reason: collision with root package name */
            public final long f410659b;

            public static long a(long j12) {
                o.f410656a.getClass();
                return (1 | (j12 - 1)) == Long.MAX_VALUE ? e.n(l.a(j12)) : l.b(o.a(), j12, DurationUnit.f410631c);
            }

            @Override // java.lang.Comparable
            public final int compareTo(d dVar) {
                return d.a.a(this, dVar);
            }

            public final boolean equals(Object obj) {
                if (obj instanceof a) {
                    return this.f410659b == ((a) obj).f410659b;
                }
                return false;
            }

            public final int hashCode() {
                return Long.hashCode(this.f410659b);
            }

            public final String toString() {
                return androidx.appcompat.app.r.u(new StringBuilder("ValueTimeMark(reading="), this.f410659b, ')');
            }

            @Override // kotlin.time.d
            public final long y0(@Y61.k d dVar) {
                boolean z12 = dVar instanceof a;
                long j12 = this.f410659b;
                if (z12) {
                    long j13 = ((a) dVar).f410659b;
                    o.f410656a.getClass();
                    return l.c(j12, j13, DurationUnit.f410631c);
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j12 + ')')) + " and " + dVar);
            }
        }

        @Y61.k
        public final String toString() {
            o.f410656a.getClass();
            return "TimeSource(System.nanoTime())";
        }
    }

    /* compiled from: TimeSource.kt */
    @K0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/r$c;", "Lkotlin/time/r;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42733c0
    public interface c extends r {
    }
}
