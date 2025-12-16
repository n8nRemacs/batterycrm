package com.avito.android.cv_upload.screens.cv_upload.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvUploadActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f131772a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.cv_upload.domain.d f131773b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.cv_upload.domain.f f131774c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f131775d;

    public g(Provider provider, com.avito.android.cv_upload.domain.d dVar, com.avito.android.cv_upload.domain.f fVar, Provider provider2) {
        this.f131772a = provider;
        this.f131773b = dVar;
        this.f131774c = fVar;
        this.f131775d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f131772a.get(), (com.avito.android.cv_upload.domain.c) this.f131773b.get(), (com.avito.android.cv_upload.domain.e) this.f131774c.get(), this.f131775d.get());
    }
}
