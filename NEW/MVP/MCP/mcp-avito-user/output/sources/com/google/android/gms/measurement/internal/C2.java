package com.google.android.gms.measurement.internal;

import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class C2 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f354544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A2 f354545b;

    public C2(A2 a22, String str) {
        this.f354545b = a22;
        this.f354544a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.f354545b.zzj().f354889f.c(this.f354544a, th2);
    }
}
