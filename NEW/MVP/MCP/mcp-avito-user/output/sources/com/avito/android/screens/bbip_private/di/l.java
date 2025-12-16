package com.avito.android.screens.bbip_private.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.bbip_common.BbipPrivatePerfScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BbipPrivateModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f260498a;

    public l(dagger.internal.l lVar) {
        this.f260498a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f260498a.f393949a;
        k.f260497a.getClass();
        return new C28478k(BbipPrivatePerfScreen.f99060d, rVar, null, 4, null);
    }
}
