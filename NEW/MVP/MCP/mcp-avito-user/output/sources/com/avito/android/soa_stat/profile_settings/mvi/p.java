package com.avito.android.soa_stat.profile_settings.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SoaStatSettingActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.soa_stat.profile_settings.domain.c f284209a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f284210b;

    public p(com.avito.android.soa_stat.profile_settings.domain.c cVar, Provider provider) {
        this.f284209a = cVar;
        this.f284210b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.soa_stat.profile_settings.domain.a) this.f284209a.get(), this.f284210b.get());
    }
}
