package com.avito.android.photo_list_view_groups;

import com.avito.android.remote.model.category_parameters.slot.images_groups.ImagesGroupsSlot;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhotoItemGroupsImagesGroupsCacheFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f218612a;

    /* renamed from: b, reason: collision with root package name */
    public final u f218613b;

    public j(u uVar, u uVar2) {
        this.f218612a = uVar;
        this.f218613b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((ImagesGroupsSlot.ParameterProvider) this.f218612a.get(), (R0) this.f218613b.get());
    }
}
