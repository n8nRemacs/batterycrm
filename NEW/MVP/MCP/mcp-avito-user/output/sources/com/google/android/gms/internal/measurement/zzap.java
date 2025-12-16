package com.google.android.gms.internal.measurement;

import XY0.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public class zzap implements zzak, zzaq {

    /* renamed from: b, reason: collision with root package name */
    @e
    public final HashMap f350563b = new HashMap();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzap) {
            return this.f350563b.equals(((zzap) obj).f350563b);
        }
        return false;
    }

    public int hashCode() {
        return this.f350563b.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        HashMap map = this.f350563b;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        return "toString".equals(str) ? new zzas(toString()) : zzan.zza(this, new zzas(str), zzhVar, list);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        zzap zzapVar = new zzap();
        for (Map.Entry entry : this.f350563b.entrySet()) {
            boolean z12 = entry.getValue() instanceof zzak;
            HashMap map = zzapVar.f350563b;
            if (z12) {
                map.put((String) entry.getKey(), (zzaq) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((zzaq) entry.getValue()).zzc());
            }
        }
        return zzapVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return zzan.zza(this.f350563b);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzaq zza(String str) {
        HashMap map = this.f350563b;
        if (map.containsKey(str)) {
            return (zzaq) map.get(str);
        }
        return zzaq.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean zzc(String str) {
        return this.f350563b.containsKey(str);
    }

    public final List<String> zza() {
        return new ArrayList(this.f350563b.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void zza(String str, zzaq zzaqVar) {
        HashMap map = this.f350563b;
        if (zzaqVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzaqVar);
        }
    }
}
