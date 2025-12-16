package com.avito.android.advert.item.interiorPhotos;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InteriorPhotosBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.interior_photos_block.a> f76592a;

    /* renamed from: b, reason: collision with root package name */
    public final u f76593b;

    public b(u uVar, Provider provider) {
        this.f76592a = provider;
        this.f76593b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f76592a.get(), (g) this.f76593b.get());
    }
}
