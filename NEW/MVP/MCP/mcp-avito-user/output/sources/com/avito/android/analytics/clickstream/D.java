package com.avito.android.analytics.clickstream;

import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class D implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f89726b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f89726b) {
            case 0:
                return new Thread(runnable, "ClickStreamEventObserver");
            case 1:
                return new Thread(runnable, "StatsdEventObserver");
            case 2:
                return new Thread(runnable, "AvCalls");
            case 3:
                return new Thread(runnable, "AvCalls");
            case 4:
                return new Thread(runnable, "IacDialer");
            default:
                int i12 = com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e.f167908g;
                return new Thread(runnable, "IacLogRepositoryThread");
        }
    }
}
