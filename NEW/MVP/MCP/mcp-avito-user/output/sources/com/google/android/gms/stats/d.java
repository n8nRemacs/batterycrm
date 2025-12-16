package com.google.android.gms.stats;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.util.D;
import com.google.android.gms.common.util.k;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import j.B;
import j.N;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
@J41.d
@RX0.a
@InterfaceC36733z
/* loaded from: classes6.dex */
public class d {

    /* renamed from: n, reason: collision with root package name */
    public static final long f355611n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f355612o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f355613p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public static volatile h f355614q;

    /* renamed from: a, reason: collision with root package name */
    public final Object f355615a;

    /* renamed from: b, reason: collision with root package name */
    @B
    public final PowerManager.WakeLock f355616b;

    /* renamed from: c, reason: collision with root package name */
    @B
    public int f355617c;

    /* renamed from: d, reason: collision with root package name */
    @B
    public ScheduledFuture f355618d;

    /* renamed from: e, reason: collision with root package name */
    @B
    public long f355619e;

    /* renamed from: f, reason: collision with root package name */
    @B
    public final HashSet f355620f;

    /* renamed from: g, reason: collision with root package name */
    @B
    public boolean f355621g;

    /* renamed from: h, reason: collision with root package name */
    @B
    public zzb f355622h;

    /* renamed from: i, reason: collision with root package name */
    public final k f355623i;

    /* renamed from: j, reason: collision with root package name */
    public final String f355624j;

    /* renamed from: k, reason: collision with root package name */
    @B
    public final HashMap f355625k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f355626l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f355627m;

    static {
        new f();
    }

    @RX0.a
    public d(@N Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f355615a = new Object();
        this.f355617c = 0;
        this.f355620f = new HashSet();
        this.f355621g = true;
        this.f355623i = k.f349611a;
        this.f355625k = new HashMap();
        this.f355626l = new AtomicInteger(0);
        C36729v.g("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f355622h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f355624j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f355624j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb2.toString());
        }
        this.f355616b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = D.f349599a;
        synchronized (D.class) {
            Boolean bool = D.f349603e;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = androidx.core.content.d.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                D.f349603e = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i12 = com.google.android.gms.common.util.B.f349598a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoA = aY0.c.a(context).a(0, packageName);
                    if (applicationInfoA == null) {
                        "Could not get applicationInfo from package: ".concat(packageName);
                    } else {
                        int i13 = applicationInfoA.uid;
                        workSource = new WorkSource();
                        D.a(workSource, i13, packageName);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    "Could not find package: ".concat(packageName);
                }
            }
            if (workSource != null) {
                try {
                    this.f355616b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e12) {
                    Log.wtf("WakeLock", e12.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f355612o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f355613p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f355612o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        zzh.zza();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f355612o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f355627m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    @RX0.a
    public final void a(long j12) {
        this.f355626l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f355611n), 1L);
        if (j12 > 0) {
            jMax = Math.min(j12, jMax);
        }
        synchronized (this.f355615a) {
            try {
                if (!b()) {
                    this.f355622h = zzb.zza(false, null);
                    this.f355616b.acquire();
                    this.f355623i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f355617c++;
                if (this.f355621g) {
                    TextUtils.isEmpty(null);
                }
                g gVar = (g) this.f355625k.get(null);
                if (gVar == null) {
                    gVar = new g(null);
                    this.f355625k.put(null, gVar);
                }
                gVar.f355629a++;
                this.f355623i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j13 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j13 > this.f355619e) {
                    this.f355619e = j13;
                    ScheduledFuture scheduledFuture = this.f355618d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f355618d = this.f355627m.schedule(new Runnable() { // from class: com.google.android.gms.stats.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            d dVar = this.f355628b;
                            synchronized (dVar.f355615a) {
                                try {
                                    if (dVar.b()) {
                                        String.valueOf(dVar.f355624j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                                        dVar.d();
                                        if (dVar.b()) {
                                            dVar.f355617c = 1;
                                            dVar.e();
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @RX0.a
    public final boolean b() {
        boolean z12;
        synchronized (this.f355615a) {
            z12 = this.f355617c > 0;
        }
        return z12;
    }

    @RX0.a
    public final void c() {
        if (this.f355626l.decrementAndGet() < 0) {
            String.valueOf(this.f355624j).concat(" release without a matched acquire!");
        }
        synchronized (this.f355615a) {
            try {
                if (this.f355621g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f355625k.containsKey(null)) {
                    g gVar = (g) this.f355625k.get(null);
                    if (gVar != null) {
                        int i12 = gVar.f355629a - 1;
                        gVar.f355629a = i12;
                        if (i12 == 0) {
                            this.f355625k.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.f355624j).concat(" counter does not exist");
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @B
    public final void d() {
        HashSet hashSet = this.f355620f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final void e() {
        synchronized (this.f355615a) {
            try {
                if (b()) {
                    if (this.f355621g) {
                        int i12 = this.f355617c - 1;
                        this.f355617c = i12;
                        if (i12 > 0) {
                            return;
                        }
                    } else {
                        this.f355617c = 0;
                    }
                    d();
                    Iterator it = this.f355625k.values().iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).f355629a = 0;
                    }
                    this.f355625k.clear();
                    ScheduledFuture scheduledFuture = this.f355618d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f355618d = null;
                        this.f355619e = 0L;
                    }
                    if (this.f355616b.isHeld()) {
                        try {
                            try {
                                this.f355616b.release();
                                if (this.f355622h != null) {
                                    this.f355622h = null;
                                }
                            } catch (RuntimeException e12) {
                                if (!e12.getClass().equals(RuntimeException.class)) {
                                    throw e12;
                                }
                                String.valueOf(this.f355624j).concat(" failed to release!");
                                if (this.f355622h != null) {
                                    this.f355622h = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f355622h != null) {
                                this.f355622h = null;
                            }
                            throw th2;
                        }
                    } else {
                        String.valueOf(this.f355624j).concat(" should be held!");
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
