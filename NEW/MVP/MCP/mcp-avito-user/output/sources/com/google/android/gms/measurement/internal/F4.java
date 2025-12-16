package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class F4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzo f354678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f354679c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C36996w4 f354680d;

    public F4(C36996w4 c36996w4, zzo zzoVar, Bundle bundle) {
        this.f354678b = zzoVar;
        this.f354679c = bundle;
        this.f354680d = c36996w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzo zzoVar = this.f354678b;
        C36996w4 c36996w4 = this.f354680d;
        L1 l12 = c36996w4.f355424d;
        if (l12 == null) {
            c36996w4.zzj().f354889f.b("Failed to send default event parameters to service");
            return;
        }
        try {
            l12.mo108m(this.f354679c, zzoVar);
        } catch (RemoteException e12) {
            c36996w4.zzj().f354889f.c("Failed to send default event parameters to service", e12);
        }
    }
}
