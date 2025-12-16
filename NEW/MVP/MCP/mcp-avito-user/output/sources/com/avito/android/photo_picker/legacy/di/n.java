package com.avito.android.photo_picker.legacy.di;

import com.avito.android.permissions.C33031a;

/* compiled from: PhotoPickerModule_ProvidePermissionHelper$_avito_photo_picker_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class n implements dagger.internal.h<com.avito.android.permissions.x> {

    /* renamed from: a, reason: collision with root package name */
    public final f f219745a;

    public n(f fVar) {
        this.f219745a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33031a(this.f219745a.f219717a);
    }
}
