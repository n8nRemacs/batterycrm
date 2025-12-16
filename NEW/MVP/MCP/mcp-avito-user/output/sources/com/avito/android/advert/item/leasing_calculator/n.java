package com.avito.android.advert.item.leasing_calculator;

import com.avito.android.C29640d;
import com.avito.android.advert.InterfaceC28240u;
import com.avito.android.advert.item.leasing_calculator.c;
import com.avito.android.leasing_calculator.view.InterfaceC31101a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import jR.InterfaceC42298a;
import javax.inject.Provider;
import oR.InterfaceC44683b;

/* compiled from: AdvertDetailsLeasingCalculatorItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class n implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28240u> f77426a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.leasing_calculator.m> f77427b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f77428c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.leasing_calculator.formatters.k> f77429d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.leasing_calculator.formatters.d> f77430e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.leasing_calculator.formatters.a> f77431f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f77432g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.leasing_calculator.view.j> f77433h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.component.toast.util.c> f77434i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC31101a> f77435j;

    /* renamed from: k, reason: collision with root package name */
    public final u f77436k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f77437l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<InterfaceC42298a> f77438m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<InterfaceC44683b> f77439n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<C29640d> f77440o;

    public n(Provider provider, Provider provider2, dagger.internal.f fVar, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, u uVar, Provider provider10, Provider provider11, Provider provider12, Provider provider13) {
        this.f77426a = provider;
        this.f77427b = provider2;
        this.f77428c = fVar;
        this.f77429d = provider3;
        this.f77430e = provider4;
        this.f77431f = provider5;
        this.f77432g = provider6;
        this.f77433h = provider7;
        this.f77434i = provider8;
        this.f77435j = provider9;
        this.f77436k = uVar;
        this.f77437l = provider10;
        this.f77438m = provider11;
        this.f77439n = provider12;
        this.f77440o = provider13;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f77426a.get(), this.f77427b.get(), (c.a) this.f77428c.get(), this.f77429d.get(), this.f77430e.get(), this.f77431f.get(), this.f77432g.get(), this.f77433h.get(), this.f77434i.get(), this.f77435j.get(), (com.avito.android.leasing_calculator.view.u) this.f77436k.get(), this.f77437l.get(), this.f77438m.get(), this.f77439n.get(), this.f77440o.get());
    }
}
