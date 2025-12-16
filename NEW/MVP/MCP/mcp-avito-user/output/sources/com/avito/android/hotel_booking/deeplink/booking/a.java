package com.avito.android.hotel_booking.deeplink.booking;

import Ju.AbstractC14250d;
import com.avito.android.hotel_booking.HotelBookingDeeplink;
import com.avito.android.hotel_booking.HotelBookingOpenParams;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HotelBookingDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ HotelBookingDeeplink f163274l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f163275m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HotelBookingDeeplink hotelBookingDeeplink, b bVar) {
        super(0);
        this.f163274l = hotelBookingDeeplink;
        this.f163275m = bVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        HotelBookingDeeplink hotelBookingDeeplink = this.f163274l;
        HotelBookingOpenParams hotelBookingOpenParams = new HotelBookingOpenParams(hotelBookingDeeplink.f163240b, hotelBookingDeeplink.f163241c, hotelBookingDeeplink.f163242d, hotelBookingDeeplink.f163243e, hotelBookingDeeplink.f163244f, hotelBookingDeeplink.f163245g, hotelBookingDeeplink.f163246h);
        b bVar = this.f163275m;
        bVar.f163277g.R(bVar.f163278h.a(hotelBookingOpenParams), com.avito.android.deeplink_handler.view.b.f134588l);
        bVar.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
