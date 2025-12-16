package com.avito.android.rating_form.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.y> f248794a;

    public m(Provider<com.avito.android.rating_form.y> provider) {
        this.f248794a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f248794a.get());
    }
}
