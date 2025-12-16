package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.C36946p2;
import com.google.android.gms.measurement.internal.I2;
import com.google.android.gms.measurement.internal.S1;
import com.google.android.gms.measurement.internal.U1;
import h1.AbstractC40759a;
import j.K;
import j.N;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class AppMeasurementReceiver extends AbstractC40759a implements C36946p2.a {

    /* renamed from: d, reason: collision with root package name */
    public C36946p2 f354501d;

    @Override // android.content.BroadcastReceiver
    @K
    public final void onReceive(@N Context context, @N Intent intent) {
        if (this.f354501d == null) {
            this.f354501d = new C36946p2(this);
        }
        C36946p2 c36946p2 = this.f354501d;
        c36946p2.getClass();
        S1 s12 = I2.a(context, null, null).f354717i;
        I2.c(s12);
        U1 u12 = s12.f354892i;
        if (intent == null) {
            u12.b("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        U1 u13 = s12.f354897n;
        u13.c("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                u12.b("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        u13.b("Starting wakeful intent.");
        c36946p2.f355306a.getClass();
        SparseArray<PowerManager.WakeLock> sparseArray = AbstractC40759a.f396975b;
        synchronized (sparseArray) {
            try {
                int i12 = AbstractC40759a.f396976c;
                int i13 = i12 + 1;
                AbstractC40759a.f396976c = i13;
                if (i13 <= 0) {
                    AbstractC40759a.f396976c = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i12);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i12, wakeLockNewWakeLock);
            } finally {
            }
        }
    }
}
