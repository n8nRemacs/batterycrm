package Yo;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: PremierPartnerSellerBannerAnalyticsInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYo/x;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class x implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f19687b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19688c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Map<String, Object> f19689d;

    public x(int i12, int i13, String str, String str2) {
        this.f19687b = i12;
        this.f19688c = i13;
        Map<String, Object> mapG = P0.g(new Q("pagetype", "re_item_seller"), new Q("placement", "middle"), new Q("re_banner_name", "rre_trx_promo_item_v2"), new Q("item_id", str));
        if (str2 != null) {
            mapG = com.avito.android.authorization.auto_recovery.phone_confirm.b.l("action_type", str2 == null ? "" : str2, mapG);
        }
        this.f19689d = mapG;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF328428b() {
        return this.f19687b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f19689d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF328429c() {
        return this.f19688c;
    }
}
