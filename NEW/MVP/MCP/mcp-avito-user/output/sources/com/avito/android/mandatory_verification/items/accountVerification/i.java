package com.avito.android.mandatory_verification.items.accountVerification;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MandatoryVerificationAccountVerificationItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f184624a;

    public i(Provider<R0> provider) {
        this.f184624a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f184624a.get());
    }
}
