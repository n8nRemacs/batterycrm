package com.google.android.gms.internal.fido;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzed {

    /* renamed from: a, reason: collision with root package name */
    public static final zzdz f350329a = new zzeb();

    /* renamed from: b, reason: collision with root package name */
    public static final zzdy f350330b = new zzec();

    public static zzdv zza(Set set) {
        zzdv zzdvVar = new zzdv(f350329a, null);
        zzdvVar.zza(f350330b);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdk zzdkVar = (zzdk) it.next();
            zzfk.zza(zzdkVar, "key");
            boolean zZzb = zzdkVar.zzb();
            HashMap map = zzdvVar.f350324b;
            HashMap map2 = zzdvVar.f350323a;
            if (zZzb) {
                zzdy zzdyVar = zzdv.f350322f;
                zzfk.zza(zzdkVar, "key");
                if (!zzdkVar.zzb()) {
                    throw new IllegalArgumentException("key must be repeating");
                }
                map2.remove(zzdkVar);
                map.put(zzdkVar, zzdyVar);
            } else {
                zzdz zzdzVar = zzdv.f350321e;
                zzfk.zza(zzdkVar, "key");
                map.remove(zzdkVar);
                map2.put(zzdkVar, zzdzVar);
            }
        }
        return zzdvVar;
    }
}
