package com.avito.android.early_access_advert.feedback_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EarlyAccessAdvertFeedbackActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.early_access_advert.a> f145671a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.early_access_advert.feedback_screen.domain.b f145672b;

    public b(Provider provider, com.avito.android.early_access_advert.feedback_screen.domain.b bVar) {
        this.f145671a = provider;
        this.f145672b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f145671a.get(), (com.avito.android.early_access_advert.feedback_screen.domain.a) this.f145672b.get());
    }
}
