package com.avito.android.bundles.di;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bundles.di.f;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: VasBundlesViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class C implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f108262a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.bundles.repository.a> f108263b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.bundles.b> f108264c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f108265d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f108266e;

    public C(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f108262a = lVar;
        this.f108263b = provider;
        this.f108264c = provider2;
        this.f108265d = provider3;
        this.f108266e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f108262a.f393949a;
        com.avito.android.bundles.repository.a aVar = this.f108263b.get();
        return new B((ScreenPerformanceTracker) this.f108266e.get(), this.f108264c.get(), aVar, (InterfaceC35745a5) ((f.c.C3243c) this.f108265d).get(), str);
    }
}
