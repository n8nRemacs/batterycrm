package com.avito.android.photo_picker.legacy.di;

import javax.inject.Provider;

/* compiled from: PhotoPickerModule_ProvideDetailsRecyclerAdapter$_avito_photo_picker_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final f f219734a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f219735b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f219736c;

    public j(f fVar, dagger.internal.u uVar, Provider provider) {
        this.f219734a = fVar;
        this.f219735b = uVar;
        this.f219736c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.responsive.e eVar = (com.avito.android.recycler.responsive.e) this.f219735b.get();
        com.avito.konveyor.a aVar = this.f219736c.get();
        this.f219734a.getClass();
        return new com.avito.android.recycler.responsive.j(eVar, aVar);
    }
}
