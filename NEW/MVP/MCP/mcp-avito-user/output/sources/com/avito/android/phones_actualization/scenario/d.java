package com.avito.android.phones_actualization.scenario;

import com.avito.android.remote.InterfaceC34258d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ActualizePhonesCodeConfirmInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.remote.r> f216242a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34258d> f216243b;

    public d(Provider<com.avito.android.remote.r> provider, Provider<InterfaceC34258d> provider2) {
        this.f216242a = provider;
        this.f216243b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f216242a.get(), this.f216243b.get());
    }
}
