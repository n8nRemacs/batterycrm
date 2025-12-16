package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzac {

    /* renamed from: a, reason: collision with root package name */
    public zzad f350543a = new zzad("", 0, null);

    /* renamed from: b, reason: collision with root package name */
    public zzad f350544b = new zzad("", 0, null);

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f350545c = new ArrayList();

    public final Object clone() {
        zzad zzadVar = (zzad) this.f350543a.clone();
        zzac zzacVar = new zzac();
        zzacVar.f350543a = zzadVar;
        zzacVar.f350544b = (zzad) zzadVar.clone();
        zzacVar.f350545c = new ArrayList();
        Iterator it = this.f350545c.iterator();
        while (it.hasNext()) {
            zzacVar.f350545c.add((zzad) ((zzad) it.next()).clone());
        }
        return zzacVar;
    }

    public final zzad zza() {
        return this.f350543a;
    }

    public final zzad zzb() {
        return this.f350544b;
    }

    public final List<zzad> zzc() {
        return this.f350545c;
    }

    public final void zza(zzad zzadVar) {
        this.f350543a = zzadVar;
        this.f350544b = (zzad) zzadVar.clone();
        this.f350545c.clear();
    }

    public final void zzb(zzad zzadVar) {
        this.f350544b = zzadVar;
    }

    public final void zza(String str, long j12, Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, zzad.zza(str2, this.f350543a.zza(str2), map.get(str2)));
        }
        this.f350545c.add(new zzad(str, j12, map2));
    }
}
