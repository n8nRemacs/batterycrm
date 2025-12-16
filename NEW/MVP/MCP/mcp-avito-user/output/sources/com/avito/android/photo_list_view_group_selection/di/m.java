package com.avito.android.photo_list_view_group_selection.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.PhotoItemGroupSelectionScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhotoItemGroupSelectionModule_ProvideScreenTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f218413a;

    public m(dagger.internal.l lVar) {
        this.f218413a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f218413a.f393949a;
        f.f218403a.getClass();
        return new C28478k(PhotoItemGroupSelectionScreen.f90450d, rVar, "photoItemGroupSelection");
    }
}
