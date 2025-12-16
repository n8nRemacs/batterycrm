package com.avito.android.service_orders.mvi;

import androidx.view.InterfaceC22983P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: AnalyticsTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.service_orders.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34936f implements dagger.internal.h<C34935e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f279601a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f279602b;

    public C34936f(dagger.internal.u uVar, Provider provider) {
        this.f279601a = provider;
        this.f279602b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34935e(this.f279601a.get(), (InterfaceC22983P) this.f279602b.get());
    }
}
