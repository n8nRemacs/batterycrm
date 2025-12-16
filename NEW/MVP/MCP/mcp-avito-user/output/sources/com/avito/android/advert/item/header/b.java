package com.avito.android.advert.item.header;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsHeaderBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f75834a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f75835b;

    public b(u uVar, Provider provider) {
        this.f75834a = uVar;
        this.f75835b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f75834a.get(), this.f75835b.get());
    }
}
