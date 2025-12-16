package com.avito.android.async_phone;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import javax.inject.Provider;

/* compiled from: AsyncPhoneTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f92233a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Screen> f92234b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f92235c;

    public n(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f92233a = provider;
        this.f92234b = provider2;
        this.f92235c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f92233a.get(), this.f92234b.get(), (com.avito.android.analytics.screens.r) this.f92235c.f393949a);
    }
}
