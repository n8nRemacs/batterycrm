package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzk extends zzal {

    /* renamed from: d, reason: collision with root package name */
    public final zzac f350909d;

    public zzk(zzac zzacVar) {
        super("internal.eventLogger");
        this.f350909d = zzacVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        zzg.zza(this.f350560b, 3, list);
        String strZzf = zzhVar.zza(list.get(0)).zzf();
        long jZza = (long) zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue());
        zzaq zzaqVarZza = zzhVar.zza(list.get(2));
        this.f350909d.zza(strZzf, jZza, zzaqVarZza instanceof zzap ? zzg.zza((zzap) zzaqVarZza) : new HashMap<>());
        return zzaq.zzc;
    }
}
