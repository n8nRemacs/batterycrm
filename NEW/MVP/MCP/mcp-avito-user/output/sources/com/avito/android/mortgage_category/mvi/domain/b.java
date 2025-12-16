package com.avito.android.mortgage_category.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LoadScreenUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<K10.a> f204935a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage_category.mvi.domain.mapper.c f204936b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f204937c;

    public b(Provider provider, com.avito.android.mortgage_category.mvi.domain.mapper.c cVar, Provider provider2) {
        this.f204935a = provider;
        this.f204936b = cVar;
        this.f204937c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = g.a(w.a(this.f204935a));
        this.f204936b.getClass();
        return new a(eVarA, new com.avito.android.mortgage_category.mvi.domain.mapper.b(), this.f204937c.get());
    }
}
