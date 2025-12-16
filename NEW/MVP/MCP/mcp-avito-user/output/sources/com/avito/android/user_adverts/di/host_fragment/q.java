package com.avito.android.user_adverts.di.host_fragment;

import Cd.C13243a;
import androidx.view.P0;
import androidx.view.T0;

/* compiled from: UserAdvertsHeaderModule_ProvidePanelConfigViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class q implements dagger.internal.h<FI0.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C35557b f312088a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f312089b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.z f312090c;

    public q(C35557b c35557b, dagger.internal.l lVar, com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.z zVar) {
        this.f312088a = c35557b;
        this.f312089b = lVar;
        this.f312090c = zVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f312089b.f393949a;
        com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.y yVar = (com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.y) this.f312090c.get();
        this.f312088a.getClass();
        return (FI0.a) new P0(t02, new C13243a(new C35562g(new FI0.a(yVar, null, 2, null)))).a(FI0.a.class);
    }
}
