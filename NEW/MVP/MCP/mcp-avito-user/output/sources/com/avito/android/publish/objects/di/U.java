package com.avito.android.publish.objects.di;

import android.app.Application;
import com.avito.android.publish.objects.di.C33894a;
import javax.inject.Provider;

/* compiled from: ObjectFillFormModule_ProvidePhotoInteractor$_avito_publish_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class U implements dagger.internal.h<com.avito.android.photo_cache.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f237670a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f237671b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.a> f237672c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.computer_vision.a> f237673d;

    public U(Provider<Application> provider, Provider<com.avito.android.util.C> provider2, Provider<com.avito.android.photo_cache.a> provider3, Provider<com.avito.android.computer_vision.a> provider4) {
        this.f237670a = provider;
        this.f237671b = provider2;
        this.f237672c = provider3;
        this.f237673d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) ((C33894a.c.C7154c) this.f237670a).get();
        com.avito.android.util.C c12 = (com.avito.android.util.C) ((C33894a.c.C33900h) this.f237671b).get();
        com.avito.android.photo_cache.a aVar = (com.avito.android.photo_cache.a) ((C33894a.c.E) this.f237672c).get();
        com.avito.android.computer_vision.a aVar2 = (com.avito.android.computer_vision.a) ((C33894a.c.C33903k) this.f237673d).get();
        C33939w.f238031a.getClass();
        return new com.avito.android.photo_cache.c(application.getMainLooper(), aVar, c12, application.getContentResolver(), new C33942z(aVar2));
    }
}
