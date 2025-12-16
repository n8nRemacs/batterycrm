package com.avito.android.advert_details_items.price_discount;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import t9.InterfaceC48520a;

/* compiled from: PriceWithDiscountPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f85331a;

    /* renamed from: b, reason: collision with root package name */
    public final u f85332b;

    /* renamed from: c, reason: collision with root package name */
    public final u f85333c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert_details_items.price_hint.f> f85334d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advert_details_items.buyer_bonuses.c> f85335e;

    public f(l lVar, u uVar, u uVar2, Provider provider, Provider provider2) {
        this.f85331a = lVar;
        this.f85332b = uVar;
        this.f85333c = uVar2;
        this.f85334d = provider;
        this.f85335e = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((String) this.f85331a.f393949a, (InterfaceC48520a) this.f85332b.get(), (InterfaceC28373a) this.f85333c.get(), this.f85334d.get(), this.f85335e.get());
    }
}
