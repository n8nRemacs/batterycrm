package com.avito.android.comfortable_deal.deal.item.digitalregistration.small;

import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wp.InterfaceC49662a;

/* compiled from: DigitalRegistrationSmallBannerPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f121416a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49662a> f121417b;

    public e(l lVar, Provider provider) {
        this.f121416a = lVar;
        this.f121417b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Y41.l) this.f121416a.f393949a, this.f121417b.get());
    }
}
