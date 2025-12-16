package com.avito.android.advert.item.beduin.v2;

import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NativeBlockFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Gson> f73375a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f73376b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f73377c;

    public s(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f73375a = provider;
        this.f73376b = lVar;
        this.f73377c = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r(dagger.internal.g.b(this.f73375a), (Y41.a) this.f73376b.f393949a, (Y41.a) this.f73377c.f393949a);
    }
}
