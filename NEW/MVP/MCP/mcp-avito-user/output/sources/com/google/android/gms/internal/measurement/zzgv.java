package com.google.android.gms.internal.measurement;

import I41.h;
import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import androidx.appcompat.app.r;
import androidx.collection.C20199a;
import androidx.core.content.m;
import com.google.android.gms.internal.measurement.zzgr;
import com.google.common.base.H;
import com.google.common.base.M;
import com.google.common.base.e0;
import com.google.common.base.f0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public abstract class zzgv<T> {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f350809g = new Object();

    /* renamed from: h, reason: collision with root package name */
    @h
    public static volatile zzgd f350810h;

    /* renamed from: i, reason: collision with root package name */
    public static final zzhg f350811i;

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicInteger f350812j;

    /* renamed from: a, reason: collision with root package name */
    public final zzhd f350813a;

    /* renamed from: b, reason: collision with root package name */
    public final String f350814b;

    /* renamed from: c, reason: collision with root package name */
    public final T f350815c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f350816d;

    /* renamed from: e, reason: collision with root package name */
    public volatile T f350817e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f350818f;

    static {
        new AtomicReference();
        f350811i = new zzhg(new zzhj() { // from class: com.google.android.gms.internal.measurement.zzgw
            @Override // com.google.android.gms.internal.measurement.zzhj
            public final boolean zza() {
                Object obj = zzgv.f350809g;
                return true;
            }
        });
        f350812j = new AtomicInteger();
    }

    public zzgv() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzgv(zzhd zzhdVar, String str, Object obj, boolean z12, zzhf zzhfVar) {
        this.f350816d = -1;
        zzhdVar.getClass();
        if (zzhdVar.f350824a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f350813a = zzhdVar;
        this.f350814b = str;
        this.f350815c = obj;
        this.f350818f = true;
    }

    public static void zzc() {
        f350812j.incrementAndGet();
    }

    @h
    public final Object a(zzgd zzgdVar) {
        zzgo zzgoVar;
        String strQ;
        if (!this.f350813a.f350827d) {
            Context context = zzgdVar.f350784a;
            synchronized (zzgo.class) {
                try {
                    if (zzgo.f350802c == null) {
                        zzgo.f350802c = m.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzgo(context) : new zzgo();
                    }
                    zzgoVar = zzgo.f350802c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zzhd zzhdVar = this.f350813a;
            if (zzhdVar.f350827d) {
                strQ = null;
            } else {
                String str = zzhdVar.f350825b;
                strQ = this.f350814b;
                if (str == null || !str.isEmpty()) {
                    strQ = r.q(str, strQ);
                }
            }
            Object objZza = zzgoVar.zza(strQ);
            if (objZza != null) {
                return b(objZza);
            }
        }
        return null;
    }

    public abstract T b(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @h
    public final Object c(zzgd zzgdVar) {
        zzhe zzheVar;
        zzgj zzgjVarZza;
        Object objZza;
        zzhd zzhdVar = this.f350813a;
        Uri uri = zzhdVar.f350824a;
        if (uri == null) {
            Context context = zzgdVar.f350784a;
            zzhdVar.getClass();
            zzgu zzguVar = new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgu
                @Override // java.lang.Runnable
                public final void run() {
                    zzgv.zzc();
                }
            };
            C20199a c20199a = zzhe.f350829b;
            if (zzge.zza()) {
                throw null;
            }
            synchronized (zzhe.class) {
                zzheVar = (zzhe) zzhe.f350829b.get(null);
                if (zzheVar == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th2;
                    }
                }
            }
            zzgjVarZza = zzheVar;
        } else if (zzgt.zza(zzgdVar.f350784a, uri)) {
            this.f350813a.getClass();
            zzgjVarZza = zzgg.zza(zzgdVar.f350784a.getContentResolver(), this.f350813a.f350824a, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgu
                @Override // java.lang.Runnable
                public final void run() {
                    zzgv.zzc();
                }
            });
        } else {
            zzgjVarZza = null;
        }
        if (zzgjVarZza == null || (objZza = zzgjVarZza.zza(zzb())) == null) {
            return null;
        }
        return b(objZza);
    }

    public final T zza() {
        if (!this.f350818f) {
            M.n("Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.", f350811i.zza(this.f350814b));
        }
        int i12 = f350812j.get();
        if (this.f350816d < i12) {
            synchronized (this) {
                try {
                    if (this.f350816d < i12) {
                        zzgd zzgdVar = f350810h;
                        H<zzgp> hA2 = H.a();
                        String strZza = null;
                        if (zzgdVar != null) {
                            hA2 = zzgdVar.f350785b.get();
                            if (hA2.c()) {
                                zzgp zzgpVarB = hA2.b();
                                zzhd zzhdVar = this.f350813a;
                                strZza = zzgpVarB.zza(zzhdVar.f350824a, null, zzhdVar.f350826c, this.f350814b);
                            }
                        }
                        M.n("Must call PhenotypeFlagInitializer.maybeInit() first", zzgdVar != null);
                        this.f350813a.getClass();
                        T tB2 = (T) c(zzgdVar);
                        if (tB2 == null && (tB2 = (T) a(zzgdVar)) == null) {
                            tB2 = this.f350815c;
                        }
                        if (hA2.c()) {
                            tB2 = strZza == null ? this.f350815c : b(strZza);
                        }
                        this.f350817e = tB2;
                        this.f350816d = i12;
                    }
                } finally {
                }
            }
        }
        return this.f350817e;
    }

    public final String zzb() {
        String str = this.f350813a.f350826c;
        String str2 = this.f350814b;
        return (str == null || !str.isEmpty()) ? r.q(str, str2) : str2;
    }

    public static void zzb(final Context context) {
        Context context2;
        if (f350810h != null || context == null) {
            return;
        }
        Object obj = f350809g;
        synchronized (obj) {
            try {
                if (f350810h == null) {
                    synchronized (obj) {
                        zzgd zzgdVar = f350810h;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzgdVar == null || zzgdVar.f350784a != context) {
                            zzgg.a();
                            zzhe.a();
                            synchronized (zzgo.class) {
                                try {
                                    zzgo zzgoVar = zzgo.f350802c;
                                    if (zzgoVar != null && (context2 = zzgoVar.f350803a) != null && zzgoVar.f350804b != null) {
                                        context2.getContentResolver().unregisterContentObserver(zzgo.f350802c.f350804b);
                                    }
                                    zzgo.f350802c = null;
                                } finally {
                                }
                            }
                            f350810h = new zzgd(context, f0.a(new e0() { // from class: com.google.android.gms.internal.measurement.zzgx
                                @Override // com.google.common.base.e0
                                public final Object get() {
                                    Object obj2 = zzgv.f350809g;
                                    return zzgr.zza.zza(context);
                                }
                            }));
                            f350812j.incrementAndGet();
                        }
                    }
                }
            } finally {
            }
        }
    }
}
