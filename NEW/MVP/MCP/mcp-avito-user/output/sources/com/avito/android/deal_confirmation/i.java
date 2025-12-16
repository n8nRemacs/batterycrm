package com.avito.android.deal_confirmation;

import com.avito.android.account.E;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DealConfirmationPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<a> f132769a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f132770b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f132771c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f132772d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f132773e;

    public i(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f132769a = provider;
        this.f132770b = provider2;
        this.f132771c = provider3;
        this.f132772d = provider4;
        this.f132773e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f132769a.get(), this.f132770b.get(), this.f132771c.get(), this.f132772d.get(), (Kundle) this.f132773e.f393949a);
    }
}
