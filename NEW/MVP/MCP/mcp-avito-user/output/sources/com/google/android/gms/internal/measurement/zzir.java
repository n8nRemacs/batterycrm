package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzir implements zzne {

    /* renamed from: a, reason: collision with root package name */
    public final zzio f350870a;

    public zzir(zzio zzioVar) {
        Charset charset = zzjh.f350896a;
        this.f350870a = zzioVar;
        zzioVar.f350864a = this;
    }

    public static zzir zza(zzio zzioVar) {
        zzir zzirVar = zzioVar.f350864a;
        return zzirVar != null ? zzirVar : new zzir(zzioVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzb(int i12, List<Double> list, boolean z12) {
        int i13 = 0;
        zzio zzioVar = this.f350870a;
        if (!z12) {
            while (i13 < list.size()) {
                zzioVar.zzb(i12, list.get(i13).doubleValue());
                i13++;
            }
            return;
        }
        zzioVar.zzc(i12, 2);
        int iZza = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZza += zzio.zza(list.get(i14).doubleValue());
        }
        zzioVar.zzc(iZza);
        while (i13 < list.size()) {
            zzioVar.zzb(list.get(i13).doubleValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzc(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        zzio zzioVar = this.f350870a;
        if (!z12) {
            while (i13 < list.size()) {
                zzioVar.zzb(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        zzioVar.zzc(i12, 2);
        int iZzd = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzd += zzio.zzd(list.get(i14).intValue());
        }
        zzioVar.zzc(iZzd);
        while (i13 < list.size()) {
            zzioVar.zzb(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzd(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        zzio zzioVar = this.f350870a;
        if (!z12) {
            while (i13 < list.size()) {
                zzioVar.zza(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        zzioVar.zzc(i12, 2);
        int iZze = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZze += zzio.zze(list.get(i14).intValue());
        }
        zzioVar.zzc(iZze);
        while (i13 < list.size()) {
            zzioVar.zza(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zze(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        zzio zzioVar = this.f350870a;
        if (!z12) {
            while (i13 < list.size()) {
                zzioVar.zza(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        zzioVar.zzc(i12, 2);
        int iZzc = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzc += zzio.zzc(list.get(i14).longValue());
        }
        zzioVar.zzc(iZzc);
        while (i13 < list.size()) {
            zzioVar.zza(list.get(i13).longValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzf(int i12, List<Float> list, boolean z12) {
        int i13 = 0;
        zzio zzioVar = this.f350870a;
        if (!z12) {
            while (i13 < list.size()) {
                zzioVar.zzb(i12, list.get(i13).floatValue());
                i13++;
            }
            return;
        }
        zzioVar.zzc(i12, 2);
        int iZza = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZza += zzio.zza(list.get(i14).floatValue());
        }
        zzioVar.zzc(iZza);
        while (i13 < list.size()) {
            zzioVar.zzb(list.get(i13).floatValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzg(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        zzio zzioVar = this.f350870a;
        if (!z12) {
            while (i13 < list.size()) {
                zzioVar.zzb(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        zzioVar.zzc(i12, 2);
        int iZzf = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzf += zzio.zzf(list.get(i14).intValue());
        }
        zzioVar.zzc(iZzf);
        while (i13 < list.size()) {
            zzioVar.zzb(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzh(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        zzio zzioVar = this.f350870a;
        if (!z12) {
            while (i13 < list.size()) {
                zzioVar.zzb(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        zzioVar.zzc(i12, 2);
        int iZzd = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzd += zzio.zzd(list.get(i14).longValue());
        }
        zzioVar.zzc(iZzd);
        while (i13 < list.size()) {
            zzioVar.zzb(list.get(i13).longValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzi(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        zzio zzioVar = this.f350870a;
        if (!z12) {
            while (i13 < list.size()) {
                zzioVar.zza(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        zzioVar.zzc(i12, 2);
        int iZzg = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzg += zzio.zzg(list.get(i14).intValue());
        }
        zzioVar.zzc(iZzg);
        while (i13 < list.size()) {
            zzioVar.zza(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzj(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        zzio zzioVar = this.f350870a;
        if (!z12) {
            while (i13 < list.size()) {
                zzioVar.zza(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        zzioVar.zzc(i12, 2);
        int iZze = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZze += zzio.zze(list.get(i14).longValue());
        }
        zzioVar.zzc(iZze);
        while (i13 < list.size()) {
            zzioVar.zza(list.get(i13).longValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzk(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        zzio zzioVar = this.f350870a;
        if (!z12) {
            while (i13 < list.size()) {
                zzioVar.zzk(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        zzioVar.zzc(i12, 2);
        int iZzh = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzh += zzio.zzh(list.get(i14).intValue());
        }
        zzioVar.zzc(iZzh);
        while (i13 < list.size()) {
            zzioVar.zzk(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzl(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        zzio zzioVar = this.f350870a;
        if (!z12) {
            while (i13 < list.size()) {
                zzioVar.zzh(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        zzioVar.zzc(i12, 2);
        int iZzf = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzf += zzio.zzf(list.get(i14).longValue());
        }
        zzioVar.zzc(iZzf);
        while (i13 < list.size()) {
            zzioVar.zzh(list.get(i13).longValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzm(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        zzio zzioVar = this.f350870a;
        if (!z12) {
            while (i13 < list.size()) {
                zzioVar.zzd(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        zzioVar.zzc(i12, 2);
        int iZzj = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzj += zzio.zzj(list.get(i14).intValue());
        }
        zzioVar.zzc(iZzj);
        while (i13 < list.size()) {
            zzioVar.zzc(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzn(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        zzio zzioVar = this.f350870a;
        if (!z12) {
            while (i13 < list.size()) {
                zzioVar.zzb(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        zzioVar.zzc(i12, 2);
        int iZzg = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iZzg += zzio.zzg(list.get(i14).longValue());
        }
        zzioVar.zzc(iZzg);
        while (i13 < list.size()) {
            zzioVar.zzb(list.get(i13).longValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final int zza() {
        return zznh.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i12, boolean z12) {
        this.f350870a.zza(i12, z12);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i12, List<Boolean> list, boolean z12) {
        int i13 = 0;
        zzio zzioVar = this.f350870a;
        if (z12) {
            zzioVar.zzc(i12, 2);
            int iZza = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                iZza += zzio.zza(list.get(i14).booleanValue());
            }
            zzioVar.zzc(iZza);
            while (i13 < list.size()) {
                zzioVar.zzb(list.get(i13).booleanValue());
                i13++;
            }
            return;
        }
        while (i13 < list.size()) {
            zzioVar.zza(i12, list.get(i13).booleanValue());
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzb(int i12, int i13) {
        this.f350870a.zza(i12, i13);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzd(int i12, int i13) {
        this.f350870a.zza(i12, i13);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zze(int i12, int i13) {
        this.f350870a.zzk(i12, i13);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzf(int i12, int i13) {
        this.f350870a.zzd(i12, i13);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzb(int i12, long j12) {
        this.f350870a.zzb(i12, j12);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zze(int i12, long j12) {
        this.f350870a.zzb(i12, j12);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzc(int i12, int i13) {
        this.f350870a.zzb(i12, i13);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzd(int i12, long j12) {
        this.f350870a.zzh(i12, j12);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzb(int i12, Object obj, zzlj zzljVar) {
        this.f350870a.a(i12, (zzkr) obj, zzljVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzc(int i12, long j12) {
        this.f350870a.zza(i12, j12);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i12, zzhu zzhuVar) {
        this.f350870a.zza(i12, zzhuVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzb(int i12, List<?> list, zzlj zzljVar) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            zzb(i12, list.get(i13), zzljVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i12, List<zzhu> list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            this.f350870a.zza(i12, list.get(i13));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    @Deprecated
    public final void zzb(int i12) {
        this.f350870a.zzc(i12, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i12, double d12) {
        this.f350870a.zzb(i12, d12);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzb(int i12, List<String> list) {
        boolean z12 = list instanceof zzjx;
        int i13 = 0;
        zzio zzioVar = this.f350870a;
        if (z12) {
            zzjx zzjxVar = (zzjx) list;
            while (i13 < list.size()) {
                Object objZzb = zzjxVar.zzb(i13);
                if (objZzb instanceof String) {
                    zzioVar.zza(i12, (String) objZzb);
                } else {
                    zzioVar.zza(i12, (zzhu) objZzb);
                }
                i13++;
            }
            return;
        }
        while (i13 < list.size()) {
            zzioVar.zza(i12, list.get(i13));
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    @Deprecated
    public final void zza(int i12) {
        this.f350870a.zzc(i12, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i12, int i13) {
        this.f350870a.zzb(i12, i13);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i12, long j12) {
        this.f350870a.zza(i12, j12);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i12, float f12) {
        this.f350870a.zzb(i12, f12);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i12, Object obj, zzlj zzljVar) {
        zzio zzioVar = this.f350870a;
        zzioVar.zzc(i12, 3);
        zzljVar.zza((zzlj) obj, (zzne) zzioVar.f350864a);
        zzioVar.zzc(i12, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i12, List<?> list, zzlj zzljVar) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            zza(i12, list.get(i13), zzljVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final <K, V> void zza(int i12, zzkm<K, V> zzkmVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            zzio zzioVar = this.f350870a;
            zzioVar.zzc(i12, 2);
            zzioVar.zzc(zziy.a(zzkmVar.zza, 1, entry.getKey()) + zziy.a(zzkmVar.zzc, 2, entry.getValue()));
            K key = entry.getKey();
            V value = entry.getValue();
            zziy.e(zzioVar, zzkmVar.zza, 1, key);
            zziy.e(zzioVar, zzkmVar.zzc, 2, value);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i12, Object obj) {
        boolean z12 = obj instanceof zzhu;
        zzio zzioVar = this.f350870a;
        if (z12) {
            zzioVar.zzb(i12, (zzhu) obj);
        } else {
            zzioVar.zza(i12, (zzkr) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i12, String str) {
        this.f350870a.zza(i12, str);
    }
}
