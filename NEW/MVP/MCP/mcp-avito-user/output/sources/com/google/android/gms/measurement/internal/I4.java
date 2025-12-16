package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class I4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbe f354736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f354737c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzcv f354738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C36996w4 f354739e;

    public I4(C36996w4 c36996w4, zzbe zzbeVar, String str, zzcv zzcvVar) {
        this.f354736b = zzbeVar;
        this.f354737c = str;
        this.f354738d = zzcvVar;
        this.f354739e = c36996w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcv zzcvVar = this.f354738d;
        C36996w4 c36996w4 = this.f354739e;
        try {
            L1 l12 = c36996w4.f355424d;
            if (l12 == null) {
                c36996w4.zzj().f354889f.b("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] bArrY1 = l12.Y1(this.f354736b, this.f354737c);
            c36996w4.O();
            c36996w4.c().E(zzcvVar, bArrY1);
        } catch (RemoteException e12) {
            c36996w4.zzj().f354889f.c("Failed to send event to the service to bundle", e12);
        } finally {
            c36996w4.c().E(zzcvVar, null);
        }
    }
}
