package io.ktor.util.date;

import Y61.k;
import Y61.l;
import io.ktor.util.date.Month;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DateJvm.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f400455a = TimeZone.getTimeZone("GMT");

    @k
    public static final Q31.b a(int i12, int i13, int i14, int i15, @k Month month, int i16) {
        Calendar calendar = Calendar.getInstance(f400455a, Locale.ROOT);
        calendar.set(1, i16);
        calendar.set(2, month.ordinal());
        calendar.set(5, i15);
        calendar.set(11, i14);
        calendar.set(12, i13);
        calendar.set(13, i12);
        calendar.set(14, 0);
        return c(calendar, null);
    }

    @k
    public static final Q31.b b(@l Long l12) {
        return c(Calendar.getInstance(f400455a, Locale.ROOT), l12);
    }

    @k
    public static final Q31.b c(@k Calendar calendar, @l Long l12) {
        if (l12 != null) {
            calendar.setTimeInMillis(l12.longValue());
        }
        int i12 = calendar.get(16) + calendar.get(15);
        int i13 = calendar.get(13);
        int i14 = calendar.get(12);
        int i15 = calendar.get(11);
        int i16 = (calendar.get(7) + 5) % 7;
        WeekDay.f400453b.getClass();
        WeekDay weekDay = WeekDay.values()[i16];
        int i17 = calendar.get(5);
        int i18 = calendar.get(6);
        Month.a aVar = Month.f400450c;
        int i19 = calendar.get(2);
        aVar.getClass();
        return new Q31.b(i13, i14, i15, weekDay, i17, i18, Month.values()[i19], calendar.get(1), calendar.getTimeInMillis() + i12);
    }
}
