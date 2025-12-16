package com.avito.android.services_onboarding.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServicesOnboardingReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final e f279966a;

    public n(e eVar) {
        this.f279966a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((c) this.f279966a.get());
    }
}
