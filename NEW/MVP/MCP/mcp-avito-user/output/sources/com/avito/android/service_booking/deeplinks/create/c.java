package com.avito.android.service_booking.deeplinks.create;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingCreateLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f274204a;

    /* renamed from: b, reason: collision with root package name */
    public final ys0.h f274205b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f274206c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f274207d;

    /* renamed from: e, reason: collision with root package name */
    public final f f274208e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f274209f;

    public c(dv.b bVar, ys0.h hVar, C25721c c25721c, dv.b bVar2, f fVar, Provider provider) {
        this.f274204a = bVar;
        this.f274205b = hVar;
        this.f274206c = c25721c;
        this.f274207d = bVar2;
        this.f274208e = fVar;
        this.f274209f = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.InterfaceC4053a) this.f274204a.get(), (ServiceBookingFlowIntentFactory) this.f274205b.get(), (C25719a) this.f274206c.get(), (a.b) this.f274207d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f274208e.get(), this.f274209f.get());
    }
}
