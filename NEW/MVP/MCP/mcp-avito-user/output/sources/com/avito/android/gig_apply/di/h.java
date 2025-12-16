package com.avito.android.gig_apply.di;

import android.app.Application;
import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigSlotModule_ProvideResourcesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<Resources> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f159657a;

    public h(Provider<Application> provider) {
        this.f159657a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = this.f159657a.get();
        g.f159656a.getClass();
        return application.getResources();
    }
}
