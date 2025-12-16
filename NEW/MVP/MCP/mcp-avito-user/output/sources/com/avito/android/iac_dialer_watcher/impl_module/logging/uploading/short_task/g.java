package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task;

import com.avito.android.iac_dialer_watcher.impl_module.logging.k;
import com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.H;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacLogSendingShortTask_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f168037a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<H> f168038b;

    /* renamed from: c, reason: collision with root package name */
    public final u f168039c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.iac_dialer_watcher.impl_module.splitter.features.c f168040d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f168041e;

    public g(Provider provider, Provider provider2, u uVar, com.avito.android.iac_dialer_watcher.impl_module.splitter.features.c cVar, Provider provider3) {
        this.f168037a = provider;
        this.f168038b = provider2;
        this.f168039c = uVar;
        this.f168040d = cVar;
        this.f168041e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f168037a.get(), this.f168038b.get(), (c) this.f168039c.get(), (com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a) this.f168040d.get(), this.f168041e.get());
    }
}
