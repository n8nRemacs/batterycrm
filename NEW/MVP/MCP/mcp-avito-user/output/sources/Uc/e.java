package Uc;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: RatingScreenshotEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics-ratings-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f16519b;

    public e() {
        this(null, null, null, 7, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f16519b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f16519b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f16519b.f90248c;
    }

    public e(String str, String str2, ReviewsOpenPageFrom reviewsOpenPageFrom, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? null : str;
        str2 = (i12 & 2) != 0 ? null : str2;
        reviewsOpenPageFrom = (i12 & 4) != 0 ? null : reviewsOpenPageFrom;
        this.f16519b = new ParametrizedClickStreamEvent(10207, 0, C35755b0.c(P0.g(new Q("user_key", str), new Q("item_id", str2), new Q("page_from", reviewsOpenPageFrom != null ? reviewsOpenPageFrom.f91255b : null))), null, 8, null);
    }
}
