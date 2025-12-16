package com.avito.android.iac_dialer.impl_module.device_status.gsm;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacGsmCallStateProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f165980a;

    public d(C30102l3 c30102l3) {
        this.f165980a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Context) this.f165980a.get());
    }
}
