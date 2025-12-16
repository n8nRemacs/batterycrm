package com.avito.android.favorite_sellers.adapter.recommendation;

/* compiled from: RecommendationInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<C30577c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f155639a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f155640b;

    public d(dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f155639a = uVar;
        this.f155640b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30577c(dagger.internal.g.a(dagger.internal.w.a(this.f155639a)), (I30.d) this.f155640b.get());
    }
}
