package com.avito.android.bbl.screens.configure.v2.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.bbl.screens.configure.v2.BblConfigureV2PerfScreen;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BblConfigureV2Module_ProvidePerfScreenDataFactory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f99301a;

    public c(l lVar) {
        this.f99301a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f99301a.f393949a;
        b.f99300a.getClass();
        BblConfigureV2PerfScreen bblConfigureV2PerfScreen = BblConfigureV2PerfScreen.f99291d;
        bblConfigureV2PerfScreen.getClass();
        return new C28478k(bblConfigureV2PerfScreen, rVar, BblConfigureV2PerfScreen.f99292e);
    }
}
