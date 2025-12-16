package com.avito.android.hotel_booking.deeplink.create_messenger;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HotelCreateMessengerDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ZI.a> f163297a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f163298b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f163299c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f163300d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f163301e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f163302f;

    public e(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f163297a = provider;
        this.f163298b = bVar;
        this.f163299c = bVar2;
        this.f163300d = provider2;
        this.f163301e = fVar;
        this.f163302f = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f163297a.get(), (a.g) this.f163298b.get(), (a.i) this.f163299c.get(), this.f163300d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f163301e.get(), this.f163302f.get());
    }
}
