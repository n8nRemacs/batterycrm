package com.avito.android.wallet.history.mvi.components;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.wallet.history.mvi.C36137b;
import com.avito.android.wallet.history.mvi.C36142g;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletHistoryActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C36142g f327588a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f327589b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f327590c;

    public e(C36142g c36142g, Provider provider, Provider provider2) {
        this.f327588a = c36142g;
        this.f327589b = provider;
        this.f327590c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((C36137b) this.f327588a.get(), this.f327589b.get(), this.f327590c.get());
    }
}
