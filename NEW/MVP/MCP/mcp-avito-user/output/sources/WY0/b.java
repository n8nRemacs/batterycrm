package wy0;

import Y61.k;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import com.avito.android.str_calendar.common.models.DateRange;
import com.avito.android.str_calendar.common.models.Position;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;

/* compiled from: StrDateUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_str-calendar_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {
    @k
    public static final String a(@k Date date) {
        return new SimpleDateFormat("d MMMM", new Locale("ru", "RU")).format(date);
    }

    @k
    public static final String b(@k Date date) {
        String str = new SimpleDateFormat("d MMM", new Locale("ru", "RU")).format(date);
        int length = str.length();
        do {
            length--;
            if (-1 >= length) {
                return "";
            }
        } while (str.charAt(length) == '.');
        return str.substring(0, length + 1);
    }

    @k
    public static final Date c(@k String str) {
        return new SimpleDateFormat(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, new Locale("ru", "RU")).parse(str);
    }

    @k
    public static final String d(@k Date date) {
        return new SimpleDateFormat(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, new Locale("ru", "RU")).format(date);
    }

    @k
    public static final Position e(@k DateRange dateRange, @k Date date) {
        boolean z12 = C49704a.g(date).get(5) == 1;
        boolean zF2 = C49704a.f(date);
        Date date2 = dateRange.f286636b;
        boolean zF3 = L.f(date2, date);
        Date date3 = dateRange.f286637c;
        return (zF3 && L.f(date3, date)) ? Position.f286640d : (L.f(date2, date) && zF2) ? Position.f286638b : (L.f(date3, date) && z12) ? Position.f286639c : (!zF2 || date.equals(date3)) ? (!z12 || date.equals(date2)) ? L.f(date2, date) ? Position.f286638b : z12 ? Position.f286638b : L.f(date3, date) ? Position.f286639c : zF2 ? Position.f286639c : (date2.compareTo(date) >= 0 || date3.compareTo(date) <= 0) ? Position.f286641e : Position.f286641e : Position.f286641e : Position.f286641e;
    }

    @k
    public static final String f(@k DateRange dateRange) {
        Calendar calendarA = C49704a.a();
        Calendar calendarA2 = C49704a.a();
        Date date = dateRange.f286636b;
        calendarA.setTime(date);
        Date date2 = dateRange.f286637c;
        calendarA2.setTime(date2);
        if (calendarA.get(2) == calendarA2.get(2)) {
            u0 u0Var = u0.f406856a;
            return String.format("%s — %s", Arrays.copyOf(new Object[]{new SimpleDateFormat("d", new Locale("ru", "RU")).format(date), b(date2)}, 2));
        }
        u0 u0Var2 = u0.f406856a;
        return String.format("%s — %s", Arrays.copyOf(new Object[]{b(date), b(date2)}, 2));
    }

    @k
    public static final String g(@k SelectedDateRange selectedDateRange) {
        Calendar calendarA = C49704a.a();
        Calendar calendarA2 = C49704a.a();
        Date date = selectedDateRange.f286645b;
        Date date2 = selectedDateRange.f286646c;
        if (date != null && date2 == null) {
            u0 u0Var = u0.f406856a;
            return String.format(a(date), Arrays.copyOf(new Object[0], 0));
        }
        if (date == null || date2 == null) {
            return "";
        }
        calendarA.setTime(date);
        calendarA2.setTime(date2);
        if (calendarA.get(2) == calendarA2.get(2)) {
            u0 u0Var2 = u0.f406856a;
            return String.format("%s–%s", Arrays.copyOf(new Object[]{new SimpleDateFormat("d", new Locale("ru", "RU")).format(date), a(date2)}, 2));
        }
        u0 u0Var3 = u0.f406856a;
        return String.format("%s – %s", Arrays.copyOf(new Object[]{a(date), a(date2)}, 2));
    }
}
