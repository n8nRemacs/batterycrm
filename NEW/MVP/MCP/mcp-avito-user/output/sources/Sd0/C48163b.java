package sd0;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: PromoBannerShowEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsd0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_promo-banner_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sd0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C48163b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f437938b;

    public C48163b(String str, Integer num, int i12, C42822w c42822w) {
        Object obj = (i12 & 2) != 0 ? null : num;
        this.f437938b = new ParametrizedClickStreamEvent(12873, 1, P0.g(new Q("from_page", str), new Q("business_platform", 3), new Q("item_id", obj == null ? "" : obj)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f437938b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f437938b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f437938b.f90248c;
    }
}
