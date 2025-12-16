package com.avito.android.rating.details.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingDetailsModule_ProvideRatingDetailsGalleryConverterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<com.avito.android.rating.details.converter.k> {

    /* renamed from: a, reason: collision with root package name */
    public final VD.d f247002a;

    public m(VD.d dVar) {
        this.f247002a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        VD.b bVar = (VD.b) this.f247002a.get();
        e.f246981a.getClass();
        return new com.avito.android.rating.details.converter.l(bVar);
    }
}
