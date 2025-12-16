package com.avito.android.iac_dialer.impl_module.device_status.power_status;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kM.AbstractC42597a;
import kM.AbstractC42598b;

/* compiled from: IacPowerStatusProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f165994a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<AbstractC42598b> f165995b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<AbstractC42597a> f165996c;

    public d(C30102l3 c30102l3, Provider provider, Provider provider2) {
        this.f165994a = c30102l3;
        this.f165995b = provider;
        this.f165996c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Context) this.f165994a.get(), this.f165995b.get(), this.f165996c.get());
    }
}
