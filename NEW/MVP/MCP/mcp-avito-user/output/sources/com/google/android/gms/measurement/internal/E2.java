package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.1 */
/* loaded from: classes6.dex */
final class E2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzcv f354661b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbe f354662c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f354663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f354664e;

    public E2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar, zzbe zzbeVar, String str) {
        this.f354661b = zzcvVar;
        this.f354662c = zzbeVar;
        this.f354663d = str;
        this.f354664e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f354664e.f354526a.n().n(this.f354661b, this.f354662c, this.f354663d);
    }
}
