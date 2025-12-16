package com.avito.android.beduin.context.di;

import android.app.Application;
import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinContextModule_ProvideResourcesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<Resources> {

    /* renamed from: a, reason: collision with root package name */
    public final c f103581a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Application> f103582b;

    public e(c cVar, Provider<Application> provider) {
        this.f103581a = cVar;
        this.f103582b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = this.f103582b.get();
        this.f103581a.getClass();
        return application.getResources();
    }
}
