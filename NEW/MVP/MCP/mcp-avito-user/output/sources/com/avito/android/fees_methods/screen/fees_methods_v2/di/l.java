package com.avito.android.fees_methods.screen.fees_methods_v2.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.fees_methods.common.FeesMethodsV2PerfScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeesMethodsV2Module_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f158255a;

    public l(dagger.internal.l lVar) {
        this.f158255a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f158255a.f393949a;
        k.f158254a.getClass();
        FeesMethodsV2PerfScreen feesMethodsV2PerfScreen = FeesMethodsV2PerfScreen.f157929d;
        feesMethodsV2PerfScreen.getClass();
        return new C28478k(feesMethodsV2PerfScreen, rVar, FeesMethodsV2PerfScreen.f157930e);
    }
}
