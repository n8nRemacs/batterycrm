package com.avito.android.advert_details_items.sellerprofile;

import javax.inject.Provider;

/* compiled from: SellerTypeOnboardingInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class Z implements dagger.internal.h<Y> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.onboarding_manager.f> f85600a;

    public Z(Provider<com.avito.android.onboarding_manager.f> provider) {
        this.f85600a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Y(this.f85600a.get());
    }
}
