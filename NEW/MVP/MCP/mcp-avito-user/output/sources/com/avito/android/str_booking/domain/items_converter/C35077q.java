package com.avito.android.str_booking.domain.items_converter;

import javax.inject.Provider;

/* compiled from: StrBookingConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.str_booking.domain.items_converter.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35077q implements dagger.internal.h<C35076p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<M> f285650a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35065e> f285651b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35080u> f285652c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<A> f285653d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<T> f285654e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<r> f285655f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<D> f285656g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35072l> f285657h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<x> f285658i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC35061a> f285659j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<J> f285660k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.u f285661l;

    public C35077q(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11) {
        this.f285650a = provider;
        this.f285651b = provider2;
        this.f285652c = provider3;
        this.f285653d = provider4;
        this.f285654e = provider5;
        this.f285655f = provider6;
        this.f285656g = provider7;
        this.f285657h = provider8;
        this.f285658i = provider9;
        this.f285659j = provider10;
        this.f285660k = provider11;
        this.f285661l = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35076p(this.f285650a.get(), this.f285651b.get(), this.f285652c.get(), this.f285653d.get(), this.f285654e.get(), this.f285655f.get(), this.f285656g.get(), this.f285657h.get(), this.f285658i.get(), this.f285659j.get(), this.f285660k.get(), (InterfaceC35068h) this.f285661l.get());
    }
}
