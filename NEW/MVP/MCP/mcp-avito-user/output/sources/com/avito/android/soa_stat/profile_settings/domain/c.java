package com.avito.android.soa_stat.profile_settings.domain;

import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SoaStatProfileSettingsInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f284084a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f284085b;

    public c(Provider<InterfaceC34401z0> provider, Provider<R0> provider2) {
        this.f284084a = provider;
        this.f284085b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f284084a.get(), this.f284085b.get());
    }
}
