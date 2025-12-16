package com.avito.android.advert.item.hotel.hotel_offer.floating_view;

import com.avito.android.advert.item.Z0;
import com.avito.android.advert.item.hotel.hotel_offer.HotelOfferFloatingViewState;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertHotelBookingInfoFloatingPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ HotelOfferFloatingViewState f75971l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f75972m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(HotelOfferFloatingViewState hotelOfferFloatingViewState, f fVar) {
        super(0);
        this.f75971l = hotelOfferFloatingViewState;
        this.f75972m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Z0 z02;
        List<Image> list = ((HotelOfferFloatingViewState.HasOffer) this.f75971l).f75894g;
        if (list != null && (z02 = this.f75972m.f75983h) != null) {
            z02.y(list);
        }
        return G0.f406611a;
    }
}
