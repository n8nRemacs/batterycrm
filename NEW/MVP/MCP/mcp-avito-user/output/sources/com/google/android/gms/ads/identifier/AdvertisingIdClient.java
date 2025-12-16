package com.google.android.gms.ads.identifier;

import I41.j;
import RX0.a;
import RX0.c;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.ServiceConnectionC36683b;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import j.N;
import j.P;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.webrtc.h;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
@j
@a
/* loaded from: classes6.dex */
public class AdvertisingIdClient {

    @J41.a
    @P
    ServiceConnectionC36683b zza;

    @J41.a
    @P
    zzf zzb;

    @J41.a
    boolean zzc;
    final Object zzd;

    @J41.a
    @P
    zzb zze;
    final long zzf;

    @J41.a
    private final Context zzg;

    /* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    @c
    public static final class Info {

        @P
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(@P String str, boolean z12) {
            this.zza = str;
            this.zzb = z12;
        }

        @P
        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        @N
        public String toString() {
            String str = this.zza;
            boolean z12 = this.zzb;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z12);
            return sb2.toString();
        }
    }

    @a
    public AdvertisingIdClient(@N Context context) {
        this(context, 30000L, false, false);
    }

    @N
    @a
    public static Info getAdvertisingIdInfo(@N Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info infoZzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(infoZzd, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return infoZzd;
        } finally {
        }
    }

    @a
    public static boolean getIsAdIdFakeForDebugLogging(@N Context context) {
        boolean zZzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            C36729v.i("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.zzc) {
                        synchronized (advertisingIdClient.zzd) {
                            zzb zzbVar = advertisingIdClient.zze;
                            if (zzbVar == null || !zzbVar.zzb) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            advertisingIdClient.zzb(false);
                            if (!advertisingIdClient.zzc) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e12) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e12);
                        }
                    }
                    C36729v.j(advertisingIdClient.zza);
                    C36729v.j(advertisingIdClient.zzb);
                    try {
                        zZzd = advertisingIdClient.zzb.zzd();
                    } catch (RemoteException unused) {
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            advertisingIdClient.zze();
            return zZzd;
        } finally {
            advertisingIdClient.zza();
        }
    }

    private final Info zzd(int i12) {
        Info info;
        C36729v.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.zzc) {
                    synchronized (this.zzd) {
                        zzb zzbVar = this.zze;
                        if (zzbVar == null || !zzbVar.zzb) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        zzb(false);
                        if (!this.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e12) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e12);
                    }
                }
                C36729v.j(this.zza);
                C36729v.j(this.zzb);
                try {
                    info = new Info(this.zzb.zzc(), this.zzb.zze(true));
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j12 = this.zzf;
            if (j12 > 0) {
                this.zze = new zzb(this, j12);
            }
        }
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    @N
    @a
    public Info getInfo() {
        return zzd(-1);
    }

    @a
    public void start() {
        zzb(true);
    }

    public final void zza() {
        C36729v.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzg == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        ZX0.a.b().c(this.zzg, this.zza);
                    }
                } catch (Throwable unused) {
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final void zzb(boolean z12) {
        C36729v.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzc) {
                    zza();
                }
                Context context = this.zzg;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iC2 = C36688g.f349289b.c(12451000, context);
                    if (iC2 != 0 && iC2 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC36683b serviceConnectionC36683b = new ServiceConnectionC36683b();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!ZX0.a.b().a(context, intent, serviceConnectionC36683b, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = serviceConnectionC36683b;
                        try {
                            this.zzb = zze.zza(serviceConnectionC36683b.a(TimeUnit.MILLISECONDS));
                            this.zzc = true;
                            if (z12) {
                                zze();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th2) {
                            throw new IOException(th2);
                        }
                    } finally {
                        IOException iOException = new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @VisibleForTesting
    public final boolean zzc(@P Info info, boolean z12, float f12, long j12, String str, @P Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap mapG = h.g("app_context", "1");
        if (info != null) {
            mapG.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id2 = info.getId();
            if (id2 != null) {
                mapG.put("ad_id_size", Integer.toString(id2.length()));
            }
        }
        if (th2 != null) {
            mapG.put("error", th2.getClass().getName());
        }
        mapG.put("tag", "AdvertisingIdClient");
        mapG.put("time_spent", Long.toString(j12));
        new zza(this, mapG).start();
        return true;
    }

    @VisibleForTesting
    public AdvertisingIdClient(@N Context context, long j12, boolean z12, boolean z13) {
        Context applicationContext;
        this.zzd = new Object();
        C36729v.j(context);
        if (z12 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j12;
    }

    @a
    @InterfaceC36733z
    public static void setShouldSkipGmsCoreVersionCheck(boolean z12) {
    }
}
