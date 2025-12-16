package v90;

import Y61.k;
import Y61.l;
import com.avito.android.profile.pro.impl.network.response.ProDashboardResponse;
import com.avito.android.profile.pro.impl.screen.item.dashboard_stats.ProfileProStatsItem;
import com.avito.android.profile.pro.impl.screen.item.dashboard_stats.StatsDay;
import com.avito.android.profile.pro.impl.screen.item.dashboard_stats.StatsItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProStatsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lv90/i;", "Lv90/h;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements h {

    /* compiled from: ProfileProStatsConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv90/i$a;", "", "<init>", "()V", "", "PROFILE_PRO_DASHBOARD_STATS", "Ljava/lang/String;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // v90.h
    @l
    public final ProfileProStatsItem a(@k ProDashboardResponse proDashboardResponse) {
        ProDashboardResponse.MoreButton moreButton;
        List<ProDashboardResponse.MetricItem> listC;
        ProDashboardResponse.Data<ProDashboardResponse.StatisticsGeneral> dataE = proDashboardResponse.getWidgets().e();
        ProfileProStatsItem profileProStatsItem = null;
        if ((dataE != null ? (ProDashboardResponse.StatisticsGeneral) dataE.c() : null) != null) {
            ProDashboardResponse.StatisticsGeneral statisticsGeneral = (ProDashboardResponse.StatisticsGeneral) proDashboardResponse.getWidgets().e().c();
            ArrayList arrayList = new ArrayList();
            if (statisticsGeneral != null && (listC = statisticsGeneral.c()) != null) {
                for (Iterator it = listC.iterator(); it.hasNext(); it = it) {
                    ProDashboardResponse.MetricItem metricItem = (ProDashboardResponse.MetricItem) it.next();
                    ArrayList arrayList2 = new ArrayList();
                    long j12 = 0;
                    for (ProDashboardResponse.ItemPeriod itemPeriod : metricItem.e()) {
                        Iterator<T> it2 = itemPeriod.d().iterator();
                        long jLongValue = 0;
                        while (it2.hasNext()) {
                            jLongValue += ((Number) it2.next()).longValue();
                        }
                        if (jLongValue > j12) {
                            j12 = jLongValue;
                        }
                        arrayList2.add(new StatsDay(jLongValue, itemPeriod.getTitle()));
                    }
                    arrayList.add(new StatsItem(j12, arrayList2, metricItem.getSlug(), metricItem.getTitle(), metricItem.getIcon(), metricItem.getValue(), metricItem.getRelativeValue(), metricItem.getDeeplink(), metricItem.c(), false, 512, null));
                }
            }
            if (statisticsGeneral != null && (moreButton = statisticsGeneral.getMoreButton()) != null) {
                arrayList.add(new StatsItem(0L, null, null, moreButton.getText(), moreButton.getIcon(), null, null, moreButton.getDeeplink(), null, true, 359, null));
            }
            profileProStatsItem = new ProfileProStatsItem("dashboard_stats", arrayList);
        }
        return profileProStatsItem;
    }
}
