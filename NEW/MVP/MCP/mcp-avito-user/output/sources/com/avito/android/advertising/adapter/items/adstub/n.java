package com.avito.android.advertising.adapter.items.adstub;

import dagger.internal.y;

/* compiled from: NotLoadAdStubBigGridNewBlueprint_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f86964a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f86965b;

    public n(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f86964a = uVar;
        this.f86965b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((s) this.f86964a.get(), (com.avito.android.advertising.a) this.f86965b.f393949a);
    }
}
