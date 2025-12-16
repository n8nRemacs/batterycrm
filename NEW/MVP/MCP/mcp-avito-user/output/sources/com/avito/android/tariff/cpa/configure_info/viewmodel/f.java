package com.avito.android.tariff.cpa.configure_info.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpaConfigureInfoFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f294534a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<a> f294535b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f294536c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f294537d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f294538e;

    public f(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f294534a = provider;
        this.f294535b = provider2;
        this.f294536c = provider3;
        this.f294537d = provider4;
        this.f294538e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = this.f294534a.get();
        return new e(this.f294537d.get(), this.f294535b.get(), gVar, this.f294536c.get(), (String) this.f294538e.f393949a);
    }
}
