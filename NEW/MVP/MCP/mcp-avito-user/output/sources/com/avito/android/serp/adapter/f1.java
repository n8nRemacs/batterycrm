package com.avito.android.serp.adapter;

import javax.inject.Provider;

/* compiled from: SpanLookup_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class f1 implements dagger.internal.h<e1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g1> f269949a;

    public f1(Provider<g1> provider) {
        this.f269949a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e1(this.f269949a.get());
    }
}
