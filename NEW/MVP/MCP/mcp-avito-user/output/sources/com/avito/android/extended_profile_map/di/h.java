package com.avito.android.extended_profile_map.di;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zA.InterfaceC50427a;

/* compiled from: ExtendedProfileMapModule_ProvideMapAnalyticsInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<InterfaceC50427a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f151246a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f151247b;

    public h(Provider<E> provider, Provider<InterfaceC28373a> provider2) {
        this.f151246a = provider;
        this.f151247b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        E e12 = this.f151246a.get();
        InterfaceC28373a interfaceC28373a = this.f151247b.get();
        f.f151244a.getClass();
        return new com.avito.android.extended_profile_map.f(e12, interfaceC28373a);
    }
}
