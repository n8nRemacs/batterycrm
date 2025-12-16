package com.avito.android.phones_actualization.scenario;

import com.avito.android.remote.InterfaceC34401z0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ActualizePhonesPhoneRequestInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.remote.r> f216261a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f216262b;

    public k(Provider<com.avito.android.remote.r> provider, Provider<InterfaceC34401z0> provider2) {
        this.f216261a = provider;
        this.f216262b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f216261a.get(), this.f216262b.get());
    }
}
