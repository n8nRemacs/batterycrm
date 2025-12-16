package com.avito.android.free_delivery.domain;

import com.avito.android.free_delivery.FreeDeliveryDetails;
import com.avito.android.remote.error.f;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UpdateDeliverySubsidyUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f158691a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SE.a> f158692b;

    /* renamed from: c, reason: collision with root package name */
    public final l f158693c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<f> f158694d;

    public b(l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f158691a = provider;
        this.f158692b = provider2;
        this.f158693c = lVar;
        this.f158694d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f158691a.get(), g.a(w.a(this.f158692b)), (FreeDeliveryDetails) this.f158693c.f393949a, this.f158694d.get());
    }
}
