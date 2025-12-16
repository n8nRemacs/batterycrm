package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzw extends zzal {

    /* renamed from: d, reason: collision with root package name */
    public final zzaa f351173d;

    public zzw(zzaa zzaaVar) {
        super("internal.registerCallback");
        this.f351173d = zzaaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        zzg.zza(this.f350560b, 3, list);
        String strZzf = zzhVar.zza(list.get(0)).zzf();
        zzaq zzaqVarZza = zzhVar.zza(list.get(1));
        if (!(zzaqVarZza instanceof zzar)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        zzaq zzaqVarZza2 = zzhVar.zza(list.get(2));
        if (!(zzaqVarZza2 instanceof zzap)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        zzap zzapVar = (zzap) zzaqVarZza2;
        if (!zzapVar.zzc("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f351173d.zza(strZzf, zzapVar.zzc("priority") ? zzg.zzb(zzapVar.zza("priority").zze().doubleValue()) : 1000, (zzar) zzaqVarZza, zzapVar.zza("type").zzf());
        return zzaq.zzc;
    }
}
