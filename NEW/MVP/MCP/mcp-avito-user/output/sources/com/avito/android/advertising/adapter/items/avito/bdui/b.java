package com.avito.android.advertising.adapter.items.avito.bdui;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import iT.InterfaceC41342b;
import javax.inject.Provider;
import ob.InterfaceC44740d;

/* compiled from: AvitoNetworkAvlBDUIBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f87024a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f87025b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f87026c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f87027d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f87028e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f87029f;

    public b(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, Provider provider, Provider provider2) {
        this.f87024a = provider;
        this.f87025b = provider2;
        this.f87026c = lVar;
        this.f87027d = lVar2;
        this.f87028e = lVar3;
        this.f87029f = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f87024a.get(), this.f87025b.get(), (Screen) this.f87026c.f393949a, (InterfaceC44740d) this.f87027d.f393949a, (androidx.appcompat.app.m) this.f87028e.f393949a, (InterfaceC41342b) this.f87029f.f393949a);
    }
}
