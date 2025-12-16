package com.avito.android.favorites;

import android.content.res.Resources;

/* compiled from: FavoriteListResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.favorites.f0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30658f0 implements dagger.internal.h<C30655e0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f157364a;

    public C30658f0(dagger.internal.l lVar) {
        this.f157364a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C30655e0((Resources) this.f157364a.f393949a);
    }
}
