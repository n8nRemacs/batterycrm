package WJ0;

import Y61.k;
import com.avito.android.user_stats.generated.api.api_1_sellers_private_statistics_general_dynamics_categories_post.DynamicCategory;
import com.avito.android.user_stats.generated.api.api_1_sellers_private_statistics_general_dynamics_categories_post.OkRespDataSuccessMetricsItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1SellersPrivateStatisticsGeneralDynamicsCategoriesPostResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"LWJ0/a;", "", "", "Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_categories_post/DynamicCategory;", "categories", "", "itemsCount", "Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_categories_post/OkRespDataSuccessMetricsItem;", "metrics", "<init>", "(Ljava/util/List;JLjava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "J", "b", "()J", "c", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    @com.google.gson.annotations.c("categories")
    @k
    private final List<DynamicCategory> categories;

    @com.google.gson.annotations.c("itemsCount")
    private final long itemsCount;

    @com.google.gson.annotations.c("metrics")
    @k
    private final List<OkRespDataSuccessMetricsItem> metrics;

    public a(@k List<DynamicCategory> list, long j12, @k List<OkRespDataSuccessMetricsItem> list2) {
        this.categories = list;
        this.itemsCount = j12;
        this.metrics = list2;
    }

    @k
    public final List<DynamicCategory> a() {
        return this.categories;
    }

    /* renamed from: b, reason: from getter */
    public final long getItemsCount() {
        return this.itemsCount;
    }

    @k
    public final List<OkRespDataSuccessMetricsItem> c() {
        return this.metrics;
    }
}
