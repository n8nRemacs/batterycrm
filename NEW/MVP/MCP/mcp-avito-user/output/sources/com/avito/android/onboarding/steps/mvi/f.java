package com.avito.android.onboarding.steps.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingStepsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.onboarding.steps.l> f209342a;

    /* renamed from: b, reason: collision with root package name */
    public final u f209343b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f209344c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f209345d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f209346e;

    public f(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f209342a = provider;
        this.f209343b = uVar;
        this.f209344c = provider2;
        this.f209345d = provider3;
        this.f209346e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f209342a.get(), (G40.c) this.f209343b.get(), this.f209344c.get(), this.f209345d.get(), (String) this.f209346e.f393949a);
    }
}
