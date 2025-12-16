package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SoaStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class o implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f313490a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f313491b;

    public o(Provider<f> provider, Provider<R0> provider2) {
        this.f313490a = provider;
        this.f313491b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f313490a.get(), this.f313491b.get());
    }
}
