package com.avito.android.mortgage_category.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SetArchivedUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<K10.a> f204944a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f204945b;

    public e(Provider<K10.a> provider, Provider<R0> provider2) {
        this.f204944a = provider;
        this.f204945b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f204945b.get(), g.a(w.a(this.f204944a)));
    }
}
