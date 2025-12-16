package com.avito.android.onboarding.dialog.view.carousel;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingCarouselPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A40.a> f208998a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f208999b;

    public h(dagger.internal.l lVar, Provider provider) {
        this.f208998a = provider;
        this.f208999b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f208998a.get(), (String) this.f208999b.f393949a);
    }
}
