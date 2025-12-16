package com.google.firebase.crashlytics.internal.common;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* loaded from: classes4.dex */
class J implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final C37593o f360912a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.settings.g f360913b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f360914c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.b f360915d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f360916e = new AtomicBoolean(false);

    /* compiled from: CrashlyticsUncaughtExceptionHandler.java */
    public interface a {
    }

    public J(C37593o c37593o, com.google.firebase.crashlytics.internal.settings.g gVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.internal.b bVar) {
        this.f360912a = c37593o;
        this.f360913b = gVar;
        this.f360914c = uncaughtExceptionHandler;
        this.f360915d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[Catch: all -> 0x002f, Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:4:0x000e, B:12:0x0027, B:15:0x0031, B:7:0x0015, B:8:0x0019, B:10:0x0021), top: B:22:0x000c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[Catch: all -> 0x002f, Exception -> 0x003e, TRY_LEAVE, TryCatch #0 {Exception -> 0x003e, blocks: (B:4:0x000e, B:12:0x0027, B:15:0x0031, B:7:0x0015, B:8:0x0019, B:10:0x0021), top: B:22:0x000c, outer: #1 }] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
        /*
            r7 = this;
            com.google.firebase.crashlytics.internal.d r0 = com.google.firebase.crashlytics.internal.d.f361031a
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.f360916e
            r2 = 1
            r1.set(r2)
            r3 = 3
            r4 = 0
            java.lang.Thread$UncaughtExceptionHandler r5 = r7.f360914c
            if (r8 != 0) goto L13
            r0.b()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L3e
        L11:
            r2 = r4
            goto L25
        L13:
            if (r9 != 0) goto L19
            r0.b()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L3e
            goto L11
        L19:
            com.google.firebase.crashlytics.internal.b r6 = r7.f360915d     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L3e
            boolean r6 = r6.c()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L3e
            if (r6 == 0) goto L25
            r0.a(r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L3e
            goto L11
        L25:
            if (r2 == 0) goto L31
            com.google.firebase.crashlytics.internal.common.o r2 = r7.f360912a     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L3e
            com.google.firebase.crashlytics.internal.settings.g r6 = r7.f360913b     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L3e
            r2.a(r6, r8, r9)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L3e
            goto L34
        L2f:
            r2 = move-exception
            goto L43
        L31:
            r0.a(r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L3e
        L34:
            r0.a(r3)
            r5.uncaughtException(r8, r9)
            r1.set(r4)
            goto L42
        L3e:
            r0.b()     // Catch: java.lang.Throwable -> L2f
            goto L34
        L42:
            return
        L43:
            r0.a(r3)
            r5.uncaughtException(r8, r9)
            r1.set(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.J.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
