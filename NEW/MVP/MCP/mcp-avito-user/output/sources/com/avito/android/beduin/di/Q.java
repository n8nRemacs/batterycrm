package com.avito.android.beduin.di;

/* compiled from: BeduinPhotoPickerModule_ProvideExifExtraDataSerializerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class Q implements dagger.internal.h<N70.b> {

    /* renamed from: a, reason: collision with root package name */
    public final O f103912a;

    public Q(O o12) {
        this.f103912a = o12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f103912a.getClass();
        return new N70.c(new com.google.gson.d().a());
    }
}
