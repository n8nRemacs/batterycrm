package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.measurement.internal.zzif;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class E4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzo f354667b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzcv f354668c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C36996w4 f354669d;

    public E4(C36996w4 c36996w4, zzo zzoVar, zzcv zzcvVar) {
        this.f354667b = zzoVar;
        this.f354668c = zzcvVar;
        this.f354669d = c36996w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzo zzoVar = this.f354667b;
        zzcv zzcvVar = this.f354668c;
        C36996w4 c36996w4 = this.f354669d;
        try {
            if (!c36996w4.b().o().e(zzif.zza.ANALYTICS_STORAGE)) {
                c36996w4.zzj().f354894k.b("Analytics storage consent denied; will not get app instance id");
                c36996w4.f().B(null);
                c36996w4.b().f355130h.b(null);
                return;
            }
            L1 l12 = c36996w4.f355424d;
            if (l12 == null) {
                c36996w4.zzj().f354889f.b("Failed to get app instance id");
                return;
            }
            String strX1 = l12.x1(zzoVar);
            if (strX1 != null) {
                c36996w4.f().B(strX1);
                c36996w4.b().f355130h.b(strX1);
            }
            c36996w4.O();
            c36996w4.c().J(strX1, zzcvVar);
        } catch (RemoteException e12) {
            c36996w4.zzj().f354889f.c("Failed to get app instance id", e12);
        } finally {
            c36996w4.c().J(null, zzcvVar);
        }
    }
}
