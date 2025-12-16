package com.avito.android.service_booking_details.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingItemDetailsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_details.domain.a> f277439a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f277440b;

    public k(dagger.internal.l lVar, Provider provider) {
        this.f277439a = provider;
        this.f277440b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f277439a.get(), (String) this.f277440b.f393949a);
    }
}
