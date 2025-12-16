package com.avito.android.advert_core.comfortable_deal_promo;

import com.avito.android.advert_core.comfortable_deal_promo.AdvertDetailsComfortableDealPromoItem;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.konveyor.item_visibility_tracker.b;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: ComfortableDealPromoItemFilter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/comfortable_deal_promo/k;", "LWV0/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f83095e;

    /* compiled from: ComfortableDealPromoItemFilter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert_core/comfortable_deal_promo/k$a", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final int f83096b;

        /* renamed from: c, reason: collision with root package name */
        public final int f83097c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Map<String, String> f83098d;

        public a(AdvertDetailsComfortableDealPromoItem.AnalyticsEvent analyticsEvent) {
            this.f83096b = analyticsEvent.getId();
            this.f83097c = analyticsEvent.getVersion();
            Map<String, String> params = analyticsEvent.getParams();
            this.f83098d = params == null ? P0.c() : params;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId, reason: from getter */
        public final int getF83096b() {
            return this.f83096b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @Y61.k
        public final Map<String, String> getParams() {
            return this.f83098d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion, reason: from getter */
        public final int getF83097c() {
            return this.f83097c;
        }
    }

    @Inject
    public k(@Y61.k InterfaceC28373a interfaceC28373a) {
        super(true, true, 0.0f, 0L, 12, null);
        this.f83095e = interfaceC28373a;
    }

    @Override // WV0.a
    public final boolean a(@Y61.k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof AdvertDetailsComfortableDealPromoItem;
    }

    @Override // WV0.a
    public final void b(int i12, @Y61.k b.InterfaceC10495b interfaceC10495b) {
        AdvertDetailsComfortableDealPromoItem.AnalyticsEvent analyticsEvent;
        AdvertDetailsComfortableDealPromoItem advertDetailsComfortableDealPromoItem = interfaceC10495b instanceof AdvertDetailsComfortableDealPromoItem ? (AdvertDetailsComfortableDealPromoItem) interfaceC10495b : null;
        if (advertDetailsComfortableDealPromoItem == null || (analyticsEvent = advertDetailsComfortableDealPromoItem.f83061j) == null) {
            return;
        }
        this.f83095e.c(new a(analyticsEvent));
    }
}
