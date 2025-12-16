package com.avito.android.safedeal.delivery.order_cancellation.details.usecase;

import com.avito.android.Z0;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.error.f;
import com.avito.android.remote.model.ReasonRds;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CancelOrderUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.safedeal.delivery.order_cancellation.data.a> f256277a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<f> f256278b;

    /* renamed from: c, reason: collision with root package name */
    public final l f256279c;

    /* renamed from: d, reason: collision with root package name */
    public final l f256280d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f256281e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f256282f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Z0> f256283g;

    public c(l lVar, l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f256277a = provider;
        this.f256278b = provider2;
        this.f256279c = lVar;
        this.f256280d = lVar2;
        this.f256281e = provider3;
        this.f256282f = provider4;
        this.f256283g = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f256277a.get(), this.f256278b.get(), (String) this.f256279c.f393949a, (ReasonRds) this.f256280d.f393949a, this.f256281e.get(), this.f256282f.get(), this.f256283g.get());
    }
}
