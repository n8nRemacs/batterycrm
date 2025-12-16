package com.avito.android.map.analytics;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.map.MapArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MapAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f184834a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.e> f184835b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<e> f184836c;

    /* renamed from: d, reason: collision with root package name */
    public final l f184837d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f184838e;

    public c(l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f184834a = provider;
        this.f184835b = provider2;
        this.f184836c = provider3;
        this.f184837d = lVar;
        this.f184838e = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f184834a.get(), this.f184835b.get(), this.f184836c.get(), (MapArguments) this.f184837d.f393949a, this.f184838e.get());
    }
}
