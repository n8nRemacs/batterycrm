package com.avito.android.safety.password_change.mvi;

import com.avito.android.account.G;
import com.avito.android.remote.InterfaceC34401z0;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PasswordChangeInteractorImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class s implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f257406a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safety.common.d f257407b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<G> f257408c;

    public s(com.avito.android.safety.common.d dVar, Provider provider, Provider provider2) {
        this.f257406a = provider;
        this.f257407b = dVar;
        this.f257408c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f257408c.get(), this.f257406a.get(), (com.avito.android.safety.common.a) this.f257407b.get());
    }
}
