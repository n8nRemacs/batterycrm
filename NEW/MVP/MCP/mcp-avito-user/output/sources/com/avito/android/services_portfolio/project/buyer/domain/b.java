package com.avito.android.services_portfolio.project.buyer.domain;

import cv0.InterfaceC39418a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ov0.InterfaceC44945a;

/* compiled from: PortfolioProjectBuyerInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC39418a> f280012a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC44945a> f280013b;

    public b(Provider<InterfaceC39418a> provider, Provider<InterfaceC44945a> provider2) {
        this.f280012a = provider;
        this.f280013b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f280012a.get(), this.f280013b.get());
    }
}
