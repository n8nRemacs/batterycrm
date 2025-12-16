package com.avito.android.mortgage.pre_approval.form.mvi.domain;

import com.avito.android.account.G;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NavigationInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final i f201910a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<G> f201911b;

    public g(i iVar, Provider provider) {
        this.f201910a = iVar;
        this.f201911b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((h) this.f201910a.get(), this.f201911b.get());
    }
}
