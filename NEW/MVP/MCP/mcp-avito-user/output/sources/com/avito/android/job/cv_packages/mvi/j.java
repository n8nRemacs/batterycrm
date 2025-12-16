package com.avito.android.job.cv_packages.mvi;

import com.avito.android.util.R0;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvPackageActorSubscription_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f174476a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f174477b;

    public j(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<R0> provider2) {
        this.f174476a = provider;
        this.f174477b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f174476a.get(), this.f174477b.get());
    }
}
