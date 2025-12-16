package com.avito.android.mortgage_category.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage_category.model.MortgageCategoryArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgageCategoryFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f204957a;

    /* renamed from: b, reason: collision with root package name */
    public final h f204958b;

    /* renamed from: c, reason: collision with root package name */
    public final j f204959c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f204960d;

    /* renamed from: e, reason: collision with root package name */
    public final l f204961e;

    public f(c cVar, h hVar, j jVar, Provider provider, l lVar) {
        this.f204957a = cVar;
        this.f204958b = hVar;
        this.f204959c = jVar;
        this.f204960d = provider;
        this.f204961e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f204957a.get();
        this.f204958b.getClass();
        g gVar = new g();
        this.f204959c.getClass();
        i iVar = new i();
        ScreenPerformanceTracker screenPerformanceTracker = this.f204960d.get();
        MortgageCategoryArguments mortgageCategoryArguments = (MortgageCategoryArguments) this.f204961e.f393949a;
        P10.d.f12777f.getClass();
        return new e("MortgageCategory", new P10.d(mortgageCategoryArguments.f204911b, mortgageCategoryArguments.f204912c, null, true), new d(bVar, screenPerformanceTracker, iVar, gVar));
    }
}
