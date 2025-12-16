package com.avito.android.user_advert.advert.faq.data;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertFaqSurveyStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class q implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<pV0.e> f308911a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f308912b;

    public q(Provider<pV0.e> provider, Provider<R0> provider2) {
        this.f308911a = provider;
        this.f308912b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f308911a.get(), this.f308912b.get());
    }
}
