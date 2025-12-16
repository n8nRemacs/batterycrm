package com.avito.android.photo_picker.legacy.di;

import javax.inject.Provider;

/* compiled from: PhotoPickerModule_ProvidesPhotoItemPresenter$_avito_photo_picker_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class x implements dagger.internal.h<com.avito.android.photo_picker.legacy.thumbnail_list.d> {

    /* renamed from: a, reason: collision with root package name */
    public final f f219781a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f219782b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.device_orientation.i> f219783c;

    public x(f fVar, dagger.internal.f fVar2, Provider provider) {
        this.f219781a = fVar;
        this.f219782b = fVar2;
        this.f219783c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f219782b));
        com.avito.android.device_orientation.i iVar = this.f219783c.get();
        this.f219781a.getClass();
        return new com.avito.android.photo_picker.legacy.thumbnail_list.i(eVarA, iVar);
    }
}
