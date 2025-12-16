package com.avito.android.loyalty.ui.quality_service_gray;

import bX.InterfaceC25576a;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: QualityServiceGrayInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC25576a> f184064a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f184065b;

    /* renamed from: c, reason: collision with root package name */
    public final l f184066c;

    /* renamed from: d, reason: collision with root package name */
    public final e f184067d;

    public g(Provider provider, Provider provider2, l lVar, e eVar) {
        this.f184064a = provider;
        this.f184065b = provider2;
        this.f184066c = lVar;
        this.f184067d = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f184064a.get(), this.f184065b.get(), (QualityServiceGrayArgs) this.f184066c.f393949a, (d) this.f184067d.get());
    }
}
