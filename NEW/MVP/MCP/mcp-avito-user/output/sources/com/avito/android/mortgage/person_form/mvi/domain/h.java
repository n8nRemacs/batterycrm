package com.avito.android.mortgage.person_form.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgageFormPollingInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f201069a;

    /* renamed from: b, reason: collision with root package name */
    public final u f201070b;

    public h(u uVar, Provider provider) {
        this.f201069a = provider;
        this.f201070b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f201069a.get(), (a) this.f201070b.get());
    }
}
