package org.threeten.bp.temporal;

import java.util.HashMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.format.ResolverStyle;

/* compiled from: JulianFields.java */
/* loaded from: classes15.dex */
public final class b {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF17' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: JulianFields.java */
    public static final class a implements h {

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f422187e;

        /* renamed from: b, reason: collision with root package name */
        public final String f422188b;

        /* renamed from: c, reason: collision with root package name */
        public final l f422189c;

        /* renamed from: d, reason: collision with root package name */
        public final long f422190d;

        /* JADX INFO: Fake field, exist only in values array */
        a EF17;

        static {
            ChronoUnit chronoUnit = ChronoUnit.DAYS;
            ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
            f422187e = new a[]{new a("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L), new a("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L), new a("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L)};
        }

        public a(String str, int i12, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j12) {
            this.f422188b = str2;
            this.f422189c = l.d((-365243219162L) + j12, 365241780471L + j12);
            this.f422190d = j12;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f422187e.clone();
        }

        @Override // org.threeten.bp.temporal.h
        public final <R extends c> R a(R r12, long j12) {
            if (this.f422189c.c(j12)) {
                return (R) r12.w(w81.d.l(j12, this.f422190d), ChronoField.f422148y);
            }
            throw new DateTimeException("Invalid value: " + this.f422188b + " " + j12);
        }

        @Override // org.threeten.bp.temporal.h
        public final boolean b(d dVar) {
            return dVar.l(ChronoField.f422148y);
        }

        @Override // org.threeten.bp.temporal.h
        public final d c(HashMap map, d dVar, ResolverStyle resolverStyle) {
            return org.threeten.bp.chrono.j.i(dVar).c(w81.d.l(((Long) map.remove(this)).longValue(), this.f422190d));
        }

        @Override // org.threeten.bp.temporal.h
        public final l d(d dVar) {
            if (dVar.l(ChronoField.f422148y)) {
                return this.f422189c;
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + this);
        }

        @Override // org.threeten.bp.temporal.h
        public final boolean e() {
            return true;
        }

        @Override // org.threeten.bp.temporal.h
        public final l f() {
            return this.f422189c;
        }

        @Override // org.threeten.bp.temporal.h
        public final long h(d dVar) {
            return dVar.m(ChronoField.f422148y) + this.f422190d;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f422188b;
        }
    }

    static {
        a[] aVarArr = a.f422187e;
        a[] aVarArr2 = a.f422187e;
        a[] aVarArr3 = a.f422187e;
    }
}
