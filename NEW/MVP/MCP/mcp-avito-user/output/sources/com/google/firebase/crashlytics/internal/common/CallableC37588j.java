package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.Callable;

/* compiled from: CrashlyticsBackgroundWorker.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class CallableC37588j implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f360980b;

    public CallableC37588j(Runnable runnable) {
        this.f360980b = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        this.f360980b.run();
        return null;
    }
}
