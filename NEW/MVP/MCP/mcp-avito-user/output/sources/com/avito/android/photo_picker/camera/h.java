package com.avito.android.photo_picker.camera;

/* compiled from: CameraPhotoResizer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f218968a;

    public h(dagger.internal.l lVar) {
        this.f218968a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((AspectRatio) this.f218968a.f393949a);
    }
}
