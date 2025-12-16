package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzj {
    public static zzaq zza(zzfp.zzd zzdVar) {
        if (zzdVar == null) {
            return zzaq.zzc;
        }
        int i12 = zzi.f350844a[zzdVar.zzb().ordinal()];
        if (i12 == 1) {
            return zzdVar.zzj() ? new zzas(zzdVar.zze()) : zzaq.zzj;
        }
        if (i12 == 2) {
            return zzdVar.zzi() ? new zzai(Double.valueOf(zzdVar.zza())) : new zzai(null);
        }
        if (i12 == 3) {
            return zzdVar.zzh() ? new zzag(Boolean.valueOf(zzdVar.zzg())) : new zzag(null);
        }
        if (i12 != 4) {
            if (i12 != 5) {
                throw new IllegalStateException("Invalid entity: ".concat(String.valueOf(zzdVar)));
            }
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List<zzfp.zzd> listZzf = zzdVar.zzf();
        ArrayList arrayList = new ArrayList();
        Iterator<zzfp.zzd> it = listZzf.iterator();
        while (it.hasNext()) {
            arrayList.add(zza(it.next()));
        }
        return new zzat(zzdVar.zzd(), arrayList);
    }

    public static zzaq zza(Object obj) {
        if (obj == null) {
            return zzaq.zzd;
        }
        if (obj instanceof String) {
            return new zzas((String) obj);
        }
        if (obj instanceof Double) {
            return new zzai((Double) obj);
        }
        if (obj instanceof Long) {
            return new zzai(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzai(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new zzag((Boolean) obj);
        }
        if (obj instanceof Map) {
            zzap zzapVar = new zzap();
            Map map = (Map) obj;
            for (Object string : map.keySet()) {
                zzaq zzaqVarZza = zza(map.get(string));
                if (string != null) {
                    if (!(string instanceof String)) {
                        string = string.toString();
                    }
                    zzapVar.zza((String) string, zzaqVarZza);
                }
            }
            return zzapVar;
        }
        if (obj instanceof List) {
            zzaf zzafVar = new zzaf();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzafVar.zza(zza(it.next()));
            }
            return zzafVar;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
}
