package com.avito.android.advertising.adapter.items.adstub;

import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotLoadAdStubGridNewBlueprint_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<s> f86970a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f86971b;

    public p(dagger.internal.l lVar, Provider provider) {
        this.f86970a = provider;
        this.f86971b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f86970a.get(), (com.avito.android.advertising.a) this.f86971b.f393949a);
    }
}
