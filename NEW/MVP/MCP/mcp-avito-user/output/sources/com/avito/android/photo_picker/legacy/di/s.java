package com.avito.android.photo_picker.legacy.di;

/* compiled from: PhotoPickerModule_ProvideThumbnailItemBlueprint$_avito_photo_picker_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class s implements dagger.internal.h<TV0.b<com.avito.android.photo_picker.legacy.thumbnail_list.j, com.avito.android.photo_picker.legacy.thumbnail_list.a>> {

    /* renamed from: a, reason: collision with root package name */
    public final f f219770a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f219771b;

    public s(f fVar, dagger.internal.u uVar) {
        this.f219770a = fVar;
        this.f219771b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.photo_picker.legacy.thumbnail_list.d dVar = (com.avito.android.photo_picker.legacy.thumbnail_list.d) this.f219771b.get();
        this.f219770a.getClass();
        return new com.avito.android.photo_picker.legacy.thumbnail_list.c(dVar);
    }
}
