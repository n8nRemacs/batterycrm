package com.google.android.gms.internal.mlkit_common;

import NZ0.d;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C36713l;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.p;
import j.l0;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class zzte {

    /* renamed from: a, reason: collision with root package name */
    public static final C36713l f351742a = new C36713l("RemoteModelUtils", "");

    @l0
    public static zznn zza(d dVar, p pVar, zzsu zzsuVar) {
        long jElapsedRealtime;
        ModelType modelTypeZzb = zzsuVar.zzb();
        dVar.getClass();
        zznt zzntVar = new zznt();
        zzno zznoVar = new zzno();
        String str = dVar.f11599a;
        if (str == null) {
            str = (String) d.f11598c.get(null);
        }
        zznoVar.zzc(str);
        zznoVar.zzd(zznq.CLOUD);
        zznoVar.zza(zzaf.zzb(null));
        int iOrdinal = modelTypeZzb.ordinal();
        zznoVar.zzb(iOrdinal != 2 ? iOrdinal != 4 ? iOrdinal != 5 ? zznp.TYPE_UNKNOWN : zznp.BASE_DIGITAL_INK : zznp.CUSTOM : zznp.BASE_TRANSLATE);
        zzntVar.zzb(zznoVar.zzg());
        zznw zznwVarZzc = zzntVar.zzc();
        zznk zznkVar = new zznk();
        zznkVar.zzd(zzsuVar.zzc());
        zznkVar.zzc(zzsuVar.zzd());
        zznkVar.zzb(Long.valueOf(zzsuVar.zza()));
        zznkVar.zzf(zznwVarZzc);
        if (zzsuVar.zzg()) {
            long jD2 = pVar.d(dVar);
            if (jD2 == 0) {
                f351742a.c("Model downloaded without its beginning time recorded.");
            } else {
                synchronized (pVar) {
                    jElapsedRealtime = pVar.e().getLong("model_first_use_time_" + dVar.a(), 0L);
                }
                if (jElapsedRealtime == 0) {
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    synchronized (pVar) {
                        pVar.e().edit().putLong("model_first_use_time_" + dVar.a(), jElapsedRealtime).apply();
                    }
                }
                zznkVar.zzg(Long.valueOf(jElapsedRealtime - jD2));
            }
        }
        if (zzsuVar.zzf()) {
            long jD3 = pVar.d(dVar);
            if (jD3 == 0) {
                f351742a.c("Model downloaded without its beginning time recorded.");
            } else {
                zznkVar.zze(Long.valueOf(SystemClock.elapsedRealtime() - jD3));
            }
        }
        return zznkVar.zzi();
    }
}
