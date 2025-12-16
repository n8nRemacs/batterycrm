package com.avito.android.publish.screen.step.params.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublishDetailsModule_ProvidePhotoItemGroupsImagesGroupsCacheFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<com.avito.android.photo_list_view_groups.h> {

    /* renamed from: a, reason: collision with root package name */
    public final d f241121a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f241122b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.photo_list_view_groups.j f241123c;

    public k(d dVar, dagger.internal.l lVar, com.avito.android.photo_list_view_groups.j jVar) {
        this.f241121a = dVar;
        this.f241122b = lVar;
        this.f241123c = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f241122b.f393949a;
        com.avito.android.photo_list_view_groups.i iVar = (com.avito.android.photo_list_view_groups.i) this.f241123c.get();
        this.f241121a.getClass();
        return (com.avito.android.photo_list_view_groups.h) new P0(fragment, iVar).a(com.avito.android.photo_list_view_groups.l.class);
    }
}
