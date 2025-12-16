package com.avito.android.service_booking.deeplinks.create_by_seller;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.B2;
import com.avito.android.D2;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingCreateBySellerLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f274232a;

    /* renamed from: b, reason: collision with root package name */
    public final ys0.h f274233b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f274234c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f274235d;

    /* renamed from: e, reason: collision with root package name */
    public final D2 f274236e;

    /* renamed from: f, reason: collision with root package name */
    public final f f274237f;

    /* renamed from: g, reason: collision with root package name */
    public final dv.b f274238g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<R0> f274239h;

    public c(dv.b bVar, ys0.h hVar, C25721c c25721c, dv.b bVar2, D2 d22, f fVar, dv.b bVar3, Provider provider) {
        this.f274232a = bVar;
        this.f274233b = hVar;
        this.f274234c = c25721c;
        this.f274235d = bVar2;
        this.f274236e = d22;
        this.f274237f = fVar;
        this.f274238g = bVar3;
        this.f274239h = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.InterfaceC4053a) this.f274232a.get(), (ServiceBookingFlowIntentFactory) this.f274233b.get(), (C25719a) this.f274234c.get(), (a.b) this.f274235d.get(), (B2) this.f274236e.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f274237f.get(), (a.i) this.f274238g.get(), this.f274239h.get());
    }
}
