package com.avito.android.advert.item.leasing_calculator.link_item;

import com.avito.android.advert.InterfaceC28240u;
import com.avito.android.advert.item.leasing_calculator.formatters.k;
import com.avito.android.advert.item.leasing_calculator.link_item.c;
import dagger.internal.x;
import dagger.internal.y;
import jR.InterfaceC42298a;
import javax.inject.Provider;

/* compiled from: AdvertDetailsLeasingLinkItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28240u> f77418a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<k> f77419b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f77420c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC42298a> f77421d;

    public f(dagger.internal.f fVar, Provider provider, Provider provider2, Provider provider3) {
        this.f77418a = provider;
        this.f77419b = provider2;
        this.f77420c = fVar;
        this.f77421d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f77418a.get(), this.f77419b.get(), (c.a) this.f77420c.get(), this.f77421d.get());
    }
}
