package com.avito.android.loyalty.ui.quality_service.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: QualityServiceActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.loyalty.ui.quality_service.k> f184004a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f184005b;

    /* renamed from: c, reason: collision with root package name */
    public final u f184006c;

    public f(u uVar, Provider provider, Provider provider2) {
        this.f184004a = provider;
        this.f184005b = provider2;
        this.f184006c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f184004a.get(), this.f184005b.get(), (MW.a) this.f184006c.get());
    }
}
