package com.avito.android.advertising.adapter.items.adstub;

import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EmptyAdStubItemNewBlueprint_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f86936a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f86937b;

    public c(dagger.internal.l lVar, Provider provider) {
        this.f86936a = provider;
        this.f86937b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f86936a.get(), (com.avito.android.advertising.a) this.f86937b.f393949a);
    }
}
