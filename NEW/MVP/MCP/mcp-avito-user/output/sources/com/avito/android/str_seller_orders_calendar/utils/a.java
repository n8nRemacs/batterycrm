package com.avito.android.str_seller_orders_calendar.utils;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import com.avito.android.util.K;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CalendarUtils.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/utils/a;", "", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f291211a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Locale f291212b = Locale.forLanguageTag("ru");

    @k
    public static Calendar a(int i12, @k Calendar calendar) {
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.add(5, i12);
        return calendar2;
    }

    @k
    public static Calendar b(int i12, @k Calendar calendar) {
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.add(2, i12);
        return calendar2;
    }

    @k
    public static String c(@k String str) {
        if (str.length() <= 0) {
            return str;
        }
        return ((Object) String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT)) + str.substring(1);
    }

    @k
    public static String d(@k Date date) {
        return new SimpleDateFormat(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, Locale.US).format(date);
    }

    public static boolean e(@k Date date, @k Date date2) {
        Calendar calendarJ = j(date);
        K.a(calendarJ);
        long timeInMillis = calendarJ.getTimeInMillis();
        Calendar calendarJ2 = j(date2);
        K.a(calendarJ2);
        G0 g02 = G0.f406611a;
        return timeInMillis > calendarJ2.getTimeInMillis();
    }

    public static boolean f(@k Date date, @k Date date2) {
        Calendar calendarJ = j(date);
        K.a(calendarJ);
        long timeInMillis = calendarJ.getTimeInMillis();
        Calendar calendarJ2 = j(date2);
        K.a(calendarJ2);
        G0 g02 = G0.f406611a;
        return timeInMillis < calendarJ2.getTimeInMillis();
    }

    public static boolean g(@k Date date, @k Date date2) {
        Calendar calendarJ = j(date);
        Calendar calendarJ2 = j(date2);
        return calendarJ.get(1) == calendarJ2.get(1) && calendarJ.get(2) == calendarJ2.get(2) && calendarJ.get(5) == calendarJ2.get(5);
    }

    public static boolean h(@k Date date, @k Date date2) {
        Calendar calendarJ = j(date);
        Calendar calendarJ2 = j(date2);
        return calendarJ.get(2) == calendarJ2.get(2) && calendarJ.get(1) == calendarJ2.get(1);
    }

    @l
    public static Date i(@k String str) {
        try {
            return new SimpleDateFormat(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, Locale.US).parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }

    @k
    public static Calendar j(@k Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }
}
