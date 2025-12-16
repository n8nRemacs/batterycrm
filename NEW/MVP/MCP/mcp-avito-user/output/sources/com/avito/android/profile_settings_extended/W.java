package com.avito.android.profile_settings_extended;

import com.avito.android.remote.D0;
import com.google.gson.Gson;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSettingsToggleInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class W implements dagger.internal.h<V> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f229081a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f229082b;

    public W(Provider<D0> provider, Provider<Gson> provider2) {
        this.f229081a = provider;
        this.f229082b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new V(this.f229082b.get(), dagger.internal.g.b(this.f229081a));
    }
}
