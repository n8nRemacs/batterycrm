package com.avito.android.user_advert.advert.delegate.deliverySettings;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: DeliverySettingsPresenterDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f308583a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.user_advert.advert.deliveryPromoBlock.d f308584b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f308585c;

    /* renamed from: d, reason: collision with root package name */
    public final u f308586d;

    public f(u uVar, com.avito.android.user_advert.advert.deliveryPromoBlock.d dVar, Provider provider, u uVar2) {
        this.f308583a = uVar;
        this.f308584b = dVar;
        this.f308585c = provider;
        this.f308586d = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.clientEventBus.a) this.f308583a.get(), (com.avito.android.user_advert.advert.deliveryPromoBlock.a) this.f308584b.get(), this.f308585c.get(), (R0) this.f308586d.get());
    }
}
