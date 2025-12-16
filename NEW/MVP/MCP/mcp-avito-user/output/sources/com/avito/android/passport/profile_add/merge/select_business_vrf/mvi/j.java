package com.avito.android.passport.profile_add.merge.select_business_vrf.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.passport.profile_add.merge.select_business_vrf.SelectBusinessVrfOpenParams;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectBusinessVrfBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.domain.i f213464a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f213465b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f213466c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f213467d;

    public j(com.avito.android.passport.profile_add.merge.domain.i iVar, dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f213464a = iVar;
        this.f213465b = provider;
        this.f213466c = lVar;
        this.f213467d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.passport.profile_add.merge.domain.a) this.f213464a.get(), this.f213465b.get(), (SelectBusinessVrfOpenParams) this.f213466c.f393949a, this.f213467d.get());
    }
}
