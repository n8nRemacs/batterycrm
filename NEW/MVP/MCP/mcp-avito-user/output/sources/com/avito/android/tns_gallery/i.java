package com.avito.android.tns_gallery;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TnsGalleryItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final l f301540a;

    /* renamed from: b, reason: collision with root package name */
    public final e f301541b;

    public i(l lVar, e eVar) {
        this.f301540a = lVar;
        this.f301541b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((j) this.f301540a.get(), (c) this.f301541b.get());
    }
}
