package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.InterfaceC36753g;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzgv;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zzny;
import com.google.android.gms.measurement.internal.zzif;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public class I2 implements InterfaceC36905j3 {

    /* renamed from: I, reason: collision with root package name */
    public static volatile I2 f354700I;

    /* renamed from: A, reason: collision with root package name */
    public volatile Boolean f354701A;

    /* renamed from: B, reason: collision with root package name */
    @j.k0
    public final Boolean f354702B;

    /* renamed from: C, reason: collision with root package name */
    @j.k0
    public final Boolean f354703C;

    /* renamed from: D, reason: collision with root package name */
    public volatile boolean f354704D;

    /* renamed from: E, reason: collision with root package name */
    public int f354705E;

    /* renamed from: F, reason: collision with root package name */
    public int f354706F;

    /* renamed from: H, reason: collision with root package name */
    @j.k0
    public final long f354708H;

    /* renamed from: a, reason: collision with root package name */
    public final Context f354709a;

    /* renamed from: b, reason: collision with root package name */
    public final String f354710b;

    /* renamed from: c, reason: collision with root package name */
    public final String f354711c;

    /* renamed from: d, reason: collision with root package name */
    public final String f354712d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f354713e;

    /* renamed from: f, reason: collision with root package name */
    public final C36852c f354714f;

    /* renamed from: g, reason: collision with root package name */
    public final C36880g f354715g;

    /* renamed from: h, reason: collision with root package name */
    public final C36876f2 f354716h;

    /* renamed from: i, reason: collision with root package name */
    public final S1 f354717i;

    /* renamed from: j, reason: collision with root package name */
    public final A2 f354718j;

    /* renamed from: k, reason: collision with root package name */
    public final C36879f5 f354719k;

    /* renamed from: l, reason: collision with root package name */
    public final N5 f354720l;

    /* renamed from: m, reason: collision with root package name */
    public final R1 f354721m;

    /* renamed from: n, reason: collision with root package name */
    public final com.google.android.gms.common.util.k f354722n;

    /* renamed from: o, reason: collision with root package name */
    public final C36934n4 f354723o;

    /* renamed from: p, reason: collision with root package name */
    public final C36967s3 f354724p;

    /* renamed from: q, reason: collision with root package name */
    public final C37005y f354725q;

    /* renamed from: r, reason: collision with root package name */
    public final C36899i4 f354726r;

    /* renamed from: s, reason: collision with root package name */
    public final String f354727s;

    /* renamed from: t, reason: collision with root package name */
    public P1 f354728t;

    /* renamed from: u, reason: collision with root package name */
    public C36996w4 f354729u;

    /* renamed from: v, reason: collision with root package name */
    public C36998x f354730v;

    /* renamed from: w, reason: collision with root package name */
    public M1 f354731w;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f354733y;

    /* renamed from: z, reason: collision with root package name */
    public long f354734z;

    /* renamed from: x, reason: collision with root package name */
    public boolean f354732x = false;

    /* renamed from: G, reason: collision with root package name */
    public final AtomicInteger f354707G = new AtomicInteger(0);

    public I2(C36954q3 c36954q3) {
        long jCurrentTimeMillis;
        Bundle bundle;
        boolean z12 = false;
        Context context = c36954q3.f355320a;
        C36852c c36852c = new C36852c();
        this.f354714f = c36852c;
        G1.f354683a = c36852c;
        this.f354709a = context;
        this.f354710b = c36954q3.f355321b;
        this.f354711c = c36954q3.f355322c;
        this.f354712d = c36954q3.f355323d;
        this.f354713e = c36954q3.f355327h;
        this.f354701A = c36954q3.f355324e;
        this.f354727s = c36954q3.f355329j;
        this.f354704D = true;
        zzdd zzddVar = c36954q3.f355326g;
        if (zzddVar != null && (bundle = zzddVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f354702B = (Boolean) obj;
            }
            Object obj2 = zzddVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f354703C = (Boolean) obj2;
            }
        }
        zzgv.zzb(context);
        com.google.android.gms.common.util.k kVar = com.google.android.gms.common.util.k.f349611a;
        this.f354722n = kVar;
        Long l12 = c36954q3.f355328i;
        if (l12 != null) {
            jCurrentTimeMillis = l12.longValue();
        } else {
            kVar.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.f354708H = jCurrentTimeMillis;
        C36880g c36880g = new C36880g(this);
        c36880g.f355162c = "";
        c36880g.f355163d = new InterfaceC36894i() { // from class: com.google.android.gms.measurement.internal.f
            @Override // com.google.android.gms.measurement.internal.InterfaceC36894i
            public final String a(String str, String str2) {
                return null;
            }
        };
        this.f354715g = c36880g;
        C36876f2 c36876f2 = new C36876f2(this);
        c36876f2.g();
        this.f354716h = c36876f2;
        S1 s12 = new S1(this);
        s12.g();
        this.f354717i = s12;
        N5 n52 = new N5(this);
        n52.g();
        this.f354720l = n52;
        this.f354721m = new R1(new C36947p3(this));
        this.f354725q = new C37005y(this);
        C36934n4 c36934n4 = new C36934n4(this);
        c36934n4.j();
        this.f354723o = c36934n4;
        C36967s3 c36967s3 = new C36967s3(this);
        c36967s3.j();
        this.f354724p = c36967s3;
        C36879f5 c36879f5 = new C36879f5(this);
        c36879f5.j();
        this.f354719k = c36879f5;
        C36899i4 c36899i4 = new C36899i4(this);
        c36899i4.g();
        this.f354726r = c36899i4;
        A2 a22 = new A2(this);
        a22.g();
        this.f354718j = a22;
        zzdd zzddVar2 = c36954q3.f355326g;
        if (zzddVar2 != null && zzddVar2.zzb != 0) {
            z12 = true;
        }
        if (context.getApplicationContext() instanceof Application) {
            b(c36967s3);
            if (c36967s3.f355183a.f354709a.getApplicationContext() instanceof Application) {
                Application application = (Application) c36967s3.f355183a.f354709a.getApplicationContext();
                if (c36967s3.f355362c == null) {
                    c36967s3.f355362c = new C36857c4(c36967s3);
                }
                if (!z12) {
                    application.unregisterActivityLifecycleCallbacks(c36967s3.f355362c);
                    application.registerActivityLifecycleCallbacks(c36967s3.f355362c);
                    c36967s3.zzj().f354897n.b("Registered activity lifecycle callback");
                }
            }
        } else {
            c(s12);
            s12.f354892i.b("Application context is not an Application");
        }
        a22.n(new J2(this, c36954q3));
    }

    public static I2 a(Context context, zzdd zzddVar, Long l12) {
        Bundle bundle;
        if (zzddVar != null && (zzddVar.zze == null || zzddVar.zzf == null)) {
            zzddVar = new zzdd(zzddVar.zza, zzddVar.zzb, zzddVar.zzc, zzddVar.zzd, null, null, zzddVar.zzg, null);
        }
        C36729v.j(context);
        C36729v.j(context.getApplicationContext());
        if (f354700I == null) {
            synchronized (I2.class) {
                try {
                    if (f354700I == null) {
                        f354700I = new I2(new C36954q3(context, zzddVar, l12));
                    }
                } finally {
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            C36729v.j(f354700I);
            f354700I.f354701A = Boolean.valueOf(zzddVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        C36729v.j(f354700I);
        return f354700I;
    }

    public static void b(AbstractC36847b1 abstractC36847b1) {
        if (abstractC36847b1 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC36847b1.f355035b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC36847b1.getClass())));
        }
    }

    public static void c(AbstractC36884g3 abstractC36884g3) {
        if (abstractC36884g3 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC36884g3.f355168b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC36884g3.getClass())));
        }
    }

    public static void d(C36891h3 c36891h3) {
        if (c36891h3 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    @j.l0
    public final boolean e() {
        return h() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            r6 = this;
            boolean r0 = r6.f354732x
            if (r0 == 0) goto Lb4
            com.google.android.gms.measurement.internal.A2 r0 = r6.f354718j
            c(r0)
            r0.e()
            java.lang.Boolean r0 = r6.f354733y
            com.google.android.gms.common.util.k r1 = r6.f354722n
            if (r0 == 0) goto L34
            long r2 = r6.f354734z
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lad
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f354734z
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lad
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f354734z = r0
            com.google.android.gms.measurement.internal.N5 r0 = r6.f354720l
            d(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.k0(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L76
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.k0(r1)
            if (r1 == 0) goto L76
            android.content.Context r1 = r6.f354709a
            aY0.b r4 = aY0.c.a(r1)
            boolean r4 = r4.c()
            if (r4 != 0) goto L74
            com.google.android.gms.measurement.internal.g r4 = r6.f354715g
            boolean r4 = r4.u()
            if (r4 != 0) goto L74
            boolean r4 = com.google.android.gms.measurement.internal.N5.N(r1)
            if (r4 == 0) goto L76
            boolean r1 = com.google.android.gms.measurement.internal.N5.h0(r1)
            if (r1 == 0) goto L76
        L74:
            r1 = r2
            goto L77
        L76:
            r1 = r3
        L77:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r6.f354733y = r4
            if (r1 == 0) goto Lad
            com.google.android.gms.measurement.internal.M1 r1 = r6.k()
            java.lang.String r1 = r1.n()
            com.google.android.gms.measurement.internal.M1 r4 = r6.k()
            r4.i()
            java.lang.String r4 = r4.f354797m
            boolean r0 = r0.R(r1, r4)
            if (r0 != 0) goto La7
            com.google.android.gms.measurement.internal.M1 r0 = r6.k()
            r0.i()
            java.lang.String r0 = r0.f354797m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La6
            goto La7
        La6:
            r2 = r3
        La7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r6.f354733y = r0
        Lad:
            java.lang.Boolean r0 = r6.f354733y
            boolean r0 = r0.booleanValue()
            return r0
        Lb4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.I2.f():boolean");
    }

    @j.l0
    public final boolean g() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        A2 a22 = this.f354718j;
        c(a22);
        a22.e();
        C36899i4 c36899i4 = this.f354726r;
        c(c36899i4);
        c(c36899i4);
        String strM = k().m();
        C36876f2 c36876f2 = this.f354716h;
        d(c36876f2);
        c36876f2.e();
        boolean zZza = zzny.zza();
        I2 i22 = c36876f2.f355183a;
        if (zZza && i22.f354715g.o(null, E.f354577I0) && !c36876f2.o().e(zzif.zza.AD_STORAGE)) {
            pair = new Pair("", Boolean.FALSE);
        } else {
            i22.f354722n.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (c36876f2.f355131i == null || jElapsedRealtime >= c36876f2.f355133k) {
                C36880g c36880g = i22.f354715g;
                c36880g.getClass();
                c36876f2.f355133k = c36880g.l(strM, E.f354611c) + jElapsedRealtime;
                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(i22.f354709a);
                    c36876f2.f355131i = "";
                    String id2 = advertisingIdInfo.getId();
                    if (id2 != null) {
                        c36876f2.f355131i = id2;
                    }
                    c36876f2.f355132j = advertisingIdInfo.isLimitAdTrackingEnabled();
                } catch (Exception e12) {
                    c36876f2.zzj().f354896m.c("Unable to get advertising id", e12);
                    c36876f2.f355131i = "";
                }
                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                pair = new Pair(c36876f2.f355131i, Boolean.valueOf(c36876f2.f355132j));
            } else {
                pair = new Pair(c36876f2.f355131i, Boolean.valueOf(c36876f2.f355132j));
            }
        }
        C36880g c36880g2 = this.f354715g;
        Boolean boolN = c36880g2.n("google_analytics_adid_collection_enabled");
        boolean z12 = boolN == null || boolN.booleanValue();
        S1 s12 = this.f354717i;
        if (!z12 || ((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
            c(s12);
            s12.f354896m.b("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        c(c36899i4);
        c36899i4.f();
        ConnectivityManager connectivityManager = (ConnectivityManager) c36899i4.f355183a.f354709a.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        } else {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            c(s12);
            s12.f354892i.b("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (zzns.zza() && c36880g2.o(null, E.f354583L0)) {
            C36996w4 c36996w4N = n();
            c36996w4N.e();
            c36996w4N.i();
            if (!c36996w4N.M() || c36996w4N.c().l0() >= 234200) {
                C36967s3 c36967s3 = this.f354724p;
                b(c36967s3);
                c36967s3.e();
                zzaj zzajVarD = c36967s3.f355183a.n().D();
                Bundle bundle = zzajVarD != null ? zzajVarD.f355532b : null;
                if (bundle == null) {
                    int i12 = this.f354706F;
                    this.f354706F = i12 + 1;
                    boolean z13 = i12 < 10;
                    c(s12);
                    s12.f354896m.c(AK.c.k("Failed to retrieve DMA consent from the service, ", z13 ? "Retrying." : "Skipping.", " retryCount"), Integer.valueOf(this.f354706F));
                    return z13;
                }
                zzif zzifVarA = zzif.a(100, bundle);
                sb2.append("&gcs=");
                sb2.append(zzifVarA.i());
                C36977u c36977uA = C36977u.a(100, bundle);
                sb2.append("&dma=");
                sb2.append(c36977uA.f355392c == Boolean.FALSE ? 0 : 1);
                String str = c36977uA.f355393d;
                if (!TextUtils.isEmpty(str)) {
                    sb2.append("&dma_cps=");
                    sb2.append(str);
                }
                int i13 = zzif.g(bundle.getString("ad_personalization")) == Boolean.TRUE ? 0 : 1;
                sb2.append("&npa=");
                sb2.append(i13);
                c(s12);
                s12.f354897n.c("Consent query parameters to Bow", sb2);
            }
        }
        N5 n52 = this.f354720l;
        d(n52);
        k();
        URL urlV = n52.v(c36876f2.f355144v.a() - 1, strM, (String) pair.first, sb2.toString());
        if (urlV != null) {
            c(c36899i4);
            K2 k22 = new K2(this);
            c36899i4.e();
            c36899i4.f();
            c36899i4.zzl().l(new RunnableC36913k4(c36899i4, strM, urlV, k22));
        }
        return false;
    }

    @j.l0
    public final int h() {
        A2 a22 = this.f354718j;
        c(a22);
        a22.e();
        Boolean boolN = this.f354715g.n("firebase_analytics_collection_deactivated");
        if (boolN != null && boolN.booleanValue()) {
            return 1;
        }
        Boolean bool = this.f354703C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        A2 a23 = this.f354718j;
        c(a23);
        a23.e();
        if (!this.f354704D) {
            return 8;
        }
        C36876f2 c36876f2 = this.f354716h;
        d(c36876f2);
        c36876f2.e();
        Boolean boolValueOf = c36876f2.m().contains("measurement_enabled") ? Boolean.valueOf(c36876f2.m().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        Boolean boolN2 = this.f354715g.n("firebase_analytics_collection_enabled");
        if (boolN2 != null) {
            return boolN2.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f354702B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f354701A == null || this.f354701A.booleanValue()) ? 0 : 7;
    }

    @Pure
    public final C37005y i() {
        C37005y c37005y = this.f354725q;
        if (c37005y != null) {
            return c37005y;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final C36998x j() {
        c(this.f354730v);
        return this.f354730v;
    }

    @Pure
    public final M1 k() {
        b(this.f354731w);
        return this.f354731w;
    }

    @Pure
    public final P1 l() {
        b(this.f354728t);
        return this.f354728t;
    }

    @Pure
    public final R1 m() {
        return this.f354721m;
    }

    @Pure
    public final C36996w4 n() {
        b(this.f354729u);
        return this.f354729u;
    }

    @Pure
    public final void o() {
        d(this.f354720l);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final Context zza() {
        return this.f354709a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final InterfaceC36753g zzb() {
        return this.f354722n;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final C36852c zzd() {
        return this.f354714f;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final S1 zzj() {
        S1 s12 = this.f354717i;
        c(s12);
        return s12;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final A2 zzl() {
        A2 a22 = this.f354718j;
        c(a22);
        return a22;
    }
}
