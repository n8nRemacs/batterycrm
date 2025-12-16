package com.avito.android.publish.screen.objects.domain.usecase;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.objects.P0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: DeleteObjectUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.screen.objects.domain.repository.a> f240081a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<P0> f240082b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f240083c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f240084d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C50213a> f240085e;

    public b(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f240081a = provider;
        this.f240082b = provider2;
        this.f240083c = lVar;
        this.f240084d = provider3;
        this.f240085e = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f240081a.get(), this.f240082b.get(), ((Boolean) this.f240083c.f393949a).booleanValue(), this.f240084d.get(), this.f240085e.get());
    }
}
