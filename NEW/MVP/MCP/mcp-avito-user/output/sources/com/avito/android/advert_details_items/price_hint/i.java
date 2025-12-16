package com.avito.android.advert_details_items.price_hint;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PriceHintPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f85371a;

    /* renamed from: b, reason: collision with root package name */
    public final u f85372b;

    public i(u uVar, u uVar2) {
        this.f85371a = uVar;
        this.f85372b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((a) this.f85371a.get(), (InterfaceC28373a) this.f85372b.get());
    }
}
