package com.avito.android.photo_gallery.grid_gallery.di;

import com.avito.android.photo_gallery.grid_gallery.di.e;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GridGalleryModule_ContentAdapterModule_ProvidePagerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f217195a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.photo_gallery.grid_gallery.items.navbar_block.b f217196b;

    public h(u uVar, com.avito.android.photo_gallery.grid_gallery.items.navbar_block.b bVar) {
        this.f217195a = uVar;
        this.f217196b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f217195a.get();
        this.f217196b.getClass();
        com.avito.android.photo_gallery.grid_gallery.items.navbar_block.a aVar2 = new com.avito.android.photo_gallery.grid_gallery.items.navbar_block.a();
        e.b.f217188a.getClass();
        return new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null), aVar, aVar2);
    }
}
