package com.avito.android.photo_picker.legacy.di;

/* compiled from: PhotoPickerModule_ProvideDetailsBluePrintProvider$_avito_photo_picker_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<com.avito.android.photo_picker.legacy.details_list.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f219729a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f219730b;

    /* renamed from: c, reason: collision with root package name */
    public final k f219731c;

    public h(f fVar, dagger.internal.u uVar, k kVar) {
        this.f219729a = fVar;
        this.f219730b = uVar;
        this.f219731c = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.photo_picker.legacy.details_list.i iVar = (com.avito.android.photo_picker.legacy.details_list.i) this.f219730b.get();
        com.avito.android.photo_picker.legacy.details_list.c cVar = (com.avito.android.photo_picker.legacy.details_list.c) this.f219731c.get();
        this.f219729a.getClass();
        return new com.avito.android.photo_picker.legacy.details_list.b(iVar, cVar);
    }
}
