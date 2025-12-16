package com.avito.android.onboarding.step;

import android.content.res.Resources;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.bxcontent.N1;
import javax.inject.Provider;
import ks0.InterfaceC43493a;

/* compiled from: BxOnboardingPriceLoweredStepInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class y implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43493a> f209249a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<N1> f209250b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.timestamp_storage.domain.d> f209251c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f209252d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f209253e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<u3.g<SimpleTestGroupWithNone>> f209254f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<BE0.a> f209255g;

    public y(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f209249a = provider;
        this.f209250b = provider2;
        this.f209251c = provider3;
        this.f209252d = lVar;
        this.f209253e = provider4;
        this.f209254f = provider5;
        this.f209255g = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f209249a.get(), this.f209250b.get(), this.f209251c.get(), (Resources) this.f209252d.f393949a, this.f209253e.get(), this.f209254f.get(), this.f209255g.get());
    }
}
