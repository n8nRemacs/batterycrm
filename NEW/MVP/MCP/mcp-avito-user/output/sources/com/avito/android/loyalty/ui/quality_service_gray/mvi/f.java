package com.avito.android.loyalty.ui.quality_service_gray.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: QualityServiceGrayBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.loyalty.ui.quality_service_gray.f> f184131a;

    /* renamed from: b, reason: collision with root package name */
    public final u f184132b;

    public f(u uVar, Provider provider) {
        this.f184131a = provider;
        this.f184132b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f184131a.get(), (IW.a) this.f184132b.get());
    }
}
