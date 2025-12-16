package com.google.android.gms.cloudmessaging;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class C implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C f348803b = new C();

    private /* synthetic */ C() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
