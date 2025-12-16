package com.avito.android.di.module;

/* compiled from: DevelopmentItemModule_ProvideDevelopmentXlListItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class J4 implements dagger.internal.h<com.avito.android.serp.adapter.rich_snippets.realty.A> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f144016a;

    public J4(dagger.internal.f fVar) {
        this.f144016a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f144016a);
        F4 f42 = F4.f143954a;
        return new com.avito.android.serp.adapter.rich_snippets.realty.C(eVarB);
    }
}
