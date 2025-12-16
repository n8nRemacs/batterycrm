package com.avito.android.publish.details.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;

/* compiled from: PublishDetailsModule_ProvidePhotoItemGroupsImagesGroupsCacheFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class v0 implements dagger.internal.h<com.avito.android.photo_list_view_groups.h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f234596a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.photo_list_view_groups.j f234597b;

    public v0(dagger.internal.l lVar, com.avito.android.photo_list_view_groups.j jVar) {
        this.f234596a = lVar;
        this.f234597b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f234596a.f393949a;
        com.avito.android.photo_list_view_groups.i iVar = (com.avito.android.photo_list_view_groups.i) this.f234597b.get();
        n0.f234577a.getClass();
        return (com.avito.android.photo_list_view_groups.h) new P0(fragment, iVar).a(com.avito.android.photo_list_view_groups.l.class);
    }
}
