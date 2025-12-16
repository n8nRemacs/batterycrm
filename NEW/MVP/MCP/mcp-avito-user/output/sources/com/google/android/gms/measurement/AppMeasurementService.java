package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.C36997w5;
import com.google.android.gms.measurement.internal.I2;
import com.google.android.gms.measurement.internal.InterfaceC36858c5;
import com.google.android.gms.measurement.internal.M2;
import com.google.android.gms.measurement.internal.S1;
import com.google.android.gms.measurement.internal.Y4;
import h1.AbstractC40759a;
import j.K;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class AppMeasurementService extends Service implements InterfaceC36858c5 {

    /* renamed from: b, reason: collision with root package name */
    public Y4<AppMeasurementService> f354502b;

    @Override // com.google.android.gms.measurement.internal.InterfaceC36858c5
    public final void a(@N Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = AbstractC40759a.f396975b;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray<PowerManager.WakeLock> sparseArray2 = AbstractC40759a.f396975b;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36858c5
    public final void b(@N JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final Y4<AppMeasurementService> c() {
        if (this.f354502b == null) {
            this.f354502b = new Y4<>(this);
        }
        return this.f354502b;
    }

    @Override // android.app.Service
    @K
    @P
    public final IBinder onBind(@N Intent intent) {
        Y4<AppMeasurementService> y4C = c();
        if (intent == null) {
            y4C.b().f354889f.b("onBind called with null intent");
            return null;
        }
        y4C.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new M2(C36997w5.c(y4C.f354996a));
        }
        y4C.b().f354892i.c("onBind received unknown action", action);
        return null;
    }

    @Override // android.app.Service
    @K
    public final void onCreate() {
        super.onCreate();
        S1 s12 = I2.a(c().f354996a, null, null).f354717i;
        I2.c(s12);
        s12.f354897n.b("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    @K
    public final void onDestroy() {
        S1 s12 = I2.a(c().f354996a, null, null).f354717i;
        I2.c(s12);
        s12.f354897n.b("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    @K
    public final void onRebind(@N Intent intent) {
        Y4<AppMeasurementService> y4C = c();
        if (intent == null) {
            y4C.b().f354889f.b("onRebind called with null intent");
            return;
        }
        y4C.getClass();
        y4C.b().f354897n.c("onRebind called. action", intent.getAction());
    }

    @Override // android.app.Service
    @K
    public final int onStartCommand(@N final Intent intent, int i12, final int i13) {
        final Y4<AppMeasurementService> y4C = c();
        final S1 s12 = I2.a(y4C.f354996a, null, null).f354717i;
        I2.c(s12);
        if (intent == null) {
            s12.f354892i.b("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        s12.f354897n.a(Integer.valueOf(i13), "Local AppMeasurementService called. startId, action", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        y4C.a(new Runnable() { // from class: com.google.android.gms.measurement.internal.a5
            @Override // java.lang.Runnable
            public final void run() {
                Y4 y42 = y4C;
                InterfaceC36858c5 interfaceC36858c5 = (InterfaceC36858c5) y42.f354996a;
                int i14 = i13;
                if (interfaceC36858c5.zza(i14)) {
                    s12.f354897n.c("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i14));
                    y42.b().f354897n.b("Completed wakeful intent.");
                    interfaceC36858c5.a(intent);
                }
            }
        });
        return 2;
    }

    @Override // android.app.Service
    @K
    public final boolean onUnbind(@N Intent intent) {
        Y4<AppMeasurementService> y4C = c();
        if (intent == null) {
            y4C.b().f354889f.b("onUnbind called with null intent");
            return true;
        }
        y4C.getClass();
        y4C.b().f354897n.c("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36858c5
    public final boolean zza(int i12) {
        return stopSelfResult(i12);
    }
}
