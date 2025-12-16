package com.avito.android.screens.bbip_v2.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.bbip_common.BbipV2PerfScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BbipV2Module_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f261447a;

    public i(l lVar) {
        this.f261447a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f261447a.f393949a;
        h.f261446a.getClass();
        return new C28478k(BbipV2PerfScreen.f99063d, rVar, null, 4, null);
    }
}
