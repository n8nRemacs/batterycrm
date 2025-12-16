package com.avito.android.screens.bbip_private_v2.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import ih.InterfaceC41399a;
import javax.inject.Provider;

/* compiled from: BbipPrivateV2GetConfiguratorUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f260915a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC41399a> f260916b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f260917c;

    public b(l lVar, Provider provider, Provider provider2) {
        this.f260915a = lVar;
        this.f260916b = provider;
        this.f260917c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String) this.f260915a.f393949a, this.f260916b.get(), this.f260917c.get());
    }
}
