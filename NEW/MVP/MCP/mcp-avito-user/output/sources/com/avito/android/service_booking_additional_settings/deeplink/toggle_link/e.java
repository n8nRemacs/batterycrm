package com.avito.android.service_booking_additional_settings.deeplink.toggle_link;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.g;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingToggleLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C25721c f275153a;

    /* renamed from: b, reason: collision with root package name */
    public final g f275154b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f275155c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f275156d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f275157e;

    public e(C25721c c25721c, g gVar, dv.b bVar, dv.b bVar2, Provider provider) {
        this.f275153a = c25721c;
        this.f275154b = gVar;
        this.f275155c = bVar;
        this.f275156d = bVar2;
        this.f275157e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((C25719a) this.f275153a.get(), (com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.f) this.f275154b.get(), (a.g) this.f275155c.get(), (a.i) this.f275156d.get(), this.f275157e.get());
    }
}
