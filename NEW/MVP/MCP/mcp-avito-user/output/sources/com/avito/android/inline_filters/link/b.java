package com.avito.android.inline_filters.link;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InlineFiltersApplyLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f172313a;

    public b(Provider<f> provider) {
        this.f172313a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f172313a.get());
    }
}
