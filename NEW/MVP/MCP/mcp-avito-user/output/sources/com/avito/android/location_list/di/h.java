package com.avito.android.location_list.di;

import com.avito.android.location_list.C31523q;
import com.avito.android.location_list.C31528w;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LocationListModule_ProvideLocationItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f182023a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C31528w> f182024b;

    /* renamed from: c, reason: collision with root package name */
    public final u f182025c;

    public h(d dVar, Provider provider, u uVar) {
        this.f182023a = dVar;
        this.f182024b = provider;
        this.f182025c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        C31528w c31528w = this.f182024b.get();
        C31523q c31523q = (C31523q) this.f182025c.get();
        this.f182023a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(c31528w);
        c10493a.b(c31523q);
        return c10493a.a();
    }
}
