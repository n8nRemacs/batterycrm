package du;

import Y61.k;
import Y61.l;
import com.avito.android.util.K;
import java.util.Calendar;
import java.util.Date;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CalendarUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_das-date-picker_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: du.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39803a {
    public static final boolean a(@k Date date, @k Date date2) {
        Calendar calendarD = d(date);
        K.a(calendarD);
        long timeInMillis = calendarD.getTimeInMillis();
        Calendar calendarD2 = d(date2);
        K.a(calendarD2);
        G0 g02 = G0.f406611a;
        return timeInMillis > calendarD2.getTimeInMillis() || c(date, date2);
    }

    public static final boolean b(@k Date date, @k Date date2) {
        Calendar calendarD = d(date);
        K.a(calendarD);
        long timeInMillis = calendarD.getTimeInMillis();
        Calendar calendarD2 = d(date2);
        K.a(calendarD2);
        G0 g02 = G0.f406611a;
        return timeInMillis < calendarD2.getTimeInMillis();
    }

    public static final boolean c(@l Date date, @l Date date2) {
        if (date == null || date2 == null) {
            return false;
        }
        Calendar calendarD = d(date);
        Calendar calendarD2 = d(date2);
        return calendarD.get(1) == calendarD2.get(1) && calendarD.get(2) == calendarD2.get(2) && calendarD.get(5) == calendarD2.get(5);
    }

    @k
    public static final Calendar d(@k Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        K.a(calendar);
        return calendar;
    }
}
