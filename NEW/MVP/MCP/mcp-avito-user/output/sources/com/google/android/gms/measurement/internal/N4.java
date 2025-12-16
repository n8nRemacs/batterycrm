package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class N4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzo f354813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f354814c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzbe f354815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C36996w4 f354816e;

    public N4(C36996w4 c36996w4, zzo zzoVar, boolean z12, zzbe zzbeVar) {
        this.f354813b = zzoVar;
        this.f354814c = z12;
        this.f354815d = zzbeVar;
        this.f354816e = c36996w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36996w4 c36996w4 = this.f354816e;
        L1 l12 = c36996w4.f355424d;
        if (l12 == null) {
            c36996w4.zzj().f354889f.b("Discarding data. Failed to send event to service");
            return;
        }
        zzbe zzbeVar = this.f354815d;
        zzo zzoVar = this.f354813b;
        if (this.f354814c) {
            zzbeVar = null;
        }
        c36996w4.r(l12, zzbeVar, zzoVar);
        c36996w4.O();
    }
}
