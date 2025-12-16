package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class M4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzo f354805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f354806c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzae f354807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C36996w4 f354808e;

    public M4(C36996w4 c36996w4, zzo zzoVar, boolean z12, zzae zzaeVar, zzae zzaeVar2) {
        this.f354805b = zzoVar;
        this.f354806c = z12;
        this.f354807d = zzaeVar;
        this.f354808e = c36996w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36996w4 c36996w4 = this.f354808e;
        L1 l12 = c36996w4.f355424d;
        if (l12 == null) {
            c36996w4.zzj().f354889f.b("Discarding data. Failed to send conditional user property to service");
            return;
        }
        c36996w4.r(l12, this.f354806c ? null : this.f354807d, this.f354805b);
        c36996w4.O();
    }
}
