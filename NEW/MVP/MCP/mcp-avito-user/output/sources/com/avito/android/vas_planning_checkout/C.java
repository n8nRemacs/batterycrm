package com.avito.android.vas_planning_checkout;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import jM0.InterfaceC42284a;
import javax.inject.Provider;

/* compiled from: VasPlanCheckoutViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class C implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f322756a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f322757b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.vas_planning_checkout.domain.d> f322758c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.vas_planning_checkout.domain.k> f322759d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.vas_planning_checkout.item.price.k> f322760e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.vas_planning_checkout.domain.g> f322761f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.vas_planning_checkout.domain.r> f322762g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.vas_planning_checkout.domain.n> f322763h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f322764i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.u f322765j;

    public C(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f322756a = lVar;
        this.f322757b = provider;
        this.f322758c = provider2;
        this.f322759d = provider3;
        this.f322760e = provider4;
        this.f322761f = provider5;
        this.f322762g = provider6;
        this.f322763h = provider7;
        this.f322764i = provider8;
        this.f322765j = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        VasPlanCheckoutFragmentArgument vasPlanCheckoutFragmentArgument = (VasPlanCheckoutFragmentArgument) this.f322756a.f393949a;
        InterfaceC35745a5 interfaceC35745a5 = this.f322757b.get();
        com.avito.android.vas_planning_checkout.domain.d dVar = this.f322758c.get();
        com.avito.android.vas_planning_checkout.domain.k kVar = this.f322759d.get();
        com.avito.android.vas_planning_checkout.item.price.k kVar2 = this.f322760e.get();
        com.avito.android.vas_planning_checkout.domain.g gVar = this.f322761f.get();
        com.avito.android.vas_planning_checkout.domain.r rVar = this.f322762g.get();
        return new B(this.f322764i.get(), interfaceC35745a5, vasPlanCheckoutFragmentArgument, dVar, gVar, kVar, this.f322763h.get(), rVar, kVar2, (InterfaceC42284a) this.f322765j.get());
    }
}
