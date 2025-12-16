package Uc;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: PublicRatingDetailsOpenEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUc/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics-ratings-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Uc.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15508b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Map<String, Object> f16515b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<Long> f16516c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f16517d;

    public C15508b() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f16517d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f16517d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f16517d.f90248c;
    }

    public C15508b(String str, ReviewsOpenPageFrom reviewsOpenPageFrom, String str2, String str3, Boolean bool, Long l12, String str4, String str5, Map map, List list, int i12, C42822w c42822w) {
        String str6 = (i12 & 1) != 0 ? null : str;
        ReviewsOpenPageFrom reviewsOpenPageFrom2 = (i12 & 2) != 0 ? null : reviewsOpenPageFrom;
        String str7 = (i12 & 4) != 0 ? null : str2;
        String str8 = (i12 & 8) != 0 ? null : str3;
        Boolean bool2 = (i12 & 16) != 0 ? null : bool;
        Long l13 = (i12 & 32) != 0 ? null : l12;
        String str9 = (i12 & 64) != 0 ? null : str4;
        String str10 = (i12 & 128) != 0 ? null : str5;
        Map map2 = (i12 & 256) != 0 ? null : map;
        List list2 = (i12 & 512) != 0 ? null : list;
        this.f16515b = map2;
        this.f16516c = list2;
        this.f16517d = new ParametrizedClickStreamEvent(2754, 15, i.a(P0.k(map2 == null ? P0.c() : map2, P0.g(new Q("encoded", str6), new Q("page_from", reviewsOpenPageFrom2 != null ? reviewsOpenPageFrom2.f91255b : null), new Q(str7, str8), new Q("sort_set_by_default", bool2), new Q("iid", l13), new Q("aggregation_type", str9), new Q("first_review_relevance_by", str10), new Q("reviews_summary_aspects", list2)))), null, 8, null);
    }
}
