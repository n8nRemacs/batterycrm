package Uc;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: RatingAspectSelectedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUc/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics-ratings-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f16518b;

    public d(@l String str, @l ReviewsOpenPageFrom reviewsOpenPageFrom, @l Long l12, @l Long l13) {
        this.f16518b = new ParametrizedClickStreamEvent(17702, 0, C35755b0.c(P0.g(new Q("encoded", str), new Q("page_from", reviewsOpenPageFrom != null ? reviewsOpenPageFrom.f91255b : null), new Q("iid", l12), new Q("reviews_filter_summary_aspect", l13))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f16518b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f16518b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f16518b.f90248c;
    }

    public /* synthetic */ d(String str, ReviewsOpenPageFrom reviewsOpenPageFrom, Long l12, Long l13, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : reviewsOpenPageFrom, (i12 & 4) != 0 ? null : l12, l13);
    }
}
