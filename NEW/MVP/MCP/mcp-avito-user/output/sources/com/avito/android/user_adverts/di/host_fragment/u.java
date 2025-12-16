package com.avito.android.user_adverts.di.host_fragment;

import Cd.C13243a;
import androidx.view.P0;
import androidx.view.T0;

/* compiled from: UserAdvertsHeaderModule_ProvideSearchViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class u implements dagger.internal.h<com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F> {

    /* renamed from: a, reason: collision with root package name */
    public final C35557b f312100a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f312101b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.x f312102c;

    public u(C35557b c35557b, dagger.internal.l lVar, com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.x xVar) {
        this.f312100a = c35557b;
        this.f312101b = lVar;
        this.f312102c = xVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f312101b.f393949a;
        com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.w wVar = (com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.w) this.f312102c.get();
        this.f312100a.getClass();
        return (com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F) new P0(t02, new C13243a(new k(wVar))).a(com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F.class);
    }
}
