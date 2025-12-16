package kotlin.time;

import kotlin.InterfaceC42733c0;
import kotlin.K0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: Duration.kt */
@s0
@K0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/time/e;", "", "a", "rawValue", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
@X41.g
/* loaded from: classes8.dex */
public final class e implements Comparable<e> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f410651c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final long f410652d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f410653e;

    /* renamed from: b, reason: collision with root package name */
    public final long f410654b;

    /* compiled from: Duration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/time/e$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        int i12 = f.f410655a;
        f410652d = g.b(4611686018427387903L);
        f410653e = g.b(-4611686018427387903L);
    }

    private /* synthetic */ e(long j12) {
        this.f410654b = j12;
    }

    public static final long a(long j12, long j13) {
        long j14 = 1000000;
        long j15 = j13 / j14;
        long j16 = j12 + j15;
        if (-4611686018426L > j16 || j16 >= 4611686018427L) {
            return g.b(kotlin.ranges.s.i(j16, -4611686018427387903L, 4611686018427387903L));
        }
        return g.d((j16 * j14) + (j13 - (j15 * j14)));
    }

    public static final void b(StringBuilder sb2, int i12, int i13, int i14, String str, boolean z12) {
        sb2.append(i12);
        if (i13 != 0) {
            sb2.append('.');
            String strR = C43066x.R(i14, String.valueOf(i13));
            int i15 = -1;
            int length = strR.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i16 = length - 1;
                    if (strR.charAt(length) != '0') {
                        i15 = length;
                        break;
                    } else if (i16 < 0) {
                        break;
                    } else {
                        length = i16;
                    }
                }
            }
            int i17 = i15 + 1;
            if (z12 || i17 >= 3) {
                sb2.append((CharSequence) strR, 0, ((i15 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) strR, 0, i17);
            }
        }
        sb2.append(str);
    }

    public static final /* synthetic */ e c(long j12) {
        return new e(j12);
    }

    public static int d(long j12, long j13) {
        long j14 = j12 ^ j13;
        if (j14 < 0 || (((int) j14) & 1) == 0) {
            return L.h(j12, j13);
        }
        int i12 = (((int) j12) & 1) - (((int) j13) & 1);
        return j12 < 0 ? -i12 : i12;
    }

    public static final long e(long j12) {
        return ((((int) j12) & 1) != 1 || j(j12)) ? l(j12, DurationUnit.f410633e) : j12 >> 1;
    }

    public static final int f(long j12) {
        if (j(j12)) {
            return 0;
        }
        return (int) (l(j12, DurationUnit.f410635g) % 60);
    }

    public static final int h(long j12) {
        if (j(j12)) {
            return 0;
        }
        return (int) ((((int) j12) & 1) == 1 ? ((j12 >> 1) % 1000) * 1000000 : (j12 >> 1) % Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
    }

    public static final int i(long j12) {
        if (j(j12)) {
            return 0;
        }
        return (int) (l(j12, DurationUnit.f410634f) % 60);
    }

    public static final boolean j(long j12) {
        return j12 == f410652d || j12 == f410653e;
    }

    public static final long k(long j12, long j13) {
        if (j(j12)) {
            if (!j(j13) || (j13 ^ j12) >= 0) {
                return j12;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (j(j13)) {
            return j13;
        }
        int i12 = ((int) j12) & 1;
        if (i12 != (((int) j13) & 1)) {
            return i12 == 1 ? a(j12 >> 1, j13 >> 1) : a(j13 >> 1, j12 >> 1);
        }
        long j14 = (j12 >> 1) + (j13 >> 1);
        return i12 == 0 ? (-4611686018426999999L > j14 || j14 >= 4611686018427000000L) ? g.b(j14 / 1000000) : g.d(j14) : g.c(j14);
    }

    public static final long l(long j12, @Y61.k DurationUnit durationUnit) {
        if (j12 == f410652d) {
            return Long.MAX_VALUE;
        }
        if (j12 == f410653e) {
            return Long.MIN_VALUE;
        }
        return durationUnit.f410640b.convert(j12 >> 1, ((((int) j12) & 1) == 0 ? DurationUnit.f410631c : DurationUnit.f410633e).f410640b);
    }

    @Y61.k
    public static String m(long j12) {
        if (j12 == 0) {
            return "0s";
        }
        if (j12 == f410652d) {
            return "Infinity";
        }
        if (j12 == f410653e) {
            return "-Infinity";
        }
        int i12 = 0;
        boolean z12 = j12 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z12) {
            sb2.append('-');
        }
        if (j12 < 0) {
            j12 = n(j12);
        }
        long jL2 = l(j12, DurationUnit.f410637i);
        int iL2 = j(j12) ? 0 : (int) (l(j12, DurationUnit.f410636h) % 24);
        int iF2 = f(j12);
        int i13 = i(j12);
        int iH2 = h(j12);
        boolean z13 = jL2 != 0;
        boolean z14 = iL2 != 0;
        boolean z15 = iF2 != 0;
        boolean z16 = (i13 == 0 && iH2 == 0) ? false : true;
        if (z13) {
            sb2.append(jL2);
            sb2.append('d');
            i12 = 1;
        }
        if (z14 || (z13 && (z15 || z16))) {
            int i14 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            sb2.append(iL2);
            sb2.append('h');
            i12 = i14;
        }
        if (z15 || (z16 && (z14 || z13))) {
            int i15 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            sb2.append(iF2);
            sb2.append('m');
            i12 = i15;
        }
        if (z16) {
            int i16 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            if (i13 != 0 || z13 || z14 || z15) {
                b(sb2, i13, iH2, 9, "s", false);
            } else if (iH2 >= 1000000) {
                b(sb2, iH2 / 1000000, iH2 % 1000000, 6, "ms", false);
            } else if (iH2 >= 1000) {
                b(sb2, iH2 / 1000, iH2 % 1000, 3, "us", false);
            } else {
                sb2.append(iH2);
                sb2.append("ns");
            }
            i12 = i16;
        }
        if (z12 && i12 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final long n(long j12) {
        long j13 = ((-(j12 >> 1)) << 1) + (((int) j12) & 1);
        int i12 = f.f410655a;
        return j13;
    }

    @Override // java.lang.Comparable
    public final int compareTo(e eVar) {
        return d(this.f410654b, eVar.f410654b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f410654b == ((e) obj).f410654b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f410654b);
    }

    @Y61.k
    public final String toString() {
        return m(this.f410654b);
    }
}
