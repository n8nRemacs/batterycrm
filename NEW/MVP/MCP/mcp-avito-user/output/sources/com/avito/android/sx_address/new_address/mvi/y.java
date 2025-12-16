package com.avito.android.sx_address.new_address.mvi;

import com.avito.android.sx_address.SxAddressControl;
import javax.inject.Provider;

/* compiled from: SxNewAddressMviActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class y implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f293846a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.sx_address.new_address.domain.a> f293847b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.sx_address.new_address.analytics.c> f293848c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.sx_address.new_address.analytics.e> f293849d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.sx_address.features.a> f293850e;

    public y(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f293846a = lVar;
        this.f293847b = provider;
        this.f293848c = provider2;
        this.f293849d = provider3;
        this.f293850e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w((SxAddressControl) this.f293846a.f393949a, this.f293847b.get(), this.f293848c.get(), this.f293849d.get(), this.f293850e.get());
    }
}
