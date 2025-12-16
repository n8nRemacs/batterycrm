package com.avito.android.photo_gallery.grid_gallery;

import kotlinx.coroutines.flow.i2;

/* compiled from: GridGalleryViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.photo_gallery.grid_gallery.mvi.z f217084a;

    public A(com.avito.android.photo_gallery.grid_gallery.mvi.z zVar) {
        this.f217084a = zVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.photo_gallery.grid_gallery.mvi.y yVar = (com.avito.android.photo_gallery.grid_gallery.mvi.y) this.f217084a.get();
        i2.f411430a.getClass();
        return new z(yVar, i2.a.f411433c);
    }
}
