package com.avito.android.sx_address.list.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.sx_address.SxAddressListParams;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SxAddressListAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f293063a;

    /* renamed from: b, reason: collision with root package name */
    public final u f293064b;

    /* renamed from: c, reason: collision with root package name */
    public final l f293065c;

    public k(l lVar, u uVar, Provider provider) {
        this.f293063a = provider;
        this.f293064b = uVar;
        this.f293065c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f293063a.get(), (g) this.f293064b.get(), (SxAddressListParams) this.f293065c.f393949a);
    }
}
