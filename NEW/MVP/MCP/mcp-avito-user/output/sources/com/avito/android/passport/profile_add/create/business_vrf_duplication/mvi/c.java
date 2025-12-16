package com.avito.android.passport.profile_add.create.business_vrf_duplication.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BusinessVrfDuplicationProfileCreationActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f211239a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.passport.profile_add.create.business_vrf_duplication.domain.a> f211240b;

    public c(Provider<InterfaceC28373a> provider, Provider<com.avito.android.passport.profile_add.create.business_vrf_duplication.domain.a> provider2) {
        this.f211239a = provider;
        this.f211240b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f211239a.get(), this.f211240b.get());
    }
}
