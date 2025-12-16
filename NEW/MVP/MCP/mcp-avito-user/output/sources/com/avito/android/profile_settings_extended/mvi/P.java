package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSettingsOneTimeEventProducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class P implements dagger.internal.h<O> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f230493a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f230494b;

    public P(Provider<com.avito.android.account.E> provider, Provider<InterfaceC28373a> provider2) {
        this.f230493a = provider;
        this.f230494b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new O(this.f230493a.get(), this.f230494b.get());
    }
}
