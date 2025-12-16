package com.avito.android.advert.item.fair_price;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import q5.C47201a;
import q5.C47202b;

/* compiled from: FairPricePresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f75394a;

    /* renamed from: b, reason: collision with root package name */
    public final C47202b f75395b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f75396c;

    public f(u uVar, C47202b c47202b, Provider provider) {
        this.f75394a = uVar;
        this.f75395b = c47202b;
        this.f75396c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.advert.item.fair_price.dialog.d) this.f75394a.get(), (C47201a) this.f75395b.get(), this.f75396c.get());
    }
}
