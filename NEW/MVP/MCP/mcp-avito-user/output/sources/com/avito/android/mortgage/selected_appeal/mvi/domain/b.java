package com.avito.android.mortgage.selected_appeal.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import i00.InterfaceC41203a;
import javax.inject.Provider;

/* compiled from: UnselectAppealUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f203471a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC41203a> f203472b;

    public b(Provider<R0> provider, Provider<InterfaceC41203a> provider2) {
        this.f203471a = provider;
        this.f203472b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f203471a.get(), g.a(w.a(this.f203472b)));
    }
}
