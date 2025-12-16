package com.avito.android.iac_dialer_watcher.impl_module.logging;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacLogFileProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f167877a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f167878b;

    public c(C30102l3 c30102l3, Provider provider) {
        this.f167877a = c30102l3;
        this.f167878b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Context) this.f167877a.get(), this.f167878b.get());
    }
}
