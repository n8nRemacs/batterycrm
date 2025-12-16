package com.avito.android.social.esia.mvi;

import com.avito.android.remote.profile.generated.api.ProfileApi;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EsiaAuthInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ProfileApi> f284401a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f284402b;

    public f(Provider<ProfileApi> provider, Provider<R0> provider2) {
        this.f284401a = provider;
        this.f284402b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f284401a.get(), this.f284402b.get());
    }
}
