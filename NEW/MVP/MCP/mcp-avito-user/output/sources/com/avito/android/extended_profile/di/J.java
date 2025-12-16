package com.avito.android.extended_profile.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.ExtendedProfileScreen;

/* compiled from: ExtendedProfileModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class J implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f149534a;

    public J(dagger.internal.l lVar) {
        this.f149534a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f149534a.f393949a;
        r.f149945a.getClass();
        return new C28478k(ExtendedProfileScreen.f90351d, rVar, null, 4, null);
    }
}
