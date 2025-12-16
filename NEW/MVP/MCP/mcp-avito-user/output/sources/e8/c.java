package e8;

import Y61.k;
import Y61.l;
import com.avito.android.advert_core.analytics.additional_seller.HouseReviewsShowActions;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: HouseReviewsShow.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le8/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f394973b;

    public c(@k String str, @k HouseReviewsShowActions houseReviewsShowActions, @l Integer num, @k String str2) {
        this.f394973b = new ParametrizedClickStreamEvent(12877, 0, C35755b0.c(P0.j(new Q("iid", str), new Q("from_page", str2), new Q("catalog_jk_action", houseReviewsShowActions.f82788b), new Q("address_id", num))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f394973b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f394973b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f394973b.f90248c;
    }

    public /* synthetic */ c(String str, HouseReviewsShowActions houseReviewsShowActions, Integer num, String str2, int i12, C42822w c42822w) {
        this(str, houseReviewsShowActions, num, (i12 & 8) != 0 ? "item" : str2);
    }
}
