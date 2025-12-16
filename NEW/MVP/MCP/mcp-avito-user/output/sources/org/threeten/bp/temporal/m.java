package org.threeten.bp.temporal;

import androidx.appcompat.app.r;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.format.ResolverStyle;

/* compiled from: WeekFields.java */
/* loaded from: classes15.dex */
public final class m implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final ConcurrentHashMap f422209h = new ConcurrentHashMap(4, 0.75f, 2);
    private static final long serialVersionUID = -1177360819670808121L;

    /* renamed from: b, reason: collision with root package name */
    public final DayOfWeek f422210b;

    /* renamed from: c, reason: collision with root package name */
    public final int f422211c;

    /* renamed from: d, reason: collision with root package name */
    public final transient h f422212d;

    /* renamed from: e, reason: collision with root package name */
    public final transient h f422213e;

    /* renamed from: f, reason: collision with root package name */
    public final transient h f422214f;

    /* renamed from: g, reason: collision with root package name */
    public final transient h f422215g;

    /* compiled from: WeekFields.java */
    public static class a implements h {

        /* renamed from: g, reason: collision with root package name */
        public static final l f422216g = l.d(1, 7);

        /* renamed from: h, reason: collision with root package name */
        public static final l f422217h = l.e(0, 1, 4, 6);

        /* renamed from: i, reason: collision with root package name */
        public static final l f422218i;

        /* renamed from: j, reason: collision with root package name */
        public static final l f422219j;

        /* renamed from: b, reason: collision with root package name */
        public final String f422220b;

        /* renamed from: c, reason: collision with root package name */
        public final m f422221c;

        /* renamed from: d, reason: collision with root package name */
        public final Enum f422222d;

        /* renamed from: e, reason: collision with root package name */
        public final Enum f422223e;

        /* renamed from: f, reason: collision with root package name */
        public final l f422224f;

        static {
            l.e(0L, 1L, 52L, 54L);
            f422218i = l.e(1L, 1L, 52L, 53L);
            f422219j = ChronoField.f422123E.f422152d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, m mVar, k kVar, k kVar2, l lVar) {
            this.f422220b = str;
            this.f422221c = mVar;
            this.f422222d = (Enum) kVar;
            this.f422223e = (Enum) kVar2;
            this.f422224f = lVar;
        }

        public static int g(int i12, int i13) {
            return ((i13 - 1) + (i12 + 7)) / 7;
        }

        public static int i(org.threeten.bp.chrono.c cVar, int i12) {
            return w81.d.d(cVar.k(ChronoField.f422143t) - i12, 7) + 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Enum, org.threeten.bp.temporal.k] */
        @Override // org.threeten.bp.temporal.h
        public final <R extends c> R a(R r12, long j12) {
            int iA2 = this.f422224f.a(j12, this);
            if (iA2 == r12.k(this)) {
                return r12;
            }
            if (this.f422223e != ChronoUnit.FOREVER) {
                return (R) r12.r(iA2 - r1, this.f422222d);
            }
            m mVar = this.f422221c;
            int iK2 = r12.k(mVar.f422214f);
            long j13 = (long) ((j12 - r1) * 52.1775d);
            ChronoUnit chronoUnit = ChronoUnit.WEEKS;
            c cVarR = r12.r(j13, chronoUnit);
            int iK3 = cVarR.k(this);
            h hVar = mVar.f422214f;
            if (iK3 > iA2) {
                return (R) cVarR.i(cVarR.k(hVar), chronoUnit);
            }
            if (cVarR.k(this) < iA2) {
                cVarR = cVarR.r(2L, chronoUnit);
            }
            R r13 = (R) cVarR.r(iK2 - cVarR.k(hVar), chronoUnit);
            return r13.k(this) > iA2 ? (R) r13.i(1L, chronoUnit) : r13;
        }

        @Override // org.threeten.bp.temporal.h
        public final boolean b(d dVar) {
            if (!dVar.l(ChronoField.f422143t)) {
                return false;
            }
            ChronoUnit chronoUnit = ChronoUnit.WEEKS;
            Enum r12 = this.f422223e;
            if (r12 == chronoUnit) {
                return true;
            }
            if (r12 == ChronoUnit.MONTHS) {
                return dVar.l(ChronoField.f422146w);
            }
            if (r12 == ChronoUnit.YEARS) {
                return dVar.l(ChronoField.f422147x);
            }
            if (r12 == org.threeten.bp.temporal.a.f422175d) {
                return dVar.l(ChronoField.f422148y);
            }
            if (r12 == ChronoUnit.FOREVER) {
                return dVar.l(ChronoField.f422148y);
            }
            return false;
        }

        @Override // org.threeten.bp.temporal.h
        public final d c(HashMap map, d dVar, ResolverStyle resolverStyle) {
            long j12;
            int i12;
            long jA2;
            Object obj;
            org.threeten.bp.chrono.c cVarA;
            int i13;
            int iG2;
            org.threeten.bp.chrono.c cVarA2;
            long jA3;
            int i14;
            long j13;
            m mVar = this.f422221c;
            int iD2 = mVar.f422210b.d();
            ChronoUnit chronoUnit = ChronoUnit.WEEKS;
            Enum r62 = this.f422223e;
            l lVar = this.f422224f;
            if (r62 == chronoUnit) {
                map.put(ChronoField.f422143t, Long.valueOf(w81.d.d((lVar.a(((Long) map.remove(this)).longValue(), this) - 1) + (iD2 - 1), 7) + 1));
                return null;
            }
            ChronoField chronoField = ChronoField.f422143t;
            if (!map.containsKey(chronoField)) {
                return null;
            }
            ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
            ResolverStyle resolverStyle2 = ResolverStyle.f421953b;
            ResolverStyle resolverStyle3 = ResolverStyle.f421955d;
            if (r62 == chronoUnit2) {
                h hVar = mVar.f422214f;
                if (!map.containsKey(hVar)) {
                    return null;
                }
                org.threeten.bp.chrono.j jVarI = org.threeten.bp.chrono.j.i(dVar);
                int iD3 = w81.d.d(chronoField.f422152d.a(((Long) map.get(chronoField)).longValue(), chronoField) - iD2, 7) + 1;
                int iA2 = lVar.a(((Long) map.get(this)).longValue(), this);
                int i15 = mVar.f422211c;
                if (resolverStyle == resolverStyle3) {
                    cVarA2 = jVarI.a(iA2, 1, i15);
                    jA3 = ((Long) map.get(hVar)).longValue();
                    i14 = i(cVarA2, iD2);
                    j13 = j(cVarA2, i14);
                } else {
                    cVarA2 = jVarI.a(iA2, 1, i15);
                    jA3 = ((a) hVar).f422224f.a(((Long) map.get(hVar)).longValue(), hVar);
                    i14 = i(cVarA2, iD2);
                    j13 = j(cVarA2, i14);
                }
                org.threeten.bp.chrono.c cVarR = cVarA2.r(((jA3 - j13) * 7) + (iD3 - i14), ChronoUnit.DAYS);
                if (resolverStyle == resolverStyle2 && cVarR.m(this) != ((Long) map.get(this)).longValue()) {
                    throw new DateTimeException("Strict mode rejected date parsed to a different year");
                }
                map.remove(this);
                map.remove(hVar);
                map.remove(chronoField);
                return cVarR;
            }
            ChronoField chronoField2 = ChronoField.f422123E;
            if (!map.containsKey(chronoField2)) {
                return null;
            }
            int iD4 = w81.d.d(chronoField.f422152d.a(((Long) map.get(chronoField)).longValue(), chronoField) - iD2, 7) + 1;
            int iA3 = chronoField2.f422152d.a(((Long) map.get(chronoField2)).longValue(), chronoField2);
            org.threeten.bp.chrono.j jVarI2 = org.threeten.bp.chrono.j.i(dVar);
            ChronoUnit chronoUnit3 = ChronoUnit.MONTHS;
            if (r62 != chronoUnit3) {
                if (r62 != ChronoUnit.YEARS) {
                    throw new IllegalStateException("unreachable");
                }
                long jLongValue = ((Long) map.remove(this)).longValue();
                org.threeten.bp.chrono.c cVarA3 = jVarI2.a(iA3, 1, 1);
                if (resolverStyle == resolverStyle3) {
                    i12 = i(cVarA3, iD2);
                    jA2 = jLongValue - j(cVarA3, i12);
                    j12 = 7;
                } else {
                    j12 = 7;
                    i12 = i(cVarA3, iD2);
                    jA2 = lVar.a(jLongValue, this) - j(cVarA3, i12);
                }
                org.threeten.bp.chrono.c cVarR2 = cVarA3.r((jA2 * j12) + (iD4 - i12), ChronoUnit.DAYS);
                if (resolverStyle == resolverStyle2 && cVarR2.m(chronoField2) != ((Long) map.get(chronoField2)).longValue()) {
                    throw new DateTimeException("Strict mode rejected date parsed to a different year");
                }
                map.remove(this);
                map.remove(chronoField2);
                map.remove(chronoField);
                return cVarR2;
            }
            ChronoField chronoField3 = ChronoField.f422120B;
            if (!map.containsKey(chronoField3)) {
                return null;
            }
            long jLongValue2 = ((Long) map.remove(this)).longValue();
            if (resolverStyle == resolverStyle3) {
                obj = chronoField;
                cVarA = jVarI2.a(iA3, 1, 1).r(((Long) map.get(chronoField3)).longValue() - 1, chronoUnit3);
                i13 = i(cVarA, iD2);
                int iK2 = cVarA.k(ChronoField.f422146w);
                iG2 = g(l(iK2, i13), iK2);
            } else {
                obj = chronoField;
                cVarA = jVarI2.a(iA3, chronoField3.f422152d.a(((Long) map.get(chronoField3)).longValue(), chronoField3), 8);
                i13 = i(cVarA, iD2);
                jLongValue2 = lVar.a(jLongValue2, this);
                int iK3 = cVarA.k(ChronoField.f422146w);
                iG2 = g(l(iK3, i13), iK3);
            }
            org.threeten.bp.chrono.c cVarR3 = cVarA.r(((jLongValue2 - iG2) * 7) + (iD4 - i13), ChronoUnit.DAYS);
            if (resolverStyle == resolverStyle2 && cVarR3.m(chronoField3) != ((Long) map.get(chronoField3)).longValue()) {
                throw new DateTimeException("Strict mode rejected date parsed to a different month");
            }
            map.remove(this);
            map.remove(chronoField2);
            map.remove(chronoField3);
            map.remove(obj);
            return cVarR3;
        }

        @Override // org.threeten.bp.temporal.h
        public final l d(d dVar) {
            ChronoField chronoField;
            ChronoUnit chronoUnit = ChronoUnit.WEEKS;
            Enum r12 = this.f422223e;
            if (r12 == chronoUnit) {
                return this.f422224f;
            }
            if (r12 == ChronoUnit.MONTHS) {
                chronoField = ChronoField.f422146w;
            } else {
                if (r12 != ChronoUnit.YEARS) {
                    if (r12 == org.threeten.bp.temporal.a.f422175d) {
                        return k(dVar);
                    }
                    if (r12 == ChronoUnit.FOREVER) {
                        return dVar.b(ChronoField.f422123E);
                    }
                    throw new IllegalStateException("unreachable");
                }
                chronoField = ChronoField.f422147x;
            }
            int iL2 = l(dVar.k(chronoField), w81.d.d(dVar.k(ChronoField.f422143t) - this.f422221c.f422210b.d(), 7) + 1);
            l lVarB = dVar.b(chronoField);
            return l.d(g(iL2, (int) lVarB.f422205b), g(iL2, (int) lVarB.f422208e));
        }

        @Override // org.threeten.bp.temporal.h
        public final boolean e() {
            return true;
        }

        @Override // org.threeten.bp.temporal.h
        public final l f() {
            return this.f422224f;
        }

        @Override // org.threeten.bp.temporal.h
        public final long h(d dVar) {
            int iJ2;
            int iG2;
            m mVar = this.f422221c;
            int iD2 = mVar.f422210b.d();
            ChronoField chronoField = ChronoField.f422143t;
            int iD3 = w81.d.d(dVar.k(chronoField) - iD2, 7) + 1;
            ChronoUnit chronoUnit = ChronoUnit.WEEKS;
            Enum r52 = this.f422223e;
            if (r52 == chronoUnit) {
                return iD3;
            }
            if (r52 == ChronoUnit.MONTHS) {
                int iK2 = dVar.k(ChronoField.f422146w);
                iG2 = g(l(iK2, iD3), iK2);
            } else {
                if (r52 != ChronoUnit.YEARS) {
                    k kVar = org.threeten.bp.temporal.a.f422175d;
                    int i12 = mVar.f422211c;
                    DayOfWeek dayOfWeek = mVar.f422210b;
                    if (r52 == kVar) {
                        int iD4 = w81.d.d(dVar.k(chronoField) - dayOfWeek.d(), 7) + 1;
                        long j12 = j(dVar, iD4);
                        if (j12 == 0) {
                            iJ2 = ((int) j(org.threeten.bp.chrono.j.i(dVar).b(dVar).i(1L, chronoUnit), iD4)) + 1;
                        } else {
                            if (j12 >= 53) {
                                if (j12 >= g(l(dVar.k(ChronoField.f422147x), iD4), (org.threeten.bp.m.p((long) dVar.k(ChronoField.f422123E)) ? 366 : 365) + i12)) {
                                    j12 -= r14 - 1;
                                }
                            }
                            iJ2 = (int) j12;
                        }
                        return iJ2;
                    }
                    if (r52 != ChronoUnit.FOREVER) {
                        throw new IllegalStateException("unreachable");
                    }
                    int iD5 = w81.d.d(dVar.k(chronoField) - dayOfWeek.d(), 7) + 1;
                    int iK3 = dVar.k(ChronoField.f422123E);
                    long j13 = j(dVar, iD5);
                    if (j13 == 0) {
                        iK3--;
                    } else if (j13 >= 53) {
                        if (j13 >= g(l(dVar.k(ChronoField.f422147x), iD5), (org.threeten.bp.m.p((long) iK3) ? 366 : 365) + i12)) {
                            iK3++;
                        }
                    }
                    return iK3;
                }
                int iK4 = dVar.k(ChronoField.f422147x);
                iG2 = g(l(iK4, iD3), iK4);
            }
            return iG2;
        }

        public final long j(d dVar, int i12) {
            int iK2 = dVar.k(ChronoField.f422147x);
            return g(l(iK2, i12), iK2);
        }

        public final l k(d dVar) {
            m mVar = this.f422221c;
            int iD2 = w81.d.d(dVar.k(ChronoField.f422143t) - mVar.f422210b.d(), 7) + 1;
            long j12 = j(dVar, iD2);
            if (j12 == 0) {
                return k(org.threeten.bp.chrono.j.i(dVar).b(dVar).i(2L, ChronoUnit.WEEKS));
            }
            return j12 >= ((long) g(l(dVar.k(ChronoField.f422147x), iD2), (org.threeten.bp.m.p((long) dVar.k(ChronoField.f422123E)) ? 366 : 365) + mVar.f422211c)) ? k(org.threeten.bp.chrono.j.i(dVar).b(dVar).r(2L, ChronoUnit.WEEKS)) : l.d(1L, r0 - 1);
        }

        public final int l(int i12, int i13) {
            int iD2 = w81.d.d(i12 - i13, 7);
            return iD2 + 1 > this.f422221c.f422211c ? 7 - iD2 : -iD2;
        }

        public final String toString() {
            return this.f422220b + "[" + this.f422221c.toString() + "]";
        }
    }

    static {
        new m(DayOfWeek.f421836b, 4);
        b(DayOfWeek.f421839e, 1);
    }

    public m(DayOfWeek dayOfWeek, int i12) {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.WEEKS;
        this.f422212d = new a("DayOfWeek", this, chronoUnit, chronoUnit2, a.f422216g);
        this.f422213e = new a("WeekOfMonth", this, chronoUnit2, ChronoUnit.MONTHS, a.f422217h);
        k kVar = org.threeten.bp.temporal.a.f422175d;
        this.f422214f = new a("WeekOfWeekBasedYear", this, chronoUnit2, kVar, a.f422218i);
        this.f422215g = new a("WeekBasedYear", this, kVar, ChronoUnit.FOREVER, a.f422219j);
        w81.d.f(dayOfWeek, "firstDayOfWeek");
        if (i12 < 1 || i12 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f422210b = dayOfWeek;
        this.f422211c = i12;
    }

    public static m a(Locale locale) {
        w81.d.f(locale, "locale");
        return b(DayOfWeek.f421840f[(((int) ((r4.getFirstDayOfWeek() - 1) % 7)) + 13) % 7], new GregorianCalendar(new Locale(locale.getLanguage(), locale.getCountry())).getMinimalDaysInFirstWeek());
    }

    public static m b(DayOfWeek dayOfWeek, int i12) {
        String str = dayOfWeek.toString() + i12;
        ConcurrentHashMap concurrentHashMap = f422209h;
        m mVar = (m) concurrentHashMap.get(str);
        if (mVar != null) {
            return mVar;
        }
        concurrentHashMap.putIfAbsent(str, new m(dayOfWeek, i12));
        return (m) concurrentHashMap.get(str);
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return b(this.f422210b, this.f422211c);
        } catch (IllegalArgumentException e12) {
            throw new InvalidObjectException("Invalid WeekFields" + e12.getMessage());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.f422210b.ordinal() * 7) + this.f422211c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WeekFields[");
        sb2.append(this.f422210b);
        sb2.append(',');
        return r.t(sb2, this.f422211c, ']');
    }
}
