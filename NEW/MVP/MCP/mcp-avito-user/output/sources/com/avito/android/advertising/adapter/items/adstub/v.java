package com.avito.android.advertising.adapter.items.adstub;

import dagger.internal.y;
import javax.inject.Provider;
import ob.InterfaceC44740d;

/* compiled from: RdsEmptyAdStubItemBlueprint_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f86994a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f86995b;

    public v(dagger.internal.l lVar, Provider provider) {
        this.f86994a = provider;
        this.f86995b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u(this.f86994a.get(), (InterfaceC44740d) this.f86995b.f393949a);
    }
}
