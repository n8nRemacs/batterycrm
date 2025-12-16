package com.avito.android.profile.user_profile.cards.address;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EmptyAddressCardPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f224749a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f224750b;

    public p(dagger.internal.l lVar, Provider provider) {
        this.f224749a = provider;
        this.f224750b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((Y41.l) this.f224750b.f393949a, this.f224749a.get());
    }
}
