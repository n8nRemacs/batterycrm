package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi;

/* compiled from: PanelSoaReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class J implements dagger.internal.h<I> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.h f313513a;

    public J(com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.h hVar) {
        this.f313513a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I((com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.g) this.f313513a.get());
    }
}
