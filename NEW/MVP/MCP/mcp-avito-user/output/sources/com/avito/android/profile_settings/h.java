package com.avito.android.profile_settings;

import com.avito.android.remote.D0;
import com.avito.android.util.R0;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileSettingsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f228441a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f228442b;

    public h(Provider<D0> provider, Provider<R0> provider2) {
        this.f228441a = provider;
        this.f228442b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f228442b.get(), dagger.internal.g.a(w.a(this.f228441a)));
    }
}
