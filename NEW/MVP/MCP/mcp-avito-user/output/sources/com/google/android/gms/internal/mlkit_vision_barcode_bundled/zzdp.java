package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzdp extends zzdo {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo
    public final int a(Map.Entry entry) {
        return ((zzdz) entry.getKey()).f352438b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo
    public final zzds b(Object obj) {
        return ((zzdy) obj).zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo
    public final zzds c(Object obj) {
        return ((zzdy) obj).n();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo
    public final zzea d(zzdn zzdnVar, zzfl zzflVar, int i12) {
        return zzdnVar.zzb(zzflVar, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo
    public final void e(Object obj) {
        ((zzdy) obj).zza.zzg();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo
    public final boolean f(zzfl zzflVar) {
        return zzflVar instanceof zzdy;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo
    public final void g(zzdj zzdjVar, Map.Entry entry) {
        zzdz zzdzVar = (zzdz) entry.getKey();
        zzhf zzhfVar = zzhf.zza;
        int iOrdinal = zzdzVar.f352439c.ordinal();
        int i12 = zzdzVar.f352438b;
        switch (iOrdinal) {
            case 0:
                zzdjVar.zzf(i12, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                zzdjVar.zzo(i12, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                zzdjVar.zzt(i12, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                zzdjVar.zzK(i12, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                zzdjVar.zzr(i12, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                zzdjVar.zzm(i12, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                zzdjVar.zzk(i12, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                zzdjVar.zzb(i12, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                zzdjVar.zzG(i12, (String) entry.getValue());
                break;
            case 9:
                zzdjVar.zzq(i12, entry.getValue(), zzfu.zza().zzb(entry.getValue().getClass()));
                break;
            case 10:
                zzdjVar.zzv(i12, entry.getValue(), zzfu.zza().zzb(entry.getValue().getClass()));
                break;
            case 11:
                zzdjVar.zzd(i12, (zzdb) entry.getValue());
                break;
            case 12:
                zzdjVar.zzI(i12, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                zzdjVar.zzr(i12, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                zzdjVar.zzx(i12, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                zzdjVar.zzz(i12, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                zzdjVar.zzB(i12, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                zzdjVar.zzD(i12, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}
