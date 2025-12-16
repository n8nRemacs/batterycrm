package com.avito.android.advert_collection_adding.mvi;

import dagger.internal.x;
import dagger.internal.y;
import java.util.List;
import javax.inject.Provider;

/* compiled from: AdvertCollectionAddingBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection_adding.k> f81904a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f81905b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f81906c;

    public h(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f81904a = provider;
        this.f81905b = lVar;
        this.f81906c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f81904a.get(), (List) this.f81905b.f393949a, ((Boolean) this.f81906c.f393949a).booleanValue());
    }
}
