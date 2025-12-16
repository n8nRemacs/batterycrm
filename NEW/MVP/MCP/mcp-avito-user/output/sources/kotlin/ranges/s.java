package kotlin.ranges;

import androidx.compose.foundation.H;
import java.util.Date;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.ranges.j;
import kotlin.ranges.m;

@Metadata(d1 = {"kotlin/ranges/t", "kotlin/ranges/u"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 49)
/* loaded from: classes8.dex */
public final class s extends u {
    public static float a(float f12, float f13) {
        return f12 < f13 ? f13 : f12;
    }

    public static long b(long j12, long j13) {
        return j12 < j13 ? j13 : j12;
    }

    public static float c(float f12, float f13) {
        return f12 > f13 ? f13 : f12;
    }

    public static long d(long j12, long j13) {
        return j12 > j13 ? j13 : j12;
    }

    public static double e(double d12, double d13, double d14) {
        if (d13 <= d14) {
            return d12 < d13 ? d13 : d12 > d14 ? d14 : d12;
        }
        StringBuilder sb2 = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb2.append(d14);
        sb2.append(" is less than minimum ");
        throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.o(sb2, d13, '.'));
    }

    public static float f(float f12, float f13, float f14) {
        if (f13 <= f14) {
            return f12 < f13 ? f13 : f12 > f14 ? f14 : f12;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f14 + " is less than minimum " + f13 + '.');
    }

    public static int g(int i12, int i13, int i14) {
        if (i13 <= i14) {
            return i12 < i13 ? i13 : i12 > i14 ? i14 : i12;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i14 + " is less than minimum " + i13 + '.');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int h(@Y61.k l lVar, int i12) {
        if (lVar instanceof f) {
            return ((Number) j(Integer.valueOf(i12), (f) lVar)).intValue();
        }
        if (lVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + lVar + '.');
        }
        int i13 = lVar.f406905b;
        if (i12 < Integer.valueOf(i13).intValue()) {
            i12 = Integer.valueOf(i13).intValue();
        } else {
            int i14 = lVar.f406906c;
            if (i12 > Integer.valueOf(i14).intValue()) {
                i12 = Integer.valueOf(i14).intValue();
            }
        }
        return i12;
    }

    public static long i(long j12, long j13, long j14) {
        if (j13 <= j14) {
            return j12 < j13 ? j13 : j12 > j14 ? j14 : j12;
        }
        throw new IllegalArgumentException(androidx.appcompat.app.r.u(H.q(j14, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j13, '.'));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Comparable] */
    @InterfaceC42733c0
    @Y61.k
    public static Comparable j(@Y61.k Comparable comparable, @Y61.k f fVar) {
        if (!fVar.isEmpty()) {
            return (!fVar.a(comparable, fVar.d()) || fVar.a(fVar.d(), comparable)) ? (!fVar.a(fVar.g(), comparable) || fVar.a(comparable, fVar.g())) ? comparable : fVar.g() : fVar.d();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fVar + '.');
    }

    @Y61.k
    public static j k(int i12, int i13) {
        j.f406904e.getClass();
        return new j(i12, i13, -1);
    }

    @InterfaceC42733c0
    @Y61.k
    public static f l(double d12, double d13) {
        return new d(d12, d13);
    }

    @InterfaceC42733c0
    @Y61.k
    public static f m(float f12, float f13) {
        return new e(f12, f13);
    }

    @Y61.k
    public static g n(@Y61.k Date date, @Y61.k Date date2) {
        return new i(date, date2);
    }

    @Y61.k
    public static j o(@Y61.k l lVar) {
        j.a aVar = j.f406904e;
        int i12 = -lVar.f406907d;
        aVar.getClass();
        return new j(lVar.f406906c, lVar.f406905b, i12);
    }

    @Y61.k
    public static j p(@Y61.k l lVar, int i12) {
        boolean z12 = i12 > 0;
        Integer numValueOf = Integer.valueOf(i12);
        if (!z12) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        j.a aVar = j.f406904e;
        if (lVar.f406907d <= 0) {
            i12 = -i12;
        }
        aVar.getClass();
        return new j(lVar.f406905b, lVar.f406906c, i12);
    }

    @Y61.k
    public static m q(@Y61.k o oVar) {
        m.a aVar = m.f406914e;
        long j12 = oVar.f406917d > 0 ? 900L : -900L;
        aVar.getClass();
        return new m(oVar.f406915b, oVar.f406916c, j12);
    }

    @Y61.k
    public static l r(int i12, int i13) {
        if (i13 > Integer.MIN_VALUE) {
            return new l(i12, i13 - 1, 1);
        }
        l.f406912f.getClass();
        return l.f406913g;
    }
}
