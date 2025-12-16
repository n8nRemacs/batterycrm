package com.avito.android.bxcontent;

import android.content.res.Resources;

/* compiled from: BxContentResourcesProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class W0 implements dagger.internal.h<V0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f109437a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.bxcontent.di.module.K f109438b;

    public W0(dagger.internal.l lVar, com.avito.android.bxcontent.di.module.K k12) {
        this.f109437a = lVar;
        this.f109438b = k12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new V0((Resources) this.f109437a.f393949a, ((Integer) this.f109438b.get()).intValue());
    }
}
