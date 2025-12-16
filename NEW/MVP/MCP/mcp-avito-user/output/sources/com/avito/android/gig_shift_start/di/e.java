package com.avito.android.gig_shift_start.di;

import android.app.Application;
import android.content.res.Resources;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigShiftStartModule_ProvideResourcesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<Resources> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f160782a;

    public e(Provider<Application> provider) {
        this.f160782a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = this.f160782a.get();
        d.f160781a.getClass();
        return application.getResources();
    }
}
