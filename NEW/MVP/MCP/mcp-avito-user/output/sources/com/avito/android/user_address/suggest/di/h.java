package com.avito.android.user_address.suggest.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.user_address.suggest.perf.UserAddressSuggestScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserAddressSuggestTrackerModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f308051a;

    public h(l lVar) {
        this.f308051a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f308051a.f393949a;
        g.f308050a.getClass();
        return new C28478k(UserAddressSuggestScreen.f308153d, rVar, null, 4, null);
    }
}
