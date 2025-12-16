package XJ0;

import Y61.k;
import com.avito.android.user_stats.generated.api.api_1_sellers_private_statistics_general_dynamics_locations_post.OkRespDataSuccessMetricsItem2;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1SellersPrivateStatisticsGeneralDynamicsLocationsPostResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"LXJ0/a;", "", "", "itemsCount", "", "LXJ0/b;", "locations", "Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_locations_post/OkRespDataSuccessMetricsItem2;", "metrics", "<init>", "(JLjava/util/List;Ljava/util/List;)V", "J", "a", "()J", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    @com.google.gson.annotations.c("itemsCount")
    private final long itemsCount;

    @com.google.gson.annotations.c("locations")
    @k
    private final List<b> locations;

    @com.google.gson.annotations.c("metrics")
    @k
    private final List<OkRespDataSuccessMetricsItem2> metrics;

    public a(long j12, @k List<b> list, @k List<OkRespDataSuccessMetricsItem2> list2) {
        this.itemsCount = j12;
        this.locations = list;
        this.metrics = list2;
    }

    /* renamed from: a, reason: from getter */
    public final long getItemsCount() {
        return this.itemsCount;
    }

    @k
    public final List<b> b() {
        return this.locations;
    }

    @k
    public final List<OkRespDataSuccessMetricsItem2> c() {
        return this.metrics;
    }
}
