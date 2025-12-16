package com.avito.android.photo_picker.legacy.di;

import javax.inject.Provider;

/* compiled from: PhotoPickerModule_ProvideThumbnailsRecyclerAdapter$_avito_photo_picker_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class v implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final f f219776a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f219777b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f219778c;

    public v(f fVar, Provider<com.avito.konveyor.adapter.a> provider, Provider<com.avito.konveyor.a> provider2) {
        this.f219776a = fVar;
        this.f219777b = provider;
        this.f219778c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f219777b.get();
        com.avito.konveyor.a aVar2 = this.f219778c.get();
        this.f219776a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
