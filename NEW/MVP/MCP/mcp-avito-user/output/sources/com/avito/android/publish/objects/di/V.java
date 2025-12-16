package com.avito.android.publish.objects.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;

/* compiled from: ObjectFillFormModule_ProvidePhotoItemGroupsImagesGroupsCacheFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class V implements dagger.internal.h<com.avito.android.photo_list_view_groups.h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f237674a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.photo_list_view_groups.j f237675b;

    public V(dagger.internal.l lVar, com.avito.android.photo_list_view_groups.j jVar) {
        this.f237674a = lVar;
        this.f237675b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f237674a.f393949a;
        com.avito.android.photo_list_view_groups.i iVar = (com.avito.android.photo_list_view_groups.i) this.f237675b.get();
        C33939w.f238031a.getClass();
        return (com.avito.android.photo_list_view_groups.h) new P0(fragment, iVar).a(com.avito.android.photo_list_view_groups.l.class);
    }
}
