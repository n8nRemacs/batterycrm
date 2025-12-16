package com.avito.android.photo_gallery.grid_gallery.items.single_entity;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GridGallerySingleEntityBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f217284a;

    public b(e eVar) {
        this.f217284a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f217284a.get());
    }
}
