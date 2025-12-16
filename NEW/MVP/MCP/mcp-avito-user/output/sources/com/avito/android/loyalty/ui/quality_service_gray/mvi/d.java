package com.avito.android.loyalty.ui.quality_service_gray.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: QualityServiceGrayActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.loyalty.ui.quality_service_gray.f> f184120a;

    /* renamed from: b, reason: collision with root package name */
    public final u f184121b;

    public d(u uVar, Provider provider) {
        this.f184120a = provider;
        this.f184121b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f184120a.get(), (IW.a) this.f184121b.get());
    }
}
