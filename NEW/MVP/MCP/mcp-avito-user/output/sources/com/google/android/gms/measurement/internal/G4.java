package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.1 */
/* loaded from: classes6.dex */
final class G4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzcv f354689b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f354690c;

    public G4(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar) {
        this.f354689b = zzcvVar;
        this.f354690c = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f354690c;
        N5 n52 = appMeasurementDynamiteService.f354526a.f354720l;
        I2.d(n52);
        I2 i22 = appMeasurementDynamiteService.f354526a;
        n52.D(this.f354689b, i22.f354701A != null && i22.f354701A.booleanValue());
    }
}
