package com.avito.android.authorization.social_registration.code_check;

import com.avito.android.remote.r;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SocRegPhoneRequestInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<r> f94610a;

    public k(Provider<r> provider) {
        this.f94610a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f94610a.get());
    }
}
