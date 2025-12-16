package com.avito.android.advertising.loaders.avito_targeting;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvitoTargetingBannerLoaderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class p implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f88051a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advertising.loaders.buzzoola.c f88052b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a> f88053c;

    /* renamed from: d, reason: collision with root package name */
    public final s f88054d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f88055e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.x> f88056f;

    public p(u uVar, com.avito.android.advertising.loaders.buzzoola.c cVar, Provider provider, s sVar, Provider provider2, Provider provider3) {
        this.f88051a = uVar;
        this.f88052b = cVar;
        this.f88053c = provider;
        this.f88054d = sVar;
        this.f88055e = provider2;
        this.f88056f = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f88051a);
        this.f88052b.getClass();
        com.avito.android.advertising.loaders.buzzoola.b bVar = new com.avito.android.advertising.loaders.buzzoola.b();
        a aVar = this.f88053c.get();
        this.f88054d.getClass();
        return new i(eVarB, bVar, aVar, new r(), this.f88055e.get(), this.f88056f.get());
    }
}
