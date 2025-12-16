package com.avito.android.advert.item.service_order_request;

import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceOrderRequestPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f79941a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28280j> f79942b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f79943c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28265d> f79944d;

    public p(Provider<InterfaceC35745a5> provider, Provider<InterfaceC28280j> provider2, Provider<com.avito.android.advert_core.analytics.a> provider3, Provider<InterfaceC28265d> provider4) {
        this.f79941a = provider;
        this.f79942b = provider2;
        this.f79943c = provider3;
        this.f79944d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f79941a.get(), this.f79942b.get(), this.f79943c.get(), this.f79944d.get());
    }
}
