package com.avito.android.services_onboarding.step;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServicesOnboardingStepBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f279970a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f279971b;

    public b(e eVar, Provider provider) {
        this.f279970a = eVar;
        this.f279971b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f279970a.getClass();
        return new a(new d(), this.f279971b.get());
    }
}
