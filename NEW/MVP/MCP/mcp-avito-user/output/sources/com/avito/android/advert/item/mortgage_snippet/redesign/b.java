package com.avito.android.advert.item.mortgage_snippet.redesign;

import com.avito.android.advert.item.mortgage_snippet.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgageRedesignSnippetBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f77714a;

    public b(Provider<c> provider) {
        this.f77714a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f77714a.get());
    }
}
