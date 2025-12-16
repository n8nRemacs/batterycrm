package com.avito.android.photo_list_view_group_selection.mvi;

import com.avito.android.photo_list_view_group_selection.PhotoItemGroupSelectionParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhotoItemGroupSelectionActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f218443a;

    public c(dagger.internal.l lVar) {
        this.f218443a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((PhotoItemGroupSelectionParams) this.f218443a.f393949a);
    }
}
