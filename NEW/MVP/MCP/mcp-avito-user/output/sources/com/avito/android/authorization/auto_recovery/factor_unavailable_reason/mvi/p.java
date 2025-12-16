package com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.FactorUnavailableReasonArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FactorUnavailableReasonReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class p implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f93189a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f93190b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f93191c;

    public p(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f93189a = provider;
        this.f93190b = lVar;
        this.f93191c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f93189a.get(), (FactorUnavailableReasonArguments) this.f93190b.f393949a, this.f93191c.get());
    }
}
