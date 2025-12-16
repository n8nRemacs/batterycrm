package com.avito.android.publish.input_imei.mvi;

import com.avito.android.publish.analytics.InterfaceC33535v;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InputImeiActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.input_imei.di.m> f236396a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.publish.items.e> f236397b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f236398c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f236399d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.publish.input_imei.i f236400e;

    public g(Provider provider, Provider provider2, dagger.internal.l lVar, Provider provider3, com.avito.android.publish.input_imei.i iVar) {
        this.f236396a = provider;
        this.f236397b = provider2;
        this.f236398c = lVar;
        this.f236399d = provider3;
        this.f236400e = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f236396a.get(), this.f236397b.get(), ((Integer) this.f236398c.f393949a).intValue(), this.f236399d.get(), (com.avito.android.publish.input_imei.h) this.f236400e.get());
    }
}
