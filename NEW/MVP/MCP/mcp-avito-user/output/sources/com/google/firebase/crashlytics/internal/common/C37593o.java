package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.J;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* compiled from: CrashlyticsController.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C37593o implements J.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37598u f360987a;

    public C37593o(C37598u c37598u) {
        this.f360987a = c37598u;
    }

    public final void a(@j.N com.google.firebase.crashlytics.internal.settings.g gVar, @j.N Thread thread, @j.N Throwable th2) {
        C37598u c37598u = this.f360987a;
        synchronized (c37598u) {
            com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
            Objects.toString(th2);
            thread.getName();
            dVar.a(3);
            try {
                e0.a(c37598u.f361004e.b(new CallableC37595q(c37598u, System.currentTimeMillis(), th2, thread, gVar)));
            } catch (TimeoutException unused) {
                com.google.firebase.crashlytics.internal.d.f361031a.b();
            } catch (Exception unused2) {
                com.google.firebase.crashlytics.internal.d.f361031a.b();
            }
        }
    }
}
