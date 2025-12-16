package com.avito.android.publish.slots.advantage_banners;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvantageBannersModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.publish.slots.advantage_banners.banner.b f243014a;

    public d(com.avito.android.publish.slots.advantage_banners.banner.b bVar) {
        this.f243014a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.publish.slots.advantage_banners.banner.a aVar = (com.avito.android.publish.slots.advantage_banners.banner.a) this.f243014a.get();
        b.f242984a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
