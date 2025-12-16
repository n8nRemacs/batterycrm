package com.avito.android.analytics.clickstream;

import com.avito.android.util.V2;
import java.lang.Thread;
import uL.C48915a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.analytics.clickstream.u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C28395u implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f89831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f89832c;

    public /* synthetic */ C28395u(Object obj, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i12) {
        this.f89830a = i12;
        this.f89832c = obj;
        this.f89831b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f89831b;
        Object obj = this.f89832c;
        switch (this.f89830a) {
            case 0:
                C28396v c28396v = (C28396v) obj;
                int i12 = C28396v.f89833g;
                try {
                    c28396v.o(th2);
                } catch (Throwable th3) {
                    V2.f318762a.a("ClickStreamCrashReport", "Exception is thrown while other exception is handled", th3);
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                    break;
                }
                break;
            case 1:
                com.avito.android.iac_dialer.impl_module.notifications.new_impl.g gVar = (com.avito.android.iac_dialer.impl_module.notifications.new_impl.g) obj;
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacNotificationManager", "CRASH_HANDLER: Lets cancel all call notifications", null);
                try {
                    gVar.f166124a.b().f44481b.cancelAll();
                } catch (Throwable unused) {
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                    break;
                }
                break;
            default:
                C48915a c48915a = (C48915a) obj;
                try {
                    if (c48915a.f439909d.get()) {
                        c48915a.f439906a.b(th2);
                    }
                } catch (Throwable unused2) {
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                    break;
                }
                break;
        }
    }
}
