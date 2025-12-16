package com.avito.android.social_management.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.SocialManagementScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SocialManagementModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f284660a;

    public m(dagger.internal.l lVar) {
        this.f284660a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f284660a.f393949a;
        g.f284647a.getClass();
        return new C28478k(SocialManagementScreen.f90497d, rVar, null, 4, null);
    }
}
