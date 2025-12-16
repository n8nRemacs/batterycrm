package com.avito.android.authorization.social_registration.code_check;

import dagger.internal.x;
import dagger.internal.y;
import ie.InterfaceC41389a;
import javax.inject.Provider;

/* compiled from: SocRegCodeConfirmInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41389a> f94602a;

    public i(Provider<InterfaceC41389a> provider) {
        this.f94602a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f94602a.get());
    }
}
