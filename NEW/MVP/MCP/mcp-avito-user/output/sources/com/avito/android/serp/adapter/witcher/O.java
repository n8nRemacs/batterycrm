package com.avito.android.serp.adapter.witcher;

import android.content.res.Resources;

/* compiled from: WitcherResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class O implements dagger.internal.h<N> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f273797a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.h f273798b;

    public O(dagger.internal.l lVar, dagger.internal.h hVar) {
        this.f273797a = lVar;
        this.f273798b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new N((Resources) this.f273797a.f393949a, ((Integer) this.f273798b.get()).intValue());
    }
}
