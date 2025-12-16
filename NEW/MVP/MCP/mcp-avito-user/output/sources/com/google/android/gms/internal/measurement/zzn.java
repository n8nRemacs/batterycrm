package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzn extends zzap {

    /* renamed from: c, reason: collision with root package name */
    public final zzac f351008c;

    public zzn(zzac zzacVar) {
        this.f351008c = zzacVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzap, com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        zzac zzacVar;
        str.getClass();
        zzacVar = this.f351008c;
        switch (str) {
            case "getEventName":
                zzg.zza("getEventName", 0, list);
                return new zzas(zzacVar.zzb().zzb());
            case "getTimestamp":
                zzg.zza("getTimestamp", 0, list);
                return new zzai(Double.valueOf(zzacVar.zzb().zza()));
            case "getParamValue":
                zzg.zza("getParamValue", 1, list);
                return zzj.zza(zzacVar.zzb().zza(zzhVar.zza(list.get(0)).zzf()));
            case "getParams":
                zzg.zza("getParams", 0, list);
                Map<String, Object> mapZzc = zzacVar.zzb().zzc();
                zzap zzapVar = new zzap();
                for (String str2 : mapZzc.keySet()) {
                    zzapVar.zza(str2, zzj.zza(mapZzc.get(str2)));
                }
                return zzapVar;
            case "setParamValue":
                zzg.zza("setParamValue", 2, list);
                String strZzf = zzhVar.zza(list.get(0)).zzf();
                zzaq zzaqVarZza = zzhVar.zza(list.get(1));
                zzacVar.zzb().zza(strZzf, zzg.zza(zzaqVarZza));
                return zzaqVarZza;
            case "setEventName":
                zzg.zza("setEventName", 1, list);
                zzaq zzaqVarZza2 = zzhVar.zza(list.get(0));
                if (zzaq.zzc.equals(zzaqVarZza2) || zzaq.zzd.equals(zzaqVarZza2)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                zzacVar.zzb().zzb(zzaqVarZza2.zzf());
                return new zzas(zzaqVarZza2.zzf());
            default:
                return super.zza(str, zzhVar, list);
        }
    }
}
