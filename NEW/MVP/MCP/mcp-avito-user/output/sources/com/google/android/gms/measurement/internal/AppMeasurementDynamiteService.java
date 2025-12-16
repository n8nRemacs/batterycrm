package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.collection.C20199a;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzct;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.Map;
import v61.InterfaceC49173d;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.1 */
@DynamiteApi
/* loaded from: classes6.dex */
public class AppMeasurementDynamiteService extends zzct {

    /* renamed from: a, reason: collision with root package name */
    @j.k0
    public I2 f354526a = null;

    /* renamed from: b, reason: collision with root package name */
    @j.B
    public final C20199a f354527b = new C20199a();

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.1 */
    public class a implements InterfaceC36933n3 {

        /* renamed from: a, reason: collision with root package name */
        public final zzda f354528a;

        public a(zzda zzdaVar) {
            this.f354528a = zzdaVar;
        }

        @Override // com.google.android.gms.measurement.internal.InterfaceC36933n3
        public final void a(String str, String str2, Bundle bundle, long j12) {
            try {
                this.f354528a.zza(str, str2, bundle, j12);
            } catch (RemoteException e12) {
                I2 i22 = AppMeasurementDynamiteService.this.f354526a;
                if (i22 != null) {
                    S1 s12 = i22.f354717i;
                    I2.c(s12);
                    s12.f354892i.c("Event listener threw exception", e12);
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.1 */
    public class b implements InterfaceC36940o3 {

        /* renamed from: a, reason: collision with root package name */
        public final zzda f354530a;

        public b(zzda zzdaVar) {
            this.f354530a = zzdaVar;
        }

        @Override // com.google.android.gms.measurement.internal.InterfaceC36940o3
        public final void a(String str, String str2, Bundle bundle, long j12) {
            try {
                this.f354530a.zza(str, str2, bundle, j12);
            } catch (RemoteException e12) {
                I2 i22 = AppMeasurementDynamiteService.this.f354526a;
                if (i22 != null) {
                    S1 s12 = i22.f354717i;
                    I2.c(s12);
                    s12.f354892i.c("Event interceptor threw exception", e12);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void beginAdUnitExposure(@j.N String str, long j12) {
        zza();
        this.f354526a.i().k(j12, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void clearConditionalUserProperty(@j.N String str, @j.N String str2, @j.N Bundle bundle) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        c36967s3.D(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void clearMeasurementEnabled(long j12) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        c36967s3.z(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void endAdUnitExposure(@j.N String str, long j12) {
        zza();
        this.f354526a.i().o(j12, str);
    }

    public final void f4(String str, zzcv zzcvVar) {
        zza();
        N5 n52 = this.f354526a.f354720l;
        I2.d(n52);
        n52.J(str, zzcvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void generateEventId(zzcv zzcvVar) {
        zza();
        N5 n52 = this.f354526a.f354720l;
        I2.d(n52);
        long jR02 = n52.r0();
        zza();
        N5 n53 = this.f354526a.f354720l;
        I2.d(n53);
        n53.A(zzcvVar, jR02);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getAppInstanceId(zzcv zzcvVar) {
        zza();
        A2 a22 = this.f354526a.f354718j;
        I2.c(a22);
        a22.n(new RunnableC36877f3(this, zzcvVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getCachedAppInstanceId(zzcv zzcvVar) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        f4(c36967s3.f355366g.get(), zzcvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getConditionalUserProperties(String str, String str2, zzcv zzcvVar) {
        zza();
        A2 a22 = this.f354526a.f354718j;
        I2.c(a22);
        a22.n(new RunnableC36893h5(this, zzcvVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getCurrentScreenClass(zzcv zzcvVar) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        f4(c36967s3.N(), zzcvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getCurrentScreenName(zzcv zzcvVar) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        f4(c36967s3.O(), zzcvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getGmpAppId(zzcv zzcvVar) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        I2 i22 = c36967s3.f355183a;
        String strB = i22.f354710b;
        if (strB == null) {
            try {
                strB = new B2(i22.f354709a, i22.f354727s).b("google_app_id");
            } catch (IllegalStateException e12) {
                S1 s12 = i22.f354717i;
                I2.c(s12);
                s12.f354889f.c("getGoogleAppId failed with exception", e12);
                strB = null;
            }
        }
        f4(strB, zzcvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getMaxUserProperties(String str, zzcv zzcvVar) {
        zza();
        I2.b(this.f354526a.f354724p);
        C36729v.f(str);
        zza();
        N5 n52 = this.f354526a.f354720l;
        I2.d(n52);
        n52.z(zzcvVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getSessionId(zzcv zzcvVar) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        c36967s3.zzl().n(new V3(c36967s3, zzcvVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getTestFlag(zzcv zzcvVar, int i12) {
        zza();
        if (i12 == 0) {
            N5 n52 = this.f354526a.f354720l;
            I2.d(n52);
            C36967s3 c36967s3 = this.f354526a.f354724p;
            I2.b(c36967s3);
            n52.J(c36967s3.P(), zzcvVar);
            return;
        }
        if (i12 == 1) {
            N5 n53 = this.f354526a.f354720l;
            I2.d(n53);
            C36967s3 c36967s32 = this.f354526a.f354724p;
            I2.b(c36967s32);
            n53.A(zzcvVar, c36967s32.M().longValue());
            return;
        }
        if (i12 == 2) {
            N5 n54 = this.f354526a.f354720l;
            I2.d(n54);
            C36967s3 c36967s33 = this.f354526a.f354724p;
            I2.b(c36967s33);
            double dDoubleValue = c36967s33.K().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                zzcvVar.zza(bundle);
                return;
            } catch (RemoteException e12) {
                S1 s12 = n54.f355183a.f354717i;
                I2.c(s12);
                s12.f354892i.c("Error returning double value to wrapper", e12);
                return;
            }
        }
        if (i12 == 3) {
            N5 n55 = this.f354526a.f354720l;
            I2.d(n55);
            C36967s3 c36967s34 = this.f354526a.f354724p;
            I2.b(c36967s34);
            n55.z(zzcvVar, c36967s34.L().intValue());
            return;
        }
        if (i12 != 4) {
            return;
        }
        N5 n56 = this.f354526a.f354720l;
        I2.d(n56);
        C36967s3 c36967s35 = this.f354526a.f354724p;
        I2.b(c36967s35);
        n56.D(zzcvVar, c36967s35.J().booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getUserProperties(String str, String str2, boolean z12, zzcv zzcvVar) {
        zza();
        A2 a22 = this.f354526a.f354718j;
        I2.c(a22);
        a22.n(new RunnableC36878f4(this, zzcvVar, str, str2, z12));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void initForTests(@j.N Map map) {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void initialize(com.google.android.gms.dynamic.d dVar, zzdd zzddVar, long j12) {
        I2 i22 = this.f354526a;
        if (i22 == null) {
            Context context = (Context) com.google.android.gms.dynamic.f.g4(dVar);
            C36729v.j(context);
            this.f354526a = I2.a(context, zzddVar, Long.valueOf(j12));
        } else {
            S1 s12 = i22.f354717i;
            I2.c(s12);
            s12.f354892i.b("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void isDataCollectionEnabled(zzcv zzcvVar) {
        zza();
        A2 a22 = this.f354526a.f354718j;
        I2.c(a22);
        a22.n(new G4(this, zzcvVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void logEvent(@j.N String str, @j.N String str2, @j.N Bundle bundle, boolean z12, boolean z13, long j12) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        c36967s3.F(str, str2, bundle, z12, z13, j12);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcv zzcvVar, long j12) {
        zza();
        C36729v.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        zzbe zzbeVar = new zzbe(str2, new zzaz(bundle), "app", j12);
        A2 a22 = this.f354526a.f354718j;
        I2.c(a22);
        a22.n(new E2(this, zzcvVar, zzbeVar, str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void logHealthData(int i12, @j.N String str, @j.N com.google.android.gms.dynamic.d dVar, @j.N com.google.android.gms.dynamic.d dVar2, @j.N com.google.android.gms.dynamic.d dVar3) {
        zza();
        Object objG4 = dVar == null ? null : com.google.android.gms.dynamic.f.g4(dVar);
        Object objG42 = dVar2 == null ? null : com.google.android.gms.dynamic.f.g4(dVar2);
        Object objG43 = dVar3 != null ? com.google.android.gms.dynamic.f.g4(dVar3) : null;
        S1 s12 = this.f354526a.f354717i;
        I2.c(s12);
        s12.l(i12, true, false, str, objG4, objG42, objG43);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityCreated(@j.N com.google.android.gms.dynamic.d dVar, @j.N Bundle bundle, long j12) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        C36857c4 c36857c4 = c36967s3.f355362c;
        if (c36857c4 != null) {
            C36967s3 c36967s32 = this.f354526a.f354724p;
            I2.b(c36967s32);
            c36967s32.R();
            c36857c4.onActivityCreated((Activity) com.google.android.gms.dynamic.f.g4(dVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityDestroyed(@j.N com.google.android.gms.dynamic.d dVar, long j12) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        C36857c4 c36857c4 = c36967s3.f355362c;
        if (c36857c4 != null) {
            C36967s3 c36967s32 = this.f354526a.f354724p;
            I2.b(c36967s32);
            c36967s32.R();
            c36857c4.onActivityDestroyed((Activity) com.google.android.gms.dynamic.f.g4(dVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityPaused(@j.N com.google.android.gms.dynamic.d dVar, long j12) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        C36857c4 c36857c4 = c36967s3.f355362c;
        if (c36857c4 != null) {
            C36967s3 c36967s32 = this.f354526a.f354724p;
            I2.b(c36967s32);
            c36967s32.R();
            c36857c4.onActivityPaused((Activity) com.google.android.gms.dynamic.f.g4(dVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityResumed(@j.N com.google.android.gms.dynamic.d dVar, long j12) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        C36857c4 c36857c4 = c36967s3.f355362c;
        if (c36857c4 != null) {
            C36967s3 c36967s32 = this.f354526a.f354724p;
            I2.b(c36967s32);
            c36967s32.R();
            c36857c4.onActivityResumed((Activity) com.google.android.gms.dynamic.f.g4(dVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivitySaveInstanceState(com.google.android.gms.dynamic.d dVar, zzcv zzcvVar, long j12) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        C36857c4 c36857c4 = c36967s3.f355362c;
        Bundle bundle = new Bundle();
        if (c36857c4 != null) {
            C36967s3 c36967s32 = this.f354526a.f354724p;
            I2.b(c36967s32);
            c36967s32.R();
            c36857c4.onActivitySaveInstanceState((Activity) com.google.android.gms.dynamic.f.g4(dVar), bundle);
        }
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e12) {
            S1 s12 = this.f354526a.f354717i;
            I2.c(s12);
            s12.f354892i.c("Error returning bundle value to wrapper", e12);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityStarted(@j.N com.google.android.gms.dynamic.d dVar, long j12) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        if (c36967s3.f355362c != null) {
            C36967s3 c36967s32 = this.f354526a.f354724p;
            I2.b(c36967s32);
            c36967s32.R();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityStopped(@j.N com.google.android.gms.dynamic.d dVar, long j12) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        if (c36967s3.f355362c != null) {
            C36967s3 c36967s32 = this.f354526a.f354724p;
            I2.b(c36967s32);
            c36967s32.R();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void performAction(Bundle bundle, zzcv zzcvVar, long j12) {
        zza();
        zzcvVar.zza(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void registerOnMeasurementEventListener(zzda zzdaVar) {
        InterfaceC36933n3 aVar;
        zza();
        synchronized (this.f354527b) {
            try {
                aVar = (InterfaceC36933n3) this.f354527b.get(Integer.valueOf(zzdaVar.zza()));
                if (aVar == null) {
                    aVar = new a(zzdaVar);
                    this.f354527b.put(Integer.valueOf(zzdaVar.zza()), aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        c36967s3.v(aVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void resetAnalyticsData(long j12) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        c36967s3.B(null);
        c36967s3.zzl().n(new O3(c36967s3, j12));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setConditionalUserProperty(@j.N Bundle bundle, long j12) {
        zza();
        if (bundle == null) {
            S1 s12 = this.f354526a.f354717i;
            I2.c(s12);
            s12.f354889f.b("Conditional user property must not be null");
        } else {
            C36967s3 c36967s3 = this.f354526a.f354724p;
            I2.b(c36967s3);
            c36967s3.r(bundle, j12);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setConsent(@j.N final Bundle bundle, final long j12) {
        zza();
        final C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        c36967s3.zzl().o(new Runnable() { // from class: com.google.android.gms.measurement.internal.y3
            @Override // java.lang.Runnable
            public final void run() {
                C36967s3 c36967s32 = c36967s3;
                if (!TextUtils.isEmpty(c36967s32.f355183a.k().n())) {
                    c36967s32.zzj().f354894k.b("Using developer consent only; google app id found");
                } else {
                    c36967s32.n(0, j12, bundle);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setConsentThirdParty(@j.N Bundle bundle, long j12) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        c36967s3.n(-20, j12, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setCurrentScreen(@j.N com.google.android.gms.dynamic.d dVar, @j.N String str, @j.N String str2, long j12) {
        zza();
        C36934n4 c36934n4 = this.f354526a.f354723o;
        I2.b(c36934n4);
        c36934n4.p((Activity) com.google.android.gms.dynamic.f.g4(dVar), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setDataCollectionEnabled(boolean z12) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        c36967s3.i();
        c36967s3.zzl().n(new H3(c36967s3, z12));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setDefaultEventParameters(@j.N Bundle bundle) {
        zza();
        final C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        c36967s3.zzl().n(new Runnable() { // from class: com.google.android.gms.measurement.internal.v3
            @Override // java.lang.Runnable
            public final void run() {
                c36967s3.q(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setEventInterceptor(zzda zzdaVar) {
        zza();
        b bVar = new b(zzdaVar);
        A2 a22 = this.f354526a.f354718j;
        I2.c(a22);
        if (a22.p()) {
            C36967s3 c36967s3 = this.f354526a.f354724p;
            I2.b(c36967s3);
            c36967s3.w(bVar);
        } else {
            A2 a23 = this.f354526a.f354718j;
            I2.c(a23);
            a23.n(new E3(this, bVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setInstanceIdProvider(zzdb zzdbVar) {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setMeasurementEnabled(boolean z12, long j12) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        c36967s3.z(Boolean.valueOf(z12));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setMinimumSessionDuration(long j12) {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setSessionTimeoutDuration(long j12) {
        zza();
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        c36967s3.zzl().n(new J3(c36967s3, j12));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setUserId(@j.N final String str, long j12) {
        zza();
        final C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        if (str == null || !TextUtils.isEmpty(str)) {
            c36967s3.zzl().n(new Runnable() { // from class: com.google.android.gms.measurement.internal.z3
                @Override // java.lang.Runnable
                public final void run() {
                    C36967s3 c36967s32 = c36967s3;
                    M1 m1K = c36967s32.f355183a.k();
                    String str2 = m1K.f354800p;
                    String str3 = str;
                    boolean z12 = (str2 == null || str2.equals(str3)) ? false : true;
                    m1K.f354800p = str3;
                    if (z12) {
                        c36967s32.f355183a.k().o();
                    }
                }
            });
            c36967s3.H(null, "_id", str, true, j12);
        } else {
            S1 s12 = c36967s3.f355183a.f354717i;
            I2.c(s12);
            s12.f354892i.b("User ID must be non-empty or null");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setUserProperty(@j.N String str, @j.N String str2, @j.N com.google.android.gms.dynamic.d dVar, boolean z12, long j12) throws SecurityException {
        zza();
        Object objG4 = com.google.android.gms.dynamic.f.g4(dVar);
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        c36967s3.H(str, str2, objG4, z12, j12);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void unregisterOnMeasurementEventListener(zzda zzdaVar) {
        InterfaceC36933n3 aVar;
        zza();
        synchronized (this.f354527b) {
            aVar = (InterfaceC36933n3) this.f354527b.remove(Integer.valueOf(zzdaVar.zza()));
        }
        if (aVar == null) {
            aVar = new a(zzdaVar);
        }
        C36967s3 c36967s3 = this.f354526a.f354724p;
        I2.b(c36967s3);
        c36967s3.a0(aVar);
    }

    @InterfaceC49173d
    public final void zza() {
        if (this.f354526a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }
}
