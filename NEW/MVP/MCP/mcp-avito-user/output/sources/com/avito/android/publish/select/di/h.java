package com.avito.android.publish.select.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f242684a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.checkable.a> f242685b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.select.title.f> f242686c;

    /* renamed from: d, reason: collision with root package name */
    public final u f242687d;

    public h(c cVar, Provider provider, Provider provider2, u uVar) {
        this.f242684a = cVar;
        this.f242685b = provider;
        this.f242686c = provider2;
        this.f242687d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.blueprints.publish.checkable.a aVar = this.f242685b.get();
        com.avito.android.select.title.f fVar = this.f242686c.get();
        com.avito.android.blueprints.publish.header.b bVar = (com.avito.android.blueprints.publish.header.b) this.f242687d.get();
        this.f242684a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(fVar);
        c10493a.b(bVar);
        return c10493a.a();
    }
}
