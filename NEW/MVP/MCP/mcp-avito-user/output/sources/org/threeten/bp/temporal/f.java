package org.threeten.bp.temporal;

import org.threeten.bp.DayOfWeek;

/* compiled from: TemporalAdjusters.java */
/* loaded from: classes15.dex */
public final class f {

    /* compiled from: TemporalAdjusters.java */
    public static final class b implements e {

        /* renamed from: b, reason: collision with root package name */
        public final int f422191b;

        /* renamed from: c, reason: collision with root package name */
        public final int f422192c;

        public b(int i12, DayOfWeek dayOfWeek, a aVar) {
            this.f422191b = i12;
            this.f422192c = dayOfWeek.d();
        }

        @Override // org.threeten.bp.temporal.e
        public final org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
            int i12 = this.f422192c;
            int i13 = this.f422191b;
            if (i13 >= 0) {
                return cVar.w(1L, ChronoField.f422146w).r(((i13 - 1) * 7) + (((i12 - r11.k(ChronoField.f422143t)) + 7) % 7), ChronoUnit.DAYS);
            }
            ChronoField chronoField = ChronoField.f422146w;
            org.threeten.bp.temporal.c cVarW = cVar.w(cVar.b(chronoField).f422208e, chronoField);
            long jK2 = i12 - cVarW.k(ChronoField.f422143t);
            if (jK2 == 0) {
                jK2 = 0;
            } else if (jK2 > 0) {
                jK2 -= 7;
            }
            return cVarW.r(jK2 - (((-i13) - 1) * 7), ChronoUnit.DAYS);
        }
    }

    /* compiled from: TemporalAdjusters.java */
    public static class c implements e {

        /* renamed from: c, reason: collision with root package name */
        public static final c f422193c = new c(0);

        /* renamed from: d, reason: collision with root package name */
        public static final c f422194d = new c(1);

        /* renamed from: b, reason: collision with root package name */
        public final int f422195b;

        public c(int i12) {
            this.f422195b = i12;
        }

        @Override // org.threeten.bp.temporal.e
        public final org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
            int i12 = this.f422195b;
            if (i12 == 0) {
                return cVar.w(1L, ChronoField.f422146w);
            }
            if (i12 == 1) {
                ChronoField chronoField = ChronoField.f422146w;
                return cVar.w(cVar.b(chronoField).f422208e, chronoField);
            }
            if (i12 == 2) {
                return cVar.w(1L, ChronoField.f422146w).r(1L, ChronoUnit.MONTHS);
            }
            if (i12 == 3) {
                return cVar.w(1L, ChronoField.f422147x);
            }
            if (i12 == 4) {
                ChronoField chronoField2 = ChronoField.f422147x;
                return cVar.w(cVar.b(chronoField2).f422208e, chronoField2);
            }
            if (i12 == 5) {
                return cVar.w(1L, ChronoField.f422147x).r(1L, ChronoUnit.YEARS);
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    /* compiled from: TemporalAdjusters.java */
    public static final class d implements e {

        /* renamed from: b, reason: collision with root package name */
        public final int f422196b;

        /* renamed from: c, reason: collision with root package name */
        public final int f422197c;

        public d(int i12, DayOfWeek dayOfWeek, a aVar) {
            w81.d.f(dayOfWeek, "dayOfWeek");
            this.f422196b = i12;
            this.f422197c = dayOfWeek.d();
        }

        @Override // org.threeten.bp.temporal.e
        public final org.threeten.bp.temporal.c a(org.threeten.bp.temporal.c cVar) {
            int iK2 = cVar.k(ChronoField.f422143t);
            int i12 = this.f422197c;
            int i13 = this.f422196b;
            if (i13 < 2 && iK2 == i12) {
                return cVar;
            }
            if ((i13 & 1) == 0) {
                return cVar.r(iK2 - i12 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
            }
            return cVar.i(i12 - iK2 >= 0 ? 7 - r2 : -r2, ChronoUnit.DAYS);
        }
    }

    public static e a() {
        return c.f422193c;
    }

    public static e b() {
        return c.f422194d;
    }

    public static e c(DayOfWeek dayOfWeek) {
        return new d(0, dayOfWeek, null);
    }

    public static e d(DayOfWeek dayOfWeek) {
        return new d(1, dayOfWeek, null);
    }
}
