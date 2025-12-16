package com.avito.android.authorization.start_registration.code_check;

import com.avito.android.remote.r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RegistrationPhoneRequestInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<r> f94639a;

    public g(Provider<r> provider) {
        this.f94639a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f94639a.get());
    }
}
