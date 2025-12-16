package com.avito.android.extended_profile_serp.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;

/* compiled from: ExtendedProfileSerpModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class A implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f152661a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f152662b;

    public A(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f152661a = lVar;
        this.f152662b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Screen screen = (Screen) this.f152661a.f393949a;
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f152662b.f393949a;
        C30538h.f152853a.getClass();
        return new C28478k(screen, rVar, null, 4, null);
    }
}
