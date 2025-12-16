package com.avito.android.re_agent_landing.landing.items.action_block;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ActionBlockPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f250747a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f250748b;

    public g(l lVar, Provider provider) {
        this.f250747a = lVar;
        this.f250748b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Y41.l) this.f250747a.f393949a, this.f250748b.get());
    }
}
