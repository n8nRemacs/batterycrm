package com.avito.android.hotel_booking.deeplink.enter_data;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HotelBookingEnterDataDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f163309a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f163310b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f163311c;

    public c(dv.b bVar, dv.b bVar2, Provider provider) {
        this.f163309a = bVar;
        this.f163310b = bVar2;
        this.f163311c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.d) this.f163309a.get(), (a.f) this.f163310b.get(), this.f163311c.get());
    }
}
