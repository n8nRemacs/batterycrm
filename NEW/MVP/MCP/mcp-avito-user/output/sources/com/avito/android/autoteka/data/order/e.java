package com.avito.android.autoteka.data.order;

import com.avito.android.account.G;
import com.avito.android.remote.InterfaceC34401z0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaChangeEmailInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f96156a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<G> f96157b;

    public e(Provider<InterfaceC34401z0> provider, Provider<G> provider2) {
        this.f96156a = provider;
        this.f96157b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f96156a.get(), this.f96157b.get());
    }
}
