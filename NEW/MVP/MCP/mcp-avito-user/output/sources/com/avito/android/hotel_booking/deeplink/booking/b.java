package com.avito.android.hotel_booking.deeplink.booking;

import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.hotel_booking.HotelBookingDeeplink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HotelBookingDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/deeplink/booking/b;", "Lev/a;", "Lcom/avito/android/hotel_booking/HotelBookingDeeplink;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends AbstractC40161a<HotelBookingDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C25719a f163276f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f163277g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.hotel_booking.d f163278h;

    @Inject
    public b(@k C25719a c25719a, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.hotel_booking.d dVar) {
        this.f163276f = c25719a;
        this.f163277g = interfaceC4053a;
        this.f163278h = dVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        HotelBookingDeeplink hotelBookingDeeplink = (HotelBookingDeeplink) deepLink;
        this.f163276f.b(hotelBookingDeeplink, this, null, new a(hotelBookingDeeplink, this));
    }
}
