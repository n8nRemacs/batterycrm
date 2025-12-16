package com.avito.android.profile_settings_extended.adapter.gallery.image;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImageItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f229436a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.profile_management_core.images.entity.e f229437b;

    public f(l lVar, com.avito.android.profile_management_core.images.entity.e eVar) {
        this.f229436a = lVar;
        this.f229437b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.l lVar = (Y41.l) this.f229436a.f393949a;
        this.f229437b.getClass();
        return new e(lVar, new com.avito.android.profile_management_core.images.entity.d());
    }
}
