package com.avito.android.profile.user_profile.cards.wallet.finance_simple;

import N90.p;
import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvitoFinanceSimpleCardItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f225718a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f225719b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<p> f225720c;

    /* renamed from: d, reason: collision with root package name */
    public final N90.d f225721d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<Context> f225722e;

    public h(l lVar, Provider provider, Provider provider2, N90.d dVar, Provider provider3) {
        this.f225718a = lVar;
        this.f225719b = provider;
        this.f225720c = provider2;
        this.f225721d = dVar;
        this.f225722e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Y41.l) this.f225718a.f393949a, this.f225719b.get(), this.f225720c.get(), (N90.b) this.f225721d.get(), this.f225722e.get());
    }
}
