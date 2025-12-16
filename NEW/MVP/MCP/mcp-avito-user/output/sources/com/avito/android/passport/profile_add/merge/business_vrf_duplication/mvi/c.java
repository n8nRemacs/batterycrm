package com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BusinessVrfDuplicationActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f212535a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<r60.d> f212536b;

    public c(Provider<InterfaceC28373a> provider, Provider<r60.d> provider2) {
        this.f212535a = provider;
        this.f212536b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f212535a.get(), this.f212536b.get());
    }
}
