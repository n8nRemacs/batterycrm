package com.avito.android.profile.edit.di;

import javax.inject.Provider;

/* compiled from: EditProfileModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.profile.edit.di.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33320e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f222161a;

    public C33320e(Provider<com.avito.konveyor.a> provider) {
        this.f222161a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f222161a.get();
        C33319d.f222158a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
