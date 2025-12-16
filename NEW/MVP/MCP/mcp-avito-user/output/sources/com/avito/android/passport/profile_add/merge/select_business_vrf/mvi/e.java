package com.avito.android.passport.profile_add.merge.select_business_vrf.mvi;

import com.avito.android.passport.profile_add.merge.select_business_vrf.SelectBusinessVrfOpenParams;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectBusinessVrfActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f213428a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.domain.i f213429b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f213430c;

    public e(dagger.internal.l lVar, com.avito.android.passport.profile_add.merge.domain.i iVar, Provider provider) {
        this.f213428a = lVar;
        this.f213429b = iVar;
        this.f213430c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((SelectBusinessVrfOpenParams) this.f213428a.f393949a, (com.avito.android.passport.profile_add.merge.domain.a) this.f213429b.get(), this.f213430c.get());
    }
}
