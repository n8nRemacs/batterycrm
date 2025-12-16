package com.avito.android.cpt.mass_activation.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.cpt.CptMassActivationScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptMassActivationModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f126513a;

    public h(dagger.internal.l lVar) {
        this.f126513a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f126513a.f393949a;
        d.f126507a.getClass();
        CptMassActivationScreen cptMassActivationScreen = CptMassActivationScreen.f126191d;
        cptMassActivationScreen.getClass();
        return new C28478k(cptMassActivationScreen, rVar, CptMassActivationScreen.f126192e);
    }
}
