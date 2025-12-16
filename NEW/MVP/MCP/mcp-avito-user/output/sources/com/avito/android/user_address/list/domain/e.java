package com.avito.android.user_address.list.domain;

import com.avito.android.user_address.UserAddressActivity;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAddressGetListUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.geo_common.interactor.g> f307356a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.user_address.a> f307357b;

    /* renamed from: c, reason: collision with root package name */
    public final l f307358c;

    public e(l lVar, Provider provider, Provider provider2) {
        this.f307356a = provider;
        this.f307357b = provider2;
        this.f307358c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f307356a.get(), this.f307357b.get(), (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.List) this.f307358c.f393949a);
    }
}
