package com.avito.android.tariff_lf_constructor.configure.setting.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ConstructorSettingViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f300192a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35215a> f300193b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35219e> f300194c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f300195d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f300196e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f300197f;

    public l(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f300192a = lVar;
        this.f300193b = provider;
        this.f300194c = provider2;
        this.f300195d = provider3;
        this.f300196e = uVar;
        this.f300197f = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k((String) this.f300192a.f393949a, this.f300193b.get(), this.f300194c.get(), this.f300195d.get(), (ScreenPerformanceTracker) this.f300196e.get(), this.f300197f.get());
    }
}
