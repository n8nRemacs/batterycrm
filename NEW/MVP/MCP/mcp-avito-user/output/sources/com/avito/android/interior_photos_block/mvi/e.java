package com.avito.android.interior_photos_block.mvi;

import com.avito.android.interior_photos_block.entity.InteriorPhotoBlock;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InteriorPhotosBlockBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f173064a;

    public e(dagger.internal.l lVar) {
        this.f173064a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((InteriorPhotoBlock) this.f173064a.f393949a);
    }
}
