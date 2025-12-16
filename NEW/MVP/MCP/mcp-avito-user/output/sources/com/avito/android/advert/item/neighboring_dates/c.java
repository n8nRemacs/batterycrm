package com.avito.android.advert.item.neighboring_dates;

import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NeighboringDatesInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Z9.a> f77754a;

    public c(Provider<Z9.a> provider) {
        this.f77754a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(g.b(this.f77754a));
    }
}
