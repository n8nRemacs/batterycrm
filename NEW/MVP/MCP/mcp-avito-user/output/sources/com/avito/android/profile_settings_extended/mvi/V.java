package com.avito.android.profile_settings_extended.mvi;

import javax.inject.Provider;

/* compiled from: ExtendedProfileSettingsReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class V implements dagger.internal.h<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.profile_settings_extended.carousel.a> f230499a;

    public V(Provider<com.avito.android.profile_settings_extended.carousel.a> provider) {
        this.f230499a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Q(this.f230499a.get());
    }
}
