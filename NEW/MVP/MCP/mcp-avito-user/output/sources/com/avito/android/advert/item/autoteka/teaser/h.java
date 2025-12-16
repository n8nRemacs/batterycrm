package com.avito.android.advert.item.autoteka.teaser;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAutotekaTeaserBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f73033a;

    /* renamed from: b, reason: collision with root package name */
    public final u f73034b;

    public h(u uVar, Provider provider) {
        this.f73033a = provider;
        this.f73034b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f73033a.get(), (com.avito.konveyor.adapter.j) this.f73034b.get());
    }
}
