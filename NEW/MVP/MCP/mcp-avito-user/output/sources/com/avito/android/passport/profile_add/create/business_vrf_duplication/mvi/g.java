package com.avito.android.passport.profile_add.create.business_vrf_duplication.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BusinessVrfDuplicationProfileCreationBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f211253a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.passport.profile_add.create.business_vrf_duplication.domain.a> f211254b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f211255c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f211256d;

    public g(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f211253a = provider;
        this.f211254b = provider2;
        this.f211255c = lVar;
        this.f211256d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f211253a.get(), this.f211254b.get(), (String) this.f211255c.f393949a, this.f211256d.get());
    }
}
