package com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters;

import javax.inject.Provider;

/* compiled from: AdditionalSettingsConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<a> f274844a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<r> f274845b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f274846c;

    public m(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f274844a = provider;
        this.f274845b = provider2;
        this.f274846c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f274844a.get(), this.f274845b.get(), (n) this.f274846c.get());
    }
}
