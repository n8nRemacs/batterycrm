package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: DeleteApplicationUseCaseImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.mortgage.root.mvi.domain.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32702p implements dagger.internal.h<C32701o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IZ.a> f203108a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f203109b;

    public C32702p(Provider<IZ.a> provider, Provider<R0> provider2) {
        this.f203108a = provider;
        this.f203109b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32701o(this.f203109b.get(), dagger.internal.g.b(this.f203108a));
    }
}
