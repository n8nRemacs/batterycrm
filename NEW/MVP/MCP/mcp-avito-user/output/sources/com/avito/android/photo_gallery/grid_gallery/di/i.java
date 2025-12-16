package com.avito.android.photo_gallery.grid_gallery.di;

import com.avito.android.photo_gallery.grid_gallery.di.e;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GridGalleryModule_NavbarAdapterModule_ProvideNavbarAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f217197a;

    public i(u uVar) {
        this.f217197a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f217197a.get();
        e.C6515e.f217189a.getClass();
        return new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null), aVar, null, 4, null);
    }
}
