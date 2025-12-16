package com.avito.android.vas_performance.ui.stickers.buy;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: StickersBuyVasViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f321991a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f321992b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.vas_performance.r> f321993c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.vas_performance.repository.a> f321994d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f321995e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f321996f;

    public x(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f321991a = lVar;
        this.f321992b = lVar2;
        this.f321993c = provider;
        this.f321994d = provider2;
        this.f321995e = provider3;
        this.f321996f = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new w((String) this.f321991a.f393949a, (String) this.f321992b.f393949a, this.f321993c.get(), this.f321994d.get(), this.f321995e.get(), (ScreenPerformanceTracker) this.f321996f.get());
    }
}
