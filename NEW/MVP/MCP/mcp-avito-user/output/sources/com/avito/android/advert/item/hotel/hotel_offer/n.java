package com.avito.android.advert.item.hotel.hotel_offer;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: AdvertHotelOfferStateProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/n;", "Lcom/avito/android/advert/item/hotel/hotel_offer/m;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q f76188a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<HotelOfferState> f76189b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final n2<HotelOfferState> f76190c;

    @Inject
    public n(@Y61.k q qVar) {
        this.f76188a = qVar;
        HotelOfferState.f75900j.getClass();
        Z1<HotelOfferState> z1A = p2.a(HotelOfferState.f75901k);
        this.f76189b = z1A;
        this.f76190c = C43175k.b(z1A);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.m
    @Y61.k
    public final Bundle H() {
        return C22777e.b(new Q("hotel_offer_state_key", this.f76190c.getValue()));
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.m
    public final void a(@Y61.k HotelOfferState hotelOfferState) {
        this.f76189b.K5(this.f76188a.a(hotelOfferState));
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.m
    public final void b(@Y61.l Bundle bundle) {
        if (bundle == null) {
            return;
        }
        HotelOfferState hotelOfferState = (HotelOfferState) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("hotel_offer_state_key", HotelOfferState.class) : bundle.getParcelable("hotel_offer_state_key"));
        if (hotelOfferState == null) {
            return;
        }
        this.f76189b.K5(hotelOfferState);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.m
    @Y61.k
    public final n2<HotelOfferState> getState() {
        return this.f76190c;
    }
}
