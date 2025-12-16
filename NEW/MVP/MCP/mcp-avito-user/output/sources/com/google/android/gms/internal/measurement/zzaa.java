package com.google.android.gms.internal.measurement;

import XY0.e;
import androidx.camera.camera2.internal.G;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzaa {

    /* renamed from: a, reason: collision with root package name */
    @e
    public final TreeMap<Integer, zzar> f350541a = new TreeMap<>();

    /* renamed from: b, reason: collision with root package name */
    @e
    public final TreeMap<Integer, zzar> f350542b = new TreeMap<>();

    public final void zza(String str, int i12, zzar zzarVar, String str2) {
        TreeMap<Integer, zzar> treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f350542b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException(G.f("Unknown callback type: ", str2));
            }
            treeMap = this.f350541a;
        }
        if (treeMap.containsKey(Integer.valueOf(i12))) {
            i12 = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i12), zzarVar);
    }

    public final void zza(zzh zzhVar, zzac zzacVar) {
        zzn zznVar = new zzn(zzacVar);
        TreeMap<Integer, zzar> treeMap = this.f350541a;
        for (Integer num : treeMap.keySet()) {
            zzad zzadVar = (zzad) zzacVar.zzb().clone();
            zzaq zzaqVarZza = treeMap.get(num).zza(zzhVar, Collections.singletonList(zznVar));
            int iZzb = zzaqVarZza instanceof zzai ? zzg.zzb(zzaqVarZza.zze().doubleValue()) : -1;
            if (iZzb == 2 || iZzb == -1) {
                zzacVar.zzb(zzadVar);
            }
        }
        TreeMap<Integer, zzar> treeMap2 = this.f350542b;
        Iterator<Integer> it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            zzaq zzaqVarZza2 = treeMap2.get(it.next()).zza(zzhVar, Collections.singletonList(zznVar));
            if (zzaqVarZza2 instanceof zzai) {
                zzg.zzb(zzaqVarZza2.zze().doubleValue());
            }
        }
    }
}
