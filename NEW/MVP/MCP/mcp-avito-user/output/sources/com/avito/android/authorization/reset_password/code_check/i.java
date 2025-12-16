package com.avito.android.authorization.reset_password.code_check;

import com.avito.android.remote.r;
import dagger.internal.x;
import dagger.internal.y;
import hD.C40806a;
import hD.C40808c;
import javax.inject.Provider;

/* compiled from: ResetPasswordCodeConfirmInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<r> f94131a;

    /* renamed from: b, reason: collision with root package name */
    public final C40808c f94132b;

    public i(Provider provider, C40808c c40808c) {
        this.f94131a = provider;
        this.f94132b = c40808c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f94131a.get(), (C40806a) this.f94132b.get());
    }
}
