package com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking_additional_settings.di.m;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingAdditionalSettingsLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f275135a;

    /* renamed from: b, reason: collision with root package name */
    public final m f275136b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f275137c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f275138d;

    public d(dv.b bVar, m mVar, dv.b bVar2, C25721c c25721c) {
        this.f275135a = bVar;
        this.f275136b = mVar;
        this.f275137c = bVar2;
        this.f275138d = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((a.InterfaceC4053a) this.f275135a.get(), (a) this.f275136b.get(), (a.b) this.f275137c.get(), (C25719a) this.f275138d.get());
    }
}
