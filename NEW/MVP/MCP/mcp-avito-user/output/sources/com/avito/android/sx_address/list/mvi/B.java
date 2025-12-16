package com.avito.android.sx_address.list.mvi;

import android.content.SharedPreferences;
import com.avito.android.sx_address.SxAddressListParams;
import javax.inject.Provider;

/* compiled from: SxAddressListBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class B implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.sx_address.list.domain.b> f293208a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f293209b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.sx_address.list.di.t f293210c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f293211d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f293212e;

    public B(Provider provider, dagger.internal.l lVar, com.avito.android.sx_address.list.di.t tVar, Provider provider2, dagger.internal.u uVar) {
        this.f293208a = provider;
        this.f293209b = lVar;
        this.f293210c = tVar;
        this.f293211d = provider2;
        this.f293212e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new z(this.f293208a.get(), (SxAddressListParams) this.f293209b.f393949a, (SharedPreferences) this.f293210c.get(), this.f293211d.get(), (com.avito.android.sx_address.list.analytics.i) this.f293212e.get());
    }
}
