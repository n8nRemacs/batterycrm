package com.avito.android.loyalty.ui.quality_service.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: QualityServiceBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.loyalty.ui.quality_service.k> f184009a;

    /* renamed from: b, reason: collision with root package name */
    public final u f184010b;

    public h(u uVar, Provider provider) {
        this.f184009a = provider;
        this.f184010b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f184009a.get(), (MW.a) this.f184010b.get());
    }
}
