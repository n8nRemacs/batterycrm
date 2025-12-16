package com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.passport.network.model.BusinessVrfDuplication;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BusinessVrfDuplicationBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f212557a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f212558b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f212559c;

    public g(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f212557a = provider;
        this.f212558b = lVar;
        this.f212559c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f212557a.get(), (BusinessVrfDuplication) this.f212558b.f393949a, this.f212559c.get());
    }
}
