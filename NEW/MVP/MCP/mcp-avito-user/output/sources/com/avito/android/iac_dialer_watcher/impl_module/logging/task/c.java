package com.avito.android.iac_dialer_watcher.impl_module.logging.task;

import android.app.Application;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacLogSendingPlannerStartupTask_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<IacLogSendingPlannerStartupTask> {

    /* renamed from: a, reason: collision with root package name */
    public final l f167945a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.iac_dialer_watcher.impl_module.splitter.features.c f167946b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.c> f167947c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f167948d;

    public c(l lVar, com.avito.android.iac_dialer_watcher.impl_module.splitter.features.c cVar, Provider provider, Provider provider2) {
        this.f167945a = lVar;
        this.f167946b = cVar;
        this.f167947c = provider;
        this.f167948d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new IacLogSendingPlannerStartupTask((Application) this.f167945a.f393949a, (com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a) this.f167946b.get(), this.f167947c.get(), this.f167948d.get());
    }
}
