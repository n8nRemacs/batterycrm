package com.avito.android.cpt.mass_activation.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.cpt.CptMassActivationV2Screen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptMassActivationV2Module_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f126519a;

    public n(dagger.internal.l lVar) {
        this.f126519a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f126519a.f393949a;
        j.f126514a.getClass();
        return new C28478k(CptMassActivationV2Screen.f126193d, rVar, null, 4, null);
    }
}
