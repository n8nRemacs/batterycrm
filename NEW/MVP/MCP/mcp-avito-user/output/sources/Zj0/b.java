package ZJ0;

import com.avito.android.beduin.common.component.input.single_line.SingleLineInputModel;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.user_stats.generated.api.api_3_sellers_private_statistics_general_config_post.OkRespDataResultMetricGroupingsItemSort;
import kotlin.Metadata;

/* compiled from: Api3SellersPrivateStatisticsGeneralConfigPostResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001c"}, d2 = {"LZJ0/b;", "", "LZJ0/c;", "badge", "", "hint", "LZJ0/d;", SingleLineInputModel.STYLE_SEARCH, "slug", "Lcom/avito/android/user_stats/generated/api/api_3_sellers_private_statistics_general_config_post/OkRespDataResultMetricGroupingsItemSort;", SearchParamsConverterKt.SORT, "title", "<init>", "(LZJ0/c;Ljava/lang/String;LZJ0/d;Ljava/lang/String;Lcom/avito/android/user_stats/generated/api/api_3_sellers_private_statistics_general_config_post/OkRespDataResultMetricGroupingsItemSort;Ljava/lang/String;)V", "LZJ0/c;", "a", "()LZJ0/c;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "LZJ0/d;", "c", "()LZJ0/d;", "d", "Lcom/avito/android/user_stats/generated/api/api_3_sellers_private_statistics_general_config_post/OkRespDataResultMetricGroupingsItemSort;", "e", "()Lcom/avito/android/user_stats/generated/api/api_3_sellers_private_statistics_general_config_post/OkRespDataResultMetricGroupingsItemSort;", "f", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    @com.google.gson.annotations.c("badge")
    @Y61.l
    private final c badge;

    @com.google.gson.annotations.c("hint")
    @Y61.l
    private final String hint;

    @com.google.gson.annotations.c(SingleLineInputModel.STYLE_SEARCH)
    @Y61.l
    private final d search;

    @com.google.gson.annotations.c("slug")
    @Y61.l
    private final String slug;

    @com.google.gson.annotations.c(SearchParamsConverterKt.SORT)
    @Y61.l
    private final OkRespDataResultMetricGroupingsItemSort sort;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    public b(@Y61.l c cVar, @Y61.l String str, @Y61.l d dVar, @Y61.l String str2, @Y61.l OkRespDataResultMetricGroupingsItemSort okRespDataResultMetricGroupingsItemSort, @Y61.l String str3) {
        this.badge = cVar;
        this.hint = str;
        this.search = dVar;
        this.slug = str2;
        this.sort = okRespDataResultMetricGroupingsItemSort;
        this.title = str3;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final c getBadge() {
        return this.badge;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final d getSearch() {
        return this.search;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final OkRespDataResultMetricGroupingsItemSort getSort() {
        return this.sort;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
