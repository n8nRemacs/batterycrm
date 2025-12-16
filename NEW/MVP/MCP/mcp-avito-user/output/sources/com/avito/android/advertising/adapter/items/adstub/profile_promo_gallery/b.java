package com.avito.android.advertising.adapter.items.adstub.profile_promo_gallery;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LoadingProfilePromoGalleryBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f86976a;

    /* renamed from: b, reason: collision with root package name */
    public final f f86977b;

    public b(u uVar, f fVar) {
        this.f86976a = uVar;
        this.f86977b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f86976a.get();
        this.f86977b.getClass();
        return new a(gVar, new e());
    }
}
