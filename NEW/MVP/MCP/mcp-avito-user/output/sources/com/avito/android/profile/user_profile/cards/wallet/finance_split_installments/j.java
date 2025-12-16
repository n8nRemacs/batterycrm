package com.avito.android.profile.user_profile.cards.wallet.finance_split_installments;

import N90.p;
import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvitoFinanceSplitInstallmentsCardItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final l f225766a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f225767b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<p> f225768c;

    /* renamed from: d, reason: collision with root package name */
    public final N90.d f225769d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<Context> f225770e;

    public j(l lVar, Provider provider, Provider provider2, N90.d dVar, Provider provider3) {
        this.f225766a = lVar;
        this.f225767b = provider;
        this.f225768c = provider2;
        this.f225769d = dVar;
        this.f225770e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Y41.l) this.f225766a.f393949a, this.f225767b.get(), this.f225768c.get(), (N90.b) this.f225769d.get(), this.f225770e.get());
    }
}
