package com.avito.android.advert.item.autoteka.teaser;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAutotekaTeaserPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f73038a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.a> f73039b;

    /* renamed from: c, reason: collision with root package name */
    public final u f73040c;

    public k(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f73038a = lVar;
        this.f73039b = provider;
        this.f73040c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((String) this.f73038a.f393949a, this.f73039b.get(), (com.avito.konveyor.adapter.a) this.f73040c.get());
    }
}
