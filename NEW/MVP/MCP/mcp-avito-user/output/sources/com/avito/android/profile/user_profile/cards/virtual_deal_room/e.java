package com.avito.android.profile.user_profile.cards.virtual_deal_room;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VirtualDealRoomCardPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f225618a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f225619b;

    public e(l lVar, Provider provider) {
        this.f225618a = lVar;
        this.f225619b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Y41.l) this.f225618a.f393949a, this.f225619b.get());
    }
}
