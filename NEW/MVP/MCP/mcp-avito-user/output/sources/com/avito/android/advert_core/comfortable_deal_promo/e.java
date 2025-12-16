package com.avito.android.advert_core.comfortable_deal_promo;

import com.avito.android.advert_core.comfortable_deal_promo.AdvertDetailsComfortableDealPromoItem;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: AdvertDetailsComfortableDealPromoPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/comfortable_deal_promo/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f83080b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83081c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f83082d;

    public e(AdvertDetailsComfortableDealPromoItem.Button button) {
        this.f83080b = button.f83067d.getId();
        AdvertDetailsComfortableDealPromoItem.AnalyticsEvent analyticsEvent = button.f83067d;
        this.f83081c = analyticsEvent.getVersion();
        Map<String, String> params = analyticsEvent.getParams();
        this.f83082d = params == null ? P0.c() : params;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF83080b() {
        return this.f83080b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, String> getParams() {
        return this.f83082d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF83081c() {
        return this.f83081c;
    }
}
