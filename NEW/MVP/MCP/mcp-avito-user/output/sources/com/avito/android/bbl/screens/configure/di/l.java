package com.avito.android.bbl.screens.configure.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.bbl.screens.configure.BblConfigurePerfScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BblConfigureModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f99158a;

    public l(dagger.internal.l lVar) {
        this.f99158a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f99158a.f393949a;
        k.f99157a.getClass();
        BblConfigurePerfScreen bblConfigurePerfScreen = BblConfigurePerfScreen.f99119d;
        bblConfigurePerfScreen.getClass();
        return new C28478k(bblConfigurePerfScreen, rVar, BblConfigurePerfScreen.f99120e);
    }
}
