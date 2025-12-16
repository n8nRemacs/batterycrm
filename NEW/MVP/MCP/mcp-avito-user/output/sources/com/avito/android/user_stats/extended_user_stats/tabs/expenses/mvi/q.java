package com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi;

import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart.Legend;
import com.avito.user_stats.model.extended_user_stats.StatsDates;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: StatsChartItemLegendHelper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/q;", "", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q {
    public static LocalDate a(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static Legend b(StatsDates statsDates, boolean z12) {
        LocalDate localDateA = a(statsDates.getStart());
        String str = localDateA.getDayOfMonth() + '\n' + localDateA.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault());
        int value = localDateA.getDayOfWeek().getValue();
        return new Legend(str, value == 6 || value == 7, z12, false, null, 24, null);
    }

    public static String c(LocalDate localDate, boolean z12) {
        String displayName;
        int monthValue = localDate.getMonthValue();
        if (monthValue == 3 || monthValue == 5) {
            if (z12) {
                displayName = localDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault());
            } else {
                displayName = new SimpleDateFormat("LLLL", Locale.getDefault()).format(Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
            }
        } else if (monthValue != 6 && monthValue != 7) {
            displayName = localDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault());
        } else if (z12) {
            displayName = localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
        } else {
            displayName = new SimpleDateFormat("LLLL", Locale.getDefault()).format(Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        }
        return C43066x.a0(displayName, ".", "", false);
    }
}
