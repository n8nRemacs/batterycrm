package org.threeten.bp.temporal;

import java.util.HashMap;
import org.threeten.bp.format.ResolverStyle;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes15.dex */
public final class ChronoField implements h {

    /* renamed from: A, reason: collision with root package name */
    public static final ChronoField f422119A;

    /* renamed from: B, reason: collision with root package name */
    public static final ChronoField f422120B;

    /* renamed from: C, reason: collision with root package name */
    public static final ChronoField f422121C;

    /* renamed from: D, reason: collision with root package name */
    public static final ChronoField f422122D;

    /* renamed from: E, reason: collision with root package name */
    public static final ChronoField f422123E;

    /* renamed from: F, reason: collision with root package name */
    public static final ChronoField f422124F;

    /* renamed from: G, reason: collision with root package name */
    public static final ChronoField f422125G;

    /* renamed from: H, reason: collision with root package name */
    public static final ChronoField f422126H;

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ ChronoField[] f422127I;

    /* renamed from: e, reason: collision with root package name */
    public static final ChronoField f422128e;

    /* renamed from: f, reason: collision with root package name */
    public static final ChronoField f422129f;

    /* renamed from: g, reason: collision with root package name */
    public static final ChronoField f422130g;

    /* renamed from: h, reason: collision with root package name */
    public static final ChronoField f422131h;

    /* renamed from: i, reason: collision with root package name */
    public static final ChronoField f422132i;

    /* renamed from: j, reason: collision with root package name */
    public static final ChronoField f422133j;

    /* renamed from: k, reason: collision with root package name */
    public static final ChronoField f422134k;

    /* renamed from: l, reason: collision with root package name */
    public static final ChronoField f422135l;

    /* renamed from: m, reason: collision with root package name */
    public static final ChronoField f422136m;

    /* renamed from: n, reason: collision with root package name */
    public static final ChronoField f422137n;

    /* renamed from: o, reason: collision with root package name */
    public static final ChronoField f422138o;

    /* renamed from: p, reason: collision with root package name */
    public static final ChronoField f422139p;

    /* renamed from: q, reason: collision with root package name */
    public static final ChronoField f422140q;

    /* renamed from: r, reason: collision with root package name */
    public static final ChronoField f422141r;

    /* renamed from: s, reason: collision with root package name */
    public static final ChronoField f422142s;

    /* renamed from: t, reason: collision with root package name */
    public static final ChronoField f422143t;

    /* renamed from: u, reason: collision with root package name */
    public static final ChronoField f422144u;

    /* renamed from: v, reason: collision with root package name */
    public static final ChronoField f422145v;

    /* renamed from: w, reason: collision with root package name */
    public static final ChronoField f422146w;

    /* renamed from: x, reason: collision with root package name */
    public static final ChronoField f422147x;

    /* renamed from: y, reason: collision with root package name */
    public static final ChronoField f422148y;

    /* renamed from: z, reason: collision with root package name */
    public static final ChronoField f422149z;

    /* renamed from: b, reason: collision with root package name */
    public final String f422150b;

    /* renamed from: c, reason: collision with root package name */
    public final k f422151c;

