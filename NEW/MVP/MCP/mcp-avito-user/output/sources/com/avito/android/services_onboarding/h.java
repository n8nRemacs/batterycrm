package com.avito.android.services_onboarding;

import com.avito.android.services_onboarding.mvi.j;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServicesOnboardingViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final j f279934a;

    public h(j jVar) {
        this.f279934a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.services_onboarding.mvi.i) this.f279934a.get(), null, 2, null);
    }
}
