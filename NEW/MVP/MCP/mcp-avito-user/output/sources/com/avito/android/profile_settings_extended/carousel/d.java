package com.avito.android.profile_settings_extended.carousel;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.D0;
import com.google.gson.Gson;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSettingsCarouselInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f230018a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f230019b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f230020c;

    public d(Provider<D0> provider, Provider<Gson> provider2, Provider<InterfaceC28373a> provider3) {
        this.f230018a = provider;
        this.f230019b = provider2;
        this.f230020c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(g.b(this.f230018a), g.b(this.f230019b), this.f230020c.get());
    }
}
