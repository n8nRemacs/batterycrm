package com.avito.android.screens.bbip_private_v2.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BbipPrivateV2Module_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f260890a;

    public c(l lVar) {
        this.f260890a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f260890a.f393949a;
        b.f260889a.getClass();
        return new C28478k(BbipPrivateV2PerformanceScreen.f260886d, rVar, null, 4, null);
    }
}
