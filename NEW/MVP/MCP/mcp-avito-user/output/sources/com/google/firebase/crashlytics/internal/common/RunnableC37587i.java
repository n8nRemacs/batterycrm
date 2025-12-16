package com.google.firebase.crashlytics.internal.common;

/* compiled from: CrashlyticsBackgroundWorker.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class RunnableC37587i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C37591m f360979b;

    public RunnableC37587i(C37591m c37591m) {
        this.f360979b = c37591m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f360979b.f360985d.set(Boolean.TRUE);
    }
}
