package com.avito.android.vas_performance.ui.stickers.edit;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_performance.v;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StickersEditVasViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f322056a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<v> f322057b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.vas_performance.repository.a> f322058c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f322059d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f322060e;

    public s(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f322056a = lVar;
        this.f322057b = provider;
        this.f322058c = provider2;
        this.f322059d = provider3;
        this.f322060e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new r((String) this.f322056a.f393949a, this.f322057b.get(), this.f322058c.get(), this.f322059d.get(), (ScreenPerformanceTracker) this.f322060e.get());
    }
}
