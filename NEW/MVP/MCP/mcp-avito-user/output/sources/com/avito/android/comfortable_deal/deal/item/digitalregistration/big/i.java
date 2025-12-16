package com.avito.android.comfortable_deal.deal.item.digitalregistration.big;

import com.avito.android.util.Kundle;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wp.InterfaceC49662a;

/* compiled from: DigitalRegistrationBigBannerPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f121382a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f121383b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC49662a> f121384c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f121385d;

    public i(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2) {
        this.f121382a = lVar;
        this.f121383b = provider;
        this.f121384c = provider2;
        this.f121385d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((Y41.l) this.f121382a.f393949a, this.f121383b.get(), this.f121384c.get(), (Kundle) this.f121385d.f393949a);
    }
}
