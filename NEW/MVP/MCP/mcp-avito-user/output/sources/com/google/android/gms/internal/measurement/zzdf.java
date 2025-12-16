package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.k;
import com.google.android.gms.measurement.internal.B2;
import com.google.android.gms.measurement.internal.InterfaceC36933n3;
import com.google.android.gms.measurement.internal.InterfaceC36940o3;
import eY0.C40073a;
import j.B;
import j.N;
import j.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
public class zzdf {

    /* renamed from: j, reason: collision with root package name */
    public static volatile zzdf f350611j;

    /* renamed from: a, reason: collision with root package name */
    public final String f350612a;

    /* renamed from: b, reason: collision with root package name */
    public final k f350613b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f350614c;

    /* renamed from: d, reason: collision with root package name */
    public final C40073a f350615d;

    /* renamed from: e, reason: collision with root package name */
    @B
    public final ArrayList f350616e;

    /* renamed from: f, reason: collision with root package name */
    public int f350617f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f350618g;

    /* renamed from: h, reason: collision with root package name */
    public final String f350619h;

    /* renamed from: i, reason: collision with root package name */
    public volatile zzcu f350620i;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
    public static class zzb extends zzcz {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC36933n3 f350625a;

        public zzb(InterfaceC36933n3 interfaceC36933n3) {
            this.f350625a = interfaceC36933n3;
        }

        @Override // com.google.android.gms.internal.measurement.zzda
        public final int zza() {
            return System.identityHashCode(this.f350625a);
        }

