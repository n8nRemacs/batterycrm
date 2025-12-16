package com.avito.android.authorization.tfa.code_check.interactor;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TfaCodeCheckPhoneRequestInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.remote.r> f94683a;

    public k(Provider<com.avito.android.remote.r> provider) {
        this.f94683a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f94683a.get());
    }
}
