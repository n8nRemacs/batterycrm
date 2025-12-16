package com.avito.android.settings;

import com.avito.android.remote.V0;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SettingsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V0> f280888a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f280889b;

    public h(Provider<V0> provider, Provider<R0> provider2) {
        this.f280888a = provider;
        this.f280889b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f280888a.get(), this.f280889b.get());
    }
}
