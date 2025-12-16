package com.avito.android.services_portfolio.project.seller.domain;

import cv0.InterfaceC39418a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PortfolioProjectSellerInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC39418a> f280226a;

    public b(Provider<InterfaceC39418a> provider) {
        this.f280226a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f280226a.get());
    }
}
