package com.avito.android.location_picker.providers;

import javax.inject.Provider;
import uW.InterfaceC48983a;

/* compiled from: AdvertsCountProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48983a> f182455a;

    public j(Provider<InterfaceC48983a> provider) {
        this.f182455a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(dagger.internal.g.b(this.f182455a));
    }
}
