package com.avito.android.favorites;

/* compiled from: FavoriteAdvertsSyncRunnerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class Y implements dagger.internal.h<X> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f156337a;

    public Y(dagger.internal.f fVar) {
        this.f156337a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new X((com.avito.android.service.short_task.j) this.f156337a.get());
    }
}
