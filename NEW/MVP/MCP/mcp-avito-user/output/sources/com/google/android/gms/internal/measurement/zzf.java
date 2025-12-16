package com.google.android.gms.internal.measurement;

import XY0.e;
import com.google.android.gms.internal.measurement.zzfp;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzf {

    /* renamed from: a, reason: collision with root package name */
    @e
    public final zzbb f350739a;

    /* renamed from: b, reason: collision with root package name */
    @e
    public final zzh f350740b;

    /* renamed from: c, reason: collision with root package name */
    @e
    public final zzh f350741c;

    /* renamed from: d, reason: collision with root package name */
    @e
    public final zzl f350742d;

    public zzf() {
        zzbb zzbbVar = new zzbb();
        this.f350739a = zzbbVar;
        zzh zzhVar = new zzh(null, zzbbVar);
        this.f350741c = zzhVar;
        this.f350740b = zzhVar.zza();
        zzl zzlVar = new zzl();
        this.f350742d = zzlVar;
        zzhVar.zzc("require", new zzz(zzlVar));
        zzlVar.zza("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.zze
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzy();
            }
        });
        zzhVar.zzc("runtime.counter", new zzai(Double.valueOf(0.0d)));
    }

    public final zzaq zza(zzh zzhVar, zzfp.zzd... zzdVarArr) {
        zzaq zzaqVarZza = zzaq.zzc;
        for (zzfp.zzd zzdVar : zzdVarArr) {
            zzaqVarZza = zzj.zza(zzdVar);
            zzg.zza(this.f350741c);
            if ((zzaqVarZza instanceof zzat) || (zzaqVarZza instanceof zzar)) {
                zzaqVarZza = this.f350739a.zza(zzhVar, zzaqVarZza);
            }
        }
        return zzaqVarZza;
    }

    public final void zza(String str, Callable<? extends zzal> callable) {
        this.f350742d.zza(str, callable);
    }
}
