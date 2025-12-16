package com.google.android.gms.internal.measurement;

import XY0.e;
import androidx.appcompat.app.r;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzh {

    /* renamed from: a, reason: collision with root package name */
    @e
    public final zzh f350820a;

    /* renamed from: b, reason: collision with root package name */
    @e
    public final zzbb f350821b;

    /* renamed from: c, reason: collision with root package name */
    @e
    public final HashMap f350822c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    @e
    public final HashMap f350823d = new HashMap();

    public zzh(zzh zzhVar, zzbb zzbbVar) {
        this.f350820a = zzhVar;
        this.f350821b = zzbbVar;
    }

    public final zzh zza() {
        return new zzh(this, this.f350821b);
    }

    public final void zzb(String str, zzaq zzaqVar) {
        zza(str, zzaqVar);
        this.f350823d.put(str, Boolean.TRUE);
    }

    public final void zzc(String str, zzaq zzaqVar) {
        zzh zzhVar;
        zzh zzhVar2 = this;
        while (!zzhVar2.f350822c.containsKey(str) && (zzhVar = zzhVar2.f350820a) != null && zzhVar.zzb(str)) {
            zzhVar2 = zzhVar;
        }
        if (zzhVar2.f350823d.containsKey(str)) {
            return;
        }
        HashMap map = zzhVar2.f350822c;
        if (zzaqVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzaqVar);
        }
    }

    public final zzaq zza(zzaq zzaqVar) {
        return this.f350821b.zza(this, zzaqVar);
    }

    public final zzaq zza(zzaf zzafVar) {
        zzaq zzaqVarZza = zzaq.zzc;
        Iterator<Integer> itZzg = zzafVar.zzg();
        while (itZzg.hasNext()) {
            zzaqVarZza = this.f350821b.zza(this, zzafVar.zza(itZzg.next().intValue()));
            if (zzaqVarZza instanceof zzaj) {
                break;
            }
        }
        return zzaqVarZza;
    }

    public final boolean zzb(String str) {
        zzh zzhVar = this;
        while (!zzhVar.f350822c.containsKey(str)) {
            zzhVar = zzhVar.f350820a;
            if (zzhVar == null) {
                return false;
            }
        }
        return true;
    }

    public final zzaq zza(String str) {
        zzh zzhVar = this;
        while (!zzhVar.f350822c.containsKey(str)) {
            zzhVar = zzhVar.f350820a;
            if (zzhVar == null) {
                throw new IllegalArgumentException(r.q(str, " is not defined"));
            }
        }
        return (zzaq) zzhVar.f350822c.get(str);
    }

    public final void zza(String str, zzaq zzaqVar) {
        if (this.f350823d.containsKey(str)) {
            return;
        }
        HashMap map = this.f350822c;
        if (zzaqVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzaqVar);
        }
    }
}
