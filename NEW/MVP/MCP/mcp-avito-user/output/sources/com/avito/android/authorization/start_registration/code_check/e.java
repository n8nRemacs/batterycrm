package com.avito.android.authorization.start_registration.code_check;

import com.avito.android.remote.r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RegistrationCodeConfirmInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<r> f94631a;

    public e(Provider<r> provider) {
        this.f94631a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f94631a.get());
    }
}
