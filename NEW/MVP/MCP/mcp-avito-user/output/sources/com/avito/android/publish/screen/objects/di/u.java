package com.avito.android.publish.screen.objects.di;

import android.app.Application;
import com.avito.android.publish.screen.objects.di.C33986a;
import javax.inject.Provider;

/* compiled from: ObjectFillFormModule_ProvidePhotoInteractor$_avito_publish_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class u implements dagger.internal.h<com.avito.android.photo_cache.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C34019j f239937a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Application> f239938b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f239939c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.a> f239940d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.computer_vision.a> f239941e;

    public u(C34019j c34019j, Provider<Application> provider, Provider<com.avito.android.util.C> provider2, Provider<com.avito.android.photo_cache.a> provider3, Provider<com.avito.android.computer_vision.a> provider4) {
        this.f239937a = c34019j;
        this.f239938b = provider;
        this.f239939c = provider2;
        this.f239940d = provider3;
        this.f239941e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) ((C33986a.c.C7207c) this.f239938b).get();
        com.avito.android.util.C c12 = (com.avito.android.util.C) ((C33986a.c.C33992h) this.f239939c).get();
        com.avito.android.photo_cache.a aVar = (com.avito.android.photo_cache.a) ((C33986a.c.E) this.f239940d).get();
        com.avito.android.computer_vision.a aVar2 = (com.avito.android.computer_vision.a) ((C33986a.c.C33995k) this.f239941e).get();
        this.f239937a.getClass();
        return new com.avito.android.photo_cache.c(application.getMainLooper(), aVar, c12, application.getContentResolver(), new m(aVar2));
    }
}
