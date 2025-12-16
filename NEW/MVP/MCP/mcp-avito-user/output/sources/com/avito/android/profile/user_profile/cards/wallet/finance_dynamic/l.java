package com.avito.android.profile.user_profile.cards.wallet.finance_dynamic;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvitoFinanceDynamicPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f225700a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f225701b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f225702c;

    public l(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f225700a = lVar;
        this.f225701b = provider;
        this.f225702c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((Y41.l) this.f225700a.f393949a, this.f225701b.get(), this.f225702c.get());
    }
}
