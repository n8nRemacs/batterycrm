package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.I2;
import com.google.android.gms.measurement.internal.InterfaceC36858c5;
import com.google.android.gms.measurement.internal.S1;
import com.google.android.gms.measurement.internal.Y4;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import j.K;
import j.N;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
@TargetApi(InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES)
/* loaded from: classes6.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC36858c5 {

    /* renamed from: b, reason: collision with root package name */
    public Y4<AppMeasurementJobService> f354500b;

    @Override // com.google.android.gms.measurement.internal.InterfaceC36858c5
    @TargetApi(InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES)
    public final void b(@N JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final Y4<AppMeasurementJobService> c() {
        if (this.f354500b == null) {
            this.f354500b = new Y4<>(this);
        }
        return this.f354500b;
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
        Y4<AppMeasurementJobService> y4C = c();
        if (intent == null) {
            y4C.b().f354889f.b("onRebind called with null intent");
            return;
        }
        y4C.getClass();
        y4C.b().f354897n.c("onRebind called. action", intent.getAction());
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(@N final JobParameters jobParameters) {
        final Y4<AppMeasurementJobService> y4C = c();
        final S1 s12 = I2.a(y4C.f354996a, null, null).f354717i;
        I2.c(s12);
        String string = jobParameters.getExtras().getString("action");
        s12.f354897n.c("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        y4C.a(new Runnable() { // from class: com.google.android.gms.measurement.internal.b5
            @Override // java.lang.Runnable
            public final void run() {
                Y4 y42 = y4C;
                y42.getClass();
                s12.f354897n.b("AppMeasurementJobService processed last upload request.");
                ((InterfaceC36858c5) y42.f354996a).b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(@N JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    @K
    public final boolean onUnbind(@N Intent intent) {
        Y4<AppMeasurementJobService> y4C = c();
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
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36858c5
    public final void a(@N Intent intent) {
    }
}
