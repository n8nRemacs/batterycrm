package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.1 */
/* loaded from: classes6.dex */
final class E3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService.b f354665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f354666c;

    public E3(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.b bVar) {
        this.f354665b = bVar;
        this.f354666c = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36967s3 c36967s3 = this.f354666c.f354526a.f354724p;
        I2.b(c36967s3);
        c36967s3.w(this.f354665b);
    }
}
