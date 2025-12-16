package com.avito.android.service_booking_common.link.details;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking_details.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingItemDetailsLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f276637a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f276638b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f276639c;

    public b(d dVar, dv.b bVar, dv.b bVar2) {
        this.f276637a = dVar;
        this.f276638b = bVar;
        this.f276639c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.service_booking_details.b) this.f276637a.get(), (a.b) this.f276638b.get(), (a.InterfaceC4053a) this.f276639c.get());
    }
}
