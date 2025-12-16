package com.avito.android.services_onboarding.di;

import androidx.recyclerview.widget.C;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServicesOnboardingModule_ProvideListUpdateCallback$_avito_services_onboarding_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f279862a;

    public l(dagger.internal.f fVar) {
        this.f279862a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f279862a.get();
        f.f279852a.getClass();
        return jVar;
    }
}
