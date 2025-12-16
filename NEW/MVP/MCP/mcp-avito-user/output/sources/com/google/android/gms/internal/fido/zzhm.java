package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzhm extends zzhp {

    /* renamed from: b, reason: collision with root package name */
    public final int f350420b;

    /* renamed from: c, reason: collision with root package name */
    public final zzcj f350421c;

    public zzhm(zzcj zzcjVar) throws zzhf {
        zzcjVar.getClass();
        this.f350421c = zzcjVar;
        zzdc it = zzcjVar.entrySet().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iA2 = ((zzhp) entry.getKey()).a();
            i12 = i12 < iA2 ? iA2 : i12;
            int iA3 = ((zzhp) entry.getValue()).a();
            if (i12 < iA3) {
                i12 = iA3;
            }
        }
        int i13 = i12 + 1;
        this.f350420b = i13;
        if (i13 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int a() {
        return this.f350420b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int iCompareTo;
        zzhp zzhpVar = (zzhp) obj;
        int iZza = zzhpVar.zza();
        int iC2 = zzhp.c((byte) -96);
        if (iC2 != iZza) {
            return iC2 - zzhpVar.zza();
        }
        zzcj zzcjVar = this.f350421c;
        int size = zzcjVar.size();
        zzcj zzcjVar2 = ((zzhm) zzhpVar).f350421c;
        if (size != zzcjVar2.size()) {
            return zzcjVar.size() - zzcjVar2.size();
        }
        zzdc it = zzcjVar.entrySet().iterator();
        zzdc it2 = zzcjVar2.entrySet().iterator();
        do {
            if (!it.hasNext() && !it2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int iCompareTo2 = ((zzhp) entry.getKey()).compareTo((zzhp) entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((zzhp) entry.getValue()).compareTo((zzhp) entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhm.class == obj.getClass()) {
            return this.f350421c.equals(((zzhm) obj).f350421c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.c((byte) -96)), this.f350421c});
    }

    public final String toString() {
        zzcj zzcjVar = this.f350421c;
        if (zzcjVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zzdc it = zzcjVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((zzhp) entry.getKey()).toString().replace("\n", "\n  "), ((zzhp) entry.getValue()).toString().replace("\n", "\n  "));
        }
        zzbd zzbdVarZza = zzbd.zza(",\n  ");
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            zzbc.zza(sb2, linkedHashMap.entrySet().iterator(), zzbdVarZza, " : ");
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e12) {
            throw new AssertionError(e12);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.c((byte) -96);
    }

    public final zzcj zzc() {
        return this.f350421c;
    }
}
