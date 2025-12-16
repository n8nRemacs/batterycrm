package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class C4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzo f354546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36996w4 f354547c;

    public C4(C36996w4 c36996w4, zzo zzoVar) {
        this.f354546b = zzoVar;
        this.f354547c = c36996w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzo zzoVar = this.f354546b;
        C36996w4 c36996w4 = this.f354547c;
        L1 l12 = c36996w4.f355424d;
        if (l12 == null) {
            c36996w4.zzj().f354889f.b("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            l12.q1(zzoVar);
        } catch (RemoteException e12) {
            c36996w4.zzj().f354889f.c("Failed to reset data on the service: remote exception", e12);
        }
        c36996w4.O();
    }
}
