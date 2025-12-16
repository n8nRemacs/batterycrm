package org.threeten.bp.temporal;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.HashMap;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.chrono.o;
import org.threeten.bp.format.ResolverStyle;

/* compiled from: IsoFields.java */
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final h f422172a = b.f422178c;

    /* renamed from: b, reason: collision with root package name */
    public static final h f422173b = b.f422179d;

    /* renamed from: c, reason: collision with root package name */
    public static final h f422174c = b.f422180e;

    /* renamed from: d, reason: collision with root package name */
    public static final k f422175d = c.WEEK_BASED_YEARS;

    /* compiled from: IsoFields.java */
    /* renamed from: org.threeten.bp.temporal.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C12241a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f422176a;

        static {
            int[] iArr = new int[c.values().length];
            f422176a = iArr;
            try {
                iArr[c.WEEK_BASED_YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f422176a[c.QUARTER_YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IsoFields.java */
    public static abstract class b implements h {

        /* renamed from: b, reason: collision with root package name */
        public static final C12242a f422177b;

        /* renamed from: c, reason: collision with root package name */
        public static final C12243b f422178c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f422179d;

        /* renamed from: e, reason: collision with root package name */
        public static final d f422180e;

        /* renamed from: f, reason: collision with root package name */
        public static final int[] f422181f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ b[] f422182g;

        /* compiled from: IsoFields.java */
        /* renamed from: org.threeten.bp.temporal.a$b$a, reason: collision with other inner class name */
        public enum C12242a extends b {
            @Override // org.threeten.bp.temporal.h
            public final <R extends org.threeten.bp.temporal.c> R a(R r12, long j12) {
                long jH2 = h(r12);
                f().b(j12, this);
                ChronoField chronoField = ChronoField.f422147x;
                return (R) r12.w((j12 - jH2) + r12.m(chronoField), chronoField);
            }

            @Override // org.threeten.bp.temporal.h
            public final boolean b(org.threeten.bp.temporal.d dVar) {
                return dVar.l(ChronoField.f422147x) && dVar.l(ChronoField.f422120B) && dVar.l(ChronoField.f422123E) && org.threeten.bp.chrono.j.i(dVar).equals(o.f421908d);
            }

            @Override // org.threeten.bp.temporal.a.b, org.threeten.bp.temporal.h
            public final org.threeten.bp.temporal.d c(HashMap map, org.threeten.bp.temporal.d dVar, ResolverStyle resolverStyle) {
                org.threeten.bp.e eVarS;
                ChronoField chronoField = ChronoField.f422123E;
                Long l12 = (Long) map.get(chronoField);
                h hVar = b.f422178c;
                Long l13 = (Long) map.get(hVar);
                if (l12 == null || l13 == null) {
                    return null;
                }
                int iA2 = chronoField.f422152d.a(l12.longValue(), chronoField);
                long jLongValue = ((Long) map.get(b.f422177b)).longValue();
                if (resolverStyle == ResolverStyle.f421955d) {
                    eVarS = org.threeten.bp.e.N(iA2, 1, 1).T(w81.d.i(3, w81.d.l(l13.longValue(), 1L))).S(w81.d.l(jLongValue, 1L));
                } else {
                    int iA3 = hVar.f().a(l13.longValue(), hVar);
                    if (resolverStyle == ResolverStyle.f421953b) {
                        int i12 = 91;
                        if (iA3 == 1) {
                            o.f421908d.getClass();
                            if (!o.r(iA2)) {
                                i12 = 90;
                            }
                        } else if (iA3 != 2) {
                            i12 = 92;
                        }
                        l.d(1L, i12).b(jLongValue, this);
                    } else {
                        f().b(jLongValue, this);
                    }
                    eVarS = org.threeten.bp.e.N(iA2, H.b(iA3, 1, 3, 1), 1).S(jLongValue - 1);
                }
                map.remove(this);
                map.remove(chronoField);
                map.remove(hVar);
                return eVarS;
            }

            @Override // org.threeten.bp.temporal.a.b, org.threeten.bp.temporal.h
            public final l d(org.threeten.bp.temporal.d dVar) {
                if (!dVar.l(this)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                long jM2 = dVar.m(b.f422178c);
                if (jM2 != 1) {
                    return jM2 == 2 ? l.d(1L, 91L) : (jM2 == 3 || jM2 == 4) ? l.d(1L, 92L) : f();
                }
                long jM3 = dVar.m(ChronoField.f422123E);
                o.f421908d.getClass();
                return o.r(jM3) ? l.d(1L, 91L) : l.d(1L, 90L);
            }

            @Override // org.threeten.bp.temporal.h
            public final l f() {
                return l.e(1L, 1L, 90L, 92L);
            }

            @Override // org.threeten.bp.temporal.h
            public final long h(org.threeten.bp.temporal.d dVar) {
                if (!dVar.l(this)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                int iK2 = dVar.k(ChronoField.f422147x);
                int iK3 = dVar.k(ChronoField.f422120B);
                long jM2 = dVar.m(ChronoField.f422123E);
                int i12 = (iK3 - 1) / 3;
                o.f421908d.getClass();
                return iK2 - b.f422181f[i12 + (o.r(jM2) ? 4 : 0)];
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        }

        /* compiled from: IsoFields.java */
        /* renamed from: org.threeten.bp.temporal.a$b$b, reason: collision with other inner class name */
        public enum C12243b extends b {
            @Override // org.threeten.bp.temporal.h
            public final <R extends org.threeten.bp.temporal.c> R a(R r12, long j12) {
                long jH2 = h(r12);
                f().b(j12, this);
                ChronoField chronoField = ChronoField.f422120B;
                return (R) r12.w(((j12 - jH2) * 3) + r12.m(chronoField), chronoField);
            }

            @Override // org.threeten.bp.temporal.h
            public final boolean b(org.threeten.bp.temporal.d dVar) {
                return dVar.l(ChronoField.f422120B) && org.threeten.bp.chrono.j.i(dVar).equals(o.f421908d);
            }

            @Override // org.threeten.bp.temporal.h
            public final l f() {
                return l.d(1L, 4L);
            }

            @Override // org.threeten.bp.temporal.h
            public final long h(org.threeten.bp.temporal.d dVar) {
                if (dVar.l(this)) {
                    return (dVar.m(ChronoField.f422120B) + 2) / 3;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        }

        /* compiled from: IsoFields.java */
        public enum c extends b {
            @Override // org.threeten.bp.temporal.h
            public final <R extends org.threeten.bp.temporal.c> R a(R r12, long j12) {
                f().b(j12, this);
                return (R) r12.r(w81.d.l(j12, h(r12)), ChronoUnit.WEEKS);
            }

            @Override // org.threeten.bp.temporal.h
            public final boolean b(org.threeten.bp.temporal.d dVar) {
                return dVar.l(ChronoField.f422148y) && org.threeten.bp.chrono.j.i(dVar).equals(o.f421908d);
            }

            @Override // org.threeten.bp.temporal.a.b, org.threeten.bp.temporal.h
            public final org.threeten.bp.temporal.d c(HashMap map, org.threeten.bp.temporal.d dVar, ResolverStyle resolverStyle) {
                Object obj;
                org.threeten.bp.e eVarC;
                long j12;
                d dVar2 = b.f422180e;
                Long l12 = (Long) map.get(dVar2);
                ChronoField chronoField = ChronoField.f422143t;
                Long l13 = (Long) map.get(chronoField);
                if (l12 == null || l13 == null) {
                    return null;
                }
                dVar2.getClass();
                int iA2 = ChronoField.f422123E.f422152d.a(l12.longValue(), dVar2);
                long jLongValue = ((Long) map.get(b.f422179d)).longValue();
                if (resolverStyle == ResolverStyle.f421955d) {
                    long jLongValue2 = l13.longValue();
                    if (jLongValue2 > 7) {
                        long j13 = jLongValue2 - 1;
                        j12 = j13 / 7;
                        jLongValue2 = (j13 % 7) + 1;
                    } else if (jLongValue2 < 1) {
                        j12 = (jLongValue2 / 7) - 1;
                        jLongValue2 = (jLongValue2 % 7) + 7;
                    } else {
                        j12 = 0;
                    }
                    obj = dVar2;
                    eVarC = org.threeten.bp.e.N(iA2, 1, 4).U(jLongValue - 1).U(j12).c(jLongValue2, chronoField);
                } else {
                    obj = dVar2;
                    int iA3 = chronoField.f422152d.a(l13.longValue(), chronoField);
                    if (resolverStyle == ResolverStyle.f421953b) {
                        b.m(org.threeten.bp.e.N(iA2, 1, 4)).b(jLongValue, this);
                    } else {
                        f().b(jLongValue, this);
                    }
                    eVarC = org.threeten.bp.e.N(iA2, 1, 4).U(jLongValue - 1).c(iA3, chronoField);
                }
                map.remove(this);
                map.remove(obj);
                map.remove(chronoField);
                return eVarC;
            }

            @Override // org.threeten.bp.temporal.a.b, org.threeten.bp.temporal.h
            public final l d(org.threeten.bp.temporal.d dVar) {
                if (dVar.l(this)) {
                    return b.m(org.threeten.bp.e.B(dVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // org.threeten.bp.temporal.h
            public final l f() {
                return l.e(1L, 1L, 52L, 53L);
            }

            @Override // org.threeten.bp.temporal.h
            public final long h(org.threeten.bp.temporal.d dVar) {
                if (dVar.l(this)) {
                    return b.i(org.threeten.bp.e.B(dVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        }

        /* compiled from: IsoFields.java */
        public enum d extends b {
            @Override // org.threeten.bp.temporal.h
            public final <R extends org.threeten.bp.temporal.c> R a(R r12, long j12) {
                if (!b(r12)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
                }
                int iA2 = ChronoField.f422123E.f422152d.a(j12, b.f422180e);
                org.threeten.bp.e eVarB = org.threeten.bp.e.B(r12);
                int iK2 = eVarB.k(ChronoField.f422143t);
                int i12 = b.i(eVarB);
                if (i12 == 53 && b.l(iA2) == 52) {
                    i12 = 52;
                }
                return (R) r12.x(org.threeten.bp.e.N(iA2, 1, 4).S(H.b(i12, 1, 7, iK2 - r6.k(r0))));
            }

            @Override // org.threeten.bp.temporal.h
            public final boolean b(org.threeten.bp.temporal.d dVar) {
                return dVar.l(ChronoField.f422148y) && org.threeten.bp.chrono.j.i(dVar).equals(o.f421908d);
            }

            @Override // org.threeten.bp.temporal.a.b, org.threeten.bp.temporal.h
            public final l d(org.threeten.bp.temporal.d dVar) {
                return ChronoField.f422123E.f422152d;
            }

            @Override // org.threeten.bp.temporal.h
            public final l f() {
                return ChronoField.f422123E.f422152d;
            }

            @Override // org.threeten.bp.temporal.h
            public final long h(org.threeten.bp.temporal.d dVar) {
                if (dVar.l(this)) {
                    return b.k(org.threeten.bp.e.B(dVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        }

        static {
            C12242a c12242a = new C12242a("DAY_OF_QUARTER", 0, null);
            f422177b = c12242a;
            C12243b c12243b = new C12243b("QUARTER_OF_YEAR", 1, null);
            f422178c = c12243b;
            c cVar = new c("WEEK_OF_WEEK_BASED_YEAR", 2, null);
            f422179d = cVar;
            d dVar = new d("WEEK_BASED_YEAR", 3, null);
            f422180e = dVar;
            f422182g = new b[]{c12242a, c12243b, cVar, dVar};
            f422181f = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        public b() {
            throw null;
        }

        public b(String str, int i12, C12241a c12241a) {
        }

        public static int i(org.threeten.bp.e eVar) {
            int iOrdinal = eVar.E().ordinal();
            int i12 = 1;
            int iF2 = eVar.F() - 1;
            int i13 = (3 - iOrdinal) + iF2;
            int i14 = i13 - ((i13 / 7) * 7);
            int i15 = i14 - 3;
            if (i15 < -3) {
                i15 = i14 + 4;
            }
            if (iF2 < i15) {
                if (eVar.F() != 180) {
                    eVar = org.threeten.bp.e.Q(eVar.f421941b, 180);
                }
                return (int) m(eVar.V(-1L)).f422208e;
            }
            int iF3 = r.f(iF2, i15, 7, 1);
            if (iF3 != 53 || i15 == -3 || (i15 == -2 && eVar.H())) {
                i12 = iF3;
            }
            return i12;
        }

        public static int k(org.threeten.bp.e eVar) {
            int i12 = eVar.f421941b;
            int iF2 = eVar.F();
            if (iF2 <= 3) {
                return iF2 - eVar.E().ordinal() < -2 ? i12 - 1 : i12;
            }
            if (iF2 >= 363) {
                return ((iF2 - 363) - (eVar.H() ? 1 : 0)) - eVar.E().ordinal() >= 0 ? i12 + 1 : i12;
            }
            return i12;
        }

        public static int l(int i12) {
            org.threeten.bp.e eVarN = org.threeten.bp.e.N(i12, 1, 1);
            if (eVarN.E() != DayOfWeek.f421838d) {
                return (eVarN.E() == DayOfWeek.f421837c && eVarN.H()) ? 53 : 52;
            }
            return 53;
        }

        public static l m(org.threeten.bp.e eVar) {
            return l.d(1L, l(k(eVar)));
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f422182g.clone();
        }

        @Override // org.threeten.bp.temporal.h
        public org.threeten.bp.temporal.d c(HashMap map, org.threeten.bp.temporal.d dVar, ResolverStyle resolverStyle) {
            return null;
        }

        @Override // org.threeten.bp.temporal.h
        public l d(org.threeten.bp.temporal.d dVar) {
            return f();
        }

        @Override // org.threeten.bp.temporal.h
        public final boolean e() {
            return true;
        }
    }

    /* compiled from: IsoFields.java */
    public enum c implements k {
        WEEK_BASED_YEARS("WeekBasedYears", org.threeten.bp.c.b(0, 31556952)),
        QUARTER_YEARS("QuarterYears", org.threeten.bp.c.b(0, 7889238));


        /* renamed from: b, reason: collision with root package name */
        public final String f422186b;

        c(String str, org.threeten.bp.c cVar) {
            this.f422186b = str;
        }

        @Override // org.threeten.bp.temporal.k
        public final <R extends org.threeten.bp.temporal.c> R a(R r12, long j12) {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return (R) r12.w(w81.d.h(r12.k(r0), j12), a.f422174c);
            }
            if (iOrdinal == 1) {
                return (R) r12.r(j12 / 256, ChronoUnit.YEARS).r((j12 % 256) * 3, ChronoUnit.MONTHS);
            }
            throw new IllegalStateException("Unreachable");
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f422186b;
        }
    }

    public a() {
        throw new AssertionError("Not instantiable");
    }
}
