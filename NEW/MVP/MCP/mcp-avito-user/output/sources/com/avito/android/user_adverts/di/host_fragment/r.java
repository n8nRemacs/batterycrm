package com.avito.android.user_adverts.di.host_fragment;

import Cd.C13243a;
import androidx.view.P0;
import androidx.view.T0;

/* compiled from: UserAdvertsHeaderModule_ProvidePanelSoaViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class r implements dagger.internal.h<JI0.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C35557b f312091a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f312092b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.F f312093c;

    public r(C35557b c35557b, dagger.internal.l lVar, com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.F f12) {
        this.f312091a = c35557b;
        this.f312092b = lVar;
        this.f312093c = f12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f312092b.f393949a;
        com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.E e12 = (com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.E) this.f312093c.get();
        this.f312091a.getClass();
        return (JI0.a) new P0(t02, new C13243a(new h(new JI0.a(e12, null, 2, null)))).a(JI0.a.class);
    }
}
