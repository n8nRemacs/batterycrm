package com.google.firebase.crashlytics.internal.common;

/* compiled from: CrashlyticsController.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class RunnableC37600w implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f361022b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f361023c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Thread f361024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C37598u f361025e;

    public RunnableC37600w(C37598u c37598u, long j12, Throwable th2, Thread thread) {
        this.f361025e = c37598u;
        this.f361022b = j12;
        this.f361023c = th2;
        this.f361024d = thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C37598u c37598u = this.f361025e;
        J j12 = c37598u.f361012m;
        if (j12 == null || !j12.f360916e.get()) {
            long j13 = this.f361022b / 1000;
            String strF = c37598u.f();
            com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
            if (strF == null) {
                dVar.a(5);
                return;
            }
            Z z12 = c37598u.f361011l;
            z12.getClass();
            dVar.a(2);
            z12.c(this.f361023c, this.f361024d, strF, "error", j13, false);
        }
    }
}
