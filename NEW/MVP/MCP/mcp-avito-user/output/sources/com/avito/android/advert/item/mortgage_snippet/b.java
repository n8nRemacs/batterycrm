package com.avito.android.advert.item.mortgage_snippet;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgageSnippetBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f77687a;

    public b(Provider<c> provider) {
        this.f77687a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f77687a.get());
    }
}
