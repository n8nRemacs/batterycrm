package com.avito.android.profile_settings_extended.adapter.item_selections;

import com.avito.android.remote.D0;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSettingsItemSelectionsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f229617a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f229618b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f229619c;

    public c(Provider<D0> provider, Provider<Gson> provider2, Provider<R0> provider3) {
        this.f229617a = provider;
        this.f229618b = provider2;
        this.f229619c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(dagger.internal.g.b(this.f229617a), this.f229618b.get(), this.f229619c.get());
    }
}
