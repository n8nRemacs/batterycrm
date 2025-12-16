package com.avito.android.publish.screen.objects.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;

/* compiled from: ObjectFillFormModule_ProvidePhotoItemGroupsImagesGroupsCacheFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class v implements dagger.internal.h<com.avito.android.photo_list_view_groups.h> {

    /* renamed from: a, reason: collision with root package name */
    public final C34019j f239942a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f239943b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.photo_list_view_groups.j f239944c;

    public v(C34019j c34019j, dagger.internal.l lVar, com.avito.android.photo_list_view_groups.j jVar) {
        this.f239942a = c34019j;
        this.f239943b = lVar;
        this.f239944c = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f239943b.f393949a;
        com.avito.android.photo_list_view_groups.i iVar = (com.avito.android.photo_list_view_groups.i) this.f239944c.get();
        this.f239942a.getClass();
        return (com.avito.android.photo_list_view_groups.h) new P0(fragment, iVar).a(com.avito.android.photo_list_view_groups.l.class);
    }
}
