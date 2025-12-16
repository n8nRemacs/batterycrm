package com.avito.android.profile.user_profile.cards.calls_history_card_item;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CallsHistoryCardItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f224860a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f224861b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f224862c;

    public e(l lVar, Provider provider, Provider provider2) {
        this.f224860a = lVar;
        this.f224861b = provider;
        this.f224862c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Y41.l) this.f224860a.f393949a, this.f224862c.get(), this.f224861b.get());
    }
}
