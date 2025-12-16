package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.f3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36877f3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzcv f355149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f355150c;

    public RunnableC36877f3(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar) {
        this.f355149b = zzcvVar;
        this.f355150c = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f355150c.f354526a.n().m(this.f355149b);
    }
}
