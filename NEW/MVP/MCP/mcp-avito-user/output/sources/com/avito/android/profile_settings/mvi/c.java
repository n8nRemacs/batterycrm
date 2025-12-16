package com.avito.android.profile_settings.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileSettingsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f228459a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f228460b;

    public c(u uVar, Provider provider) {
        this.f228459a = uVar;
        this.f228460b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.profile_settings.f) this.f228459a.get(), this.f228460b.get());
    }
}
