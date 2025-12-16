package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class L4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzo f354783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36996w4 f354784c;

    public L4(C36996w4 c36996w4, zzo zzoVar) {
        this.f354783b = zzoVar;
        this.f354784c = c36996w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzo zzoVar = this.f354783b;
        C36996w4 c36996w4 = this.f354784c;
        L1 l12 = c36996w4.f355424d;
        if (l12 == null) {
            c36996w4.zzj().f354889f.b("Failed to send measurementEnabled to service");
            return;
        }
        try {
            l12.t1(zzoVar);
            c36996w4.O();
        } catch (RemoteException e12) {
            c36996w4.zzj().f354889f.c("Failed to send measurementEnabled to the service", e12);
        }
    }
}
