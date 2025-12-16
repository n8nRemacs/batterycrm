package com.avito.android.profile_phones.phones_list.mvi;

import javax.inject.Provider;

/* compiled from: PhonesDeviceListConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.profile_phones.phones_list.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33431c implements dagger.internal.h<C33430b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.remote.H> f227954a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.profile_phones.phones_list.L> f227955b;

    public C33431c(Provider<com.avito.android.remote.H> provider, Provider<com.avito.android.profile_phones.phones_list.L> provider2) {
        this.f227954a = provider;
        this.f227955b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33430b(this.f227954a.get(), this.f227955b.get());
    }
}
