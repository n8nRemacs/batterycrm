package com.avito.android.advert.item.hotel.hotel_offer.konveyor.button;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsHotelButtonPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/button/d;", "LTV0/d;", "Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/button/f;", "Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/button/AdvertDetailsHotelButtonItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<f, AdvertDetailsHotelButtonItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.hotel.hotel_offer.b f76028b;

    @Inject
    public d(@I5.k @k com.avito.android.advert.item.hotel.hotel_offer.b bVar) {
        this.f76028b = bVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Integer numQ;
        f fVar = (f) eVar;
        AdvertDetailsHotelButtonItem advertDetailsHotelButtonItem = (AdvertDetailsHotelButtonItem) aVar;
        fVar.v0(advertDetailsHotelButtonItem.f76019c);
        String str = advertDetailsHotelButtonItem.f76020d;
        if (str != null && (numQ = com.avito.android.lib.util.f.q(str)) != null) {
            fVar.j0(numQ.intValue());
        }
        fVar.a(new c(advertDetailsHotelButtonItem, this));
    }
}
