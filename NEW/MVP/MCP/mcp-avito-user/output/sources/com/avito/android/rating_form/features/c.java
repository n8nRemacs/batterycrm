package com.avito.android.rating_form.features;

import com.avito.android.C34161r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormFeaturesModule_ProvideRatingFormFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f248136a;

    public c(Provider<C34161r> provider) {
        this.f248136a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f248136a.get();
        b.f248135a.getClass();
        return (a) c34161r.f246393a.b(a.class);
    }
}
