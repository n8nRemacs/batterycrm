package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.z4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC37017z4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzo f355516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f355517c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zznb f355518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C36996w4 f355519e;

    public RunnableC37017z4(C36996w4 c36996w4, zzo zzoVar, boolean z12, zznb zznbVar) {
        this.f355516b = zzoVar;
        this.f355517c = z12;
        this.f355518d = zznbVar;
        this.f355519e = c36996w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36996w4 c36996w4 = this.f355519e;
        L1 l12 = c36996w4.f355424d;
        if (l12 == null) {
            c36996w4.zzj().f354889f.b("Discarding data. Failed to set user property");
            return;
        }
        c36996w4.r(l12, this.f355517c ? null : this.f355518d, this.f355516b);
        c36996w4.O();
    }
}
