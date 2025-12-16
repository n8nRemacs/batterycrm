package com.google.android.gms.internal.measurement;

import XY0.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzbb {

    /* renamed from: a, reason: collision with root package name */
    @e
    public final HashMap f350580a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final zzbq f350581b = new zzbq();

    public zzbb() {
        a(new zzaw());
        a(new zzba());
        a(new zzbc());
        a(new zzbg());
        a(new zzbi());
        a(new zzbo());
        a(new zzbt());
    }

    public final void a(zzay zzayVar) {
        Iterator it = zzayVar.f350574a.iterator();
        while (it.hasNext()) {
            this.f350580a.put(((zzbv) it.next()).toString(), zzayVar);
        }
    }

    public final zzaq zza(zzh zzhVar, zzaq zzaqVar) {
        zzg.zza(zzhVar);
        if (!(zzaqVar instanceof zzat)) {
            return zzaqVar;
        }
        zzat zzatVar = (zzat) zzaqVar;
        ArrayList<zzaq> arrayListZzb = zzatVar.zzb();
        String strZza = zzatVar.zza();
        HashMap map = this.f350580a;
        return (map.containsKey(strZza) ? (zzay) map.get(strZza) : this.f350581b).zza(strZza, zzhVar, arrayListZzb);
    }
}
