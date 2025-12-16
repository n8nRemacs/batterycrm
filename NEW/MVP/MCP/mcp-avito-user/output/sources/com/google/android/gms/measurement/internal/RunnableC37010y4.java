package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.y4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC37010y4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f355492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f355493c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzo f355494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f355495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzcv f355496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C36996w4 f355497g;

    public RunnableC37010y4(C36996w4 c36996w4, String str, String str2, zzo zzoVar, boolean z12, zzcv zzcvVar) {
        this.f355492b = str;
        this.f355493c = str2;
        this.f355494d = zzoVar;
        this.f355495e = z12;
        this.f355496f = zzcvVar;
        this.f355497g = c36996w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzo zzoVar = this.f355494d;
        String str = this.f355492b;
        zzcv zzcvVar = this.f355496f;
        C36996w4 c36996w4 = this.f355497g;
        Bundle bundle = new Bundle();
        try {
            L1 l12 = c36996w4.f355424d;
            String str2 = this.f355493c;
            if (l12 == null) {
                c36996w4.zzj().f354889f.a(str, "Failed to get user properties; not connected to service", str2);
                return;
            }
            Bundle bundleR = N5.r(l12.W3(str, str2, this.f355495e, zzoVar));
            c36996w4.O();
            c36996w4.c().B(zzcvVar, bundleR);
        } catch (RemoteException e12) {
            c36996w4.zzj().f354889f.a(str, "Failed to get user properties; remote exception", e12);
        } finally {
            c36996w4.c().B(zzcvVar, bundle);
        }
    }
}
