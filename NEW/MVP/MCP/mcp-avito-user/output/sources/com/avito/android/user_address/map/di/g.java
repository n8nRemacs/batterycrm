package com.avito.android.user_address.map.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.user_address.map.perf.UserAddressMapScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserAddressMapTrackerModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f307555a;

    public g(l lVar) {
        this.f307555a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f307555a.f393949a;
        f.f307554a.getClass();
        return new C28478k(UserAddressMapScreen.f307938d, rVar, null, 4, null);
    }
}
