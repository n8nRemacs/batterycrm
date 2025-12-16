package com.google.android.gms.internal.measurement;

import AK.c;
import XY0.e;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import v61.m;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzaf implements zzak, zzaq, Iterable<zzaq> {

    /* renamed from: b, reason: collision with root package name */
    @e
    public final TreeMap f350552b;

    /* renamed from: c, reason: collision with root package name */
    @e
    public final TreeMap f350553c;

    public zzaf() {
        this.f350552b = new TreeMap();
        this.f350553c = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaf)) {
            return false;
        }
        zzaf zzafVar = (zzaf) obj;
        if (zzb() != zzafVar.zzb()) {
            return false;
        }
        TreeMap treeMap = this.f350552b;
        if (treeMap.isEmpty()) {
            return zzafVar.f350552b.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!zza(iIntValue).equals(zzafVar.zza(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f350552b.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new zzah(this);
    }

    public final String toString() {
        return zzb(",");
    }

    public final int zza() {
        return this.f350552b.size();
    }

    public final int zzb() {
        TreeMap treeMap = this.f350552b;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        zzaf zzafVar = new zzaf();
        for (Map.Entry entry : this.f350552b.entrySet()) {
            boolean z12 = entry.getValue() instanceof zzak;
            TreeMap treeMap = zzafVar.f350552b;
            if (z12) {
                treeMap.put((Integer) entry.getKey(), (zzaq) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((zzaq) entry.getValue()).zzc());
            }
        }
        return zzafVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        TreeMap treeMap = this.f350552b;
        return treeMap.size() == 1 ? zza(0).zze() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return toString();
    }

    public final Iterator<Integer> zzg() {
        return this.f350552b.keySet().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return new zzae(this.f350552b.keySet().iterator(), this.f350553c.keySet().iterator());
    }

    public final List<zzaq> zzi() {
        ArrayList arrayList = new ArrayList(zzb());
        for (int i12 = 0; i12 < zzb(); i12++) {
            arrayList.add(zza(i12));
        }
        return arrayList;
    }

    public final void zzj() {
        this.f350552b.clear();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || SearchParamsConverterKt.SORT.equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? zzbe.zza(str, this, zzhVar, list) : zzan.zza(this, new zzas(str), zzhVar, list);
    }

    public final String zzb(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (!this.f350552b.isEmpty()) {
            for (int i12 = 0; i12 < zzb(); i12++) {
                zzaq zzaqVarZza = zza(i12);
                sb2.append(str);
                if (!(zzaqVarZza instanceof zzax) && !(zzaqVarZza instanceof zzao)) {
                    sb2.append(zzaqVarZza.zzf());
                }
            }
            sb2.delete(0, str.length());
        }
        return sb2.toString();
    }

    public zzaf(List<zzaq> list) {
        this();
        if (list != null) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                zzb(i12, list.get(i12));
            }
        }
    }

    public final boolean zzc(int i12) {
        if (i12 >= 0) {
            TreeMap treeMap = this.f350552b;
            if (i12 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i12));
            }
        }
        throw new IndexOutOfBoundsException(c.g(i12, "Out of bounds index: "));
    }

    public zzaf(zzaq... zzaqVarArr) {
        this((List<zzaq>) Arrays.asList(zzaqVarArr));
    }

    public final void zzb(int i12) {
        TreeMap treeMap = this.f350552b;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i12 > iIntValue || i12 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i12));
        if (i12 == iIntValue) {
            int i13 = i12 - 1;
            if (treeMap.containsKey(Integer.valueOf(i13)) || i13 < 0) {
                return;
            }
            treeMap.put(Integer.valueOf(i13), zzaq.zzc);
            return;
        }
        while (true) {
            i12++;
            if (i12 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            zzaq zzaqVar = (zzaq) treeMap.get(Integer.valueOf(i12));
            if (zzaqVar != null) {
                treeMap.put(Integer.valueOf(i12 - 1), zzaqVar);
                treeMap.remove(Integer.valueOf(i12));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean zzc(String str) {
        return "length".equals(str) || this.f350553c.containsKey(str);
    }

    @m
    public final void zzb(int i12, zzaq zzaqVar) {
        if (i12 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i12 >= 0) {
            TreeMap treeMap = this.f350552b;
            if (zzaqVar == null) {
                treeMap.remove(Integer.valueOf(i12));
                return;
            } else {
                treeMap.put(Integer.valueOf(i12), zzaqVar);
                return;
            }
        }
        throw new IndexOutOfBoundsException(c.g(i12, "Out of bounds index: "));
    }

    public final zzaq zza(int i12) {
        zzaq zzaqVar;
        if (i12 < zzb()) {
            return (!zzc(i12) || (zzaqVar = (zzaq) this.f350552b.get(Integer.valueOf(i12))) == null) ? zzaq.zzc : zzaqVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzaq zza(String str) {
        zzaq zzaqVar;
        if ("length".equals(str)) {
            return new zzai(Double.valueOf(zzb()));
        }
        return (!zzc(str) || (zzaqVar = (zzaq) this.f350553c.get(str)) == null) ? zzaq.zzc : zzaqVar;
    }

    public final void zza(zzaq zzaqVar) {
        zzb(zzb(), zzaqVar);
    }

    public final void zza(int i12, zzaq zzaqVar) {
        if (i12 >= 0) {
            if (i12 >= zzb()) {
                zzb(i12, zzaqVar);
                return;
            }
            TreeMap treeMap = this.f350552b;
            for (int iIntValue = ((Integer) treeMap.lastKey()).intValue(); iIntValue >= i12; iIntValue--) {
                zzaq zzaqVar2 = (zzaq) treeMap.get(Integer.valueOf(iIntValue));
                if (zzaqVar2 != null) {
                    zzb(iIntValue + 1, zzaqVar2);
                    treeMap.remove(Integer.valueOf(iIntValue));
                }
            }
            zzb(i12, zzaqVar);
            return;
        }
        throw new IllegalArgumentException(c.g(i12, "Invalid value index: "));
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void zza(String str, zzaq zzaqVar) {
        TreeMap treeMap = this.f350553c;
        if (zzaqVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, zzaqVar);
        }
    }
}
