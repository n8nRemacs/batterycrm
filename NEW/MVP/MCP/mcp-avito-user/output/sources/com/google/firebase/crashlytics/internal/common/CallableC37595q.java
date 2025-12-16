package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: CrashlyticsController.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class CallableC37595q implements Callable<Task<Void>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f360990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f360991c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Thread f360992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.settings.g f360993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C37598u f360994f;

    public CallableC37595q(C37598u c37598u, long j12, Throwable th2, Thread thread, com.google.firebase.crashlytics.internal.settings.g gVar) {
        this.f360994f = c37598u;
        this.f360990b = j12;
        this.f360991c = th2;
        this.f360992d = thread;
        this.f360993e = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() throws IOException {
        long j12 = this.f360990b;
        long j13 = j12 / 1000;
        C37598u c37598u = this.f360994f;
        String strF = c37598u.f();
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        if (strF == null) {
            dVar.b();
            return C37030m.f(null);
        }
        c37598u.f361002c.a();
        Z z12 = c37598u.f361011l;
        z12.getClass();
        dVar.a(2);
        z12.c(this.f360991c, this.f360992d, strF, CrashHianalyticsData.EVENT_ID_CRASH, j13, true);
        c37598u.d(j12);
        com.google.firebase.crashlytics.internal.settings.g gVar = this.f360993e;
        c37598u.c(false, gVar);
        new C37585g(c37598u.f361005f);
        C37598u.a(c37598u, C37585g.f360973b);
        if (!c37598u.f361001b.b()) {
            return C37030m.f(null);
        }
        ExecutorService executorService = c37598u.f361004e.f360982a;
        return gVar.b().t(executorService, new C37594p(this, executorService, strF));
    }
}
