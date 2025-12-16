package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class J3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f354752b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354753c;

    public J3(C36967s3 c36967s3, long j12) {
        this.f354752b = j12;
        this.f354753c = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36967s3 c36967s3 = this.f354753c;
        C36911k2 c36911k2 = c36967s3.b().f355134l;
        long j12 = this.f354752b;
        c36911k2.b(j12);
        S1 s1Zzj = c36967s3.zzj();
        s1Zzj.f354896m.c("Session timeout duration set", Long.valueOf(j12));
    }
}
