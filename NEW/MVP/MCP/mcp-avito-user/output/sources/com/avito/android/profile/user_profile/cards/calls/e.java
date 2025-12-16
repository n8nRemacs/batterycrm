package com.avito.android.profile.user_profile.cards.calls;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CallsCardPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f224842a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f224843b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f224844c;

    public e(l lVar, Provider provider, Provider provider2) {
        this.f224842a = lVar;
        this.f224843b = provider;
        this.f224844c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Y41.l) this.f224842a.f393949a, this.f224844c.get(), this.f224843b.get());
    }
}
