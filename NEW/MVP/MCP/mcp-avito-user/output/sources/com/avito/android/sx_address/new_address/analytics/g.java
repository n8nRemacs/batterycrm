package com.avito.android.sx_address.new_address.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SxNewAddressAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f293580a;

    /* renamed from: b, reason: collision with root package name */
    public final u f293581b;

    public g(u uVar, Provider provider) {
        this.f293580a = provider;
        this.f293581b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f293580a.get(), (c) this.f293581b.get());
    }
}
