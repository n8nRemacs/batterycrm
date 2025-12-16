package com.avito.android.location_picker.providers;

import javax.inject.Provider;

/* compiled from: AddressValidationProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.location_picker.providers.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31568e implements dagger.internal.h<C31567d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.geo_common.interactor.g> f182446a;

    public C31568e(Provider<com.avito.android.geo_common.interactor.g> provider) {
        this.f182446a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C31567d(this.f182446a.get());
    }
}
