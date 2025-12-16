package com.avito.android.work_profile.profile.gig.mvi;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigResponseToItemsMapper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.gig_snippet.a> f331148a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Application> f331149b;

    public l(Provider<com.avito.android.gig_snippet.a> provider, Provider<Application> provider2) {
        this.f331148a = provider;
        this.f331149b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f331148a.get(), this.f331149b.get());
    }
}
