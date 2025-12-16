package com.avito.android.profile_settings_extended.phones;

import com.avito.android.remote.D0;
import com.avito.android.util.InterfaceC35863o4;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSettingsPhonesRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f230812a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f230813b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f230814c;

    public h(Provider<D0> provider, Provider<Gson> provider2, Provider<InterfaceC35863o4> provider3) {
        this.f230812a = provider;
        this.f230813b = provider2;
        this.f230814c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(dagger.internal.g.b(this.f230812a), dagger.internal.g.b(this.f230813b), this.f230814c.get());
    }
}
