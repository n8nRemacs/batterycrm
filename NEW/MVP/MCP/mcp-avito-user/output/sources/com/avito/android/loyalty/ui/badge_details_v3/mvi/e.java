package com.avito.android.loyalty.ui.badge_details_v3.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BadgeDetailsV3Bootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.loyalty.ui.badge_details_v3.e> f183330a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f183331b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f183332c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f183333d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f183334e;

    public e(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f183330a = provider;
        this.f183331b = lVar;
        this.f183332c = lVar2;
        this.f183333d = provider2;
        this.f183334e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f183330a.get(), (String) this.f183331b.f393949a, (String) this.f183332c.f393949a, this.f183333d.get(), this.f183334e.get());
    }
}
