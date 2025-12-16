package com.avito.android.recommendation_items_loader_impl.screen.mvi;

import Ii0.InterfaceC14116a;
import com.avito.android.recommendation_items_loader_impl.screen.RecommendationLoaderActivityArgument;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RecommendationLoaderActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14116a> f252329a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f252330b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f252331c;

    public f(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f252329a = provider;
        this.f252330b = provider2;
        this.f252331c = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f252329a.get(), this.f252330b.get(), (RecommendationLoaderActivityArgument) this.f252331c.f393949a);
    }
}
