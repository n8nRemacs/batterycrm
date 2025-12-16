package com.avito.android.service_booking_calendar.link;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking_calendar.di.m;
import com.avito.android.service_booking_calendar.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingCalendarMonthLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f276136a;

    /* renamed from: b, reason: collision with root package name */
    public final m f276137b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f276138c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f276139d;

    public c(dv.b bVar, m mVar, dv.b bVar2, C25721c c25721c) {
        this.f276136a = bVar;
        this.f276137b = mVar;
        this.f276138c = bVar2;
        this.f276139d = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.InterfaceC4053a) this.f276136a.get(), (r) this.f276137b.get(), (a.b) this.f276138c.get(), (C25719a) this.f276139d.get());
    }
}
