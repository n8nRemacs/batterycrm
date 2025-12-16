package com.avito.android.user_address.map.mvi;

import com.avito.android.user_address.UserAddressActivity;
import javax.inject.Provider;

/* compiled from: UserAddressMapBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_address.map.mvi.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35359l implements dagger.internal.h<C35358k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f307884a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.user_address.map.domain.d> f307885b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.user_address.map.view.e> f307886c;

    public C35359l(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f307884a = lVar;
        this.f307885b = provider;
        this.f307886c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C35358k((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map) this.f307884a.f393949a, this.f307885b.get(), this.f307886c.get());
    }
}
