package com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.user_stats.extended_user_stats.C35729a;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart.Detail;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart.TypeDetail;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.user_stats.model.extended_user_stats.MetricItem;
import com.avito.user_stats.model.extended_user_stats.StatsDates;
import com.avito.user_stats.model.extended_user_stats.StatsServices;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: StatsChartItemHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/o;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f317856a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final QJ0.f f317857b;

    /* renamed from: e, reason: collision with root package name */
    public double f317860e;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public List<StatsServices> f317862g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public List<MetricItem> f317863h;

    /* renamed from: i, reason: collision with root package name */
    public double f317864i;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f317858c = new SimpleDateFormat("d MMM yy", Locale.getDefault());

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f317859d = new SimpleDateFormat("d MMM", Locale.getDefault());

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final q f317861f = new q();

    public o(@Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k QJ0.f fVar) {
        this.f317856a = interfaceC35863o4;
        this.f317857b = fVar;
    }

    public static String c(int i12, long j12, String str) {
        String strValueOf = String.valueOf(Math.round((j12 / i12) * 10.0d) / 10.0d);
        if (C43066x.q(strValueOf, ".0", false)) {
            strValueOf = strValueOf.substring(0, C43066x.H('.', 0, 6, strValueOf));
        }
        return H.i(' ', strValueOf.replace('.', ','), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137 A[PHI: r30
  0x0137: PHI (r30v2 long) = (r30v1 long), (r30v5 long) binds: [B:77:0x019b, B:54:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart.ChartExpensesItem a(@Y61.l java.util.List r35, @Y61.l java.util.List r36, double r37, @Y61.l java.lang.Integer r39, @Y61.l java.util.List r40) {
        /*
            Method dump skipped, instructions count: 1361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.o.a(java.util.List, java.util.List, double, java.lang.Integer, java.util.List):com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart.ChartExpensesItem");
    }

    public final Detail b(StatsServices statsServices, double d12, boolean z12) {
        Object next;
        StatsServices statsServices2;
        Object next2;
        long jK2;
        MetricItem metricItem;
        Object next3;
        List<StatsServices> list = this.f317862g;
        UniversalColor universalColorJ = null;
        if (list == null) {
            List<MetricItem> list2 = this.f317863h;
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it.next();
                    if (L.f(((MetricItem) next3).getSlug(), statsServices.getSlug())) {
                        break;
                    }
                }
                metricItem = (MetricItem) next3;
            } else {
                metricItem = null;
            }
            if (metricItem != null) {
                universalColorJ = metricItem.getPlotColor();
            }
        } else {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                List<StatsServices> listG = ((StatsServices) next).g();
                if (listG != null) {
                    Iterator<T> it3 = listG.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        if (L.f(((StatsServices) next2).getSlug(), statsServices.getSlug())) {
                            break;
                        }
                    }
                    statsServices2 = (StatsServices) next2;
                } else {
                    statsServices2 = null;
                }
                if (statsServices2 != null) {
                    break;
                }
            }
            StatsServices statsServices3 = (StatsServices) next;
            if (z12) {
                if (statsServices3 != null) {
                    universalColorJ = statsServices3.getBonusPlotColor();
                }
            } else if (statsServices3 != null) {
                universalColorJ = statsServices3.getPlotColor();
            }
        }
        if (z12) {
            Long lC2 = statsServices.getBonusAmount();
            jK2 = lC2 != null ? lC2.longValue() : 0L;
        } else {
            jK2 = statsServices.getRealAmount();
        }
        double dA2 = this.f317864i != 0.0d ? m.a(jK2) / this.f317864i : 0.0d;
        if (dA2 < d12) {
            this.f317860e = (d12 - dA2) + this.f317860e;
        } else {
            d12 = dA2;
        }
        return new Detail((float) d12, TypeDetail.f317695b, universalColorJ);
    }

    @Y61.k
    public final String d(@Y61.k StatsDates statsDates) {
        Date dateD = statsDates.getStart();
        Date dateC = statsDates.getEnd();
        SimpleDateFormat simpleDateFormat = this.f317858c;
        SimpleDateFormat simpleDateFormat2 = this.f317859d;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateD);
        Calendar calendar2 = Calendar.getInstance();
        if (dateC == null) {
            calendar2 = calendar;
        } else {
            calendar2.setTime(dateC);
        }
        return C35729a.b(calendar, calendar2, simpleDateFormat, simpleDateFormat2);
    }
}
