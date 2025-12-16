package com.avito.android.mortgage.landing.list.items.action_banner;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ActionBannerVisibilityTracker_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f199667a;

    public i(Provider<InterfaceC28373a> provider) {
        this.f199667a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f199667a.get());
    }
}
