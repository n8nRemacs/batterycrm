package com.avito.android.mortgage.deeplink.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DocumentsFormRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IZ.a> f198820a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f198821b;

    public e(Provider<IZ.a> provider, Provider<R0> provider2) {
        this.f198820a = provider;
        this.f198821b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f198821b.get(), dagger.internal.g.b(this.f198820a));
    }
}
