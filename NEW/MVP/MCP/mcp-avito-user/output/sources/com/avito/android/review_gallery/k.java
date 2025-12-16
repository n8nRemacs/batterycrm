package com.avito.android.review_gallery;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReviewGalleryViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.review_gallery.mvi.k f255517a;

    public k(com.avito.android.review_gallery.mvi.k kVar) {
        this.f255517a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.review_gallery.mvi.j) this.f255517a.get(), null, 2, null);
    }
}
