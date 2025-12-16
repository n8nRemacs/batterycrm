package com.avito.android.bbl.screens.configure.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BblConfigureBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.bbl.screens.configure.mvi.domain.a> f99224a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f99225b;

    public f(dagger.internal.l lVar, Provider provider) {
        this.f99224a = provider;
        this.f99225b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f99224a.get(), (String) this.f99225b.f393949a);
    }
}
