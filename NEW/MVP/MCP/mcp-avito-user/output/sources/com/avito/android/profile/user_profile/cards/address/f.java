package com.avito.android.profile.user_profile.cards.address;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AddressCardPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f224727a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f224728b;

    public f(dagger.internal.l lVar, Provider provider) {
        this.f224727a = provider;
        this.f224728b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Y41.l) this.f224728b.f393949a, this.f224727a.get());
    }
}
