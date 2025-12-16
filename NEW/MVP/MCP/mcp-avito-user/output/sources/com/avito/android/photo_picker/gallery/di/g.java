package com.avito.android.photo_picker.gallery.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GalleryPickerModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.photo_picker.gallery.gallery_list.b f219496a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.photo_picker.gallery.gallery_list.re23.b f219497b;

    public g(com.avito.android.photo_picker.gallery.gallery_list.b bVar, com.avito.android.photo_picker.gallery.gallery_list.re23.b bVar2) {
        this.f219496a = bVar;
        this.f219497b = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.photo_picker.gallery.gallery_list.a aVar = (com.avito.android.photo_picker.gallery.gallery_list.a) this.f219496a.get();
        com.avito.android.photo_picker.gallery.gallery_list.re23.a aVar2 = (com.avito.android.photo_picker.gallery.gallery_list.re23.a) this.f219497b.get();
        int i12 = d.f219492a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        return c10493a.a();
    }
}
