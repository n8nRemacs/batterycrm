package wy0;

import Y61.k;
import Y61.l;
import com.avito.android.util.K;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CalendarUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_str-calendar_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: wy0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49704a {
    @k
    public static final Calendar a() {
        Calendar calendar = Calendar.getInstance(new Locale("ru", "RU"));
        K.a(calendar);
        return calendar;
    }

    public static final boolean b(@k Date date, @k Date date2) {
        return c(date, date2) || e(date, date2);
    }

    public static final boolean c(@k Date date, @k Date date2) {
        Calendar calendarG = g(date);
        K.a(calendarG);
        long timeInMillis = calendarG.getTimeInMillis();
        Calendar calendarG2 = g(date2);
        K.a(calendarG2);
        G0 g02 = G0.f406611a;
        return timeInMillis > calendarG2.getTimeInMillis();
    }

    public static final boolean d(@k Date date, @k Date date2) {
        Calendar calendarG = g(date);
        K.a(calendarG);
        long timeInMillis = calendarG.getTimeInMillis();
        Calendar calendarG2 = g(date2);
        K.a(calendarG2);
        G0 g02 = G0.f406611a;
        return timeInMillis < calendarG2.getTimeInMillis();
    }

    public static final boolean e(@k Date date, @l Date date2) {
        if (date2 == null) {
            return false;
        }
        Calendar calendarG = g(date);
        Calendar calendarG2 = g(date2);
        return calendarG.get(1) == calendarG2.get(1) && calendarG.get(2) == calendarG2.get(2) && calendarG.get(5) == calendarG2.get(5);
    }

    public static final boolean f(@k Date date) {
        return g(date).get(5) == g(date).getActualMaximum(5);
    }

    @k
    public static final Calendar g(@k Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        K.a(calendar);
        return calendar;
    }
}
