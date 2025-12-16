package com.avito.android.travel_onboarding.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelOnboardingBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f302302a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f302303b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.travel_onboarding.domain.interactors.d f302304c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.travel_onboarding.domain.interactors.b f302305d;

    public e(dagger.internal.l lVar, dagger.internal.l lVar2, com.avito.android.travel_onboarding.domain.interactors.d dVar, com.avito.android.travel_onboarding.domain.interactors.b bVar) {
        this.f302302a = lVar;
        this.f302303b = lVar2;
        this.f302304c = dVar;
        this.f302305d = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((String) this.f302302a.f393949a, (DeepLink) this.f302303b.f393949a, (com.avito.android.travel_onboarding.domain.interactors.c) this.f302304c.get(), (com.avito.android.travel_onboarding.domain.interactors.a) this.f302305d.get());
    }
}
