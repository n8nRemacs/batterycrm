package com.avito.android.iac_dialer_watcher.impl_module.logging.task;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacAppStatusLogTask_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class a implements h<IacAppStatusLogTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.b> f167944a;

    public a(Provider<com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.b> provider) {
        this.f167944a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new IacAppStatusLogTask(this.f167944a.get());
    }
}
