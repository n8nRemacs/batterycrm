package com.avito.android.services_onboarding.di;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServicesSteppedOnboardingIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f279866a;

    public o(C30102l3 c30102l3) {
        this.f279866a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((Context) this.f279866a.get());
    }
}
