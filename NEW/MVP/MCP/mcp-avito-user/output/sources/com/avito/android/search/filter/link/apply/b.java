package com.avito.android.search.filter.link.apply;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FiltersApplyLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f263394a;

    public b(Provider<f> provider) {
        this.f263394a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f263394a.get());
    }
}
