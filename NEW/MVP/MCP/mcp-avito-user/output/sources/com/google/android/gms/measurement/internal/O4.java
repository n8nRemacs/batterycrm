package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class O4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f354832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f354833c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzo f354834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzcv f354835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C36996w4 f354836f;

    public O4(C36996w4 c36996w4, String str, String str2, zzo zzoVar, zzcv zzcvVar) {
        this.f354832b = str;
        this.f354833c = str2;
        this.f354834d = zzoVar;
        this.f354835e = zzcvVar;
        this.f354836f = c36996w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzo zzoVar = this.f354834d;
        String str = this.f354833c;
        String str2 = this.f354832b;
        zzcv zzcvVar = this.f354835e;
        C36996w4 c36996w4 = this.f354836f;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            L1 l12 = c36996w4.f355424d;
            if (l12 == null) {
                c36996w4.zzj().f354889f.a(str2, "Failed to get conditional properties; not connected to service", str);
                return;
            }
            ArrayList<Bundle> arrayListB0 = N5.b0(l12.S1(str2, str, zzoVar));
            c36996w4.O();
            c36996w4.c().C(zzcvVar, arrayListB0);
        } catch (RemoteException e12) {
            c36996w4.zzj().f354889f.d("Failed to get conditional properties; remote exception", str2, str, e12);
        } finally {
            c36996w4.c().C(zzcvVar, arrayList);
        }
    }
}
