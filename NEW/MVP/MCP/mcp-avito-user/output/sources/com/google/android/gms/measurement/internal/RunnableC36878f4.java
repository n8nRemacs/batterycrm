package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.f4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36878f4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzcv f355151b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f355152c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f355153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f355154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f355155f;

    public RunnableC36878f4(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar, String str, String str2, boolean z12) {
        this.f355151b = zzcvVar;
        this.f355152c = str;
        this.f355153d = str2;
        this.f355154e = z12;
        this.f355155f = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f355155f.f354526a.n().x(this.f355152c, this.f355153d, this.f355154e, this.f355151b);
    }
}
