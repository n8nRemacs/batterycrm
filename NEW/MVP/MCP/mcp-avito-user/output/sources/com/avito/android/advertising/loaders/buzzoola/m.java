package com.avito.android.advertising.loaders.buzzoola;

import com.avito.android.C30828i;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rb.InterfaceC47628b;

/* compiled from: BuzzoolaBannerLoaderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final u f88326a;

    /* renamed from: b, reason: collision with root package name */
    public final u f88327b;

    /* renamed from: c, reason: collision with root package name */
    public final c f88328c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC47628b> f88329d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C30828i> f88330e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.x> f88331f;

    public m(u uVar, u uVar2, c cVar, Provider provider, Provider provider2, Provider provider3) {
        this.f88326a = uVar;
        this.f88327b = uVar2;
        this.f88328c = cVar;
        this.f88329d = provider;
        this.f88330e = provider2;
        this.f88331f = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f88326a);
        com.avito.android.advertising.loaders.event_service.c cVar = (com.avito.android.advertising.loaders.event_service.c) this.f88327b.get();
        this.f88328c.getClass();
        b bVar = new b();
        InterfaceC47628b interfaceC47628b = this.f88329d.get();
        this.f88330e.get();
        return new l(eVarB, cVar, bVar, interfaceC47628b, this.f88331f.get());
    }
}
