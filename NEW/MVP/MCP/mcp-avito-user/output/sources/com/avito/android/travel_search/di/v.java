package com.avito.android.travel_search.di;

import ac.C19864a;
import com.avito.android.C29640d;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.travel_search.di.a;
import dagger.internal.x;
import dagger.internal.y;
import is0.C42101c;
import is0.InterfaceC42100b;
import javax.inject.Provider;

/* compiled from: TravelSearchModule_ProvideSerpAnalyticsInteractor$_avito_travel_search_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class v implements dagger.internal.h<InterfaceC42100b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f303086a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.e> f303087b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C19864a> f303088c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C29640d> f303089d;

    public v(Provider<InterfaceC28373a> provider, Provider<com.avito.android.analytics.provider.e> provider2, Provider<C19864a> provider3, Provider<C29640d> provider4) {
        this.f303086a = provider;
        this.f303087b = provider2;
        this.f303088c = provider3;
        this.f303089d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((a.c.C35264d) this.f303086a).get();
        com.avito.android.analytics.provider.e eVarZ0 = ((a.c.g0) this.f303087b).f303033a.Z0();
        p.f303076a.getClass();
        return new C42101c(interfaceC28373a, eVarZ0);
    }
}
