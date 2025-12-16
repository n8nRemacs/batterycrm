package com.avito.android.cpt.activation.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.cpt.CptActivationScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptActivationModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f126239a;

    public h(l lVar) {
        this.f126239a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f126239a.f393949a;
        d.f126229a.getClass();
        CptActivationScreen cptActivationScreen = CptActivationScreen.f126189d;
        cptActivationScreen.getClass();
        return new C28478k(cptActivationScreen, rVar, CptActivationScreen.f126190e);
    }
}
