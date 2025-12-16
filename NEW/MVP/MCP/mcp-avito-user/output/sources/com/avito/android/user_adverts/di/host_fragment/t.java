package com.avito.android.user_adverts.di.host_fragment;

import Cd.C13243a;
import androidx.view.P0;
import androidx.view.T0;

/* compiled from: UserAdvertsHeaderModule_ProvideSafetyInfoOverlayViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class t implements dagger.internal.h<com.avito.android.user_adverts.root_screen.adverts_host.safety_info.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C35557b f312097a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f312098b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.user_adverts.root_screen.adverts_host.safety_info.f f312099c;

    public t(C35557b c35557b, dagger.internal.l lVar, com.avito.android.user_adverts.root_screen.adverts_host.safety_info.f fVar) {
        this.f312097a = c35557b;
        this.f312098b = lVar;
        this.f312099c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f312098b.f393949a;
        com.avito.android.user_adverts.root_screen.adverts_host.safety_info.b bVar = (com.avito.android.user_adverts.root_screen.adverts_host.safety_info.b) this.f312099c.get();
        this.f312097a.getClass();
        return (com.avito.android.user_adverts.root_screen.adverts_host.safety_info.a) new P0(t02, new C13243a(new j(bVar))).a(com.avito.android.user_adverts.root_screen.adverts_host.safety_info.b.class);
    }
}
