package com.avito.android.user_adverts.di.host_fragment;

import Cd.C13243a;
import androidx.view.P0;
import androidx.view.T0;

/* compiled from: UserAdvertsHeaderModule_ProvideServiceFreemiumViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class v implements dagger.internal.h<com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C35557b f312103a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f312104b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.e f312105c;

    public v(C35557b c35557b, dagger.internal.l lVar, com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.e eVar) {
        this.f312103a = c35557b;
        this.f312104b = lVar;
        this.f312105c = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f312104b.f393949a;
        com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.d dVar = (com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.d) this.f312105c.get();
        this.f312103a.getClass();
        return (com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.a) new P0(t02, new C13243a(new l(dVar))).a(com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.d.class);
    }
}
