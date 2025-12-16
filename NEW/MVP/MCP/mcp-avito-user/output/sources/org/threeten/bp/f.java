package org.threeten.bp;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.a;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* compiled from: LocalDateTime.java */
/* loaded from: classes8.dex */
public final class f extends org.threeten.bp.chrono.d<e> implements org.threeten.bp.temporal.c, org.threeten.bp.temporal.e, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final f f421946d = G(e.f421939e, g.f422067f);

    /* renamed from: e, reason: collision with root package name */
    public static final f f421947e = G(e.f421940f, g.f422068g);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: b, reason: collision with root package name */
    public final e f421948b;

    /* renamed from: c, reason: collision with root package name */
    public final g f421949c;

    /* compiled from: LocalDateTime.java */
    public class a implements org.threeten.bp.temporal.j<f> {
        @Override // org.threeten.bp.temporal.j
        public final f a(org.threeten.bp.temporal.d dVar) {
            return f.B(dVar);
        }
    }

    /* compiled from: LocalDateTime.java */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421950a;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f421950a = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421950a[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421950a[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f421950a[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f421950a[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f421950a[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f421950a[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        new a();
    }

    public f(e eVar, g gVar) {
        this.f421948b = eVar;
        this.f421949c = gVar;
    }

    public static f B(org.threeten.bp.temporal.d dVar) {
        if (dVar instanceof f) {
            return (f) dVar;
        }
        if (dVar instanceof s) {
            return ((s) dVar).f422115b;
        }
        try {
            return new f(e.B(dVar), g.r(dVar));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName());
        }
    }

    public static f F() {
        a.c cVar = new a.c(o.r());
        d dVarA = cVar.a();
        return H(dVarA.f421935b, dVarA.f421936c, cVar.f421846b.o().a(dVarA));
    }

    public static f G(e eVar, g gVar) {
        w81.d.f(eVar, "date");
        w81.d.f(gVar, CrashHianalyticsData.TIME);
        return new f(eVar, gVar);
    }

    public static f H(long j12, int i12, q qVar) {
        w81.d.f(qVar, "offset");
        return new f(e.P(w81.d.c(j12 + qVar.f422109c, 86400L)), g.x(i12, w81.d.e(86400, r2)));
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 4, this);
    }

    public final String A(org.threeten.bp.format.c cVar) {
        w81.d.f(cVar, "formatter");
        return cVar.a(this);
    }

    public final boolean C(org.threeten.bp.chrono.d<?> dVar) {
        if (dVar instanceof f) {
            return z((f) dVar) > 0;
        }
        long jV2 = this.f421948b.v();
        long jV3 = dVar.u().v();
        return jV2 > jV3 || (jV2 == jV3 && this.f421949c.H() > dVar.v().H());
    }

    public final boolean E(org.threeten.bp.chrono.d<?> dVar) {
        if (dVar instanceof f) {
            return z((f) dVar) < 0;
        }
        long jV2 = this.f421948b.v();
        long jV3 = dVar.u().v();
        return jV2 < jV3 || (jV2 == jV3 && this.f421949c.H() < dVar.v().H());
    }

    @Override // org.threeten.bp.chrono.d
    /* renamed from: J, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final f r(long j12, org.threeten.bp.temporal.k kVar) {
        if (!(kVar instanceof ChronoUnit)) {
            return (f) kVar.a(this, j12);
        }
        switch (((ChronoUnit) kVar).ordinal()) {
            case 0:
                return N(this.f421948b, 0L, 0L, 0L, j12);
            case 1:
                f fVarK = K(j12 / 86400000000L);
                return fVarK.N(fVarK.f421948b, 0L, 0L, 0L, (j12 % 86400000000L) * 1000);
            case 2:
                f fVarK2 = K(j12 / 86400000);
                return fVarK2.N(fVarK2.f421948b, 0L, 0L, 0L, (j12 % 86400000) * 1000000);
            case 3:
                return L(j12);
            case 4:
                return N(this.f421948b, 0L, j12, 0L, 0L);
            case 5:
                return N(this.f421948b, j12, 0L, 0L, 0L);
            case 6:
                f fVarK3 = K(j12 / 256);
                return fVarK3.N(fVarK3.f421948b, (j12 % 256) * 12, 0L, 0L, 0L);
            default:
                return P(this.f421948b.n(j12, kVar), this.f421949c);
        }
    }

    public final f K(long j12) {
        return P(this.f421948b.S(j12), this.f421949c);
    }

    public final f L(long j12) {
        return N(this.f421948b, 0L, 0L, j12, 0L);
    }

    public final f N(e eVar, long j12, long j13, long j14, long j15) {
        long j16 = j12 | j13 | j14 | j15;
        g gVarW = this.f421949c;
        if (j16 == 0) {
            return P(eVar, gVarW);
        }
        long j17 = j12 / 24;
        long j18 = j17 + (j13 / 1440) + (j14 / 86400) + (j15 / 86400000000000L);
        long j19 = 1;
        long j22 = ((j12 % 24) * 3600000000000L) + ((j13 % 1440) * 60000000000L) + ((j14 % 86400) * 1000000000) + (j15 % 86400000000000L);
        long jH2 = gVarW.H();
        long j23 = (j22 * j19) + jH2;
        long jC2 = w81.d.c(j23, 86400000000000L) + (j18 * j19);
        long j24 = ((j23 % 86400000000000L) + 86400000000000L) % 86400000000000L;
        if (j24 != jH2) {
            gVarW = g.w(j24);
        }
        return P(eVar.S(jC2), gVarW);
    }

    @Override // org.threeten.bp.chrono.d
    /* renamed from: O, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final f w(long j12, org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return (f) hVar.a(this, j12);
        }
        boolean zK2 = ((ChronoField) hVar).k();
        g gVar = this.f421949c;
        e eVar = this.f421948b;
        return zK2 ? P(eVar, gVar.c(j12, hVar)) : P(eVar.c(j12, hVar), gVar);
    }

    public final f P(e eVar, g gVar) {
        return (this.f421948b == eVar && this.f421949c == gVar) ? this : new f(eVar, gVar);
    }

    @Override // org.threeten.bp.chrono.d
    /* renamed from: Q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final f x(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof e ? P((e) eVar, this.f421949c) : eVar instanceof g ? P(this.f421948b, (g) eVar) : eVar instanceof f ? (f) eVar : (f) eVar.a(this);
    }

    public final f R(int i12) {
        return P(this.f421948b, this.f421949c.L(i12));
    }

    public final f S(int i12) {
        g gVarP = this.f421949c;
        if (gVarP.f422073c != i12) {
            ChronoField.f422136m.i(i12);
            gVarP = g.p(gVarP.f422072b, i12, gVarP.f422074d, gVarP.f422075e);
        }
        return P(this.f421948b, gVarP);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final org.threeten.bp.temporal.l b(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? ((ChronoField) hVar).k() ? this.f421949c.b(hVar) : this.f421948b.b(hVar) : hVar.d(this);
    }

    @Override // org.threeten.bp.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f421948b.equals(fVar.f421948b) && this.f421949c.equals(fVar.f421949c);
    }

    @Override // org.threeten.bp.chrono.d, w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final <R> R f(org.threeten.bp.temporal.j<R> jVar) {
        return jVar == org.threeten.bp.temporal.i.f422203f ? (R) this.f421948b : (R) super.f(jVar);
    }

    @Override // org.threeten.bp.chrono.d
    public final int hashCode() {
        return this.f421948b.hashCode() ^ this.f421949c.hashCode();
    }

    @Override // org.threeten.bp.chrono.d, w81.AbstractC49470b, org.threeten.bp.temporal.c
    public final org.threeten.bp.temporal.c i(long j12, org.threeten.bp.temporal.k kVar) {
        ChronoUnit chronoUnit = (ChronoUnit) kVar;
        return j12 == Long.MIN_VALUE ? n(Long.MAX_VALUE, chronoUnit).n(1L, chronoUnit) : n(-j12, chronoUnit);
    }

    @Override // w81.AbstractC49471c, org.threeten.bp.temporal.d
    public final int k(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? ((ChronoField) hVar).k() ? this.f421949c.k(hVar) : this.f421948b.k(hVar) : super.k(hVar);
    }

    @Override // org.threeten.bp.temporal.d
    public final boolean l(org.threeten.bp.temporal.h hVar) {
        if (!(hVar instanceof ChronoField)) {
            return hVar != null && hVar.b(this);
        }
        ChronoField chronoField = (ChronoField) hVar;
        return chronoField.e() || chronoField.k();
    }

    @Override // org.threeten.bp.temporal.d
    public final long m(org.threeten.bp.temporal.h hVar) {
        return hVar instanceof ChronoField ? ((ChronoField) hVar).k() ? this.f421949c.m(hVar) : this.f421948b.m(hVar) : hVar.h(this);
    }

    @Override // org.threeten.bp.chrono.d
    public final org.threeten.bp.chrono.h o(o oVar) {
        return s.E(this, oVar, null);
    }

    @Override // org.threeten.bp.chrono.d, java.lang.Comparable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int compareTo(org.threeten.bp.chrono.d<?> dVar) {
        return dVar instanceof f ? z((f) dVar) : super.compareTo(dVar);
    }

    @Override // org.threeten.bp.chrono.d
    /* renamed from: q */
    public final org.threeten.bp.chrono.d i(long j12, ChronoUnit chronoUnit) {
        return j12 == Long.MIN_VALUE ? n(Long.MAX_VALUE, chronoUnit).n(1L, chronoUnit) : n(-j12, chronoUnit);
    }

    @Override // org.threeten.bp.chrono.d
    public final String toString() {
        return this.f421948b.toString() + 'T' + this.f421949c.toString();
    }

    @Override // org.threeten.bp.chrono.d
    public final org.threeten.bp.chrono.c u() {
        return this.f421948b;
    }

    @Override // org.threeten.bp.chrono.d
    public final g v() {
        return this.f421949c;
    }

    public final int z(f fVar) {
        int iZ2 = this.f421948b.z(fVar.f421948b);
        return iZ2 == 0 ? this.f421949c.compareTo(fVar.f421949c) : iZ2;
    }
}
