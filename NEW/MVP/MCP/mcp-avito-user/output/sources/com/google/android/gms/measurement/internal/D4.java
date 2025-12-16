package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class D4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzo f354557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36996w4 f354558c;

    public D4(C36996w4 c36996w4, zzo zzoVar) {
        this.f354557b = zzoVar;
        this.f354558c = c36996w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzo zzoVar = this.f354557b;
        C36996w4 c36996w4 = this.f354558c;
        L1 l12 = c36996w4.f355424d;
        if (l12 == null) {
            c36996w4.zzj().f354889f.b("Discarding data. Failed to send app launch");
            return;
        }
        try {
            l12.B1(zzoVar);
            c36996w4.f355183a.l().s();
            c36996w4.r(l12, null, zzoVar);
            c36996w4.O();
        } catch (RemoteException e12) {
            c36996w4.zzj().f354889f.c("Failed to send app launch to the service", e12);
        }
    }
}
