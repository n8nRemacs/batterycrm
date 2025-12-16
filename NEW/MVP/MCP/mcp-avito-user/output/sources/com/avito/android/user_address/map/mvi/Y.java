package com.avito.android.user_address.map.mvi;

import android.app.Activity;
import com.avito.android.user_address.UserAddressActivity;
import javax.inject.Provider;
import nF.C44245a;

/* compiled from: UserAddressMapMviActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class Y implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f307810a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.user_address.map.domain.d> f307811b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.location.find.o> f307812c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f307813d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.user_address.a> f307814e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.user_address.map.view.e> f307815f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f307816g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C44245a> f307817h;

    public Y(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f307810a = lVar;
        this.f307811b = provider;
        this.f307812c = provider2;
        this.f307813d = lVar2;
        this.f307814e = provider3;
        this.f307815f = provider4;
        this.f307816g = uVar;
        this.f307817h = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new B((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map) this.f307810a.f393949a, this.f307811b.get(), this.f307812c.get(), (Activity) this.f307813d.f393949a, this.f307814e.get(), this.f307815f.get(), (com.avito.android.permissions.q) this.f307816g.get(), this.f307817h.get());
    }
}
