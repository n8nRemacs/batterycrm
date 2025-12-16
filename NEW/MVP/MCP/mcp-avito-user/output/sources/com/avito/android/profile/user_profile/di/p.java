package com.avito.android.profile.user_profile.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.UserProfileScreen;

/* compiled from: UserProfileModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final f f226117a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f226118b;

    public p(f fVar, dagger.internal.l lVar) {
        this.f226117a = fVar;
        this.f226118b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f226118b.f393949a;
        this.f226117a.getClass();
        return new C28478k(UserProfileScreen.f90550d, rVar, null, 4, null);
    }
}
