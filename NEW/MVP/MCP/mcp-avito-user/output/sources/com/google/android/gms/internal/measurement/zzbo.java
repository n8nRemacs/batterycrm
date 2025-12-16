package com.google.android.gms.internal.measurement;

import androidx.appcompat.app.r;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzbo extends zzay {
    public zzbo() {
        this.f350574a.add(zzbv.ADD);
        this.f350574a.add(zzbv.DIVIDE);
        this.f350574a.add(zzbv.MODULUS);
        this.f350574a.add(zzbv.MULTIPLY);
        this.f350574a.add(zzbv.NEGATE);
        this.f350574a.add(zzbv.POST_DECREMENT);
        this.f350574a.add(zzbv.POST_INCREMENT);
        this.f350574a.add(zzbv.PRE_DECREMENT);
        this.f350574a.add(zzbv.PRE_INCREMENT);
        this.f350574a.add(zzbv.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        switch (zzbr.f350594a[zzg.zza(str).ordinal()]) {
            case 1:
                zzg.zza(zzbv.ADD, 2, list);
                zzaq zzaqVarZza = zzhVar.zza(list.get(0));
                zzaq zzaqVarZza2 = zzhVar.zza(list.get(1));
                if ((zzaqVarZza instanceof zzak) || (zzaqVarZza instanceof zzas) || (zzaqVarZza2 instanceof zzak) || (zzaqVarZza2 instanceof zzas)) {
                    return new zzas(r.q(zzaqVarZza.zzf(), zzaqVarZza2.zzf()));
                }
                return new zzai(Double.valueOf(zzaqVarZza2.zze().doubleValue() + zzaqVarZza.zze().doubleValue()));
            case 2:
                zzg.zza(zzbv.DIVIDE, 2, list);
                return new zzai(Double.valueOf(zzhVar.zza(list.get(0)).zze().doubleValue() / zzhVar.zza(list.get(1)).zze().doubleValue()));
            case 3:
                zzg.zza(zzbv.MODULUS, 2, list);
                return new zzai(Double.valueOf(zzhVar.zza(list.get(0)).zze().doubleValue() % zzhVar.zza(list.get(1)).zze().doubleValue()));
            case 4:
                zzg.zza(zzbv.MULTIPLY, 2, list);
                return new zzai(Double.valueOf(zzhVar.zza(list.get(0)).zze().doubleValue() * zzhVar.zza(list.get(1)).zze().doubleValue()));
            case 5:
                zzg.zza(zzbv.NEGATE, 1, list);
                return new zzai(Double.valueOf(zzhVar.zza(list.get(0)).zze().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                zzg.zza(str, 2, list);
                zzaq zzaqVarZza3 = zzhVar.zza(list.get(0));
                zzhVar.zza(list.get(1));
                return zzaqVarZza3;
            case 8:
            case 9:
                zzg.zza(str, 1, list);
                return zzhVar.zza(list.get(0));
            case 10:
                zzg.zza(zzbv.SUBTRACT, 2, list);
                zzaq zzaqVarZza4 = zzhVar.zza(list.get(0));
                zzai zzaiVar = new zzai(Double.valueOf(zzhVar.zza(list.get(1)).zze().doubleValue() * (-1.0d)));
                return new zzai(Double.valueOf(zzaiVar.zze().doubleValue() + zzaqVarZza4.zze().doubleValue()));
            default:
                a(str);
                throw null;
        }
    }
}
