package com.avito.android.realty_agency.checkerboard.mvi;

import com.avito.android.realty_agency.checkerboard.model.CheckerboardArguments;
import javax.inject.Provider;
import ri0.InterfaceC47661a;

/* compiled from: CheckerboardBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<y> f251326a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47661a> f251327b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f251328c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.realty_agency.checkerboard.mvi.use_case.c f251329d;

    public u(Provider provider, Provider provider2, dagger.internal.l lVar, com.avito.android.realty_agency.checkerboard.mvi.use_case.c cVar) {
        this.f251326a = provider;
        this.f251327b = provider2;
        this.f251328c = lVar;
        this.f251329d = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f251326a.get(), this.f251327b.get(), (CheckerboardArguments) this.f251328c.f393949a, (com.avito.android.realty_agency.checkerboard.mvi.use_case.b) this.f251329d.get());
    }
}
