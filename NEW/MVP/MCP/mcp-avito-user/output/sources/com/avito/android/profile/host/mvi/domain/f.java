package com.avito.android.profile.host.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import hz.InterfaceC41196a;
import javax.inject.Provider;

/* compiled from: UserProfileHostLoader_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<s90.b> f222399a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f222400b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f222401c;

    public f(Provider<s90.b> provider, Provider<InterfaceC41196a> provider2, Provider<R0> provider3) {
        this.f222399a = provider;
        this.f222400b = provider2;
        this.f222401c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f222399a.get(), this.f222400b.get(), this.f222401c.get());
    }
}
