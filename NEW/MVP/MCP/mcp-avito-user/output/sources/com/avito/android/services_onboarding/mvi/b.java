package com.avito.android.services_onboarding.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServicesOnboardingActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Yu0.g> f279937a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f279938b;

    public b(dagger.internal.l lVar, Provider provider) {
        this.f279937a = provider;
        this.f279938b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f279937a.get(), (Integer) this.f279938b.f393949a);
    }
}
