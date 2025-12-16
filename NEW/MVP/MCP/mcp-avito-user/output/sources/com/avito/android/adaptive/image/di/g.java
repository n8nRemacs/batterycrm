package com.avito.android.adaptive.image.di;

import android.app.Application;
import android.content.Context;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdaptiveImagePickerModule_ProvideContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<Context> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f68512a;

    public g(Provider<Application> provider) {
        this.f68512a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = this.f68512a.get();
        c.f68506a.getClass();
        return application;
    }
}
