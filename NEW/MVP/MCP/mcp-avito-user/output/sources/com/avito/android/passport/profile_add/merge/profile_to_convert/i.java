package com.avito.android.passport.profile_add.merge.profile_to_convert;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileToConvertKonveyorModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f213131a;

    /* renamed from: b, reason: collision with root package name */
    public final u f213132b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f213133c;

    public i(h hVar, u uVar, Provider provider) {
        this.f213131a = hVar;
        this.f213132b = uVar;
        this.f213133c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f213132b.get();
        com.avito.konveyor.a aVar2 = this.f213133c.get();
        this.f213131a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
