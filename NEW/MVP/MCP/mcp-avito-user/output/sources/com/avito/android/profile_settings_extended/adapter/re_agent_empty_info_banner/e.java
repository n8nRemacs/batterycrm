package com.avito.android.profile_settings_extended.adapter.re_agent_empty_info_banner;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReAgentEmptyInfoBannerItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f229770a;

    /* renamed from: b, reason: collision with root package name */
    public final l f229771b;

    public e(l lVar, Provider provider) {
        this.f229770a = provider;
        this.f229771b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Y41.l) this.f229771b.f393949a, this.f229770a.get());
    }
}
