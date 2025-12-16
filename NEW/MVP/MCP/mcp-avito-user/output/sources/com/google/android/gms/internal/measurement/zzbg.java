package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzbg extends zzay {
    public zzbg() {
        this.f350574a.add(zzbv.AND);
        this.f350574a.add(zzbv.NOT);
        this.f350574a.add(zzbv.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        int i12 = zzbj.f350586a[zzg.zza(str).ordinal()];
        if (i12 == 1) {
            zzg.zza(zzbv.AND, 2, list);
            zzaq zzaqVarZza = zzhVar.zza(list.get(0));
            return !zzaqVarZza.zzd().booleanValue() ? zzaqVarZza : zzhVar.zza(list.get(1));
        }
        if (i12 == 2) {
            zzg.zza(zzbv.NOT, 1, list);
            return new zzag(Boolean.valueOf(!zzhVar.zza(list.get(0)).zzd().booleanValue()));
        }
        if (i12 != 3) {
            a(str);
            throw null;
        }
        zzg.zza(zzbv.OR, 2, list);
        zzaq zzaqVarZza2 = zzhVar.zza(list.get(0));
        return zzaqVarZza2.zzd().booleanValue() ? zzaqVarZza2 : zzhVar.zza(list.get(1));
    }
}
