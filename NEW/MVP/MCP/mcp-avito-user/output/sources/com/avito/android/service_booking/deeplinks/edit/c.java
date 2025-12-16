package com.avito.android.service_booking.deeplinks.edit;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingEditLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f274254a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f274255b;

    /* renamed from: c, reason: collision with root package name */
    public final f f274256c;

    /* renamed from: d, reason: collision with root package name */
    public final ys0.h f274257d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f274258e;

    /* renamed from: f, reason: collision with root package name */
    public final C25721c f274259f;

    public c(dv.b bVar, dv.b bVar2, f fVar, ys0.h hVar, dv.b bVar3, C25721c c25721c) {
        this.f274254a = bVar;
        this.f274255b = bVar2;
        this.f274256c = fVar;
        this.f274257d = hVar;
        this.f274258e = bVar3;
        this.f274259f = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.b) this.f274254a.get(), (a.InterfaceC4053a) this.f274255b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f274256c.get(), (ServiceBookingFlowIntentFactory) this.f274257d.get(), (a.i) this.f274258e.get(), (C25719a) this.f274259f.get());
    }
}
