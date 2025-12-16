package Uc;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserRatingDetailsOpenEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUc/h;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics-ratings-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f16525b;

    public h(@k String str, @l ReviewsOpenPageFrom reviewsOpenPageFrom, @l String str2, @l String str3, @l Boolean bool) {
        this.f16525b = new ParametrizedClickStreamEvent(2755, 4, i.a(P0.g(new Q("encoded", str), new Q("page_from", reviewsOpenPageFrom != null ? reviewsOpenPageFrom.f91255b : null), new Q(str2, str3), new Q("sort_set_by_default", bool))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f16525b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f16525b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f16525b.f90248c;
    }

    public /* synthetic */ h(String str, ReviewsOpenPageFrom reviewsOpenPageFrom, String str2, String str3, Boolean bool, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : reviewsOpenPageFrom, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : bool);
    }
}
