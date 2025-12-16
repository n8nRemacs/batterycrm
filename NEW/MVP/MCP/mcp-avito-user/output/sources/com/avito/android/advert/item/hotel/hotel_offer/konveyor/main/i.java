package com.avito.android.advert.item.hotel.hotel_offer.konveyor.main;

import com.avito.android.advert.item.Z0;
import com.avito.android.advert.item.hotel.hotel_offer.HotelOfferState;
import com.avito.android.advert.item.hotel.hotel_offer.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: AdvertDetailsHotelOfferPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class i extends C42801a implements Y41.p<com.avito.android.advert.item.hotel.hotel_offer.a, Continuation<? super G0>, Object>, SuspendFunction {
    @Override // Y41.p
    public final Object invoke(com.avito.android.advert.item.hotel.hotel_offer.a aVar, Continuation<? super G0> continuation) {
        com.avito.android.advert.item.hotel.hotel_offer.a aVar2 = aVar;
        h hVar = (h) this.receiver;
        hVar.getClass();
        if (aVar2 instanceof a.C2256a) {
            h.O(hVar, ((a.C2256a) aVar2).f75935a);
        } else if (aVar2 instanceof a.c) {
            h.O(hVar, ((a.c) aVar2).f75937a);
        } else if (aVar2 instanceof a.d) {
            Z0 z02 = hVar.f76108o;
            if (z02 != null) {
                z02.y(((a.d) aVar2).f75938a);
            }
        } else if (aVar2 instanceof a.e) {
            h.O(hVar, ((a.e) aVar2).f75939a);
        } else if (aVar2 instanceof a.f) {
            h.O(hVar, ((a.f) aVar2).f75940a);
        } else if (aVar2 instanceof a.b) {
            com.avito.android.advert.item.hotel.hotel_offer.m mVar = hVar.f76096c;
            mVar.a(HotelOfferState.a(mVar.getState().getValue(), null, null, null, false, null, ((a.b) aVar2).f75936a, null, null, 223));
        }
        return G0.f406611a;
    }
}
