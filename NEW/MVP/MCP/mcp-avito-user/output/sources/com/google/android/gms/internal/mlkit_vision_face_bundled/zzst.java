package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.core.os.C22779g;
import androidx.core.os.q;
import com.google.android.gms.common.internal.C36713l;
import com.google.android.gms.common.internal.C36726s;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.vision.face.mlkit.c;
import com.google.mlkit.common.sdkinternal.C37635d;
import com.google.mlkit.common.sdkinternal.C37640i;
import com.google.mlkit.common.sdkinternal.p;
import j.P;
import j.l0;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzst {

    /* renamed from: j, reason: collision with root package name */
    @P
    public static zzbj f353975j;

    /* renamed from: k, reason: collision with root package name */
    public static final zzbl f353976k = zzbl.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    public final String f353977a;

    /* renamed from: b, reason: collision with root package name */
    public final String f353978b;

    /* renamed from: c, reason: collision with root package name */
    public final zzsm f353979c;

    /* renamed from: d, reason: collision with root package name */
    public final p f353980d;

    /* renamed from: e, reason: collision with root package name */
    public final Task f353981e;

    /* renamed from: f, reason: collision with root package name */
    public final Task f353982f;

    /* renamed from: g, reason: collision with root package name */
    public final String f353983g;

    /* renamed from: h, reason: collision with root package name */
    public final int f353984h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f353985i = new HashMap();

    public zzst(Context context, final p pVar, zzsm zzsmVar, String str) {
        new HashMap();
        this.f353977a = context.getPackageName();
        this.f353978b = C37635d.a(context);
        this.f353980d = pVar;
        this.f353979c = zzsmVar;
        zztc.zza();
        this.f353983g = str;
        C37640i c37640iA = C37640i.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_face_bundled.zzsr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzst zzstVar = this.zza;
                zzstVar.getClass();
                return C36726s.f349457c.a(zzstVar.f353983g);
            }
        };
        c37640iA.getClass();
        this.f353981e = C37640i.b(callable);
        C37640i c37640iA2 = C37640i.a();
        Objects.requireNonNull(pVar);
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_face_bundled.zzss
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return pVar.c();
            }
        };
        c37640iA2.getClass();
        this.f353982f = C37640i.b(callable2);
        zzbl zzblVar = f353976k;
        this.f353984h = zzblVar.containsKey(str) ? DynamiteModule.d(context, (String) zzblVar.get(str), false) : -1;
    }

    @l0
    public final void zzc(c cVar, final zznw zznwVar) {
        HashMap map = this.f353985i;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (map.get(zznwVar) != null && jElapsedRealtime - ((Long) map.get(zznwVar)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        map.put(zznwVar, Long.valueOf(jElapsedRealtime));
        zznu zznuVar = cVar.f355707a;
        zznx zznxVar = new zznx();
        zznxVar.zzd(zznuVar);
        zzmv zzmvVar = new zzmv();
        zzmvVar.zzb(cVar.f355708b);
        zzmvVar.zza(cVar.f355709c);
        zznxVar.zzf(zzmvVar.zzc());
        final zzsl zzslVarZzf = zzsw.zzf(zznxVar, cVar.f355710d);
        Task task = this.f353981e;
        final String strA = task.r() ? (String) task.n() : C36726s.f349457c.a(this.f353983g);
        C37640i.c().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_face_bundled.zzsq
            @Override // java.lang.Runnable
            public final void run() {
                zzbj zzbjVarZzb;
                zzst zzstVar = this.zza;
                zzsl zzslVar = zzslVarZzf;
                zznw zznwVar2 = zznwVar;
                String str = strA;
                zzstVar.getClass();
                zzslVar.zzb(zznwVar2);
                String strZzd = zzslVar.zzd();
                zzrl zzrlVar = new zzrl();
                zzrlVar.zzb(zzstVar.f353977a);
                zzrlVar.zzc(zzstVar.f353978b);
                synchronized (zzst.class) {
                    try {
                        zzbjVarZzb = zzst.f353975j;
                        if (zzbjVarZzb == null) {
                            q qVarA = C22779g.a(Resources.getSystem().getConfiguration());
                            zzbg zzbgVar = new zzbg();
                            for (int i12 = 0; i12 < qVarA.d(); i12++) {
                                Locale localeB = qVarA.b(i12);
                                C36713l c36713l = C37635d.f362332a;
                                zzbgVar.zza(localeB.toLanguageTag());
                            }
                            zzbjVarZzb = zzbgVar.zzb();
                            zzst.f353975j = zzbjVarZzb;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                zzrlVar.zzh(zzbjVarZzb);
                zzrlVar.zzg(Boolean.TRUE);
                zzrlVar.zzl(strZzd);
                zzrlVar.zzj(str);
                zzrlVar.zzi(zzstVar.f353982f.r() ? (String) zzstVar.f353982f.n() : zzstVar.f353980d.c());
                zzrlVar.zzd(10);
                zzrlVar.zzk(Integer.valueOf(zzstVar.f353984h));
                zzslVar.zzc(zzrlVar);
                zzstVar.f353979c.zza(zzslVar);
            }
        });
    }
}
