package com.avito.android.publish.input_vin.mvi.mvi;

import com.avito.android.publish.C0;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lD.C43617a;

/* compiled from: InputVinMviBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C0> f236667a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f236668b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f236669c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f236670d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C43617a> f236671e;

    public h(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f236667a = provider;
        this.f236668b = lVar;
        this.f236669c = provider2;
        this.f236670d = lVar2;
        this.f236671e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f236667a.get(), ((Integer) this.f236668b.f393949a).intValue(), this.f236669c.get(), ((Boolean) this.f236670d.f393949a).booleanValue(), this.f236671e.get());
    }
}
