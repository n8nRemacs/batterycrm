package com.avito.android.user_adverts.di.host_fragment;

import Cd.C13243a;
import androidx.view.P0;
import androidx.view.T0;

/* compiled from: UserAdvertsHeaderModule_ProvideCharityOverlayViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<com.avito.android.user_adverts.root_screen.adverts_host.charity_info.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C35557b f312079a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f312080b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.user_adverts.root_screen.adverts_host.charity_info.e f312081c;

    public n(C35557b c35557b, dagger.internal.l lVar, com.avito.android.user_adverts.root_screen.adverts_host.charity_info.e eVar) {
        this.f312079a = c35557b;
        this.f312080b = lVar;
        this.f312081c = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f312080b.f393949a;
        com.avito.android.user_adverts.root_screen.adverts_host.charity_info.b bVar = (com.avito.android.user_adverts.root_screen.adverts_host.charity_info.b) this.f312081c.get();
        this.f312079a.getClass();
        return (com.avito.android.user_adverts.root_screen.adverts_host.charity_info.a) new P0(t02, new C13243a(new C35559d(bVar))).a(com.avito.android.user_adverts.root_screen.adverts_host.charity_info.b.class);
    }
}
