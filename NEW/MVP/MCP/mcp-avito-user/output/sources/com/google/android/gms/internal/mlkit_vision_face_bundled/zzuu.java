package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.nio.charset.Charset;
import java.util.List;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzuu implements zzyo {

    /* renamed from: a, reason: collision with root package name */
    public final zzut f354039a;

    public zzuu(zzut zzutVar) {
        Charset charset = zzvt.f354067a;
        this.f354039a = zzutVar;
        zzutVar.f354038a = this;
    }

    public static zzuu zza(zzut zzutVar) {
        zzuu zzuuVar = zzutVar.f354038a;
        return zzuuVar != null ? zzuuVar : new zzuu(zzutVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzA(int i12, List list, boolean z12) {
        int i13 = 0;
        zzut zzutVar = this.f354039a;
        if (!z12) {
            while (i13 < list.size()) {
                zzutVar.zzh(i12, ((Long) list.get(i13)).longValue());
                i13++;
            }
            return;
        }
        zzutVar.zzo(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Long) list.get(i15)).getClass();
            i14 += 8;
        }
        zzutVar.zzq(i14);
        while (i13 < list.size()) {
            zzutVar.zzi(((Long) list.get(i13)).longValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzB(int i12, int i13) {
        this.f354039a.zzp(i12, (i13 >> 31) ^ (i13 + i13));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzC(int i12, List list, boolean z12) {
        int i13 = 0;
        zzut zzutVar = this.f354039a;
        if (!z12) {
            while (i13 < list.size()) {
                int iIntValue = ((Integer) list.get(i13)).intValue();
                zzutVar.zzp(i12, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i13++;
            }
            return;
        }
        zzutVar.zzo(i12, 2);
        int iZzw = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            int iIntValue2 = ((Integer) list.get(i14)).intValue();
            iZzw += zzut.zzw((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        zzutVar.zzq(iZzw);
        while (i13 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i13)).intValue();
            zzutVar.zzq((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzD(int i12, long j12) {
        this.f354039a.zzr(i12, (j12 >> 63) ^ (j12 + j12));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzE(int i12, List list, boolean z12) {
        int i13 = 0;
        zzut zzutVar = this.f354039a;
        if (!z12) {
            while (i13 < list.size()) {
                long jLongValue = ((Long) list.get(i13)).longValue();
                zzutVar.zzr(i12, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i13++;
            }
            return;
        }
        zzutVar.zzo(i12, 2);
        int iZzx = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            long jLongValue2 = ((Long) list.get(i14)).longValue();
            iZzx += zzut.zzx((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        zzutVar.zzq(iZzx);
        while (i13 < list.size()) {
            long jLongValue3 = ((Long) list.get(i13)).longValue();
            zzutVar.zzs((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    @Deprecated
    public final void zzF(int i12) {
        this.f354039a.zzo(i12, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzG(int i12, String str) {
        this.f354039a.zzm(i12, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzH(int i12, List list) {
        boolean z12 = list instanceof zzwa;
        int i13 = 0;
        zzut zzutVar = this.f354039a;
        if (!z12) {
            while (i13 < list.size()) {
                zzutVar.zzm(i12, (String) list.get(i13));
                i13++;
            }
            return;
        }
        zzwa zzwaVar = (zzwa) list;
        while (i13 < list.size()) {
            Object objZzf = zzwaVar.zzf(i13);
            if (objZzf instanceof String) {
                zzutVar.zzm(i12, (String) objZzf);
            } else {
                zzutVar.zze(i12, (zzul) objZzf);
            }
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzI(int i12, int i13) {
        this.f354039a.zzp(i12, i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzJ(int i12, List list, boolean z12) {
        int i13 = 0;
        zzut zzutVar = this.f354039a;
        if (!z12) {
            while (i13 < list.size()) {
                zzutVar.zzp(i12, ((Integer) list.get(i13)).intValue());
                i13++;
            }
            return;
        }
        zzutVar.zzo(i12, 2);
        int iZzw = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzw += zzut.zzw(((Integer) list.get(i14)).intValue());
        }
        zzutVar.zzq(iZzw);
        while (i13 < list.size()) {
            zzutVar.zzq(((Integer) list.get(i13)).intValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzK(int i12, long j12) {
        this.f354039a.zzr(i12, j12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzL(int i12, List list, boolean z12) {
        int i13 = 0;
        zzut zzutVar = this.f354039a;
        if (!z12) {
            while (i13 < list.size()) {
                zzutVar.zzr(i12, ((Long) list.get(i13)).longValue());
                i13++;
            }
            return;
        }
        zzutVar.zzo(i12, 2);
        int iZzx = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzx += zzut.zzx(((Long) list.get(i14)).longValue());
        }
        zzutVar.zzq(iZzx);
        while (i13 < list.size()) {
            zzutVar.zzs(((Long) list.get(i13)).longValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzb(int i12, boolean z12) {
        this.f354039a.zzd(i12, z12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzc(int i12, List list, boolean z12) {
        int i13 = 0;
        zzut zzutVar = this.f354039a;
        if (!z12) {
            while (i13 < list.size()) {
                zzutVar.zzd(i12, ((Boolean) list.get(i13)).booleanValue());
                i13++;
            }
            return;
        }
        zzutVar.zzo(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Boolean) list.get(i15)).getClass();
            i14++;
        }
        zzutVar.zzq(i14);
        while (i13 < list.size()) {
            zzutVar.zzb(((Boolean) list.get(i13)).booleanValue() ? (byte) 1 : (byte) 0);
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzd(int i12, zzul zzulVar) {
        this.f354039a.zze(i12, zzulVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zze(int i12, List list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            this.f354039a.zze(i12, (zzul) list.get(i13));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzf(int i12, double d12) {
        this.f354039a.zzh(i12, Double.doubleToRawLongBits(d12));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzg(int i12, List list, boolean z12) {
        int i13 = 0;
        zzut zzutVar = this.f354039a;
        if (!z12) {
            while (i13 < list.size()) {
                zzutVar.zzh(i12, Double.doubleToRawLongBits(((Double) list.get(i13)).doubleValue()));
                i13++;
            }
            return;
        }
        zzutVar.zzo(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Double) list.get(i15)).getClass();
            i14 += 8;
        }
        zzutVar.zzq(i14);
        while (i13 < list.size()) {
            zzutVar.zzi(Double.doubleToRawLongBits(((Double) list.get(i13)).doubleValue()));
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    @Deprecated
    public final void zzh(int i12) {
        this.f354039a.zzo(i12, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzi(int i12, int i13) {
        this.f354039a.zzj(i12, i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzj(int i12, List list, boolean z12) {
        int i13 = 0;
        zzut zzutVar = this.f354039a;
        if (!z12) {
            while (i13 < list.size()) {
                zzutVar.zzj(i12, ((Integer) list.get(i13)).intValue());
                i13++;
            }
            return;
        }
        zzutVar.zzo(i12, 2);
        int iZzx = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzx += zzut.zzx(((Integer) list.get(i14)).intValue());
        }
        zzutVar.zzq(iZzx);
        while (i13 < list.size()) {
            zzutVar.zzk(((Integer) list.get(i13)).intValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzk(int i12, int i13) {
        this.f354039a.zzf(i12, i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzl(int i12, List list, boolean z12) {
        int i13 = 0;
        zzut zzutVar = this.f354039a;
        if (!z12) {
            while (i13 < list.size()) {
                zzutVar.zzf(i12, ((Integer) list.get(i13)).intValue());
                i13++;
            }
            return;
        }
        zzutVar.zzo(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Integer) list.get(i15)).getClass();
            i14 += 4;
        }
        zzutVar.zzq(i14);
        while (i13 < list.size()) {
            zzutVar.zzg(((Integer) list.get(i13)).intValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzm(int i12, long j12) {
        this.f354039a.zzh(i12, j12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzn(int i12, List list, boolean z12) {
        int i13 = 0;
        zzut zzutVar = this.f354039a;
        if (!z12) {
            while (i13 < list.size()) {
                zzutVar.zzh(i12, ((Long) list.get(i13)).longValue());
                i13++;
            }
            return;
        }
        zzutVar.zzo(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Long) list.get(i15)).getClass();
            i14 += 8;
        }
        zzutVar.zzq(i14);
        while (i13 < list.size()) {
            zzutVar.zzi(((Long) list.get(i13)).longValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzo(int i12, float f12) {
        this.f354039a.zzf(i12, Float.floatToRawIntBits(f12));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzp(int i12, List list, boolean z12) {
        int i13 = 0;
        zzut zzutVar = this.f354039a;
        if (!z12) {
            while (i13 < list.size()) {
                zzutVar.zzf(i12, Float.floatToRawIntBits(((Float) list.get(i13)).floatValue()));
                i13++;
            }
            return;
        }
        zzutVar.zzo(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Float) list.get(i15)).getClass();
            i14 += 4;
        }
        zzutVar.zzq(i14);
        while (i13 < list.size()) {
            zzutVar.zzg(Float.floatToRawIntBits(((Float) list.get(i13)).floatValue()));
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzq(int i12, Object obj, zzxf zzxfVar) {
        zzut zzutVar = this.f354039a;
        zzutVar.zzo(i12, 3);
        zzxfVar.zzi((zzws) obj, zzutVar.f354038a);
        zzutVar.zzo(i12, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzr(int i12, int i13) {
        this.f354039a.zzj(i12, i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzs(int i12, List list, boolean z12) {
        int i13 = 0;
        zzut zzutVar = this.f354039a;
        if (!z12) {
            while (i13 < list.size()) {
                zzutVar.zzj(i12, ((Integer) list.get(i13)).intValue());
                i13++;
            }
            return;
        }
        zzutVar.zzo(i12, 2);
        int iZzx = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzx += zzut.zzx(((Integer) list.get(i14)).intValue());
        }
        zzutVar.zzq(iZzx);
        while (i13 < list.size()) {
            zzutVar.zzk(((Integer) list.get(i13)).intValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzt(int i12, long j12) {
        this.f354039a.zzr(i12, j12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzu(int i12, List list, boolean z12) {
        int i13 = 0;
        zzut zzutVar = this.f354039a;
        if (!z12) {
            while (i13 < list.size()) {
                zzutVar.zzr(i12, ((Long) list.get(i13)).longValue());
                i13++;
            }
            return;
        }
        zzutVar.zzo(i12, 2);
        int iZzx = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzx += zzut.zzx(((Long) list.get(i14)).longValue());
        }
        zzutVar.zzq(iZzx);
        while (i13 < list.size()) {
            zzutVar.zzs(((Long) list.get(i13)).longValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzv(int i12, Object obj, zzxf zzxfVar) {
        zzws zzwsVar = (zzws) obj;
        zzuq zzuqVar = (zzuq) this.f354039a;
        zzuqVar.zzq((i12 << 3) | 2);
        zzuqVar.zzq(((zztu) zzwsVar).a(zzxfVar));
        zzxfVar.zzi(zzwsVar, zzuqVar.f354038a);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzw(int i12, Object obj) {
        boolean z12 = obj instanceof zzul;
        zzut zzutVar = this.f354039a;
        if (z12) {
            zzuq zzuqVar = (zzuq) zzutVar;
            zzuqVar.zzq(11);
            zzuqVar.zzp(2, i12);
            zzuqVar.zze(3, (zzul) obj);
            zzuqVar.zzq(12);
            return;
        }
        zzws zzwsVar = (zzws) obj;
        zzuq zzuqVar2 = (zzuq) zzutVar;
        zzuqVar2.zzq(11);
        zzuqVar2.zzp(2, i12);
        zzuqVar2.zzq(26);
        zzuqVar2.zzq(zzwsVar.zzu());
        zzwsVar.zzL(zzutVar);
        zzuqVar2.zzq(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzx(int i12, int i13) {
        this.f354039a.zzf(i12, i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzy(int i12, List list, boolean z12) {
        int i13 = 0;
        zzut zzutVar = this.f354039a;
        if (!z12) {
            while (i13 < list.size()) {
                zzutVar.zzf(i12, ((Integer) list.get(i13)).intValue());
                i13++;
            }
            return;
        }
        zzutVar.zzo(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Integer) list.get(i15)).getClass();
            i14 += 4;
        }
        zzutVar.zzq(i14);
        while (i13 < list.size()) {
            zzutVar.zzg(((Integer) list.get(i13)).intValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo
    public final void zzz(int i12, long j12) {
        this.f354039a.zzh(i12, j12);
    }
}
