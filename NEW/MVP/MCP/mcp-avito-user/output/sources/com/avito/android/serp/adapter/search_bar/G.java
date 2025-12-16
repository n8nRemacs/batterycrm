package com.avito.android.serp.adapter.search_bar;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ur.InterfaceC49101b;
import wv.C49686b;

/* compiled from: SearchBarItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class G implements dagger.internal.h<C34840t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N> f271584a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.p> f271585b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f271586c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f271587d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f271588e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f271589f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Rp0.b> f271590g;

    /* renamed from: h, reason: collision with root package name */
    public final C49686b f271591h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f271592i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f271593j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f271594k;

    public G(Provider provider, Provider provider2, Provider provider3, dagger.internal.f fVar, dagger.internal.f fVar2, Provider provider4, Provider provider5, C49686b c49686b, Provider provider6, Provider provider7, Provider provider8) {
        this.f271584a = provider;
        this.f271585b = provider2;
        this.f271586c = provider3;
        this.f271587d = fVar;
        this.f271588e = fVar2;
        this.f271589f = provider4;
        this.f271590g = provider5;
        this.f271591h = c49686b;
        this.f271592i = provider6;
        this.f271593j = provider7;
        this.f271594k = provider8;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34840t(this.f271584a.get(), this.f271585b.get(), this.f271586c.get(), dagger.internal.g.b(this.f271587d), dagger.internal.g.b(this.f271588e), this.f271589f.get(), this.f271590g.get(), (com.avito.android.delayed_ux_feedback.d) this.f271591h.get(), this.f271592i.get(), this.f271593j.get(), this.f271594k.get());
    }
}
