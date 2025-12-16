package com.avito.android.bxcontent.di.module;

import com.avito.android.util.Kundle;
import javax.inject.Provider;

/* compiled from: BxContentModule_ProvideStoriesItemPresenter$_avito_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class M implements dagger.internal.h<com.avito.android.stories.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.stories.n f110895a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f110896b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f110897c;

    public M(com.avito.android.stories.n nVar, dagger.internal.l lVar, Provider provider) {
        this.f110895a = nVar;
        this.f110896b = lVar;
        this.f110897c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.stories.m mVar = (com.avito.android.stories.m) this.f110895a.get();
        Kundle kundle = (Kundle) this.f110896b.f393949a;
        com.avito.android.serp.analytics.widgets_tracker.g gVar = this.f110897c.get();
        C29070s.f111022a.getClass();
        return new com.avito.android.stories.adapter.d(mVar, kundle, gVar);
    }
}
