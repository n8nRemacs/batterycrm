package com.avito.android.bxcontent.business360;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: Business360ToastInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.onboarding_manager.f> f109624a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f109625b;

    /* renamed from: c, reason: collision with root package name */
    public final u f109626c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f109624a = provider;
        this.f109625b = provider2;
        this.f109626c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f109624a.get(), this.f109625b.get(), (com.avito.android.bxcontent.analytics.a) this.f109626c.get());
    }
}