        @Override // com.google.android.gms.internal.measurement.zzda
        public final void zza(String str, String str2, Bundle bundle, long j12) {
            this.f350625a.a(str, str2, bundle, j12);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
    public static class zzc extends zzcz {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC36940o3 f350626a;

        public zzc(InterfaceC36940o3 interfaceC36940o3) {
            this.f350626a = interfaceC36940o3;
        }

        @Override // com.google.android.gms.internal.measurement.zzda
        public final int zza() {
            return System.identityHashCode(this.f350626a);
        }

        @Override // com.google.android.gms.internal.measurement.zzda
        public final void zza(String str, String str2, Bundle bundle, long j12) {
            this.f350626a.a(str, str2, bundle, j12);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
    public class zzd implements Application.ActivityLifecycleCallbacks {
        public zzd() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            zzdf.this.a(new zzeo(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            zzdf.this.a(new zzet(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            zzdf.this.a(new zzes(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            zzdf.this.a(new zzep(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            zzcs zzcsVar = new zzcs();
            zzdf.this.a(new zzeu(this, activity, zzcsVar));
            Bundle bundleZza = zzcsVar.zza(50L);
            if (bundleZza != null) {
                bundle.putAll(bundleZza);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            zzdf.this.a(new zzeq(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            zzdf.this.a(new zzer(this, activity));
        }
    }

    public zzdf(Context context, String str, String str2, String str3, Bundle bundle) throws ClassNotFoundException {
        if (str == null || str3 == null || str2 == null) {
            this.f350612a = "FA";
        } else {
            try {
                Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
                this.f350612a = "FA";
            } catch (ClassNotFoundException unused) {
                this.f350612a = str;
            }
        }
        this.f350613b = k.f349611a;
        zzci zzciVarZza = zzch.zza();
        zzdr zzdrVar = new zzdr();
        zzdrVar.f350656b = Executors.defaultThreadFactory();
        this.f350614c = zzciVarZza.zza(zzdrVar, zzcq.zza);
        this.f350615d = new C40073a(this);
        this.f350616e = new ArrayList();
        try {
            if (new B2(context, B2.a(context)).b("google_app_id") != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
                } catch (ClassNotFoundException unused2) {
                    this.f350619h = null;
                    this.f350618g = true;
                    return;
                }
            }
        } catch (IllegalStateException unused3) {
        }
        if (str3 == null || str2 == null) {
            this.f350619h = "fa";
        } else {
            try {
                Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
                this.f350619h = "fa";
            } catch (ClassNotFoundException unused4) {
                this.f350619h = str2;
            }
        }
        a(new zzdi(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new zzd());
    }

    public final void a(zza zzaVar) {
        this.f350614c.execute(zzaVar);
    }

    public final void b(Exception exc, boolean z12, boolean z13) {
        this.f350618g |= z12;
        if (!z12 && z13) {
            zza(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
    }

    public final int zza(String str) {
        zzcs zzcsVar = new zzcs();
        a(new zzed(this, str, zzcsVar));
        Integer num = (Integer) zzcs.zza(zzcsVar.zza(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final C40073a zzb() {
        return this.f350615d;
    }

    @l0
    public final Long zzc() {
        zzcs zzcsVar = new zzcs();
        a(new zzef(this, zzcsVar));
        return zzcsVar.zzb(120000L);
    }

    public final String zzd() {
        return this.f350619h;
    }

    @l0
    public final String zze() {
        zzcs zzcsVar = new zzcs();
        a(new zzeg(this, zzcsVar));
        return zzcsVar.zzc(120000L);
    }

    public final String zzf() {
        zzcs zzcsVar = new zzcs();
        a(new zzdv(this, zzcsVar));
        return zzcsVar.zzc(50L);
    }

    public final String zzg() {
        zzcs zzcsVar = new zzcs();
        a(new zzea(this, zzcsVar));
        return zzcsVar.zzc(500L);
    }

    public final String zzh() {
        zzcs zzcsVar = new zzcs();
        a(new zzdx(this, zzcsVar));
        return zzcsVar.zzc(500L);
    }

    public final String zzi() {
        zzcs zzcsVar = new zzcs();
        a(new zzdw(this, zzcsVar));
        return zzcsVar.zzc(500L);
    }

    public final void zzj() {
        a(new zzdp(this));
    }

    public final void zzb(String str) {
        a(new zzdu(this, str));
    }

    public final void zzd(Bundle bundle) {
        a(new zzek(this, bundle));
    }

    public final void zzb(String str, String str2, Bundle bundle) {
        a(new zzel(this, null, str, str2, bundle, true, true));
    }

    public final void zzd(String str) {
        a(new zzdm(this, str));
    }

    public final void zzb(Bundle bundle) {
        a(new zzdn(this, bundle));
    }

    public final void zzc(String str) {
        a(new zzdt(this, str));
    }

    public final long zza() {
        zzcs zzcsVar = new zzcs();
        a(new zzdy(this, zzcsVar));
        Long lZzb = zzcsVar.zzb(500L);
        if (lZzb == null) {
            long jNanoTime = System.nanoTime();
            this.f350613b.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i12 = this.f350617f + 1;
            this.f350617f = i12;
            return jNextLong + i12;
        }
        return lZzb.longValue();
    }

    public final void zzb(String str, String str2) {
        zza((String) null, str, (Object) str2, false);
    }

    public final void zzc(Bundle bundle) {
        a(new zzdq(this, bundle));
    }

    public final void zzb(InterfaceC36933n3 interfaceC36933n3) {
        Pair pair;
        C36729v.j(interfaceC36933n3);
        synchronized (this.f350616e) {
            int i12 = 0;
            while (true) {
                try {
                    if (i12 >= this.f350616e.size()) {
                        pair = null;
                        break;
                    } else {
                        if (interfaceC36933n3.equals(((Pair) this.f350616e.get(i12)).first)) {
                            pair = (Pair) this.f350616e.get(i12);
                            break;
                        }
                        i12++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (pair == null) {
                return;
            }
            this.f350616e.remove(pair);
            zzb zzbVar = (zzb) pair.second;
            if (this.f350620i != null) {
                try {
                    this.f350620i.unregisterOnMeasurementEventListener(zzbVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            a(new zzem(this, zzbVar));
        }
    }

    public final Bundle zza(Bundle bundle, boolean z12) {
        zzcs zzcsVar = new zzcs();
        a(new zzeb(this, bundle, zzcsVar));
        if (z12) {
            return zzcsVar.zza(5000L);
        }
        return null;
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
    public abstract class zza implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final long f350621b;

        /* renamed from: c, reason: collision with root package name */
        public final long f350622c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f350623d;

        public zza(boolean z12) {
            zzdf.this.f350613b.getClass();
            this.f350621b = System.currentTimeMillis();
            zzdf.this.f350613b.getClass();
            this.f350622c = SystemClock.elapsedRealtime();
            this.f350623d = z12;
        }

        @Override // java.lang.Runnable
        public void run() {
            zzdf zzdfVar = zzdf.this;
            if (zzdfVar.f350618g) {
                a();
                return;
            }
            try {
                zza();
            } catch (Exception e12) {
                zzdfVar.b(e12, false, this.f350623d);
                a();
            }
        }

        public abstract void zza();

        public void a() {
        }
    }

    public static zzdf zza(@N Context context) {
        return zza(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static zzdf zza(Context context, String str, String str2, String str3, Bundle bundle) {
        C36729v.j(context);
        if (f350611j == null) {
            synchronized (zzdf.class) {
                try {
                    if (f350611j == null) {
                        f350611j = new zzdf(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return f350611j;
    }

    public final Object zza(int i12) {
        zzcs zzcsVar = new zzcs();
        a(new zzei(this, zzcsVar, i12));
        return zzcs.zza(zzcsVar.zza(15000L), Object.class);
    }

    public final List<Bundle> zza(String str, String str2) {
        zzcs zzcsVar = new zzcs();
        a(new zzdj(this, str, str2, zzcsVar));
        List<Bundle> list = (List) zzcs.zza(zzcsVar.zza(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> zza(String str, String str2, boolean z12) {
        zzcs zzcsVar = new zzcs();
        a(new zzdz(this, str, str2, z12, zzcsVar));
        Bundle bundleZza = zzcsVar.zza(5000L);
        if (bundleZza != null && bundleZza.size() != 0) {
            HashMap map = new HashMap(bundleZza.size());
            for (String str3 : bundleZza.keySet()) {
                Object obj = bundleZza.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    map.put(str3, obj);
                }
            }
            return map;
        }
        return Collections.emptyMap();
    }

    public final void zza(String str, String str2, Bundle bundle) {
        a(new zzdk(this, str, str2, bundle));
    }

    public final void zza(String str, String str2, Bundle bundle, long j12) {
        a(new zzel(this, Long.valueOf(j12), str, str2, bundle, true, false));
    }

    public final void zza(@N String str, Bundle bundle) {
        a(new zzel(this, null, null, str, bundle, false, true));
    }

    public final void zza(int i12, String str, Object obj, Object obj2, Object obj3) {
        a(new zzec(this, str, obj));
    }

    public final void zza(InterfaceC36933n3 interfaceC36933n3) {
        C36729v.j(interfaceC36933n3);
        synchronized (this.f350616e) {
            for (int i12 = 0; i12 < this.f350616e.size(); i12++) {
                try {
                    if (interfaceC36933n3.equals(((Pair) this.f350616e.get(i12)).first)) {
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zzb zzbVar = new zzb(interfaceC36933n3);
            this.f350616e.add(new Pair(interfaceC36933n3, zzbVar));
            if (this.f350620i != null) {
                try {
                    this.f350620i.registerOnMeasurementEventListener(zzbVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            a(new zzej(this, zzbVar));
        }
    }

    public final void zza(Bundle bundle) {
        a(new zzdh(this, bundle));
    }

    public final void zza(Activity activity, String str, String str2) {
        a(new zzdl(this, activity, str, str2));
    }

    public final void zza(boolean z12) {
        a(new zzeh(this, z12));
    }

    public final void zza(InterfaceC36940o3 interfaceC36940o3) {
        zzc zzcVar = new zzc(interfaceC36940o3);
        if (this.f350620i != null) {
            try {
                this.f350620i.setEventInterceptor(zzcVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
            }
        }
        a(new zzee(this, zzcVar));
    }

    public final void zza(Boolean bool) {
        a(new zzdo(this, bool));
    }

    public final void zza(long j12) {
        a(new zzds(this, j12));
    }

    public final void zza(String str, String str2, Object obj, boolean z12) {
        a(new zzen(this, str, str2, obj, z12));
    }
}
