package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.core.os.C22779g;
import androidx.core.os.q;
import com.google.android.gms.common.internal.C36713l;
import com.google.android.gms.common.internal.C36726s;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.C37635d;
import com.google.mlkit.common.sdkinternal.C37640i;
import com.google.mlkit.common.sdkinternal.p;
import j.P;
import j.k0;
import j.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zznm {

    /* renamed from: k, reason: collision with root package name */
    @P
    public static zzcc f352202k;

    /* renamed from: l, reason: collision with root package name */
    public static final zzce f352203l = zzce.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    public static final /* synthetic */ int zza = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f352204a;

    /* renamed from: b, reason: collision with root package name */
    public final String f352205b;

    /* renamed from: c, reason: collision with root package name */
    public final zznl f352206c;

    /* renamed from: d, reason: collision with root package name */
    public final p f352207d;

    /* renamed from: e, reason: collision with root package name */
    public final Task f352208e;

    /* renamed from: f, reason: collision with root package name */
    public final Task f352209f;

    /* renamed from: g, reason: collision with root package name */
    public final String f352210g;

    /* renamed from: h, reason: collision with root package name */
    public final int f352211h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f352212i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f352213j = new HashMap();

    public zznm(Context context, final p pVar, zznl zznlVar, final String str) {
        this.f352204a = context.getPackageName();
        this.f352205b = C37635d.a(context);
        this.f352207d = pVar;
        this.f352206c = zznlVar;
        this.f352210g = str;
        C37640i c37640iA = C37640i.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zznj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                zzcc zzccVar = zznm.f352202k;
                return C36726s.f349457c.a(str2);
            }
        };
        c37640iA.getClass();
        this.f352208e = C37640i.b(callable);
        C37640i c37640iA2 = C37640i.a();
        pVar.getClass();
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzni
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return pVar.c();
            }
        };
        c37640iA2.getClass();
        this.f352209f = C37640i.b(callable2);
        zzce zzceVar = f352203l;
        this.f352211h = zzceVar.containsKey(str) ? DynamiteModule.d(context, (String) zzceVar.get(str), false) : -1;
    }

    @k0
    public static long a(ArrayList arrayList, double d12) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d12 / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    @l0
    public final String b() {
        Task task = this.f352208e;
        return task.r() ? (String) task.n() : C36726s.f349457c.a(this.f352210g);
    }

    @l0
    public final boolean c(zzkk zzkkVar, long j12) {
        HashMap map = this.f352212i;
        return map.get(zzkkVar) == null || j12 - ((Long) map.get(zzkkVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    @l0
    public final void zzb(zznk zznkVar, zzkk zzkkVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c(zzkkVar, jElapsedRealtime)) {
            this.f352212i.put(zzkkVar, Long.valueOf(jElapsedRealtime));
            zzf(zznkVar.zza(), zzkkVar, b());
        }
    }

    public final void zze(zznp zznpVar, zzkk zzkkVar) {
        zzf(zznpVar, zzkkVar, b());
    }

    public final void zzf(final zznp zznpVar, final zzkk zzkkVar, final String str) {
        final byte[] bArr = null;
        C37640i.c().execute(new Runnable(zznpVar, zzkkVar, str, bArr) { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zznh
            public final /* synthetic */ zzkk zzb;
            public final /* synthetic */ String zzc;
            public final /* synthetic */ zznp zzd;

            @Override // java.lang.Runnable
            public final void run() {
                zzcc zzccVarZzf;
                zznm zznmVar = this.zza;
                zznp zznpVar2 = this.zzd;
                zzkk zzkkVar2 = this.zzb;
                String str2 = this.zzc;
                zznmVar.getClass();
                zznpVar2.zzf(zzkkVar2);
                String strZzb = zznpVar2.zzb();
                zzmc zzmcVar = new zzmc();
                zzmcVar.zzb(zznmVar.f352204a);
                zzmcVar.zzc(zznmVar.f352205b);
                synchronized (zznm.class) {
                    try {
                        zzccVarZzf = zznm.f352202k;
                        if (zzccVarZzf == null) {
                            q qVarA = C22779g.a(Resources.getSystem().getConfiguration());
                            zzbz zzbzVar = new zzbz();
                            for (int i12 = 0; i12 < qVarA.d(); i12++) {
                                Locale localeB = qVarA.b(i12);
                                C36713l c36713l = C37635d.f362332a;
                                zzbzVar.zzd(localeB.toLanguageTag());
                            }
                            zzccVarZzf = zzbzVar.zzf();
                            zznm.f352202k = zzccVarZzf;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                zzmcVar.zzh(zzccVarZzf);
                zzmcVar.zzg(Boolean.TRUE);
                zzmcVar.zzl(strZzb);
                zzmcVar.zzj(str2);
                zzmcVar.zzi(zznmVar.f352209f.r() ? (String) zznmVar.f352209f.n() : zznmVar.f352207d.c());
                zzmcVar.zzd(10);
                zzmcVar.zzk(Integer.valueOf(zznmVar.f352211h));
                zznpVar2.zzg(zzmcVar);
                zznmVar.f352206c.zza(zznpVar2);
            }
        });
    }
}
