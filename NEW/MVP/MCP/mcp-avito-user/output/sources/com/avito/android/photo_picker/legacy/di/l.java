package com.avito.android.photo_picker.legacy.di;

/* compiled from: PhotoPickerModule_ProvideEditorItemPresenter$_avito_photo_picker_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<com.avito.android.photo_picker.legacy.details_list.i> {

    /* renamed from: a, reason: collision with root package name */
    public final f f219739a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f219740b;

    public l(f fVar, dagger.internal.u uVar) {
        this.f219739a = fVar;
        this.f219740b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.device_orientation.i iVar = (com.avito.android.device_orientation.i) this.f219740b.get();
        this.f219739a.getClass();
        return new com.avito.android.photo_picker.legacy.details_list.m(iVar);
    }
}
