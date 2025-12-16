package com.avito.android.photo_picker.camera_mvi;

import com.avito.android.photo_picker.camera_mvi.mvi.l;
import com.avito.android.photo_picker.camera_mvi.mvi.m;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CameraViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final m f219120a;

    public h(m mVar) {
        this.f219120a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((l) this.f219120a.get(), null, 2, null);
    }
}
