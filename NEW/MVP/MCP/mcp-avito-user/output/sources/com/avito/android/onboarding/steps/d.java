package com.avito.android.onboarding.steps;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OnboardingStepsDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final j f209282a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f209283b;

    public d(j jVar, dv.b bVar) {
        this.f209282a = jVar;
        this.f209283b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((h) this.f209282a.get(), (a.InterfaceC4053a) this.f209283b.get());
    }
}
