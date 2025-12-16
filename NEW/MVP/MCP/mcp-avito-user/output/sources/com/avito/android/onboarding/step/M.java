package com.avito.android.onboarding.step;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.bxcontent.N1;
import com.avito.android.user_viewed.feature.UserViewedTestGroup;
import javax.inject.Provider;
import ks0.InterfaceC43493a;

/* compiled from: BxOnboardingUserViewedStepInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class M implements dagger.internal.h<F> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f209180a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f209181b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<N1> f209182c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.timestamp_storage.domain.d> f209183d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advert.viewed.persistance.b> f209184e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC43493a> f209185f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f209186g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<u3.g<UserViewedTestGroup>> f209187h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<BE0.a> f209188i;

    public M(Provider<Context> provider, Provider<com.avito.android.account.E> provider2, Provider<N1> provider3, Provider<com.avito.android.timestamp_storage.domain.d> provider4, Provider<com.avito.android.advert.viewed.persistance.b> provider5, Provider<InterfaceC43493a> provider6, Provider<InterfaceC28373a> provider7, Provider<u3.g<UserViewedTestGroup>> provider8, Provider<BE0.a> provider9) {
        this.f209180a = provider;
        this.f209181b = provider2;
        this.f209182c = provider3;
        this.f209183d = provider4;
        this.f209184e = provider5;
        this.f209185f = provider6;
        this.f209186g = provider7;
        this.f209187h = provider8;
        this.f209188i = provider9;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new F(this.f209180a.get(), this.f209181b.get(), this.f209182c.get(), this.f209183d.get(), this.f209184e.get(), this.f209185f.get(), this.f209186g.get(), this.f209187h.get(), this.f209188i.get());
    }
}
