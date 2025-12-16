package com.avito.android.edit_carousel.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.ExtendedProfileSettingsShowcaseScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EditCarouselModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f146376a;

    public e(l lVar) {
        this.f146376a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f146376a.f393949a;
        c.f146373a.getClass();
        return new C28478k(ExtendedProfileSettingsShowcaseScreen.f90353d, rVar, "profile-settings-showcase-add-items");
    }
}
