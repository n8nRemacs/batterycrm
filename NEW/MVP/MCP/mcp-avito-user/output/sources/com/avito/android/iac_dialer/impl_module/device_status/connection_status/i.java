package com.avito.android.iac_dialer.impl_module.device_status.connection_status;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacConnectionStatusProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f165963a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.device_status.power_status.a> f165964b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f165965c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f165966d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.app_foreground_provider.util_module.a> f165967e;

    /* renamed from: f, reason: collision with root package name */
    public final u f165968f;

    public i(C30102l3 c30102l3, Provider provider, Provider provider2, Provider provider3, Provider provider4, u uVar) {
        this.f165963a = c30102l3;
        this.f165964b = provider;
        this.f165965c = provider2;
        this.f165966d = provider3;
        this.f165967e = provider4;
        this.f165968f = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Context) this.f165963a.get(), this.f165964b.get(), this.f165965c.get(), this.f165966d.get(), this.f165967e.get(), (BL.a) this.f165968f.get());
    }
}
