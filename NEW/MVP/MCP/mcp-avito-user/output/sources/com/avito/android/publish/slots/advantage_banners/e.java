package com.avito.android.publish.slots.advantage_banners;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvantageBannersModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f243015a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f243016b;

    public e(u uVar, Provider provider) {
        this.f243015a = uVar;
        this.f243016b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f243015a.get();
        com.avito.konveyor.a aVar2 = this.f243016b.get();
        b.f242984a.getClass();
        j jVar = new j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
