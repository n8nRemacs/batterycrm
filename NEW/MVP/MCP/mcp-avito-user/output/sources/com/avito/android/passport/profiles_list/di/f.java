package com.avito.android.passport.profiles_list.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfilesListModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final e f213787a;

    /* renamed from: b, reason: collision with root package name */
    public final u f213788b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f213789c;

    public f(e eVar, u uVar, Provider provider) {
        this.f213787a = eVar;
        this.f213788b = uVar;
        this.f213789c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f213788b.get();
        com.avito.konveyor.a aVar2 = this.f213789c.get();
        this.f213787a.getClass();
        return new j(aVar, aVar2);
    }
}
