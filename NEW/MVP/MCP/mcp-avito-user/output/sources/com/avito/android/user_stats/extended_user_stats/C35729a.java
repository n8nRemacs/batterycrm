package com.avito.android.user_stats.extended_user_stats;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CalendarHelper.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_stats.extended_user_stats.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35729a {
    public static final String a(SimpleDateFormat simpleDateFormat, Calendar calendar) {
        int i12 = calendar.get(2);
        return (i12 == 5 || i12 == 6) ? new SimpleDateFormat("d MMMM", Locale.getDefault()).format(calendar.getTime()) : simpleDateFormat.format(calendar.getTime());
    }

    @Y61.k
    public static final String b(@Y61.k Calendar calendar, @Y61.k Calendar calendar2, @Y61.k SimpleDateFormat simpleDateFormat, @Y61.k SimpleDateFormat simpleDateFormat2) {
        String strY;
        int i12 = calendar.get(1);
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        if (calendar.equals(calendar2)) {
            strY = i12 != localDateTimeNow.getYear() ? simpleDateFormat.format(calendar.getTime()) : a(new SimpleDateFormat("d MMMM", Locale.getDefault()), calendar);
        } else {
            int i13 = calendar.get(2);
            int i14 = calendar2.get(1);
            int i15 = calendar2.get(2);
            Object objValueOf = (localDateTimeNow.getYear() == i12 || localDateTimeNow.getYear() == i14) ? "" : Integer.valueOf(i12);
            if (i12 != i14) {
                strY = simpleDateFormat.format(calendar.getTime()) + " — " + simpleDateFormat.format(calendar2.getTime());
            } else if (i13 != i15) {
                strY = a(simpleDateFormat2, calendar) + " — " + a(simpleDateFormat2, calendar2) + ' ' + objValueOf;
            } else {
                int i16 = calendar.get(5);
                int i17 = calendar2.get(5);
                int actualMaximum = calendar2.getActualMaximum(5);
                if (i16 == 1 && i17 == actualMaximum) {
                    strY = new SimpleDateFormat("LLLL", Locale.getDefault()).format(calendar2.getTime()) + ' ' + objValueOf;
                } else {
                    strY = i16 + (char) 8212 + a(simpleDateFormat2, calendar2) + ' ' + objValueOf;
                }
            }
        }
        if (C43066x.L(strY) == '.') {
            strY = C43066x.y(1, strY);
        }
        return C43066x.a0(strY, ". ", " ", false);
    }
}
