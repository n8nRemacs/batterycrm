package com.avito.android.passport.profile_add.create_flow.select_specific.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectSpecificModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f211712a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f211713b;

    public i(u uVar, Provider provider) {
        this.f211712a = uVar;
        this.f211713b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f211712a.get();
        com.avito.konveyor.a aVar2 = this.f211713b.get();
        c.f211702a.getClass();
        j jVar = new j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
