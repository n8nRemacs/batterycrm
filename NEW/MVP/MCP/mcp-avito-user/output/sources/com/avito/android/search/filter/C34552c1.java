package com.avito.android.search.filter;

import android.content.res.Resources;

/* compiled from: FiltersResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.search.filter.c1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34552c1 implements dagger.internal.h<C34549b1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f262688a;

    public C34552c1(dagger.internal.l lVar) {
        this.f262688a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34549b1((Resources) this.f262688a.f393949a);
    }
}