    /* renamed from: d, reason: collision with root package name */
    public final l f422152d;

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        ChronoUnit chronoUnit2 = ChronoUnit.SECONDS;
        ChronoField chronoField = new ChronoField("NANO_OF_SECOND", 0, "NanoOfSecond", chronoUnit, chronoUnit2, l.d(0L, 999999999L));
        f422128e = chronoField;
        ChronoUnit chronoUnit3 = ChronoUnit.DAYS;
        ChronoField chronoField2 = new ChronoField("NANO_OF_DAY", 1, "NanoOfDay", chronoUnit, chronoUnit3, l.d(0L, 86399999999999L));
        f422129f = chronoField2;
        ChronoUnit chronoUnit4 = ChronoUnit.MICROS;
        ChronoField chronoField3 = new ChronoField("MICRO_OF_SECOND", 2, "MicroOfSecond", chronoUnit4, chronoUnit2, l.d(0L, 999999L));
        f422130g = chronoField3;
        ChronoField chronoField4 = new ChronoField("MICRO_OF_DAY", 3, "MicroOfDay", chronoUnit4, chronoUnit3, l.d(0L, 86399999999L));
        f422131h = chronoField4;
        ChronoUnit chronoUnit5 = ChronoUnit.MILLIS;
        ChronoField chronoField5 = new ChronoField("MILLI_OF_SECOND", 4, "MilliOfSecond", chronoUnit5, chronoUnit2, l.d(0L, 999L));
        f422132i = chronoField5;
        ChronoField chronoField6 = new ChronoField("MILLI_OF_DAY", 5, "MilliOfDay", chronoUnit5, chronoUnit3, l.d(0L, 86399999L));
        f422133j = chronoField6;
        ChronoUnit chronoUnit6 = ChronoUnit.MINUTES;
        ChronoField chronoField7 = new ChronoField("SECOND_OF_MINUTE", 6, "SecondOfMinute", chronoUnit2, chronoUnit6, l.d(0L, 59L));
        f422134k = chronoField7;
        ChronoField chronoField8 = new ChronoField("SECOND_OF_DAY", 7, "SecondOfDay", chronoUnit2, chronoUnit3, l.d(0L, 86399L));
        f422135l = chronoField8;
        ChronoUnit chronoUnit7 = ChronoUnit.HOURS;
        ChronoField chronoField9 = new ChronoField("MINUTE_OF_HOUR", 8, "MinuteOfHour", chronoUnit6, chronoUnit7, l.d(0L, 59L));
        f422136m = chronoField9;
        ChronoField chronoField10 = new ChronoField("MINUTE_OF_DAY", 9, "MinuteOfDay", chronoUnit6, chronoUnit3, l.d(0L, 1439L));
        f422137n = chronoField10;
        ChronoUnit chronoUnit8 = ChronoUnit.HALF_DAYS;
        ChronoField chronoField11 = new ChronoField("HOUR_OF_AMPM", 10, "HourOfAmPm", chronoUnit7, chronoUnit8, l.d(0L, 11L));
        f422138o = chronoField11;
        ChronoField chronoField12 = new ChronoField("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", chronoUnit7, chronoUnit8, l.d(1L, 12L));
        f422139p = chronoField12;
        ChronoField chronoField13 = new ChronoField("HOUR_OF_DAY", 12, "HourOfDay", chronoUnit7, chronoUnit3, l.d(0L, 23L));
        f422140q = chronoField13;
        ChronoField chronoField14 = new ChronoField("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", chronoUnit7, chronoUnit3, l.d(1L, 24L));
        f422141r = chronoField14;
        ChronoField chronoField15 = new ChronoField("AMPM_OF_DAY", 14, "AmPmOfDay", chronoUnit8, chronoUnit3, l.d(0L, 1L));
        f422142s = chronoField15;
        ChronoUnit chronoUnit9 = ChronoUnit.WEEKS;
        ChronoField chronoField16 = new ChronoField("DAY_OF_WEEK", 15, "DayOfWeek", chronoUnit3, chronoUnit9, l.d(1L, 7L));
        f422143t = chronoField16;
        ChronoField chronoField17 = new ChronoField("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", chronoUnit3, chronoUnit9, l.d(1L, 7L));
        f422144u = chronoField17;
        ChronoField chronoField18 = new ChronoField("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", chronoUnit3, chronoUnit9, l.d(1L, 7L));
        f422145v = chronoField18;
        ChronoUnit chronoUnit10 = ChronoUnit.MONTHS;
        ChronoField chronoField19 = new ChronoField("DAY_OF_MONTH", 18, "DayOfMonth", chronoUnit3, chronoUnit10, l.e(1L, 1L, 28L, 31L));
        f422146w = chronoField19;
        ChronoUnit chronoUnit11 = ChronoUnit.YEARS;
        ChronoField chronoField20 = new ChronoField("DAY_OF_YEAR", 19, "DayOfYear", chronoUnit3, chronoUnit11, l.e(1L, 1L, 365L, 366L));
        f422147x = chronoField20;
        ChronoUnit chronoUnit12 = ChronoUnit.FOREVER;
        ChronoField chronoField21 = new ChronoField("EPOCH_DAY", 20, "EpochDay", chronoUnit3, chronoUnit12, l.d(-365243219162L, 365241780471L));
        f422148y = chronoField21;
        ChronoField chronoField22 = new ChronoField("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", chronoUnit9, chronoUnit10, l.e(1L, 1L, 4L, 5L));
        f422149z = chronoField22;
        ChronoField chronoField23 = new ChronoField("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", chronoUnit9, chronoUnit11, l.d(1L, 53L));
        f422119A = chronoField23;
        ChronoField chronoField24 = new ChronoField("MONTH_OF_YEAR", 23, "MonthOfYear", chronoUnit10, chronoUnit11, l.d(1L, 12L));
        f422120B = chronoField24;
        ChronoField chronoField25 = new ChronoField("PROLEPTIC_MONTH", 24, "ProlepticMonth", chronoUnit10, chronoUnit12, l.d(-11999999988L, 11999999999L));
        f422121C = chronoField25;
        ChronoField chronoField26 = new ChronoField("YEAR_OF_ERA", 25, "YearOfEra", chronoUnit11, chronoUnit12, l.e(1L, 1L, 999999999L, 1000000000L));
        f422122D = chronoField26;
        ChronoField chronoField27 = new ChronoField("YEAR", 26, "Year", chronoUnit11, chronoUnit12, l.d(-999999999L, 999999999L));
        f422123E = chronoField27;
        ChronoField chronoField28 = new ChronoField("ERA", 27, "Era", ChronoUnit.ERAS, chronoUnit12, l.d(0L, 1L));
        f422124F = chronoField28;
        ChronoField chronoField29 = new ChronoField("INSTANT_SECONDS", 28, "InstantSeconds", chronoUnit2, chronoUnit12, l.d(Long.MIN_VALUE, Long.MAX_VALUE));
        f422125G = chronoField29;
        ChronoField chronoField30 = new ChronoField("OFFSET_SECONDS", 29, "OffsetSeconds", chronoUnit2, chronoUnit12, l.d(-64800L, 64800L));
        f422126H = chronoField30;
        f422127I = new ChronoField[]{chronoField, chronoField2, chronoField3, chronoField4, chronoField5, chronoField6, chronoField7, chronoField8, chronoField9, chronoField10, chronoField11, chronoField12, chronoField13, chronoField14, chronoField15, chronoField16, chronoField17, chronoField18, chronoField19, chronoField20, chronoField21, chronoField22, chronoField23, chronoField24, chronoField25, chronoField26, chronoField27, chronoField28, chronoField29, chronoField30};
    }

    public ChronoField(String str, int i12, String str2, k kVar, ChronoUnit chronoUnit, l lVar) {
        this.f422150b = str2;
        this.f422151c = kVar;
        this.f422152d = lVar;
    }

    public static ChronoField valueOf(String str) {
        return (ChronoField) Enum.valueOf(ChronoField.class, str);
    }

    public static ChronoField[] values() {
        return (ChronoField[]) f422127I.clone();
    }

    @Override // org.threeten.bp.temporal.h
    public final <R extends c> R a(R r12, long j12) {
        return (R) r12.w(j12, this);
    }

    @Override // org.threeten.bp.temporal.h
    public final boolean b(d dVar) {
        return dVar.l(this);
    }

    @Override // org.threeten.bp.temporal.h
    public final d c(HashMap map, d dVar, ResolverStyle resolverStyle) {
        return null;
    }

    @Override // org.threeten.bp.temporal.h
    public final l d(d dVar) {
        return dVar.b(this);
    }

    @Override // org.threeten.bp.temporal.h
    public final boolean e() {
        return ordinal() >= f422143t.ordinal() && ordinal() <= f422124F.ordinal();
    }

    @Override // org.threeten.bp.temporal.h
    public final l f() {
        return this.f422152d;
    }

    @Override // org.threeten.bp.temporal.h
    public final long h(d dVar) {
        return dVar.m(this);
    }

    public final void i(long j12) {
        this.f422152d.b(j12, this);
    }

    public final boolean k() {
        return ordinal() < f422143t.ordinal();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f422150b;
    }
}
