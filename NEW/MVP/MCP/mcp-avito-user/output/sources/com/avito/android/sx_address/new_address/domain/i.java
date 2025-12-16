package com.avito.android.sx_address.new_address.domain;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SxNewAddressInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<EA0.a> f293659a;

    public i(Provider<EA0.a> provider) {
        this.f293659a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f293659a.get());
    }
}
