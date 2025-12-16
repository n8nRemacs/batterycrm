package com.avito.android.photo_picker.gallery.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GalleryPickerModule_ProvidePhotoGridPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f219498a;

    public h(u uVar) {
        this.f219498a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f219498a.get();
        int i12 = d.f219492a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
