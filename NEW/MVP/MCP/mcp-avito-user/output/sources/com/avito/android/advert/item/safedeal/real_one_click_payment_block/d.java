package com.avito.android.advert.item.safedeal.real_one_click_payment_block;

import Mn0.InterfaceC14512b;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsSafeDealPaymentBlockInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14512b> f78921a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f78922b;

    public d(Provider<InterfaceC14512b> provider, Provider<InterfaceC35745a5> provider2) {
        this.f78921a = provider;
        this.f78922b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f78922b.get(), dagger.internal.g.a(w.a(this.f78921a)));
    }
}
