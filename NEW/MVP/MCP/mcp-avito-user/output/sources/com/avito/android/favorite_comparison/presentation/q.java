package com.avito.android.favorite_comparison.presentation;

import Uq.InterfaceC15558a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import sC.InterfaceC48028e;

/* compiled from: FavoriteComparisonViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15558a> f155364a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.favorite_comparison.presentation.items.comparison_list_item.d> f155365b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f155366c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f155367d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f155368e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f155369f;

    public q(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f155364a = provider;
        this.f155365b = provider2;
        this.f155366c = provider3;
        this.f155367d = provider4;
        this.f155368e = provider5;
        this.f155369f = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f155364a.get(), this.f155366c.get(), this.f155365b.get(), this.f155367d.get(), this.f155368e.get(), (InterfaceC48028e) this.f155369f.get());
    }
}
