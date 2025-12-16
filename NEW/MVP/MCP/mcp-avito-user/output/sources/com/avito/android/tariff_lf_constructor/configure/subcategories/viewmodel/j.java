package com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConstructorConfigureSubCategoriesViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f300499a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f300500b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f300501c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<d> f300502d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.tariff_lf_constructor.configure.a> f300503e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<a> f300504f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l> f300505g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f300506h;

    /* renamed from: i, reason: collision with root package name */
    public final u f300507i;

    public j(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f300499a = lVar;
        this.f300500b = lVar2;
        this.f300501c = lVar3;
        this.f300502d = provider;
        this.f300503e = provider2;
        this.f300504f = provider3;
        this.f300505g = provider4;
        this.f300506h = provider5;
        this.f300507i = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((String) this.f300499a.f393949a, (String) this.f300500b.f393949a, (String) this.f300501c.f393949a, this.f300502d.get(), this.f300503e.get(), this.f300504f.get(), this.f300505g.get(), this.f300506h.get(), (ScreenPerformanceTracker) this.f300507i.get());
    }
}
