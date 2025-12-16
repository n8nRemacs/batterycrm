package com.avito.android.service_booking_settings.work_hours.item.license_agreement;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LicenseAgreementItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f277972a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f277973b;

    public b(d dVar, Provider provider) {
        this.f277972a = dVar;
        this.f277973b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f277972a.getClass();
        return new a(new c(), this.f277973b.get());
    }
}
