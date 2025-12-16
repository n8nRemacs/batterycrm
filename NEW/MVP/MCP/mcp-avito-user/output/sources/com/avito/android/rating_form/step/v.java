package com.avito.android.rating_form.step;

import javax.inject.Provider;

/* compiled from: RatingFormStepScreenNameImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.y> f249738a;

    public v(Provider<com.avito.android.rating_form.y> provider) {
        this.f249738a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u(this.f249738a.get());
    }
}
