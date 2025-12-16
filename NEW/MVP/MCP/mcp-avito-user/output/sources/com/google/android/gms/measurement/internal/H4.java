package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class H4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36941o4 f354696b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36996w4 f354697c;

    public H4(C36996w4 c36996w4, C36941o4 c36941o4) {
        this.f354696b = c36941o4;
        this.f354697c = c36996w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36996w4 c36996w4 = this.f354697c;
        L1 l12 = c36996w4.f355424d;
        if (l12 == null) {
            c36996w4.zzj().f354889f.b("Failed to send current screen to service");
            return;
        }
        try {
            C36941o4 c36941o4 = this.f354696b;
            I2 i22 = c36996w4.f355183a;
            if (c36941o4 == null) {
                l12.J(0L, null, null, i22.f354709a.getPackageName());
            } else {
                l12.J(c36941o4.f355294c, c36941o4.f355292a, c36941o4.f355293b, i22.f354709a.getPackageName());
            }
            c36996w4.O();
        } catch (RemoteException e12) {
            c36996w4.zzj().f354889f.c("Failed to send current screen to the service", e12);
        }
    }
}
