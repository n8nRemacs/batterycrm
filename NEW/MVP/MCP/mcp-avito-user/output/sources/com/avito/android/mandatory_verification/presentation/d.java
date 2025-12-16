package com.avito.android.mandatory_verification.presentation;

import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MandatoryVerificationItemPresentersDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f184733a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f184734b;

    public d(l lVar, Provider provider) {
        this.f184733a = lVar;
        this.f184734b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Y41.l) this.f184733a.f393949a, this.f184734b.get());
    }
}
