package com.avito.android.travel_search.domain;

import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TravelSearchHeaderModelMapperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Gson> f303102a;

    public f(Provider<Gson> provider) {
        this.f303102a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f303102a.get());
    }
}
