package com.avito.android;

/* compiled from: FavoriteSyncTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.v0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C35993v0 implements dagger.internal.h<FavoriteSyncTask> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.favorites.Y f319193a;

    /* renamed from: b, reason: collision with root package name */
    public final AD.c f319194b;

    public C35993v0(com.avito.android.favorites.Y y12, AD.c cVar) {
        this.f319193a = y12;
        this.f319194b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new FavoriteSyncTask((com.avito.android.favorites.W) this.f319193a.get(), (AD.a) this.f319194b.get());
    }
}
