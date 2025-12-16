package com.google.android.gms.internal.mlkit_common;

import NZ0.d;
import android.content.Context;
import android.content.res.Resources;
import androidx.core.os.C22779g;
import androidx.core.os.q;
import com.google.android.gms.common.internal.C36713l;
import com.google.android.gms.common.internal.C36726s;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.C37635d;
import com.google.mlkit.common.sdkinternal.C37640i;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.p;
import j.P;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class zzss {

    /* renamed from: i, reason: collision with root package name */
    @P
    public static zzaq f351726i;

    /* renamed from: j, reason: collision with root package name */
    public static final zzat f351727j = zzat.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    public final String f351728a;

    /* renamed from: b, reason: collision with root package name */
    public final String f351729b;

    /* renamed from: c, reason: collision with root package name */
    public final zzsk f351730c;

    /* renamed from: d, reason: collision with root package name */
    public final p f351731d;

    /* renamed from: e, reason: collision with root package name */
    public final Task f351732e;

    /* renamed from: f, reason: collision with root package name */
    public final Task f351733f;

    /* renamed from: g, reason: collision with root package name */
    public final String f351734g;

    /* renamed from: h, reason: collision with root package name */
    public final int f351735h;

    public zzss(Context context, final p pVar, zzsk zzskVar, String str) {
        new HashMap();
        new HashMap();
        this.f351728a = context.getPackageName();
        this.f351729b = C37635d.a(context);
        this.f351731d = pVar;
        this.f351730c = zzskVar;
        zztg.zza();
        this.f351734g = str;
        C37640i c37640iA = C37640i.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzsp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzss zzssVar = this.zza;
                zzssVar.getClass();
                return C36726s.f349457c.a(zzssVar.f351734g);
            }
        };
        c37640iA.getClass();
        this.f351732e = C37640i.b(callable);
        C37640i c37640iA2 = C37640i.a();
        pVar.getClass();
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzsq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return pVar.c();
            }
        };
        c37640iA2.getClass();
        this.f351733f = C37640i.b(callable2);
        zzat zzatVar = f351727j;
        this.f351735h = zzatVar.containsKey(str) ? DynamiteModule.d(context, (String) zzatVar.get(str), false) : -1;
    }

    public final zzre a(String str, String str2) {
        zzaq zzaqVarZzc;
        zzre zzreVar = new zzre();
        zzreVar.zzb(this.f351728a);
        zzreVar.zzc(this.f351729b);
        synchronized (zzss.class) {
            try {
                zzaqVarZzc = f351726i;
                if (zzaqVarZzc == null) {
                    q qVarA = C22779g.a(Resources.getSystem().getConfiguration());
                    zzan zzanVar = new zzan();
                    for (int i12 = 0; i12 < qVarA.d(); i12++) {
                        Locale localeB = qVarA.b(i12);
                        C36713l c36713l = C37635d.f362332a;
                        zzanVar.zzb(localeB.toLanguageTag());
                    }
                    zzaqVarZzc = zzanVar.zzc();
                    f351726i = zzaqVarZzc;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzreVar.zzh(zzaqVarZzc);
        zzreVar.zzg(Boolean.TRUE);
        zzreVar.zzl(str);
        zzreVar.zzj(str2);
        zzreVar.zzi(this.f351733f.r() ? (String) this.f351733f.n() : this.f351731d.c());
        zzreVar.zzd(10);
        zzreVar.zzk(Integer.valueOf(this.f351735h));
        return zzreVar;
    }

    public final void zzd(final zzsj zzsjVar, final zzng zzngVar) {
        Task task = this.f351732e;
        final String strA = task.r() ? (String) task.n() : C36726s.f349457c.a(this.f351734g);
        C37640i.c().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzso
            @Override // java.lang.Runnable
            public final void run() {
                zzss zzssVar = this.zza;
                zzsj zzsjVar2 = zzsjVar;
                zzng zzngVar2 = zzngVar;
                String str = strA;
                zzssVar.getClass();
                zzsjVar2.zza(zzngVar2);
                zzsjVar2.zzc(zzssVar.a(zzsjVar2.zzd(), str));
                zzssVar.f351730c.zza(zzsjVar2);
            }
        });
    }

    public final void zze(zzsj zzsjVar, d dVar, boolean z12, int i12) {
        zzst zzstVarZzh = zzsu.zzh();
        zzstVarZzh.zzf(false);
        zzstVarZzh.zzd(dVar.f11600b);
        zzstVarZzh.zza(zznl.FAILED);
        zzstVarZzh.zzb(zznf.DOWNLOAD_FAILED);
        zzstVarZzh.zzc(i12);
        zzg(zzsjVar, dVar, zzstVarZzh.zzh());
    }

    public final void zzf(zzsj zzsjVar, d dVar, zznf zznfVar, boolean z12, ModelType modelType, zznl zznlVar) {
        zzst zzstVarZzh = zzsu.zzh();
        zzstVarZzh.zzf(z12);
        zzstVarZzh.zzd(modelType);
        zzstVarZzh.zzb(zznfVar);
        zzstVarZzh.zza(zznlVar);
        zzg(zzsjVar, dVar, zzstVarZzh.zzh());
    }

    public final void zzg(final zzsj zzsjVar, final d dVar, final zzsu zzsuVar) {
        C37640i.c().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzsr
            @Override // java.lang.Runnable
            public final void run() {
                zzss zzssVar = this.zza;
                zzsj zzsjVar2 = zzsjVar;
                zzsu zzsuVar2 = zzsuVar;
                d dVar2 = dVar;
                zzssVar.getClass();
                zzsjVar2.zza(zzng.MODEL_DOWNLOAD);
                String strZze = zzsuVar2.zze();
                Task task = zzssVar.f351732e;
                zzsjVar2.zzc(zzssVar.a(strZze, task.r() ? (String) task.n() : C36726s.f349457c.a(zzssVar.f351734g)));
                zzsjVar2.zzb(zzte.zza(dVar2, zzssVar.f351731d, zzsuVar2));
                zzssVar.f351730c.zza(zzsjVar2);
            }
        });
    }
}
