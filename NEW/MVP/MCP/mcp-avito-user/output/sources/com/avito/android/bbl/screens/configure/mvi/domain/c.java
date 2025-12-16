package com.avito.android.bbl.screens.configure.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wh.InterfaceC49621a;

/* compiled from: GetBblConfigureUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49621a> f99201a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f99202b;

    public c(Provider<InterfaceC49621a> provider, Provider<R0> provider2) {
        this.f99201a = provider;
        this.f99202b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f99201a.get(), this.f99202b.get());
    }
}
