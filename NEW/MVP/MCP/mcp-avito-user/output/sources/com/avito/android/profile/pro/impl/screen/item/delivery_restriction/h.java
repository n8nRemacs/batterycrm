package com.avito.android.profile.pro.impl.screen.item.delivery_restriction;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileProDeliveryRestrictionBannerPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f223206a;

    /* renamed from: b, reason: collision with root package name */
    public final l f223207b;

    public h(l lVar, Provider provider) {
        this.f223206a = provider;
        this.f223207b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Y41.l) this.f223207b.f393949a, this.f223206a.get());
    }
}
