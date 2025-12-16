package com.avito.android.photo_picker.legacy.di;

/* compiled from: PhotoPickerModule_ProvidesDetailsAdapterPresenter$_avito_photo_picker_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class w implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f219779a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f219780b;

    public w(f fVar, dagger.internal.u uVar) {
        this.f219779a = fVar;
        this.f219780b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f219780b.get();
        this.f219779a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
