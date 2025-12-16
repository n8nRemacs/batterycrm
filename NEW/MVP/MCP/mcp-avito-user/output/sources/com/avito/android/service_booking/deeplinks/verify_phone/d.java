package com.avito.android.service_booking.deeplinks.verify_phone;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingVerifyPhoneLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C25721c f274275a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.service_booking.interactors.c f274276b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f274277c;

    /* renamed from: d, reason: collision with root package name */
    public final f f274278d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f274279e;

    /* renamed from: f, reason: collision with root package name */
    public final f f274280f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f274281g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<R0> f274282h;

    public d(C25721c c25721c, com.avito.android.service_booking.interactors.c cVar, dv.b bVar, f fVar, dv.b bVar2, f fVar2, Provider provider, Provider provider2) {
        this.f274275a = c25721c;
        this.f274276b = cVar;
        this.f274277c = bVar;
        this.f274278d = fVar;
        this.f274279e = bVar2;
        this.f274280f = fVar2;
        this.f274281g = provider;
        this.f274282h = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((C25719a) this.f274275a.get(), (com.avito.android.service_booking.interactors.a) this.f274276b.get(), (a.g) this.f274277c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f274278d.get(), (a.i) this.f274279e.get(), (InterfaceC28373a) this.f274280f.get(), this.f274281g.get(), this.f274282h.get());
    }
}
