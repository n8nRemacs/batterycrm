package com.avito.android.advert_collection.mvi;

import com.avito.android.account.E;
import com.avito.android.remote.H;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCollectionBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection.i> f81664a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f81665b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<H> f81666c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f81667d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f81668e;

    public i(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f81664a = provider;
        this.f81665b = lVar;
        this.f81666c = provider2;
        this.f81667d = provider3;
        this.f81668e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f81664a.get(), ((Boolean) this.f81665b.f393949a).booleanValue(), this.f81666c.get(), this.f81667d.get(), (String) this.f81668e.f393949a);
    }
}
