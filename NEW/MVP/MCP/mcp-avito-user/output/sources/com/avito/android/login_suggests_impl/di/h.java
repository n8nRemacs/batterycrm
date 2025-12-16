package com.avito.android.login_suggests_impl.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LoginSuggestsModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f182928a;

    public h(l lVar) {
        this.f182928a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f182928a.f393949a;
        d.f182925a.getClass();
        return new C28478k(LoginSuggestScreen.f182895d, rVar, null, 4, null);
    }
}
