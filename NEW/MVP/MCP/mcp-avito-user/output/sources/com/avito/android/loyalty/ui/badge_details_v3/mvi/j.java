package com.avito.android.loyalty.ui.badge_details_v3.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BadgeDetailsV3OneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f183351a;

    public j(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f183351a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f183351a.get());
    }
}
