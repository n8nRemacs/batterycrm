package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.List;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzdj {

    /* renamed from: a, reason: collision with root package name */
    public final zzdi f352414a;

    public zzdj(zzdi zzdiVar) {
        Charset charset = zzel.f352447a;
        this.f352414a = zzdiVar;
        zzdiVar.f352413a = this;
    }

    public static zzdj zza(zzdi zzdiVar) {
        zzdj zzdjVar = zzdiVar.f352413a;
        return zzdjVar != null ? zzdjVar : new zzdj(zzdiVar);
    }

    public final void zzA(int i12, List list, boolean z12) {
        int i13 = 0;
        zzdi zzdiVar = this.f352414a;
        if (!z12) {
            while (i13 < list.size()) {
                zzdiVar.zzh(i12, ((Long) list.get(i13)).longValue());
                i13++;
            }
            return;
        }
        zzdiVar.zzo(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Long) list.get(i15)).getClass();
            i14 += 8;
        }
        zzdiVar.zzq(i14);
        while (i13 < list.size()) {
            zzdiVar.zzi(((Long) list.get(i13)).longValue());
            i13++;
        }
    }

    public final void zzB(int i12, int i13) {
        this.f352414a.zzp(i12, (i13 >> 31) ^ (i13 + i13));
    }

    public final void zzC(int i12, List list, boolean z12) {
        int i13 = 0;
        zzdi zzdiVar = this.f352414a;
        if (!z12) {
            while (i13 < list.size()) {
                int iIntValue = ((Integer) list.get(i13)).intValue();
                zzdiVar.zzp(i12, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i13++;
            }
            return;
        }
        zzdiVar.zzo(i12, 2);
        int iZzD = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            int iIntValue2 = ((Integer) list.get(i14)).intValue();
            iZzD += zzdi.zzD((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        zzdiVar.zzq(iZzD);
        while (i13 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i13)).intValue();
            zzdiVar.zzq((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i13++;
        }
    }

    public final void zzD(int i12, long j12) {
        this.f352414a.zzr(i12, (j12 >> 63) ^ (j12 + j12));
    }

    public final void zzE(int i12, List list, boolean z12) {
        int i13 = 0;
        zzdi zzdiVar = this.f352414a;
        if (!z12) {
            while (i13 < list.size()) {
                long jLongValue = ((Long) list.get(i13)).longValue();
                zzdiVar.zzr(i12, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i13++;
            }
            return;
        }
        zzdiVar.zzo(i12, 2);
        int iZzE = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            long jLongValue2 = ((Long) list.get(i14)).longValue();
            iZzE += zzdi.zzE((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        zzdiVar.zzq(iZzE);
        while (i13 < list.size()) {
            long jLongValue3 = ((Long) list.get(i13)).longValue();
            zzdiVar.zzs((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i13++;
        }
    }

    @Deprecated
    public final void zzF(int i12) {
        this.f352414a.zzo(i12, 3);
    }

    public final void zzG(int i12, String str) {
        this.f352414a.zzm(i12, str);
    }

    public final void zzH(int i12, List list) {
        boolean z12 = list instanceof zzev;
        int i13 = 0;
        zzdi zzdiVar = this.f352414a;
        if (!z12) {
            while (i13 < list.size()) {
                zzdiVar.zzm(i12, (String) list.get(i13));
                i13++;
            }
            return;
        }
        zzev zzevVar = (zzev) list;
        while (i13 < list.size()) {
            Object objZzf = zzevVar.zzf(i13);
            if (objZzf instanceof String) {
                zzdiVar.zzm(i12, (String) objZzf);
            } else {
                zzdiVar.zze(i12, (zzdb) objZzf);
            }
            i13++;
        }
    }

    public final void zzI(int i12, int i13) {
        this.f352414a.zzp(i12, i13);
    }

    public final void zzJ(int i12, List list, boolean z12) {
        int i13 = 0;
        zzdi zzdiVar = this.f352414a;
        if (!z12) {
            while (i13 < list.size()) {
                zzdiVar.zzp(i12, ((Integer) list.get(i13)).intValue());
                i13++;
            }
            return;
        }
        zzdiVar.zzo(i12, 2);
        int iZzD = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzD += zzdi.zzD(((Integer) list.get(i14)).intValue());
        }
        zzdiVar.zzq(iZzD);
        while (i13 < list.size()) {
            zzdiVar.zzq(((Integer) list.get(i13)).intValue());
            i13++;
        }
    }

    public final void zzK(int i12, long j12) {
        this.f352414a.zzr(i12, j12);
    }

    public final void zzL(int i12, List list, boolean z12) {
        int i13 = 0;
        zzdi zzdiVar = this.f352414a;
        if (!z12) {
            while (i13 < list.size()) {
                zzdiVar.zzr(i12, ((Long) list.get(i13)).longValue());
                i13++;
            }
            return;
        }
        zzdiVar.zzo(i12, 2);
        int iZzE = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzE += zzdi.zzE(((Long) list.get(i14)).longValue());
        }
        zzdiVar.zzq(iZzE);
        while (i13 < list.size()) {
            zzdiVar.zzs(((Long) list.get(i13)).longValue());
            i13++;
        }
    }

    public final void zzb(int i12, boolean z12) {
        this.f352414a.zzd(i12, z12);
    }

    public final void zzc(int i12, List list, boolean z12) {
        int i13 = 0;
        zzdi zzdiVar = this.f352414a;
        if (!z12) {
            while (i13 < list.size()) {
                zzdiVar.zzd(i12, ((Boolean) list.get(i13)).booleanValue());
                i13++;
            }
            return;
        }
        zzdiVar.zzo(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Boolean) list.get(i15)).getClass();
            i14++;
        }
        zzdiVar.zzq(i14);
        while (i13 < list.size()) {
            zzdiVar.zzb(((Boolean) list.get(i13)).booleanValue() ? (byte) 1 : (byte) 0);
            i13++;
        }
    }

    public final void zzd(int i12, zzdb zzdbVar) {
        this.f352414a.zze(i12, zzdbVar);
    }

    public final void zze(int i12, List list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            this.f352414a.zze(i12, (zzdb) list.get(i13));
        }
    }

    public final void zzf(int i12, double d12) {
        this.f352414a.zzh(i12, Double.doubleToRawLongBits(d12));
    }

    public final void zzg(int i12, List list, boolean z12) {
        int i13 = 0;
        zzdi zzdiVar = this.f352414a;
        if (!z12) {
            while (i13 < list.size()) {
                zzdiVar.zzh(i12, Double.doubleToRawLongBits(((Double) list.get(i13)).doubleValue()));
                i13++;
            }
            return;
        }
        zzdiVar.zzo(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Double) list.get(i15)).getClass();
            i14 += 8;
        }
        zzdiVar.zzq(i14);
        while (i13 < list.size()) {
            zzdiVar.zzi(Double.doubleToRawLongBits(((Double) list.get(i13)).doubleValue()));
            i13++;
        }
    }

    @Deprecated
    public final void zzh(int i12) {
        this.f352414a.zzo(i12, 4);
    }

    public final void zzi(int i12, int i13) {
        this.f352414a.zzj(i12, i13);
    }

    public final void zzj(int i12, List list, boolean z12) {
        int i13 = 0;
        zzdi zzdiVar = this.f352414a;
        if (!z12) {
            while (i13 < list.size()) {
                zzdiVar.zzj(i12, ((Integer) list.get(i13)).intValue());
                i13++;
            }
            return;
        }
        zzdiVar.zzo(i12, 2);
        int iZzx = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzx += zzdi.zzx(((Integer) list.get(i14)).intValue());
        }
        zzdiVar.zzq(iZzx);
        while (i13 < list.size()) {
            zzdiVar.zzk(((Integer) list.get(i13)).intValue());
            i13++;
        }
    }

    public final void zzk(int i12, int i13) {
        this.f352414a.zzf(i12, i13);
    }

    public final void zzl(int i12, List list, boolean z12) {
        int i13 = 0;
        zzdi zzdiVar = this.f352414a;
        if (!z12) {
            while (i13 < list.size()) {
                zzdiVar.zzf(i12, ((Integer) list.get(i13)).intValue());
                i13++;
            }
            return;
        }
        zzdiVar.zzo(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Integer) list.get(i15)).getClass();
            i14 += 4;
        }
        zzdiVar.zzq(i14);
        while (i13 < list.size()) {
            zzdiVar.zzg(((Integer) list.get(i13)).intValue());
            i13++;
        }
    }

    public final void zzm(int i12, long j12) {
        this.f352414a.zzh(i12, j12);
    }

    public final void zzn(int i12, List list, boolean z12) {
        int i13 = 0;
        zzdi zzdiVar = this.f352414a;
        if (!z12) {
            while (i13 < list.size()) {
                zzdiVar.zzh(i12, ((Long) list.get(i13)).longValue());
                i13++;
            }
            return;
        }
        zzdiVar.zzo(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Long) list.get(i15)).getClass();
            i14 += 8;
        }
        zzdiVar.zzq(i14);
        while (i13 < list.size()) {
            zzdiVar.zzi(((Long) list.get(i13)).longValue());
            i13++;
        }
    }

    public final void zzo(int i12, float f12) {
        this.f352414a.zzf(i12, Float.floatToRawIntBits(f12));
    }

    public final void zzp(int i12, List list, boolean z12) {
        int i13 = 0;
        zzdi zzdiVar = this.f352414a;
        if (!z12) {
            while (i13 < list.size()) {
                zzdiVar.zzf(i12, Float.floatToRawIntBits(((Float) list.get(i13)).floatValue()));
                i13++;
            }
            return;
        }
        zzdiVar.zzo(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Float) list.get(i15)).getClass();
            i14 += 4;
        }
        zzdiVar.zzq(i14);
        while (i13 < list.size()) {
            zzdiVar.zzg(Float.floatToRawIntBits(((Float) list.get(i13)).floatValue()));
            i13++;
        }
    }

    public final void zzq(int i12, Object obj, zzgb zzgbVar) {
        zzdi zzdiVar = this.f352414a;
        zzdiVar.zzo(i12, 3);
        zzgbVar.zzm((zzfl) obj, zzdiVar.f352413a);
        zzdiVar.zzo(i12, 4);
    }

    public final void zzr(int i12, int i13) {
        this.f352414a.zzj(i12, i13);
    }

    public final void zzs(int i12, List list, boolean z12) {
        int i13 = 0;
        zzdi zzdiVar = this.f352414a;
        if (!z12) {
            while (i13 < list.size()) {
                zzdiVar.zzj(i12, ((Integer) list.get(i13)).intValue());
                i13++;
            }
            return;
        }
        zzdiVar.zzo(i12, 2);
        int iZzx = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzx += zzdi.zzx(((Integer) list.get(i14)).intValue());
        }
        zzdiVar.zzq(iZzx);
        while (i13 < list.size()) {
            zzdiVar.zzk(((Integer) list.get(i13)).intValue());
            i13++;
        }
    }

    public final void zzt(int i12, long j12) {
        this.f352414a.zzr(i12, j12);
    }

    public final void zzu(int i12, List list, boolean z12) {
        int i13 = 0;
        zzdi zzdiVar = this.f352414a;
        if (!z12) {
            while (i13 < list.size()) {
                zzdiVar.zzr(i12, ((Long) list.get(i13)).longValue());
                i13++;
            }
            return;
        }
        zzdiVar.zzo(i12, 2);
        int iZzE = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzE += zzdi.zzE(((Long) list.get(i14)).longValue());
        }
        zzdiVar.zzq(iZzE);
        while (i13 < list.size()) {
            zzdiVar.zzs(((Long) list.get(i13)).longValue());
            i13++;
        }
    }

    public final void zzv(int i12, Object obj, zzgb zzgbVar) {
        Object obj2 = (zzfl) obj;
        zzdg zzdgVar = (zzdg) this.f352414a;
        zzdgVar.zzq((i12 << 3) | 2);
        zzck zzckVar = (zzck) obj2;
        int iA2 = zzckVar.a();
        if (iA2 == -1) {
            iA2 = zzgbVar.zza(zzckVar);
            zzckVar.b(iA2);
        }
        zzdgVar.zzq(iA2);
        zzgbVar.zzm(obj2, zzdgVar.f352413a);
    }

    public final void zzw(int i12, Object obj) {
        boolean z12 = obj instanceof zzdb;
        zzdi zzdiVar = this.f352414a;
        if (z12) {
            zzdg zzdgVar = (zzdg) zzdiVar;
            zzdgVar.zzq(11);
            zzdgVar.zzp(2, i12);
            zzdgVar.zze(3, (zzdb) obj);
            zzdgVar.zzq(12);
            return;
        }
        zzfl zzflVar = (zzfl) obj;
        zzdg zzdgVar2 = (zzdg) zzdiVar;
        zzdgVar2.zzq(11);
        zzdgVar2.zzp(2, i12);
        zzdgVar2.zzq(26);
        zzdgVar2.zzq(zzflVar.zzE());
        zzflVar.zzW(zzdiVar);
        zzdgVar2.zzq(12);
    }

    public final void zzx(int i12, int i13) {
        this.f352414a.zzf(i12, i13);
    }

    public final void zzy(int i12, List list, boolean z12) {
        int i13 = 0;
        zzdi zzdiVar = this.f352414a;
        if (!z12) {
            while (i13 < list.size()) {
                zzdiVar.zzf(i12, ((Integer) list.get(i13)).intValue());
                i13++;
            }
            return;
        }
        zzdiVar.zzo(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Integer) list.get(i15)).getClass();
            i14 += 4;
        }
        zzdiVar.zzq(i14);
        while (i13 < list.size()) {
            zzdiVar.zzg(((Integer) list.get(i13)).intValue());
            i13++;
        }
    }

    public final void zzz(int i12, long j12) {
        this.f352414a.zzh(i12, j12);
    }
}
