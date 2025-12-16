package com.avito.android.loyalty.ui.badge_details_v3.mvi;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BadgeDetailsV3Actor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.loyalty.ui.badge_details_v3.e> f183319a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f183320b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f183321c;

    public c(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f183319a = provider;
        this.f183320b = lVar;
        this.f183321c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f183319a.get(), (String) this.f183320b.f393949a, this.f183321c.get());
    }
}
