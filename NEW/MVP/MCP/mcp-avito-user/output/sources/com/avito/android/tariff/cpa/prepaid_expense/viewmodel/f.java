package com.avito.android.tariff.cpa.prepaid_expense.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: PublicationAdvanceFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f295083a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<j> f295084b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35206a> f295085c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f295086d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f295087e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<g> f295088f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f295089g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f295090h;

    public f(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f295083a = lVar;
        this.f295084b = provider;
        this.f295085c = provider2;
        this.f295086d = provider3;
        this.f295087e = provider4;
        this.f295088f = provider5;
        this.f295089g = uVar;
        this.f295090h = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((String) this.f295083a.f393949a, this.f295084b.get(), this.f295085c.get(), this.f295086d.get(), this.f295087e.get(), this.f295088f.get(), (v50.g) this.f295089g.get(), this.f295090h.get());
    }
}
