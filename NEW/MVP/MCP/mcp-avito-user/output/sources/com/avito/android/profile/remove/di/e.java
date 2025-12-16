package com.avito.android.profile.remove.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.profile.remove.ProfileRemoveScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileRemoveModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f223914a;

    public e(l lVar) {
        this.f223914a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f223914a.f393949a;
        d.f223913a.getClass();
        return new C28478k(ProfileRemoveScreen.f223768d, rVar, "userProfileRemove");
    }
}
