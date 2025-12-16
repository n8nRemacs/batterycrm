package com.avito.android.mortgage.pre_approval.result.mvi.domain;

import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetApplicationUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IZ.a> f202107a;

    public b(Provider<IZ.a> provider) {
        this.f202107a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(dagger.internal.g.a(w.a(this.f202107a)));
    }
}
