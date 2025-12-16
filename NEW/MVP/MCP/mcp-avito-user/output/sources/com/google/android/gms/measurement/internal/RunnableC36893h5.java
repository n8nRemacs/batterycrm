package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.h5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36893h5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzcv f355184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f355185c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f355186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f355187e;

    public RunnableC36893h5(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar, String str, String str2) {
        this.f355184b = zzcvVar;
        this.f355185c = str;
        this.f355186d = str2;
        this.f355187e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f355187e.f354526a.n().w(this.f355185c, this.f355186d, this.f355184b);
    }
}
