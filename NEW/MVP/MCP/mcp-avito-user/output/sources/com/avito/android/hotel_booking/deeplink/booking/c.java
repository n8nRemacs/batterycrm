package com.avito.android.hotel_booking.deeplink.booking;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HotelBookingDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C25721c f163279a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f163280b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.hotel_booking.f f163281c;

    public c(C25721c c25721c, dv.b bVar, com.avito.android.hotel_booking.f fVar) {
        this.f163279a = c25721c;
        this.f163280b = bVar;
        this.f163281c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((C25719a) this.f163279a.get(), (a.InterfaceC4053a) this.f163280b.get(), (com.avito.android.hotel_booking.d) this.f163281c.get());
    }
}
