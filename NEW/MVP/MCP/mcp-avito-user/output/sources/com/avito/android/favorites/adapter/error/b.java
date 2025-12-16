package com.avito.android.favorites.adapter.error;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FavoriteErrorItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f156562a;

    public b(u uVar) {
        this.f156562a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f156562a.get());
    }
}
