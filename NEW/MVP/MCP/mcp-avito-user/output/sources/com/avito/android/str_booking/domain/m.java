package com.avito.android.str_booking.domain;

import Nx0.InterfaceC14622b;
import Px0.InterfaceC14851a;
import Wx0.C15807a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.d1;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lE.C43624b;

/* compiled from: StrBookingInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14851a> f285679a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14622b> f285680b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<d1> f285681c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f285682d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f285683e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C43624b> f285684f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f285685g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C15807a> f285686h;

    /* renamed from: i, reason: collision with root package name */
    public final b f285687i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.l f285688j;

    public m(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, b bVar, dagger.internal.l lVar) {
        this.f285679a = provider;
        this.f285680b = provider2;
        this.f285681c = provider3;
        this.f285682d = provider4;
        this.f285683e = provider5;
        this.f285684f = provider6;
        this.f285685g = provider7;
        this.f285686h = provider8;
        this.f285687i = bVar;
        this.f285688j = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14851a interfaceC14851a = this.f285679a.get();
        InterfaceC14622b interfaceC14622b = this.f285680b.get();
        d1 d1Var = this.f285681c.get();
        R0 r02 = this.f285682d.get();
        InterfaceC28373a interfaceC28373a = this.f285683e.get();
        C43624b c43624b = this.f285684f.get();
        com.avito.android.analytics.provider.a aVar = this.f285685g.get();
        C15807a c15807a = this.f285686h.get();
        this.f285687i.getClass();
        return new g(interfaceC14851a, interfaceC14622b, d1Var, r02, interfaceC28373a, c43624b, aVar, c15807a, new a(), (String) this.f285688j.f393949a);
    }
}
