package com.google.firebase.crashlytics;

import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.E;
import j.N;
import j.P;
import j.k0;

/* loaded from: classes4.dex */
public class FirebaseCrashlytics {

    /* renamed from: a, reason: collision with root package name */
    @k0
    public final E f360860a;

    public FirebaseCrashlytics(@N E e12) {
        this.f360860a = e12;
    }

    @N
    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) com.google.firebase.g.c().b(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    @N
    public Task<Boolean> checkForUnsentReports() {
        return this.f360860a.b();
    }

    public void deleteUnsentReports() {
        this.f360860a.c();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f360860a.f360894g;
    }

    public void log(@N String str) {
        this.f360860a.e(str);
    }

    public void recordException(@N Throwable th2) {
        if (th2 == null) {
            com.google.firebase.crashlytics.internal.d.f361031a.a(5);
        } else {
            this.f360860a.f(th2);
        }
    }

    public void sendUnsentReports() {
        this.f360860a.h();
    }

    public void setCrashlyticsCollectionEnabled(boolean z12) {
        this.f360860a.i(Boolean.valueOf(z12));
    }

    public void setCustomKey(@N String str, boolean z12) {
        this.f360860a.j(str, Boolean.toString(z12));
    }

    public void setCustomKeys(@N e eVar) {
        eVar.getClass();
        this.f360860a.k();
    }

    public void setUserId(@N String str) {
        this.f360860a.l(str);
    }

    public void setCrashlyticsCollectionEnabled(@P Boolean bool) {
        this.f360860a.i(bool);
    }

    public void setCustomKey(@N String str, double d12) {
        this.f360860a.j(str, Double.toString(d12));
    }

    public void setCustomKey(@N String str, float f12) {
        this.f360860a.j(str, Float.toString(f12));
    }

    public void setCustomKey(@N String str, int i12) {
        this.f360860a.j(str, Integer.toString(i12));
    }

    public void setCustomKey(@N String str, long j12) {
        this.f360860a.j(str, Long.toString(j12));
    }

    public void setCustomKey(@N String str, @N String str2) {
        this.f360860a.j(str, str2);
    }
}
