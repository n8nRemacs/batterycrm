package com.avito.android.extended_profile_selection_create.select.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileSelectionCreateModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f152267a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f152268b;

    public l(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f152267a = lVar;
        this.f152268b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Screen screen = (Screen) this.f152267a.f393949a;
        r rVar = (r) this.f152268b.f393949a;
        f.f152261a.getClass();
        return new C28478k(screen, rVar, null, 4, null);
    }
}
