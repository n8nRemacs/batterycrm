package com.avito.android.advert.item.hotel.hotel_promo_widget;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertHotelPromoWidgetPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_promo_widget/d;", "LTV0/d;", "Lcom/avito/android/advert/item/hotel/hotel_promo_widget/f;", "Lcom/avito/android/advert/item/hotel/hotel_promo_widget/AdvertHotelPromoWidgetItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<f, AdvertHotelPromoWidgetItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f76221b;

    @Inject
    public d(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f76221b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AdvertHotelPromoWidgetItem advertHotelPromoWidgetItem = (AdvertHotelPromoWidgetItem) aVar;
        UniversalColor universalColor = advertHotelPromoWidgetItem.f76214m;
        if (universalColor != null) {
            fVar.v(universalColor);
        }
        fVar.w(advertHotelPromoWidgetItem.f76209h);
        fVar.q(advertHotelPromoWidgetItem.f76210i);
        fVar.M(advertHotelPromoWidgetItem.f76211j);
        fVar.pa(advertHotelPromoWidgetItem.f76212k, new c(advertHotelPromoWidgetItem, this));
    }
}
