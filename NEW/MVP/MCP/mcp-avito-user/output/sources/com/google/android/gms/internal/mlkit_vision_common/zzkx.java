package com.google.android.gms.internal.mlkit_vision_common;

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
import j.l0;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
public final class zzkx {

    /* renamed from: j, reason: collision with root package name */
    @P
    public static zzp f352893j;

    /* renamed from: k, reason: collision with root package name */
    public static final zzr f352894k = zzr.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    public final String f352895a;

    /* renamed from: b, reason: collision with root package name */
    public final String f352896b;

    /* renamed from: c, reason: collision with root package name */
    public final zzkw f352897c;

    /* renamed from: d, reason: collision with root package name */
    public final p f352898d;

    /* renamed from: e, reason: collision with root package name */
    public final Task f352899e;

    /* renamed from: f, reason: collision with root package name */
    public final Task f352900f;

    /* renamed from: g, reason: collision with root package name */
    public final String f352901g;

    /* renamed from: h, reason: collision with root package name */
    public final int f352902h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f352903i = new HashMap();

    public zzkx(Context context, final p pVar, zzkw zzkwVar, String str) {
        new HashMap();
        this.f352895a = context.getPackageName();
        this.f352896b = C37635d.a(context);
        this.f352898d = pVar;
        this.f352897c = zzkwVar;
        zzlk.zza();
        this.f352901g = str;
        C37640i c37640iA = C37640i.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzkt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzkx zzkxVar = this.zza;
                zzkxVar.getClass();
                return C36726s.f349457c.a(zzkxVar.f352901g);
            }
        };
        c37640iA.getClass();
        this.f352899e = C37640i.b(callable);
        C37640i c37640iA2 = C37640i.a();
        pVar.getClass();
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzku
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return pVar.c();
            }
        };
        c37640iA2.getClass();
        this.f352900f = C37640i.b(callable2);
        zzr zzrVar = f352894k;
        this.f352902h = zzrVar.containsKey(str) ? DynamiteModule.d(context, (String) zzrVar.get(str), false) : -1;
    }

    @l0
    public final void zzc(zzlh zzlhVar, final zzhs zzhsVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f352903i;
        if (map.get(zzhsVar) != null && jElapsedRealtime - ((Long) map.get(zzhsVar)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        map.put(zzhsVar, Long.valueOf(jElapsedRealtime));
        int i12 = zzlhVar.zza;
        int i13 = zzlhVar.zzb;
        int i14 = zzlhVar.zzc;
        int i15 = zzlhVar.zzd;
        int i16 = zzlhVar.zze;
        long j12 = zzlhVar.zzf;
        int i17 = zzlhVar.zzg;
        zzhk zzhkVar = new zzhk();
        zzhkVar.zzd(i12 != -1 ? i12 != 35 ? i12 != 842094169 ? i12 != 16 ? i12 != 17 ? zzhg.UNKNOWN_FORMAT : zzhg.NV21 : zzhg.NV16 : zzhg.YV12 : zzhg.YUV_420_888 : zzhg.BITMAP);
        zzhkVar.zzf(i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? zzhl.ANDROID_MEDIA_IMAGE : zzhl.FILEPATH : zzhl.BYTEBUFFER : zzhl.BYTEARRAY : zzhl.BITMAP);
        zzhkVar.zzc(Integer.valueOf(i14));
        zzhkVar.zze(Integer.valueOf(i15));
        zzhkVar.zzg(Integer.valueOf(i16));
        zzhkVar.zzb(Long.valueOf(j12));
        zzhkVar.zzh(Integer.valueOf(i17));
        zzhn zzhnVarZzj = zzhkVar.zzj();
        zzht zzhtVar = new zzht();
        zzhtVar.zzd(zzhnVarZzj);
        final zzkp zzkpVarZze = zzky.zze(zzhtVar);
        Task task = this.f352899e;
        final String strA = task.r() ? (String) task.n() : C36726s.f349457c.a(this.f352901g);
        C37640i.c().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzkv
            @Override // java.lang.Runnable
            public final void run() {
                zzp zzpVarZzc;
                zzkx zzkxVar = this.zza;
                zzkp zzkpVar = zzkpVarZze;
                zzhs zzhsVar2 = zzhsVar;
                String str = strA;
                zzkxVar.getClass();
                zzkpVar.zza(zzhsVar2);
                String strZzc = zzkpVar.zzc();
                zzjo zzjoVar = new zzjo();
                zzjoVar.zzb(zzkxVar.f352895a);
                zzjoVar.zzc(zzkxVar.f352896b);
                synchronized (zzkx.class) {
                    try {
                        zzpVarZzc = zzkx.f352893j;
                        if (zzpVarZzc == null) {
                            q qVarA = C22779g.a(Resources.getSystem().getConfiguration());
                            zzm zzmVar = new zzm();
                            for (int i18 = 0; i18 < qVarA.d(); i18++) {
                                Locale localeB = qVarA.b(i18);
                                C36713l c36713l = C37635d.f362332a;
                                zzmVar.zzb(localeB.toLanguageTag());
                            }
                            zzpVarZzc = zzmVar.zzc();
                            zzkx.f352893j = zzpVarZzc;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                zzjoVar.zzh(zzpVarZzc);
                zzjoVar.zzg(Boolean.TRUE);
                zzjoVar.zzl(strZzc);
                zzjoVar.zzj(str);
                zzjoVar.zzi(zzkxVar.f352900f.r() ? (String) zzkxVar.f352900f.n() : zzkxVar.f352898d.c());
                zzjoVar.zzd(10);
                zzjoVar.zzk(Integer.valueOf(zzkxVar.f352902h));
                zzkpVar.zzb(zzjoVar);
                zzkxVar.f352897c.zza(zzkpVar);
            }
        });
    }
}
