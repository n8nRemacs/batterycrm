package com.avito.android.advert_core.comfortable_deal_promo;

import com.avito.android.advert_core.comfortable_deal_promo.AdvertDetailsComfortableDealPromoItem;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsComfortableDealPromoPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/comfortable_deal_promo/g;", "Lcom/avito/android/advert_core/comfortable_deal_promo/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f83084b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f83085c;

    @Inject
    public g(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f83084b = aVar;
        this.f83085c = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        AdvertDetailsComfortableDealPromoItem advertDetailsComfortableDealPromoItem = (AdvertDetailsComfortableDealPromoItem) aVar;
        AdvertDetailsComfortableDealPromoItem.WidgetStyle widgetStyle = advertDetailsComfortableDealPromoItem.f83059h;
        iVar.uo(widgetStyle != null ? widgetStyle.f83074c : null, widgetStyle != null ? widgetStyle.f83073b : null);
        AdvertDetailsComfortableDealPromoItem.ImageInformation imageInformation = advertDetailsComfortableDealPromoItem.f83058g;
        if (imageInformation != null) {
            iVar.na(imageInformation.f83068b, imageInformation.f83069c, imageInformation.f83070d, imageInformation.f83071e, imageInformation.f83072f);
        } else {
            iVar.p0();
        }
        iVar.b(advertDetailsComfortableDealPromoItem.f83056e);
        iVar.tb(new d(this), advertDetailsComfortableDealPromoItem.f83057f);
        iVar.v50(new f(this), advertDetailsComfortableDealPromoItem.f83060i);
    }
}
