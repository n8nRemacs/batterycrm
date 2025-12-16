package com.avito.android.passport.profile_add.merge.profiles_list.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.passport.profile_add.merge.domain.MergeFlow;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfilesListBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.domain.i f213292a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f213293b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f213294c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<r60.d> f213295d;

    public g(com.avito.android.passport.profile_add.merge.domain.i iVar, dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f213292a = iVar;
        this.f213293b = lVar;
        this.f213294c = provider;
        this.f213295d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.passport.profile_add.merge.domain.a) this.f213292a.get(), (MergeFlow) this.f213293b.f393949a, this.f213294c.get(), this.f213295d.get());
    }
}
