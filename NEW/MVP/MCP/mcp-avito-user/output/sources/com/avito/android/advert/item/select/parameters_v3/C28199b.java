package com.avito.android.advert.item.select.parameters_v3;

import javax.inject.Provider;

/* compiled from: AutoSelectParametersV3Blueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.select.parameters_v3.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28199b implements dagger.internal.h<C28198a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28200c> f79564a;

    public C28199b(Provider<InterfaceC28200c> provider) {
        this.f79564a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28198a(this.f79564a.get());
    }
}
