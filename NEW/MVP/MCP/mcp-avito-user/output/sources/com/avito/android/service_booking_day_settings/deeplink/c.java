package com.avito.android.service_booking_day_settings.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking_calendar.di.m;
import com.avito.android.service_booking_calendar.r;
import com.avito.android.service_booking_day_settings.di.p;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import tt0.InterfaceC48717c;

/* compiled from: ServiceBookingDayScheduleSettingsLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f277098a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f277099b;

    /* renamed from: c, reason: collision with root package name */
    public final p f277100c;

    /* renamed from: d, reason: collision with root package name */
    public final m f277101d;

    /* renamed from: e, reason: collision with root package name */
    public final C25721c f277102e;

    public c(dv.b bVar, dv.b bVar2, p pVar, m mVar, C25721c c25721c) {
        this.f277098a = bVar;
        this.f277099b = bVar2;
        this.f277100c = pVar;
        this.f277101d = mVar;
        this.f277102e = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.InterfaceC4053a) this.f277098a.get(), (a.b) this.f277099b.get(), (InterfaceC48717c) this.f277100c.get(), (r) this.f277101d.get(), (C25719a) this.f277102e.get());
    }
}
