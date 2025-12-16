package com.avito.android.serp.adapter.witcher;

import com.avito.android.analytics.InterfaceC28373a;

/* compiled from: WitcherAnalyticsFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.serp.adapter.witcher.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34884c implements dagger.internal.h<C34883b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f273848a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f273849b;

    public C34884c(dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f273848a = uVar;
        this.f273849b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34883b((com.avito.android.serp.analytics.widgets_tracker.g) this.f273848a.get(), (InterfaceC28373a) this.f273849b.get());
    }
}
