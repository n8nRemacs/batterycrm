package com.avito.android.passport.profile_add.merge.profiles_list;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfilesListModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class p implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final o f213310a;

    /* renamed from: b, reason: collision with root package name */
    public final u f213311b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f213312c;

    public p(o oVar, u uVar, Provider provider) {
        this.f213310a = oVar;
        this.f213311b = uVar;
        this.f213312c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f213311b.get();
        com.avito.konveyor.a aVar2 = this.f213312c.get();
        this.f213310a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
