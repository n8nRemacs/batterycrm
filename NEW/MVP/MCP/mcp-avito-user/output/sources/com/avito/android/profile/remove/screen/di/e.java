package com.avito.android.profile.remove.screen.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.profile.remove.ProfileRemoveItemsScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileRemoveItemsScreenModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f224032a;

    public e(l lVar) {
        this.f224032a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f224032a.f393949a;
        d.f224031a.getClass();
        return new C28478k(ProfileRemoveItemsScreen.f223767d, rVar, null, 4, null);
    }
}
