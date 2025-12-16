package com.avito.android.safedeal_checkout.delivery_universal_checkout.domain;

import Yn0.InterfaceC18304a;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.model.DeliveryUniversalCheckoutData;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryUniversalCheckoutUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC18304a> f257053a;

    /* renamed from: b, reason: collision with root package name */
    public final u f257054b;

    /* renamed from: c, reason: collision with root package name */
    public final l f257055c;

    public b(l lVar, u uVar, Provider provider) {
        this.f257053a = provider;
        this.f257054b = uVar;
        this.f257055c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f257053a.get(), (com.avito.android.safedeal_checkout.delivery_universal_checkout.a) this.f257054b.get(), (DeliveryUniversalCheckoutData) this.f257055c.f393949a);
    }
}
