package YJ0;

import com.avito.android.user_stats.generated.api.api_2_sellers_private_statistics_general_dynamics_dates_post.DynamicsAppsSummary;
import com.avito.android.user_stats.generated.api.api_2_sellers_private_statistics_general_dynamics_dates_post.DynamicsDatesAppsMetricsItemV2;
import com.avito.android.user_stats.generated.api.api_2_sellers_private_statistics_general_dynamics_dates_post.OkRespDataSuccessDatesItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2SellersPrivateStatisticsGeneralDynamicsDatesPostResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"LYJ0/a;", "", "LYJ0/l;", "alertContent", "", "Lcom/avito/android/user_stats/generated/api/api_2_sellers_private_statistics_general_dynamics_dates_post/OkRespDataSuccessDatesItem;", "dates", "Lcom/avito/android/user_stats/generated/api/api_2_sellers_private_statistics_general_dynamics_dates_post/DynamicsDatesAppsMetricsItemV2;", "metrics", "Lcom/avito/android/user_stats/generated/api/api_2_sellers_private_statistics_general_dynamics_dates_post/DynamicsAppsSummary;", "summary", "<init>", "(LYJ0/l;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "LYJ0/l;", "a", "()LYJ0/l;", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "d", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    @com.google.gson.annotations.c("alertContent")
    @Y61.l
    private final l alertContent;

    @com.google.gson.annotations.c("dates")
    @Y61.k
    private final List<OkRespDataSuccessDatesItem> dates;

    @com.google.gson.annotations.c("metrics")
    @Y61.k
    private final List<DynamicsDatesAppsMetricsItemV2> metrics;

    @com.google.gson.annotations.c("summary")
    @Y61.l
    private final List<DynamicsAppsSummary> summary;

    public a(@Y61.l l lVar, @Y61.k List<OkRespDataSuccessDatesItem> list, @Y61.k List<DynamicsDatesAppsMetricsItemV2> list2, @Y61.l List<DynamicsAppsSummary> list3) {
        this.alertContent = lVar;
        this.dates = list;
        this.metrics = list2;
        this.summary = list3;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final l getAlertContent() {
        return this.alertContent;
    }

    @Y61.k
    public final List<OkRespDataSuccessDatesItem> b() {
        return this.dates;
    }

    @Y61.k
    public final List<DynamicsDatesAppsMetricsItemV2> c() {
        return this.metrics;
    }

    @Y61.l
    public final List<DynamicsAppsSummary> d() {
        return this.summary;
    }
}
