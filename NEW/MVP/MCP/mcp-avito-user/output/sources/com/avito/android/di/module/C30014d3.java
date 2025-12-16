package com.avito.android.di.module;

import android.app.Application;
import com.avito.android.InterfaceC32900o;
import javax.inject.Provider;

/* compiled from: CoreAnalyticsModule_ProvideDeviceIdProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.d3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30014d3 implements dagger.internal.h<com.avito.android.remote.H> {

    /* renamed from: a, reason: collision with root package name */
    public final C29981a3 f144262a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f144263b;

    /* renamed from: c, reason: collision with root package name */
    public final C30214v6 f144264c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC32900o> f144265d;

    public C30014d3(C29981a3 c29981a3, dagger.internal.l lVar, C30214v6 c30214v6, Provider provider) {
        this.f144262a = c29981a3;
        this.f144263b = lVar;
        this.f144264c = c30214v6;
        this.f144265d = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f144263b.f393949a;
        AK0.l lVar = (AK0.l) this.f144264c.get();
        InterfaceC32900o interfaceC32900o = this.f144265d.get();
        this.f144262a.getClass();
        return new com.avito.android.remote.I(lVar, application.getContentResolver(), interfaceC32900o.getDeviceId().invoke());
    }
}
