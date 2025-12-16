package com.avito.android.iac_dialer.impl_module.telecom;

import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class b implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f166405b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f166406c;

    public /* synthetic */ b(IacConnectionInputData iacConnectionInputData) {
        this.f166406c = iacConnectionInputData;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f166405b) {
            case 0:
                return IacConnectionInputData.callScope$lambda$1((IacConnectionInputData) this.f166406c, runnable);
            default:
                Thread thread = new Thread(runnable, (String) this.f166406c);
                thread.setDaemon(true);
                return thread;
        }
    }
}
