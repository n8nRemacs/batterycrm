package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import defpackage.bci;
import defpackage.es3;
import defpackage.j3g;
import defpackage.k3g;
import defpackage.l3g;
import defpackage.mz9;
import defpackage.nva;
import defpackage.rv6;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class zzd {
    private static volatile zzd zza;
    private static final Object zzb = new Object();
    private static final Duration zzc = Duration.ofMinutes(30);
    private final k3g zzd;
    private final AtomicLong zze = new AtomicLong(-1);

    private zzd(Context context, String str) {
        this.zzd = new bci(context, bci.k, new l3g("ads_identifier:api"), rv6.c);
    }

    public static zzd zza(Context context) {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        zza = new zzd(context, "ads_identifier:api");
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    public static void zzb(zzd zzdVar, long j, Exception exc) {
        es3 es3Var;
        Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
        if ((exc instanceof ApiException) && (es3Var = ((ApiException) exc).a.d) != null && es3Var.b == 24) {
            zzdVar.zze.set(j);
        }
    }

    public final synchronized void zzc(int i, int i2, long j, long j2, int i3) {
        AtomicLong atomicLong = this.zze;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (this.zze.get() == -1 || jElapsedRealtime - this.zze.get() > zzc.toMillis()) {
            k3g k3gVar = this.zzd;
            if (k3gVar != null) {
                ((bci) k3gVar).d(new j3g(0, Arrays.asList(new mz9(35401, i2, 0, j, j2, null, null, 0, i3)))).j(new nva() { // from class: com.google.android.gms.ads.identifier.zzc
                    @Override // defpackage.nva
                    public final void onFailure(Exception exc) {
                        zzd.zzb(this.zza, jElapsedRealtime, exc);
                    }
                });
            }
        }
    }
}
