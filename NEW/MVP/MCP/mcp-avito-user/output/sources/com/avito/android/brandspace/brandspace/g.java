package com.avito.android.brandspace.brandspace;

import com.avito.android.brandspace.brandspace.mvi.i;
import com.avito.android.brandspace.interactor.BrandspaceAnalyticsInteractor;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;
import pk.InterfaceC47104b;

/* compiled from: BrandspaceViewModelMvi_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final i f107616a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<BrandspaceAnalyticsInteractor> f107617b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f107618c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC47104b> f107619d;

    public g(i iVar, Provider provider, Provider provider2, Provider provider3) {
        this.f107616a = iVar;
        this.f107617b = provider;
        this.f107618c = provider2;
        this.f107619d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.brandspace.brandspace.mvi.h) this.f107616a.get(), this.f107617b.get(), this.f107618c.get(), this.f107619d.get());
    }
}
