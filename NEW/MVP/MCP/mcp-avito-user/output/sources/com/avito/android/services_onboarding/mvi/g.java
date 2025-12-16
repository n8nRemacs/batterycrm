package com.avito.android.services_onboarding.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServicesOnboardingBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Yu0.g> f279952a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f279953b;

    public g(dagger.internal.l lVar, Provider provider) {
        this.f279952a = provider;
        this.f279953b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f279952a.get(), (Integer) this.f279953b.f393949a);
    }
}
