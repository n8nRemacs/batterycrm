package com.avito.android.di.module;

import javax.inject.Provider;
import lW.InterfaceC43691a;

/* compiled from: DefaultSearchLocationModule_ProvideDefaultSearchLocationAnalyticsInteractorImpl$_avito_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class B4 implements dagger.internal.h<com.avito.android.home.default_search_location.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43691a> f143849a;

    public B4(Provider<InterfaceC43691a> provider) {
        this.f143849a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC43691a interfaceC43691a = this.f143849a.get();
        int i12 = C30245y4.f144719a;
        return new com.avito.android.home.default_search_location.b(interfaceC43691a);
    }
}
