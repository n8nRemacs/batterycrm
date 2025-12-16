package com.avito.android.bundles.vas_union.di;

import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bundles.vas_union.di.d;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: VasUnionModule_ProvideViewModelFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class A implements dagger.internal.h<P0.c> {

    /* renamed from: a, reason: collision with root package name */
    public final q f108479a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.bundles.vas_union.repository.a> f108480b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.bundles.vas_union.a> f108481c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f108482d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f108483e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<AK0.l> f108484f;

    public A(q qVar, Provider provider, Provider provider2, Provider provider3, dagger.internal.u uVar, Provider provider4) {
        this.f108479a = qVar;
        this.f108480b = provider;
        this.f108481c = provider2;
        this.f108482d = provider3;
        this.f108483e = uVar;
        this.f108484f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.bundles.vas_union.repository.a aVar = this.f108480b.get();
        com.avito.android.bundles.vas_union.a aVar2 = this.f108481c.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((d.c.C3247c) this.f108482d).get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f108483e.get();
        AK0.l lVar = (AK0.l) ((d.c.b) this.f108484f).get();
        q qVar = this.f108479a;
        qVar.getClass();
        return new com.avito.android.bundles.vas_union.viewmodel.t(lVar, screenPerformanceTracker, aVar2, aVar, interfaceC35745a5, qVar.f108543a);
    }
}
