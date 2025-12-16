package com.avito.android.profile_settings_extended.adapter.re_agent_short_flow_creation_banner;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReAgentShortFlowCreationBannerItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f229794a;

    /* renamed from: b, reason: collision with root package name */
    public final l f229795b;

    public f(l lVar, Provider provider) {
        this.f229794a = provider;
        this.f229795b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Y41.l) this.f229795b.f393949a, this.f229794a.get());
    }
}
