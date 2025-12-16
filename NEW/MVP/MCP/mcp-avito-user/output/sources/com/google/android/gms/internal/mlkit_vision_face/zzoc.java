package com.google.android.gms.internal.mlkit_vision_face;

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

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzoc {

    /* renamed from: k, reason: collision with root package name */
    @P
    public static zzbn f353429k;

    /* renamed from: l, reason: collision with root package name */
    public static final zzbp f353430l = zzbp.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    public final String f353431a;

    /* renamed from: b, reason: collision with root package name */
    public final String f353432b;

    /* renamed from: c, reason: collision with root package name */
    public final zzob f353433c;

    /* renamed from: d, reason: collision with root package name */
    public final p f353434d;

    /* renamed from: e, reason: collision with root package name */
    public final Task f353435e;

    /* renamed from: f, reason: collision with root package name */
    public final Task f353436f;

    /* renamed from: g, reason: collision with root package name */
    public final String f353437g;

    /* renamed from: h, reason: collision with root package name */
    public final int f353438h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f353439i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f353440j = new HashMap();

    public zzoc(Context context, final p pVar, zzob zzobVar, String str) {
        this.f353431a = context.getPackageName();
        this.f353432b = C37635d.a(context);
        this.f353434d = pVar;
        this.f353433c = zzobVar;
        zzoo.zza();
        this.f353437g = str;
        C37640i c37640iA = C37640i.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_face.zznv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzoc zzocVar = this.zza;
                zzocVar.getClass();
                return C36726s.f349457c.a(zzocVar.f353437g);
            }
        };
        c37640iA.getClass();
        this.f353435e = C37640i.b(callable);
        C37640i c37640iA2 = C37640i.a();
        pVar.getClass();
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_face.zznw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return pVar.c();
            }
        };
        c37640iA2.getClass();
        this.f353436f = C37640i.b(callable2);
        zzbp zzbpVar = f353430l;
        this.f353438h = zzbpVar.containsKey(str) ? DynamiteModule.d(context, (String) zzbpVar.get(str), false) : -1;
    }

    @k0
    public static long a(ArrayList arrayList, double d12) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d12 / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    @l0
    public final String b() {
        Task task = this.f353435e;
        return task.r() ? (String) task.n() : C36726s.f349457c.a(this.f353437g);
    }

    @l0
    public final boolean c(zzkt zzktVar, long j12) {
        HashMap map = this.f353439i;
        return map.get(zzktVar) == null || j12 - ((Long) map.get(zzktVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    public final void zzd(zznr zznrVar, zzkt zzktVar) {
        zze(zznrVar, zzktVar, b());
    }

    public final void zze(final zznr zznrVar, final zzkt zzktVar, final String str) {
        C37640i.c().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_face.zznx
            @Override // java.lang.Runnable
            public final void run() {
                zzbn zzbnVarZzc;
                zzoc zzocVar = this.zza;
                zznr zznrVar2 = zznrVar;
                zzkt zzktVar2 = zzktVar;
                String str2 = str;
                zzocVar.getClass();
                zznrVar2.zzb(zzktVar2);
                String strZzd = zznrVar2.zzd();
                zzmt zzmtVar = new zzmt();
                zzmtVar.zzb(zzocVar.f353431a);
                zzmtVar.zzc(zzocVar.f353432b);
                synchronized (zzoc.class) {
                    try {
                        zzbnVarZzc = zzoc.f353429k;
                        if (zzbnVarZzc == null) {
                            q qVarA = C22779g.a(Resources.getSystem().getConfiguration());
                            zzbk zzbkVar = new zzbk();
                            for (int i12 = 0; i12 < qVarA.d(); i12++) {
                                Locale localeB = qVarA.b(i12);
                                C36713l c36713l = C37635d.f362332a;
                                zzbkVar.zzb(localeB.toLanguageTag());
                            }
                            zzbnVarZzc = zzbkVar.zzc();
                            zzoc.f353429k = zzbnVarZzc;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                zzmtVar.zzh(zzbnVarZzc);
                zzmtVar.zzg(Boolean.TRUE);
                zzmtVar.zzl(strZzd);
                zzmtVar.zzj(str2);
                zzmtVar.zzi(zzocVar.f353436f.r() ? (String) zzocVar.f353436f.n() : zzocVar.f353434d.c());
                zzmtVar.zzd(10);
                zzmtVar.zzk(Integer.valueOf(zzocVar.f353438h));
                zznrVar2.zzc(zzmtVar);
                zzocVar.f353433c.zza(zznrVar2);
            }
        });
    }

    @l0
    public final void zzf(zzoa zzoaVar, zzkt zzktVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c(zzktVar, jElapsedRealtime)) {
            this.f353439i.put(zzktVar, Long.valueOf(jElapsedRealtime));
            zze(zzoaVar.zza(), zzktVar, b());
        }
    }
}
