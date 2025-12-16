package com.avito.android.publish.screen.objects.domain.usecase;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.objects.P0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: ObjectValidateUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.screen.objects.domain.repository.i> f240128a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.publish.screen.objects.domain.repository.a> f240129b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f240130c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<P0> f240131d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f240132e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f240133f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C50213a> f240134g;

    public n(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f240128a = provider;
        this.f240129b = provider2;
        this.f240130c = uVar;
        this.f240131d = provider3;
        this.f240132e = lVar;
        this.f240133f = provider4;
        this.f240134g = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f240128a.get(), this.f240129b.get(), (com.avito.android.publish.screen.objects.domain.repository.e) this.f240130c.get(), this.f240131d.get(), ((Boolean) this.f240132e.f393949a).booleanValue(), this.f240133f.get(), this.f240134g.get());
    }
}
