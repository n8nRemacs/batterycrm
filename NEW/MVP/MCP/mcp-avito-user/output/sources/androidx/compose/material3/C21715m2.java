package androidx.compose.material3;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CalendarModelImpl.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/m2;", "Landroidx/compose/material3/l2;", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@j.X
/* renamed from: androidx.compose.material3.m2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21715m2 extends AbstractC21692l2 {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f36819d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final ZoneId f36820e = ZoneId.of("UTC");

    /* renamed from: b, reason: collision with root package name */
    public final int f36821b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f36822c;

    /* compiled from: CalendarModelImpl.android.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/m2$a;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.m2$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static String a(long j12, @Y61.k String str, @Y61.k Locale locale, @Y61.k LinkedHashMap linkedHashMap) {
            String str2 = "P:" + str + locale.toLanguageTag();
            Object objWithDecimalStyle = linkedHashMap.get(str2);
            if (objWithDecimalStyle == null) {
                objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
                linkedHashMap.put(str2, objWithDecimalStyle);
            }
            return Instant.ofEpochMilli(j12).atZone(C21715m2.f36820e).toLocalDate().format((DateTimeFormatter) objWithDecimalStyle);
        }

        public a() {
        }
    }

    public C21715m2(@Y61.k Locale locale) {
        this.f36821b = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        DayOfWeek[] dayOfWeekArrValues = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(dayOfWeekArrValues.length);
        for (DayOfWeek dayOfWeek : dayOfWeekArrValues) {
            arrayList.add(new kotlin.Q(dayOfWeek.getDisplayName(TextStyle.FULL, locale), dayOfWeek.getDisplayName(TextStyle.NARROW, locale)));
        }
        this.f36822c = arrayList;
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final String a(long j12, @Y61.k String str, @Y61.k Locale locale) {
        LinkedHashMap linkedHashMap = this.f36772a;
        f36819d.getClass();
        return a.a(j12, str, locale, linkedHashMap);
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final C21669k2 b(long j12) {
        LocalDate localDate = Instant.ofEpochMilli(j12).atZone(f36820e).toLocalDate();
        return new C21669k2(localDate.getYear(), localDate.getMonthValue(), localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC) * 1000, localDate.getDayOfMonth());
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final M3 c(@Y61.k Locale locale) {
        return C21738n2.a(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale));
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    /* renamed from: d, reason: from getter */
    public final int getF36821b() {
        return this.f36821b;
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final C21784p2 e(int i12, int i13) {
        return l(LocalDate.of(i12, i13, 1));
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final C21784p2 f(long j12) {
        return l(Instant.ofEpochMilli(j12).atZone(f36820e).withDayOfMonth(1).toLocalDate());
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final C21784p2 g(@Y61.k C21669k2 c21669k2) {
        return l(LocalDate.of(c21669k2.f36699b, c21669k2.f36700c, 1));
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final C21669k2 h() {
        LocalDate localDateNow = LocalDate.now();
        return new C21669k2(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(f36820e).toInstant().toEpochMilli(), localDateNow.getDayOfMonth());
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final List<kotlin.Q<String, String>> i() {
        return this.f36822c;
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.l
    public final C21669k2 j(@Y61.k String str, @Y61.k String str2) {
        try {
            LocalDate localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern(str2));
            return new C21669k2(localDate.getYear(), localDate.getMonth().getValue(), localDate.atTime(LocalTime.MIDNIGHT).atZone(f36820e).toInstant().toEpochMilli(), localDate.getDayOfMonth());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final C21784p2 k(@Y61.k C21784p2 c21784p2, int i12) {
        return i12 <= 0 ? c21784p2 : l(Instant.ofEpochMilli(c21784p2.f37014e).atZone(f36820e).toLocalDate().plusMonths(i12));
    }

    public final C21784p2 l(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.f36821b;
        if (value < 0) {
            value += 7;
        }
        return new C21784p2(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(f36820e).toInstant().toEpochMilli());
    }

    @Y61.k
    public final String toString() {
        return "CalendarModel";
    }
}
