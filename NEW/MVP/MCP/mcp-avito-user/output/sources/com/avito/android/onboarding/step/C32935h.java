package com.avito.android.onboarding.step;

import android.content.res.Resources;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.bxcontent.N1;
import javax.inject.Provider;

/* compiled from: BxOnboardingFavoritesStepInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.onboarding.step.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32935h implements dagger.internal.h<C32933f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<N1> f209211a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.timestamp_storage.domain.d> f209212b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f209213c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f209214d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<u3.g<SimpleTestGroupWithNone>> f209215e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<BE0.a> f209216f;

    public C32935h(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f209211a = provider;
        this.f209212b = provider2;
        this.f209213c = lVar;
        this.f209214d = provider3;
        this.f209215e = provider4;
        this.f209216f = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C32933f(this.f209211a.get(), this.f209212b.get(), (Resources) this.f209213c.f393949a, this.f209214d.get(), this.f209215e.get(), this.f209216f.get());
    }
}
