package com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsInnerOfferPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/inner_offer/j;", "LTV0/d;", "Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/inner_offer/l;", "Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/inner_offer/AdvertDetailsInnerOfferItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements TV0.d<l, AdvertDetailsInnerOfferItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.hotel.hotel_offer.b f76061b;

    @Inject
    public j(@I5.k @Y61.k com.avito.android.advert.item.hotel.hotel_offer.b bVar) {
        this.f76061b = bVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        AdvertDetailsInnerOfferItem advertDetailsInnerOfferItem = (AdvertDetailsInnerOfferItem) aVar;
        lVar.l((Image) C42745f0.G(advertDetailsInnerOfferItem.f76034d));
        lVar.L(advertDetailsInnerOfferItem.f76035e);
        lVar.eQ(advertDetailsInnerOfferItem.f76036f);
        lVar.bX(advertDetailsInnerOfferItem.f76037g);
        lVar.pO(advertDetailsInnerOfferItem.f76038h);
        lVar.Lc(new f(advertDetailsInnerOfferItem, this));
        lVar.gl(new g(advertDetailsInnerOfferItem, this));
        lVar.U(new h(advertDetailsInnerOfferItem, this));
        lVar.h4(new i(advertDetailsInnerOfferItem, this));
    }
}
