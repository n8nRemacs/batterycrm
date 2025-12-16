package com.avito.android.vas_union.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.vas_union.VasUnionV2Screen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasUnionV2Module_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class u implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f323193a;

    public u(dagger.internal.l lVar) {
        this.f323193a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f323193a.f393949a;
        q.f323183a.getClass();
        VasUnionV2Screen vasUnionV2Screen = VasUnionV2Screen.f323113d;
        vasUnionV2Screen.getClass();
        return new C28478k(vasUnionV2Screen, rVar, VasUnionV2Screen.f323114e);
    }
}
